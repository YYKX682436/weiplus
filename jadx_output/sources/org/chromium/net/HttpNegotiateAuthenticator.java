package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net::android")
/* loaded from: classes13.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "net_auth";
    private final java.lang.String mAccountType;
    private android.os.Bundle mSpnegoContext;

    /* loaded from: classes13.dex */
    public class GetAccountsCallback implements android.accounts.AccountManagerCallback<android.accounts.Account[]> {
        private final org.chromium.net.HttpNegotiateAuthenticator.RequestData mRequestData;

        public GetAccountsCallback(org.chromium.net.HttpNegotiateAuthenticator.RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(android.accounts.AccountManagerFuture<android.accounts.Account[]> accountManagerFuture) {
            try {
                android.accounts.Account[] result = accountManagerFuture.getResult();
                if (result.length == 0) {
                    org.chromium.base.Log.w(org.chromium.net.HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                    org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, org.chromium.net.HttpNegotiateAuthenticator.this, org.chromium.net.NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                    return;
                }
                if (result.length > 1) {
                    org.chromium.base.Log.w(org.chromium.net.HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", java.lang.Integer.valueOf(result.length));
                    org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, org.chromium.net.HttpNegotiateAuthenticator.this, org.chromium.net.NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                } else if (org.chromium.net.HttpNegotiateAuthenticator.this.lacksPermission(org.chromium.base.ContextUtils.getApplicationContext(), "android.permission.USE_CREDENTIALS", true)) {
                    org.chromium.base.Log.e(org.chromium.net.HttpNegotiateAuthenticator.TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                    org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, org.chromium.net.HttpNegotiateAuthenticator.this, org.chromium.net.NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
                } else {
                    org.chromium.net.HttpNegotiateAuthenticator.RequestData requestData = this.mRequestData;
                    android.accounts.Account account = result[0];
                    requestData.account = account;
                    requestData.accountManager.getAuthToken(account, requestData.authTokenType, requestData.options, true, (android.accounts.AccountManagerCallback<android.os.Bundle>) new org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback(requestData), new android.os.Handler(org.chromium.base.ThreadUtils.getUiThreadLooper()));
                }
            } catch (android.accounts.AuthenticatorException | android.accounts.OperationCanceledException | java.io.IOException e17) {
                org.chromium.base.Log.w(org.chromium.net.HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e17);
                org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, org.chromium.net.HttpNegotiateAuthenticator.this, -9, null);
            }
        }
    }

    /* loaded from: classes13.dex */
    public class GetTokenCallback implements android.accounts.AccountManagerCallback<android.os.Bundle> {
        private final org.chromium.net.HttpNegotiateAuthenticator.RequestData mRequestData;

        public GetTokenCallback(org.chromium.net.HttpNegotiateAuthenticator.RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(android.accounts.AccountManagerFuture<android.os.Bundle> accountManagerFuture) {
            try {
                android.os.Bundle result = accountManagerFuture.getResult();
                if (!result.containsKey("intent")) {
                    org.chromium.net.HttpNegotiateAuthenticator.this.processResult(result, this.mRequestData);
                } else {
                    final android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
                    org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(applicationContext, new android.content.BroadcastReceiver() { // from class: org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(android.content.Context context, android.content.Intent intent) {
                            applicationContext.unregisterReceiver(this);
                            android.accounts.AccountManager accountManager = org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.this.mRequestData.accountManager;
                            android.accounts.Account account = org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.this.mRequestData.account;
                            java.lang.String str = org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.this.mRequestData.authTokenType;
                            android.os.Bundle bundle = org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.this.mRequestData.options;
                            org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback getTokenCallback = org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.this;
                            accountManager.getAuthToken(account, str, bundle, true, (android.accounts.AccountManagerCallback<android.os.Bundle>) new org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback(getTokenCallback.mRequestData), (android.os.Handler) null);
                        }
                    }, new android.content.IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                }
            } catch (android.accounts.AuthenticatorException | android.accounts.OperationCanceledException | java.io.IOException e17) {
                org.chromium.base.Log.w(org.chromium.net.HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to obtain a token.", e17);
                org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, org.chromium.net.HttpNegotiateAuthenticator.this, -9, null);
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface Natives {
        void setResult(long j17, org.chromium.net.HttpNegotiateAuthenticator httpNegotiateAuthenticator, int i17, java.lang.String str);
    }

    /* loaded from: classes13.dex */
    public static class RequestData {
        public android.accounts.Account account;
        public android.accounts.AccountManager accountManager;
        public java.lang.String authTokenType;
        public long nativeResultObject;
        public android.os.Bundle options;
    }

    public HttpNegotiateAuthenticator(java.lang.String str) {
        this.mAccountType = str;
    }

    public static org.chromium.net.HttpNegotiateAuthenticator create(java.lang.String str) {
        return new org.chromium.net.HttpNegotiateAuthenticator(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(android.os.Bundle bundle, org.chromium.net.HttpNegotiateAuthenticator.RequestData requestData) {
        this.mSpnegoContext = bundle.getBundle(org.chromium.net.HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i17 = -9;
        switch (bundle.getInt(org.chromium.net.HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i17 = 0;
                break;
            case 2:
                i17 = -3;
                break;
            case 3:
                i17 = org.chromium.net.NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i17 = org.chromium.net.NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i17 = org.chromium.net.NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i17 = org.chromium.net.NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i17 = org.chromium.net.NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i17 = org.chromium.net.NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i17 = org.chromium.net.NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, this, i17, bundle.getString("authtoken"));
    }

    private void requestTokenWithActivity(android.content.Context context, android.app.Activity activity, org.chromium.net.HttpNegotiateAuthenticator.RequestData requestData, java.lang.String[] strArr) {
        if (!lacksPermission(context, "android.permission.GET_ACCOUNTS", false)) {
            requestData.accountManager.getAuthTokenByFeatures(this.mAccountType, requestData.authTokenType, strArr, activity, null, requestData.options, new org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback(requestData), new android.os.Handler(org.chromium.base.ThreadUtils.getUiThreadLooper()));
        } else {
            org.chromium.base.Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, this, org.chromium.net.NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        }
    }

    private void requestTokenWithoutActivity(android.content.Context context, org.chromium.net.HttpNegotiateAuthenticator.RequestData requestData, java.lang.String[] strArr) {
        if (!lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            requestData.accountManager.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new org.chromium.net.HttpNegotiateAuthenticator.GetAccountsCallback(requestData), new android.os.Handler(org.chromium.base.ThreadUtils.getUiThreadLooper()));
        } else {
            org.chromium.base.Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            org.chromium.net.HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, this, org.chromium.net.NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        }
    }

    public void getNextAuthToken(long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
        org.chromium.net.HttpNegotiateAuthenticator.RequestData requestData = new org.chromium.net.HttpNegotiateAuthenticator.RequestData();
        requestData.authTokenType = org.chromium.net.HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE + str;
        requestData.accountManager = android.accounts.AccountManager.get(applicationContext);
        requestData.nativeResultObject = j17;
        java.lang.String[] strArr = {org.chromium.net.HttpNegotiateConstants.SPNEGO_FEATURE};
        android.os.Bundle bundle = new android.os.Bundle();
        requestData.options = bundle;
        if (str2 != null) {
            bundle.putString(org.chromium.net.HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, str2);
        }
        android.os.Bundle bundle2 = this.mSpnegoContext;
        if (bundle2 != null) {
            requestData.options.putBundle(org.chromium.net.HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle2);
        }
        requestData.options.putBoolean(org.chromium.net.HttpNegotiateConstants.KEY_CAN_DELEGATE, z17);
        android.app.Activity lastTrackedFocusedActivity = org.chromium.base.ApplicationStatus.getLastTrackedFocusedActivity();
        if (lastTrackedFocusedActivity == null) {
            requestTokenWithoutActivity(applicationContext, requestData, strArr);
        } else {
            requestTokenWithActivity(applicationContext, lastTrackedFocusedActivity, requestData, strArr);
        }
    }

    public boolean lacksPermission(android.content.Context context, java.lang.String str, boolean z17) {
        return (z17 || context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) == 0) ? false : true;
    }
}
