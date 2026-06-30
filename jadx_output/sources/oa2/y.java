package oa2;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.plugin.finder.activity.uic.w1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int O6(int i17) {
        return 18;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int P6() {
        return 195;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int Q6() {
        return getActivity().getIntent().getIntExtra("key_latest_index", 0);
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC R6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(oa2.b0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int T6() {
        return 18;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public boolean W6() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.w1
    public com.tencent.mm.plugin.finder.feed.x10 a7(int i17, int i18, int i19) {
        android.view.View view;
        android.view.View view2;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        oa2.x xVar = new oa2.x(this, (com.tencent.mm.ui.MMActivity) activity, 2, i17, false, true, 8, null);
        java.lang.String str = this.f101742e;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        xVar.F = str;
        xVar.D = i18;
        xVar.P = b7();
        androidx.fragment.app.Fragment fragment = getFragment();
        android.view.View view3 = null;
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = (fragment == null || (view2 = fragment.getView()) == null) ? null : (com.tencent.mm.view.RefreshLoadMoreLayout) view2.findViewById(com.tencent.mm.R.id.m6e);
        if (rlLayout == null) {
            rlLayout = U6().f434523b;
            kotlin.jvm.internal.o.f(rlLayout, "rlLayout");
        }
        xVar.f106180m = rlLayout;
        rlLayout.setSuperNestedScroll(true);
        xVar.f111023J = i19;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        if (fragment2 != null && (view = fragment2.getView()) != null) {
            view3 = view.findViewById(com.tencent.mm.R.id.f484229dg3);
        }
        xVar.M = view3;
        return xVar;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.w1, com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        U6().f434523b.setEnableRefresh(false);
        android.view.ViewGroup.LayoutParams layoutParams = U6().f434523b.getLayoutParams();
        androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
        if (cVar != null) {
            ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin = (int) getDimension(com.tencent.mm.R.dimen.f479659bw);
            U6().f434523b.setLayoutParams(cVar);
        }
    }
}
