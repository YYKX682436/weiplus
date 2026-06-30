package sc2;

/* loaded from: classes2.dex */
public final class k7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f406024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(ad2.h hVar, sc2.r7 r7Var, in5.s0 s0Var) {
        super(0);
        this.f406023d = hVar;
        this.f406024e = r7Var;
        this.f406025f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var;
        xc2.p0 p0Var;
        android.view.View view;
        ad2.h hVar = this.f406023d;
        if (hVar != null && (s0Var = hVar.f3148i) != null && (p0Var = hVar.f3147h) != null && (view = hVar.f3143d) != null) {
            ad2.k.b(hVar, s0Var, view, p0Var, true, null, 16, null);
            yz5.l lVar = this.f406024e.f406215n;
            if (lVar != null) {
                lVar.invoke(this.f406025f);
            }
        }
        return jz5.f0.f302826a;
    }
}
