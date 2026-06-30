package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class MMFinderFragment extends com.tencent.mm.ui.component.UIComponentFragment {
    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        this.f206301h = onCreateView;
        return onCreateView;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        pm0.v.V(0L, new wu2.a0(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void q0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.q0(set);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.k9.class)));
    }

    public int r0() {
        return 0;
    }
}
