package tk3;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f419943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f419944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tk3.t tVar, boolean z17) {
        super(0);
        this.f419943d = tVar;
        this.f419944e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tk3.d dVar = this.f419943d.f419949d;
        if (dVar != null && dVar.f419913a != null) {
            boolean z17 = this.f419944e;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "resume FloatBallView, animation:%s", java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView = dVar.f419913a;
            if (multiTaskNewFloatBallView != null) {
                multiTaskNewFloatBallView.u(z17, false, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
