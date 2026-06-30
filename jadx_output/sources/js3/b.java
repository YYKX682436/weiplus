package js3;

/* loaded from: classes8.dex */
public class b implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            java.lang.String string = bundle.getString("download_url", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadMailApkTask", "download, url %s, md5 %s", string, bundle.getString("download_md5", ""));
            java.net.URL url = new java.net.URL(string);
            new java.net.URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://wx.mail.qq.com/list/readtemplate?name=wxplugin_push.html");
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
        } catch (java.lang.Exception e17) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadMailApkTask", "dz[download qq mail error:%s]", e17.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DownloadMailApkTask", e17, "", new java.lang.Object[0]);
        }
    }
}
