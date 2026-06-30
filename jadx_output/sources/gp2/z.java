package gp2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f274356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f274357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ws5.f f274359h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gp2.l0 l0Var, so2.h1 h1Var, int i17, android.view.View view, ws5.f fVar) {
        super(0);
        this.f274355d = l0Var;
        this.f274356e = h1Var;
        this.f274357f = i17;
        this.f274358g = view;
        this.f274359h = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so2.h1 h1Var = this.f274356e;
        int i17 = this.f274357f;
        gp2.l0 l0Var = this.f274355d;
        gp2.l0.d(l0Var, h1Var, i17, this.f274358g, this.f274359h);
        com.tencent.mars.xlog.Log.i(l0Var.t(), "checkCustomAutoPlay onFirstFrameRendStartCallback tabId:" + l0Var.f274246e);
        return jz5.f0.f302826a;
    }
}
