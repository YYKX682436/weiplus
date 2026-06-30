package nc5;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f336233a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f336234b;

    /* renamed from: c, reason: collision with root package name */
    public nc5.r f336235c;

    public u(androidx.recyclerview.widget.RecyclerView sugRv, android.content.Context activity) {
        kotlin.jvm.internal.o.g(sugRv, "sugRv");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f336233a = sugRv;
        this.f336234b = activity;
        sugRv.N(new nc5.s(activity));
    }

    public final void a(yz5.l callback, yz5.l lVar) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList aj6 = ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).aj();
        boolean isEmpty = aj6.isEmpty();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f336233a;
        if (isEmpty) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
        }
        if (lVar != null) {
            lVar.invoke(aj6);
        }
        this.f336235c = new nc5.r(aj6, new nc5.t(callback, aj6));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this.f336234b);
        linearLayoutManager.Q(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f336235c);
    }
}
