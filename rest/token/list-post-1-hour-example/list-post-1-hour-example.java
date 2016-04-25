// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.TokenFactory;
import com.twilio.sdk.resource.instance.Token;
import com.twilio.sdk.resource.list.TokenList;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class Example { 

  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
  public static final String AUTH_TOKEN = "{{ auth_token }}";

  public static void main(String[] args) throws TwilioRestException {
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

	List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(new BasicNameValuePair("Ttl", "3600"));

    TokenFactory tokenFactory = client.getAccount().getTokenFactory();
    Token token = tokenFactory.create(params);
    System.out.println(token.getUsername());
  }
}