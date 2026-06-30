package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/je;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileFeedFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements com.tencent.mm.plugin.finder.profile.uic.je {
    public FinderProfileFeedFragment() {
        this.f129265p = 104;
        jz5.h.b(new com.tencent.mm.plugin.finder.profile.e(this));
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.je
    public void k(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC) pf5.z.f353948a.b(this).e(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC.class);
            if (finderProfileFeedUIC != null) {
                finderProfileFeedUIC.setCoveredStyle();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC2 = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC) pf5.z.f353948a.b(this).e(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC.class);
        if (finderProfileFeedUIC2 != null) {
            finderProfileFeedUIC2.setNormalStyle();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC.class, com.tencent.mm.plugin.finder.profile.uic.f4.class});
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderProfileUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderProfileFeedFragment");
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void q0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.q0(set);
        set.remove(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
    }
}
