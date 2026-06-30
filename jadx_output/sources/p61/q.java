package p61;

/* loaded from: classes8.dex */
public class q extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352350a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f352351b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f352352c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f352353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352354e;

    public q(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI, java.lang.String str) {
        this.f352354e = bindGoogleContactUI;
        this.f352350a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/token").openConnection();
        httpURLConnection.setRequestProperty("Charset", com.tencent.mapsdk.internal.rv.f51270c);
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        httpURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.apache.http.message.BasicNameValuePair("code", str));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_id", "369820936870.apps.googleusercontent.com"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("redirect_uri", "urn:ietf:wg:oauth:2.0:oob"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("grant_type", "authorization_code"));
        java.lang.String a17 = r61.r0.a(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "QueryString:%s", a17);
        int length = a17.getBytes().length;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(length);
        java.lang.String str2 = "";
        sb6.append("");
        httpURLConnection.setRequestProperty("Content-length", sb6.toString());
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), com.tencent.mapsdk.internal.rv.f51270c));
        bufferedWriter.write(a17);
        bufferedWriter.flush();
        bufferedWriter.close();
        int responseCode = httpURLConnection.getResponseCode();
        com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "responseCode:" + responseCode);
        if (200 == responseCode) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), com.tencent.mapsdk.internal.rv.f51270c));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            bufferedReader.close();
            str2 = stringBuffer.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "exchange token respone:%s", str2);
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return str2;
    }

    public final java.lang.String b(java.lang.String str) {
        return new org.json.JSONObject(str).optString("access_token");
    }

    public final java.lang.String c(java.lang.String str) {
        return new org.json.JSONObject(str).optString("refresh_token");
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            java.lang.String a17 = a(this.f352350a);
            this.f352351b = b(a17);
            this.f352352c = c(a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "response:%s", a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "mAccessToken:%s", this.f352351b);
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "mRefreshToken:%s", this.f352352c);
            this.f352353d = true;
            return null;
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s" + e17.getMessage());
            return null;
        } catch (java.net.ProtocolException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s" + e18.getMessage());
            return null;
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s" + e19.getMessage());
            return null;
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "JSONException:%s" + e27.getMessage());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        super.onPostExecute((java.lang.Void) obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPostExecute");
        boolean z17 = this.f352353d;
        java.lang.String str = this.f352351b;
        java.lang.String str2 = this.f352352c;
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI = this.f352354e;
        if (z17) {
            bindGoogleContactUI.getClass();
            if (!android.text.TextUtils.isEmpty(str)) {
                bindGoogleContactUI.f72934i = str;
                bindGoogleContactUI.f72935m = str2;
                new p61.p(bindGoogleContactUI, str).execute(new java.lang.Void[0]);
                return;
            }
        }
        bindGoogleContactUI.U6();
        bindGoogleContactUI.W6();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
        this.f352351b = "";
        this.f352352c = "";
        this.f352353d = false;
    }
}
