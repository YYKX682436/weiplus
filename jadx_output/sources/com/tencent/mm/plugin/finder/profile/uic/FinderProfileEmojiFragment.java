package com.tencent.mm.plugin.finder.profile.uic;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileEmojiFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/je;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileEmojiFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements com.tencent.mm.plugin.finder.profile.uic.je {
    public FinderProfileEmojiFragment() {
        this.f129265p = 112;
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.je
    public void k(boolean z17) {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC) pf5.z.f353948a.b(this).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.class);
        if (finderEmojiListUIC != null) {
            if (z17) {
                finderEmojiListUIC.S6().f434634b.setBackgroundResource(com.tencent.mm.R.color.a9e);
            } else {
                finderEmojiListUIC.S6().f434634b.setBackgroundResource(com.tencent.mm.R.color.f478494f);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC.class);
    }
}
