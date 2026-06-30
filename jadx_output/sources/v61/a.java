package v61;

/* loaded from: classes8.dex */
public class a extends android.accounts.AbstractAccountAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f433421a;

    public a(android.content.Context context) {
        super(context);
        this.f433421a = context;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public android.os.Bundle addAccount(android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse, java.lang.String str, java.lang.String str2, java.lang.String[] strArr, android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.content.Intent intent = new android.content.Intent(this.f433421a, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.ContactsSyncUI.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        intent.putExtra("contact_sync_scene", 1);
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public android.os.Bundle confirmCredentials(android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse, android.accounts.Account account, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountAuthenticatorService", "confirmCredentials");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public android.os.Bundle editProperties(android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountAuthenticatorService", "editProperties");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public android.os.Bundle getAuthToken(android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountAuthenticatorService", "getAuthToken");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public java.lang.String getAuthTokenLabel(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountAuthenticatorService", "getAuthTokenLabel");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public android.os.Bundle hasFeatures(android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse, android.accounts.Account account, java.lang.String[] strArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountAuthenticatorService", "hasFeatures: " + strArr);
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public android.os.Bundle updateCredentials(android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountAuthenticatorService", "updateCredentials");
        return null;
    }
}
