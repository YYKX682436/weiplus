package lf4;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f318457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(lf4.b0 b0Var, int i17, java.util.ArrayList arrayList) {
        super(0);
        this.f318455d = b0Var;
        this.f318456e = i17;
        this.f318457f = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf4.b0 b0Var = this.f318455d;
        sf4.a1 a1Var = (sf4.a1) b0Var.f318355e;
        int i17 = this.f318456e;
        a1Var.h(i17, this.f318457f);
        lf4.h hVar = b0Var.f318355e;
        ((sf4.a1) hVar).c(i17);
        ((sf4.a1) hVar).d();
        return jz5.f0.f302826a;
    }
}
