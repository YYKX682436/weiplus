package yc5;

/* loaded from: classes5.dex */
public final class d implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f460900a;

    public d(kotlinx.coroutines.z zVar) {
        this.f460900a = zVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        ((kotlinx.coroutines.a0) this.f460900a).U(java.lang.Boolean.TRUE);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryFileHelper", "exportFileToPublicDownload: failed, src=".concat(srcPath));
        ((kotlinx.coroutines.a0) this.f460900a).U(java.lang.Boolean.FALSE);
    }
}
