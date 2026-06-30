package pc0;

@j95.b
/* loaded from: classes10.dex */
public final class k extends i95.w implements ci0.s {
    public void Ai(android.content.Context context, java.lang.String downloadUrl, java.lang.String appId) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
        kotlin.jvm.internal.o.g(appId, "appId");
        if (appId.equals("wxa5e0de08d96cc09d")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f276157b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
    }

    public boolean wi(android.content.Context context, java.lang.String packageName, java.lang.String publicKey) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(packageName, "packageName");
        kotlin.jvm.internal.o.g(publicKey, "publicKey");
        return dw3.c.f244181a.b(context, packageName, publicKey);
    }
}
