package lf4;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf4.j f318451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f318453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ if4.f f318454h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z17, nf4.j jVar, lf4.q0 q0Var, int i17, if4.f fVar) {
        super(0);
        this.f318450d = z17;
        this.f318451e = jVar;
        this.f318452f = q0Var;
        this.f318453g = i17;
        this.f318454h = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f318450d && !this.f318451e.z0()) {
            lf4.q0 q0Var = this.f318452f;
            java.util.ArrayList arrayList = q0Var.f318465i;
            int i17 = this.f318453g;
            arrayList.set(i17, this.f318454h);
            java.util.ArrayList arrayList2 = q0Var.f318465i;
            lf4.h hVar = q0Var.f318462f;
            ((sf4.a1) hVar).h(0, arrayList2);
            ((sf4.a1) hVar).e(0, i17, 1);
            ((sf4.a1) hVar).d();
            q0Var.n();
        }
        return jz5.f0.f302826a;
    }
}
