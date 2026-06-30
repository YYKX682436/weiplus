package lf4;

/* loaded from: classes4.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f318494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(lf4.j1 j1Var, int i17, java.util.List list) {
        super(0);
        this.f318492d = j1Var;
        this.f318493e = i17;
        this.f318494f = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf4.j1 j1Var = this.f318492d;
        sf4.a1 a1Var = (sf4.a1) j1Var.f318419f;
        int i17 = this.f318493e;
        a1Var.h(i17, this.f318494f);
        lf4.h hVar = j1Var.f318419f;
        ((sf4.a1) hVar).c(i17);
        ((sf4.a1) hVar).d();
        return jz5.f0.f302826a;
    }
}
