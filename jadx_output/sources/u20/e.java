package u20;

/* loaded from: classes9.dex */
public final class e implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u20.i f423866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f423867c;

    public e(java.lang.String str, u20.i iVar, android.content.Context context) {
        this.f423865a = str;
        this.f423866b = iVar;
        this.f423867c = context;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        u20.i iVar = this.f423866b;
        if (inputStream == null) {
            com.tencent.mars.xlog.Log.w("EcsShareToContactLogicImage", "downloadAndProcessImage, download failed for url: " + this.f423865a);
            iVar.b("Failed to download image");
        } else {
            try {
                java.lang.String str = iVar.f423884g;
                java.lang.String str2 = iVar.f423884g;
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(str, false);
                try {
                    kotlin.jvm.internal.o.d(K);
                    vz5.a.b(inputStream, K, 0, 2, null);
                    vz5.b.a(K, null);
                    inputStream.close();
                    com.tencent.mars.xlog.Log.i("EcsShareToContactLogicImage", "downloadAndProcessImage, saved to VFSFile: " + str2);
                    iVar.e(this.f423867c, str2);
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("EcsShareToContactLogicImage", e17, "downloadAndProcessImage, write to VFSFile failed", new java.lang.Object[0]);
                com.tencent.mm.vfs.w6.h(iVar.f423884g);
                iVar.b("Failed to save downloaded image");
            }
        }
        return null;
    }
}
