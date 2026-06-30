package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileAllFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/je;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileAllFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements com.tencent.mm.plugin.finder.profile.uic.je {
    public FinderProfileAllFragment() {
        this.f129265p = 201;
        jz5.h.b(new com.tencent.mm.plugin.finder.profile.a(this));
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.je
    public void k(boolean z17) {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.profile.uic.a2.class, com.tencent.mm.plugin.finder.profile.uic.dk.class, com.tencent.mm.plugin.finder.profile.uic.f4.class, com.tencent.mm.plugin.finder.viewmodel.component.ny.class});
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void q0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.q0(set);
        set.remove(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            return mMFinderUI.getD();
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 7;
    }
}
