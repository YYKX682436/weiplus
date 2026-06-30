package rc3;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(rc3.w0 w0Var, int i17) {
        super(0);
        this.f394055d = w0Var;
        this.f394056e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f394055d.f394105z, "canvas view remove " + this.f394056e);
        rc3.w0 w0Var = this.f394055d;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = w0Var.f394091i;
        jc3.r rVar = mBBuildConfig != null ? mBBuildConfig.f147829s : null;
        jc3.p pVar = mBBuildConfig != null ? mBBuildConfig.f147830t : null;
        if (rVar != null) {
            cf3.d dVar = (cf3.d) w0Var.f394096q.remove(java.lang.Integer.valueOf(this.f394056e));
            if (dVar != null) {
                dVar.f40917b.post(new cf3.a(dVar));
            }
        } else if (pVar != null) {
            int i17 = this.f394056e;
            fh1.r0 r0Var = (fh1.r0) pVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewDestroy canvasId: " + i17);
            fh1.o0 o0Var = (fh1.o0) fh1.x0.f262621J.remove(java.lang.Integer.valueOf(i17));
            java.lang.String str = (java.lang.String) fh1.x0.L.remove(java.lang.Integer.valueOf(i17));
            synchronized (r0Var) {
                kotlin.jvm.internal.m0.c(fh1.x0.K).remove(str);
            }
            if (o0Var != null) {
                ((android.view.Surface) ((jz5.n) o0Var.f262575d).getValue()).release();
                o0Var.f262572a.release();
            }
        } else {
            com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub = (com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub) w0Var.f394095p.remove(java.lang.Integer.valueOf(this.f394056e));
            if (mBSurfaceStub != null) {
                rc3.w0 w0Var2 = this.f394055d;
                w0Var2.S(new rc3.q(w0Var2, this.f394056e, mBSurfaceStub));
            }
        }
        return jz5.f0.f302826a;
    }
}
