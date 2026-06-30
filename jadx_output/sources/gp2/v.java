package gp2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f274326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f274327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gp2.l0 l0Var, int i17, zy2.g5 g5Var) {
        super(1);
        this.f274325d = l0Var;
        this.f274326e = i17;
        this.f274327f = g5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = gp2.l0.N;
        gp2.l0 l0Var = this.f274325d;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "switchCompleteCallback: result=" + intValue);
        if (intValue == -1) {
            l0Var.L(this.f274326e);
        }
        ((zy2.p7) this.f274327f).setFluentSwitchCompleteCallback(null);
        return jz5.f0.f302826a;
    }
}
