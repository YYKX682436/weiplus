package fl1;

/* loaded from: classes7.dex */
public abstract class p1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f263842d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f263843e;

    /* renamed from: f, reason: collision with root package name */
    public final fl1.r1 f263844f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.View view, java.util.List items, fl1.r1 itemAdapter) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(itemAdapter, "itemAdapter");
        this.f263842d = view;
        this.f263843e = items;
        this.f263844f = itemAdapter;
    }

    public abstract void i(fl1.h1 h1Var);

    public final void j(boolean z17, fl1.h1 h1Var) {
        fl1.i1 i1Var;
        int size = this.f263843e.size();
        fl1.r1 r1Var = this.f263844f;
        if (size == 1) {
            k(true);
            if (!z17 || (i1Var = r1Var.f263852e) == null) {
                return;
            }
            i1Var.a(h1Var);
            return;
        }
        if (!z17) {
            k(false);
            return;
        }
        fl1.i1 i1Var2 = r1Var.f263852e;
        if (i1Var2 != null) {
            i1Var2.a(h1Var);
        }
        k(true);
    }

    public abstract void k(boolean z17);
}
