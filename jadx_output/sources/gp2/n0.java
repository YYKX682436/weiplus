package gp2;

/* loaded from: classes10.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.q0 f274282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(gp2.q0 q0Var) {
        super(0);
        this.f274282d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f274282d.f274296d.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
        return (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
    }
}
