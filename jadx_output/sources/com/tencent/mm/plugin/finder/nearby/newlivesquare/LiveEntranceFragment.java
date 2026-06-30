package com.tencent.mm.plugin.finder.nearby.newlivesquare;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LiveEntranceFragment extends com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment {
    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{sp2.r.class, sp2.x3.class, com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEndSquareUIC.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getInt("key_use_dark_style", 1);
        }
        return onCreateView;
    }
}
