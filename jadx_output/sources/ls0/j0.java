package ls0;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ls0.r0 r0Var) {
        super(0);
        this.f320846d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gs0.w wVar;
        com.tencent.mars.xlog.Log.i(this.f320846d.f320916t, "onDecodeEnd, encodeFrameCount:" + this.f320846d.Y + ", drawFrameCount:" + this.f320846d.Z);
        this.f320846d.f320896e0 = true;
        ls0.r0 r0Var = this.f320846d;
        if (r0Var.f320908l && (wVar = r0Var.D) != null) {
            wVar.d();
        }
        ls0.r0.e(this.f320846d);
        return jz5.f0.f302826a;
    }
}
