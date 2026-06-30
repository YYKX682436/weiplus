package lf4;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z17, lf4.q0 q0Var) {
        super(0);
        this.f318383d = z17;
        this.f318384e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf4.q0 q0Var = this.f318384e;
        boolean z17 = this.f318383d;
        if (z17) {
            int size = q0Var.f318465i.size();
            int i17 = q0Var.f318467n;
            if (i17 >= 0 && i17 < size) {
                java.util.ArrayList arrayList = q0Var.f318465i;
                arrayList.remove(i17);
                lf4.h hVar = q0Var.f318462f;
                ((sf4.a1) hVar).h(0, arrayList);
                ((sf4.a1) hVar).f(0, q0Var.f318467n, 1);
                ((sf4.a1) hVar).d();
            }
        }
        ((sf4.a1) q0Var.f318462f).b(z17);
        q0Var.f318467n = -1;
        return jz5.f0.f302826a;
    }
}
