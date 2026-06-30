package jn4;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f300799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PByteArray f300801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn4.h f300802g;

    public g(jn4.h hVar, int i17, java.lang.String str, com.tencent.mm.pointers.PByteArray pByteArray) {
        this.f300802g = hVar;
        this.f300799d = i17;
        this.f300800e = str;
        this.f300801f = pByteArray;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "https://" + com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str + "/cgi-bin/mmsupport-bin/stackreport?version=");
        stringBuffer.append(java.lang.Integer.toHexString(o45.wf.f343029g));
        stringBuffer.append("&devicetype=");
        stringBuffer.append(wo.q.f447780a);
        stringBuffer.append("&filelength=");
        stringBuffer.append(this.f300799d);
        stringBuffer.append("&sum=");
        stringBuffer.append(this.f300800e);
        stringBuffer.append("&reporttype=4");
        jn4.h hVar = this.f300802g;
        java.lang.String str2 = hVar.f300803d.f300819d;
        if (str2 != null && !str2.equals("")) {
            stringBuffer.append("&username=");
            stringBuffer.append(hVar.f300803d.f300819d);
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        byte[] bArr = this.f300801f.value;
        int i17 = 3;
        while (true) {
            int i18 = i17 - 1;
            jn4.m mVar = hVar.f300803d;
            if (i17 <= 0) {
                jn4.m.a(mVar);
                return;
            }
            org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
            org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(stringBuffer2);
            try {
                org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(bArr);
                byteArrayEntity.setContentType("binary/octet-stream");
                httpPost.setEntity(byteArrayEntity);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "http pose returnContent : " + com.tencent.mm.sdk.platformtools.t8.e(defaultHttpClient.execute(httpPost).getEntity().getContent()));
                jn4.d dVar = mVar.f300822g;
                if (dVar != null) {
                    ((com.tencent.mm.plugin.traceroute.ui.y) dVar).f175342a.f175343a.f175317m.sendEmptyMessage(4);
                    return;
                }
                return;
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "http post IOException: " + e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTraceRoute", e17, "", new java.lang.Object[0]);
            } catch (java.lang.IllegalStateException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "http post IllegalStateException: " + e18.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTraceRoute", e18, "", new java.lang.Object[0]);
            }
            i17 = i18;
        }
    }
}
