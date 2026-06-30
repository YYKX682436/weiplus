package dv2;

/* loaded from: classes2.dex */
public final class g1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.j1 f243856d;

    public g1(dv2.j1 j1Var) {
        this.f243856d = j1Var;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        dv2.j1 j1Var = this.f243856d;
        if (!(i17 >= 0 && i17 < j1Var.f243878h.size())) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.h00 O6 = dv2.j1.O6(j1Var);
        java.lang.Object obj = j1Var.f243878h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        O6.U6(view, (com.tencent.mm.plugin.finder.viewmodel.component.lz) obj, i17, 0);
        return true;
    }
}
