package p61;

/* loaded from: classes8.dex */
public class w3 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352401a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f352402b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI f352404d;

    public w3(com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI, java.lang.String str) {
        this.f352404d = googleFriendUI;
        this.f352401a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        return new org.json.JSONObject(str).optString("access_token");
    }

    public final java.lang.String b() {
        java.lang.String str;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/token").openConnection();
        httpURLConnection.setRequestProperty("Charset", com.tencent.mapsdk.internal.rv.f51270c);
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        httpURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.apache.http.message.BasicNameValuePair("refresh_token", this.f352401a));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_id", "369820936870.apps.googleusercontent.com"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u"));
        arrayList.add(new org.apache.http.message.BasicNameValuePair("grant_type", "refresh_token"));
        java.lang.String a17 = r61.r0.a(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "QueryString:%s" + a17);
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(httpURLConnection.getOutputStream(), com.tencent.mapsdk.internal.rv.f51270c));
        bufferedWriter.write(a17);
        bufferedWriter.flush();
        bufferedWriter.close();
        int responseCode = httpURLConnection.getResponseCode();
        com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "responseCode:" + responseCode);
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
            str = stringBuffer.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "exchange token respone:%s" + str);
        } else {
            str = "";
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return str;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "doInBackground");
        try {
            java.lang.String b17 = b();
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "refresh response:%s", b17);
            this.f352402b = a(b17);
            this.f352403c = true;
            return null;
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "MalformedURLException:%s", e17.getMessage());
            return null;
        } catch (java.net.ProtocolException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "ProtocolException:%s", e18.getMessage());
            return null;
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "IOException:%s", e19.getMessage());
            return null;
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.GoogleFriendUI", "JSONException:%s", e27.getMessage());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        super.onPostExecute((java.lang.Void) obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "onPostExecute");
        boolean z17 = this.f352403c;
        java.lang.String str = this.f352402b;
        int i17 = com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.f73067u;
        com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI googleFriendUI = this.f352404d;
        if (z17) {
            googleFriendUI.getClass();
            if (!android.text.TextUtils.isEmpty(str)) {
                googleFriendUI.f73074m = str;
                gm0.j1.u().c().w(208902, str);
                googleFriendUI.f73076o = false;
                googleFriendUI.X6();
                new p61.v3(googleFriendUI, googleFriendUI, googleFriendUI.f73074m, null).execute(new java.lang.Void[0]);
                return;
            }
        }
        googleFriendUI.V6();
        googleFriendUI.W6(false);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "onPreExecute");
        this.f352403c = false;
    }
}
