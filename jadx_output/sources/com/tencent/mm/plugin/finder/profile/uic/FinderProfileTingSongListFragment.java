package com.tencent.mm.plugin.finder.profile.uic;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTingSongListFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/je;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileTingSongListFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements com.tencent.mm.plugin.finder.profile.uic.je {

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.IResponse f123497t;

    public FinderProfileTingSongListFragment(db2.f6 f6Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse initIResponse) {
        kotlin.jvm.internal.o.g(initIResponse, "initIResponse");
        this.f123497t = initIResponse;
        this.f129265p = 304;
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.je
    public void k(boolean z17) {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.profile.uic.ri.class);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (il4.l.f292142a.h(getContext())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Zj(this, 46004);
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderProfileTingSongListFragment);
    }
}
