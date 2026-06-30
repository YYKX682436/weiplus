package yu2;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f465850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f465850d = jz5.h.b(new yu2.e(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b9v;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateAfter ");
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
        sb6.append(((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment).f129263n);
        sb6.append("  tabType:");
        androidx.fragment.app.Fragment fragment2 = getFragment();
        kotlin.jvm.internal.o.e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
        sb6.append(((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment2).f129265p);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        android.widget.TextView textView = ((vb2.j0) this.f465850d.getValue()).f434632b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("titleId is :");
        androidx.fragment.app.Fragment fragment3 = getFragment();
        kotlin.jvm.internal.o.e(fragment3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
        sb7.append(((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment3).f129263n);
        textView.setText(sb7.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f465850d = jz5.h.b(new yu2.e(this));
    }
}
