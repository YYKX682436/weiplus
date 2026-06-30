package ls0;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ls0.r0 r0Var) {
        super(1);
        this.f320813d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a aVar;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 19L, 1L);
        }
        ls0.r0 r0Var = this.f320813d;
        r0Var.Z++;
        r0Var.f320898f0 = true;
        com.tencent.mars.xlog.Log.i(this.f320813d.f320916t, "onFrameDraw, drawFrameCount:" + this.f320813d.Z + ", encodeFrameCount:" + this.f320813d.Y + ", isDecodeEnd:" + this.f320813d.f320896e0);
        ls0.w0 w0Var = this.f320813d.Q;
        if (w0Var != null && (aVar = w0Var.f320955o) != null) {
            ((ls0.t0) aVar).invoke();
        }
        ls0.r0 r0Var2 = this.f320813d;
        if (r0Var2.f320908l) {
            android.opengl.GLES20.glFinish();
            ls0.r0 r0Var3 = this.f320813d;
            gs0.w wVar = r0Var3.D;
            if (wVar != null) {
                ls0.k kVar = r0Var3.F;
                wVar.b(kVar != null ? kVar.f320867u : 0L);
            }
            ls0.r0 r0Var4 = this.f320813d;
            gs0.w wVar2 = r0Var4.D;
            r0Var4.Y = wVar2 != null ? wVar2.f275045o : 0;
            ls0.r0.e(this.f320813d);
        } else {
            gs0.b bVar = r0Var2.C;
            if (bVar != null) {
                bVar.a(0L);
            }
        }
        fs0.g gVar = this.f320813d.B;
        if (gVar != null) {
            gVar.d(false);
        }
        return jz5.f0.f302826a;
    }
}
