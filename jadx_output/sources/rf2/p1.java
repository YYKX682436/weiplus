package rf2;

/* loaded from: classes10.dex */
public final class p1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394852d;

    public p1(rf2.c2 c2Var) {
        this.f394852d = c2Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        yz5.r rVar = this.f394852d.f394686h;
        if (rVar != null) {
            ((rf2.x1) rVar).C(adapter, view, java.lang.Integer.valueOf(i17), holder);
        }
    }
}
