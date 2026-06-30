package ds2;

/* loaded from: classes2.dex */
public final class i implements vr2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f242869a;

    public i(ds2.b0 b0Var) {
        this.f242869a = b0Var;
    }

    @Override // vr2.i
    public void a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        ds2.b0 b0Var = this.f242869a;
        com.tencent.mars.xlog.Log.e(b0Var.f242859g, "[onFormatChange] mediaId=".concat(mediaId));
        b0Var.a(mediaId, false, "onFormatChange");
        cu2.x xVar = cu2.x.f222449a;
        com.tencent.mm.vfs.w6.h(cu2.x.c(xVar, mediaId, false, false, false, 14, null).u0());
        xVar.n(mediaId, 0L, 0L, -2);
    }

    @Override // vr2.i
    public void b(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        this.f242869a.d();
    }

    @Override // vr2.i
    public void c(java.lang.String mediaId, int i17, long j17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    @Override // vr2.i
    public void d(java.lang.String mediaId, boolean z17, int i17, cs2.p task, long j17, int i18, int i19) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        cu2.x xVar = cu2.x.f222449a;
        so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        ds2.b0 b0Var = this.f242869a;
        b0Var.f242853a.getClass();
        if (!c17.field_moovReady && z17) {
            xVar.k(mediaId, task.k());
        }
        b0Var.d();
    }

    @Override // vr2.i
    public void e(java.lang.String mediaId, java.lang.String msg, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(task, "task");
        this.f242869a.d();
    }

    @Override // vr2.i
    public void f(java.lang.String mediaId, cs2.p task, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void g(java.lang.String mediaId, int i17, int i18, java.lang.String fileFormat, java.lang.String codingFormat, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(codingFormat, "codingFormat");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // vr2.i
    public void h(java.lang.String mediaId, cs2.p task) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.e(this.f242869a.f242859g, "[onReject] mediaId=".concat(mediaId));
    }
}
