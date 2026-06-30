package gq5;

/* loaded from: classes5.dex */
public final class g implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gq5.i f274626a;

    public g(gq5.i iVar) {
        this.f274626a = iVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.vfs.w6.h(srcPath);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mars.xlog.Log.i(this.f274626a.f274628m, "exportFile: export fail, srcPath:" + srcPath + ", destPath:" + destPath);
    }
}
