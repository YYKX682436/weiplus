package im2;

/* loaded from: classes3.dex */
public final class t2 implements com.tencent.mm.ui.widget.picker.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f292542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jz5.o f292543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292544c;

    public t2(com.tencent.mm.ui.widget.picker.c0 c0Var, jz5.o oVar, im2.z3 z3Var) {
        this.f292542a = c0Var;
        this.f292543b = oVar;
        this.f292544c = z3Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.z
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        im2.z3 z3Var = this.f292544c;
        jz5.o oVar = this.f292543b;
        this.f292542a.d();
        if (z17) {
            try {
                java.util.List list = (java.util.List) oVar.f302841d;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int c07 = kz5.n0.c0(list, (java.lang.CharSequence) obj);
                java.lang.Object obj4 = ((java.util.ArrayList) oVar.f302842e).get(c07);
                kotlin.jvm.internal.o.f(obj4, "get(...)");
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = ((java.util.List) obj4).indexOf((java.lang.CharSequence) obj2);
                int i17 = 0;
                for (int i18 = 0; i18 < c07; i18++) {
                    i17 += ((java.util.List) ((java.util.ArrayList) oVar.f302842e).get(i18)).size();
                }
                java.lang.Object obj5 = ((java.util.ArrayList) oVar.f302843f).get(i17 + indexOf);
                kotlin.jvm.internal.o.f(obj5, "get(...)");
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf2 = ((java.util.List) obj5).indexOf((java.lang.CharSequence) obj3);
                im2.z3 z3Var2 = this.f292544c;
                if (z3Var2.C1 == null) {
                    im2.z3.t7(z3Var2, c07, indexOf, indexOf2, null, null, 24, null);
                    return;
                }
                this.f292544c.s7(c07, indexOf, indexOf2, this.f292543b, new java.util.Date(z3Var2.P6(r2.getInteger(0) * 1000)));
                z3Var.f292652m2 = true;
                z3Var.R6();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i(z3Var.f292635d, th6.getMessage());
            }
        }
    }
}
