package i33;

/* loaded from: classes3.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.k1 f288202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(i33.k1 k1Var) {
        super(0);
        this.f288202d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        i33.k1 k1Var = this.f288202d;
        android.view.View findViewById = k1Var.findViewById(com.tencent.mm.R.id.f482847pn);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        arrayList.add(new i33.g1(findViewById, 0, 2, null));
        android.view.View findViewById2 = k1Var.findViewById(com.tencent.mm.R.id.o0z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        arrayList.add(new i33.g1(findViewById2, 0, 2, null));
        android.view.View findViewById3 = k1Var.findViewById(com.tencent.mm.R.id.f487252o10);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        arrayList.add(new i33.g1(findViewById3, 0, 2, null));
        android.view.View findViewById4 = k1Var.findViewById(com.tencent.mm.R.id.kmg);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        arrayList.add(new i33.g1(findViewById4, 0, 2, null));
        android.view.View findViewById5 = k1Var.findViewById(com.tencent.mm.R.id.f482850pq);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        arrayList.add(new i33.g1(findViewById5, 0, 2, null));
        return arrayList;
    }
}
