package oj5;

/* loaded from: classes14.dex */
public final class h extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oj5.o f345852a;

    public h(oj5.o oVar) {
        this.f345852a = oVar;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        oj5.o oVar = this.f345852a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f345865d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f345865d.a((androidx.recyclerview.widget.k3) it.next(), "onChanged");
        }
        oVar.f345865d.clear();
        oj5.o.b(this.f345852a, true, "onChanged", 0L, 4, null);
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        oj5.o oVar = this.f345852a;
        oj5.o.a(oVar);
        int i19 = i17 + i18;
        for (int i27 = i17; i27 < i19; i27++) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) oVar.f345865d.remove(java.lang.Integer.valueOf(i27));
            oVar.f345865d.a(k3Var, "onItemRangeChanged(" + i17 + '-' + i18 + ')');
        }
        oj5.o.b(this.f345852a, true, "onItemRangeChanged(" + i17 + '-' + i18 + ')', 0L, 4, null);
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        oj5.o oVar = this.f345852a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f345865d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f345865d.a((androidx.recyclerview.widget.k3) it.next(), "onItemRangeInserted");
        }
        oVar.f345865d.clear();
        oj5.o.b(this.f345852a, true, "onItemRangeInserted(" + i17 + '-' + i18 + ')', 0L, 4, null);
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        oj5.o oVar = this.f345852a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f345865d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f345865d.a((androidx.recyclerview.widget.k3) it.next(), "onItemRangeMoved");
        }
        oVar.f345865d.clear();
        oj5.o.b(this.f345852a, true, "onItemRangeMoved(" + i17 + '-' + i18 + '-' + i19 + ')', 0L, 4, null);
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        oj5.o oVar = this.f345852a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f345865d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f345865d.a((androidx.recyclerview.widget.k3) it.next(), "onItemRangeRemoved");
        }
        oVar.f345865d.clear();
        oj5.o.b(this.f345852a, true, "onItemRangeRemoved(" + i17 + '-' + i18 + ')', 0L, 4, null);
    }
}
