package h92;

/* loaded from: classes2.dex */
public class d implements h92.a, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer f279689d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f279690e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f279691f;

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        n().t(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
    }

    @Override // h92.a
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(o(), headerLayout);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f279690e = inflate;
    }

    @Override // h92.a
    public void h(android.content.Context context, com.tencent.mm.view.RefreshLoadMoreLayout rlLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        kotlin.jvm.internal.o.g(rlLayout.getRecyclerView(), "<set-?>");
        java.lang.Object parent = rlLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr);
                view.setLayoutParams(layoutParams2);
                view.requestLayout();
            }
        }
    }

    @Override // h92.a
    public com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer k(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer(context);
    }

    @Override // h92.a
    public void l(android.content.Context context, android.widget.FrameLayout footerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(footerLayout, "footerLayout");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.adh, footerLayout);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f279691f = inflate;
        inflate.setOnClickListener(new h92.c(this));
    }

    public final com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer n() {
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = this.f279689d;
        if (finderAccountSwitchDrawer != null) {
            return finderAccountSwitchDrawer;
        }
        kotlin.jvm.internal.o.o("drawer");
        throw null;
    }

    public int o() {
        return com.tencent.mm.R.layout.adj;
    }
}
