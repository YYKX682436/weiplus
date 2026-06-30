package kf2;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf2.a0 f307314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kf2.a0 a0Var) {
        super(0);
        this.f307314d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kf2.a0 a0Var = this.f307314d;
        arrayList.add(new kf2.q0(a0Var.f307190g, a0Var));
        df2.k kVar = a0Var.f307190g;
        arrayList.add(new kf2.p0(kVar, a0Var));
        arrayList.add(new kf2.v(kVar, a0Var));
        arrayList.add(new kf2.e0(kVar, a0Var));
        arrayList.add(new kf2.l0(kVar, a0Var));
        arrayList.add(new kf2.e(kVar, a0Var));
        arrayList.add(new kf2.j(kVar, a0Var));
        arrayList.add(new kf2.n(kVar, a0Var));
        arrayList.add(new kf2.r(kVar, a0Var));
        arrayList.add(new kf2.h0(kVar, a0Var));
        arrayList.add(new kf2.r0(kVar, a0Var));
        arrayList.add(new kf2.m0(kVar, a0Var));
        return arrayList;
    }
}
