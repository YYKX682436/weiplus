package go0;

/* loaded from: classes14.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f273733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i17, int i18, go0.f0 f0Var) {
        super(0);
        this.f273733d = i17;
        this.f273734e = i18;
        this.f273735f = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f273734e;
        go0.f0 f0Var = this.f273735f;
        int i18 = this.f273733d;
        if (i18 <= 0 || i17 <= 0) {
            java.lang.String debugText = "updateDrawSize error:" + i18 + " *" + i17 + ", default:" + f0Var.e() + " x " + f0Var.d();
            kotlin.jvm.internal.o.g(debugText, "debugText");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
            ft0.d dVar = f0Var.f273764m;
            if (dVar != null) {
                dVar.e(null, f0Var.e(), f0Var.d());
            }
        } else {
            java.lang.String debugText2 = "updateDrawSize:" + i18 + " x " + i17;
            kotlin.jvm.internal.o.g(debugText2, "debugText");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText2);
            ft0.d dVar2 = f0Var.f273764m;
            if (dVar2 != null) {
                dVar2.e(null, i18, i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
