package p61;

/* loaded from: classes8.dex */
public class p extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352341a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f352342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f352343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352344d;

    public p(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI, java.lang.String str) {
        this.f352344d = bindGoogleContactUI;
        this.f352341a = str;
    }

    public final java.lang.String a(java.lang.String str) {
        return new org.json.JSONObject(str).optString(com.google.android.gms.common.Scopes.EMAIL);
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token=" + str).openConnection();
        httpURLConnection.setRequestProperty("Charset", com.tencent.mapsdk.internal.rv.f51270c);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        httpURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
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
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "get EmailAccount respone:%s", str2);
        } else {
            str2 = "";
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return str2;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "doInBackground");
        try {
            java.lang.String a17 = a(b(this.f352341a));
            this.f352342b = a17;
            if (android.text.TextUtils.isEmpty(a17)) {
                return null;
            }
            this.f352343c = true;
            return null;
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "UnsupportedEncodingException:%s", e17.getMessage());
            return null;
        } catch (java.net.MalformedURLException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s", e18.getMessage());
            return null;
        } catch (java.net.ProtocolException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s", e19.getMessage());
            return null;
        } catch (java.io.IOException e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s", e27.getMessage());
            return null;
        } catch (org.json.JSONException e28) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GoogleContact.BindGoogleContactUI", e28, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        super.onPostExecute((java.lang.Void) obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPostExecute");
        boolean z17 = this.f352343c;
        java.lang.String str = this.f352342b;
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI = this.f352344d;
        if (z17) {
            bindGoogleContactUI.getClass();
            if (!android.text.TextUtils.isEmpty(str)) {
                if (android.text.TextUtils.isEmpty(bindGoogleContactUI.f72932g) || android.text.TextUtils.isEmpty(str) || bindGoogleContactUI.f72932g.equalsIgnoreCase(str)) {
                    bindGoogleContactUI.f72932g = str;
                    bindGoogleContactUI.T6(0);
                    return;
                } else {
                    bindGoogleContactUI.U6();
                    db5.e1.u(bindGoogleContactUI, bindGoogleContactUI.getString(com.tencent.mm.R.string.fqv), "", new p61.k(bindGoogleContactUI, str), new p61.l(bindGoogleContactUI));
                    return;
                }
            }
        }
        bindGoogleContactUI.U6();
        bindGoogleContactUI.W6();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
        this.f352343c = false;
    }
}
