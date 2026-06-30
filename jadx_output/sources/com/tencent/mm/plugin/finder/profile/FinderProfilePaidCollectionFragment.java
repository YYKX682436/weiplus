package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfilePaidCollectionFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/je;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfilePaidCollectionFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements com.tencent.mm.plugin.finder.profile.uic.je {

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f123288t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f123289u;

    public FinderProfilePaidCollectionFragment() {
        this.f129265p = 106;
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.je
    public void k(boolean z17) {
        com.tencent.mm.plugin.finder.profile.uic.ic icVar = (com.tencent.mm.plugin.finder.profile.uic.ic) pf5.z.f353948a.b(this).e(com.tencent.mm.plugin.finder.profile.uic.ic.class);
        if (icVar != null) {
            jz5.g gVar = icVar.f123796m;
            if (z17) {
                ((vb2.y) ((jz5.n) gVar).getValue()).f434777b.setBackgroundResource(com.tencent.mm.R.color.a9e);
            } else {
                ((vb2.y) ((jz5.n) gVar).getValue()).f434777b.setBackgroundResource(com.tencent.mm.R.color.f478494f);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.profile.uic.ic.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        java.util.List list = this.f123288t;
        com.tencent.mm.protobuf.g gVar = this.f123289u;
        if (list == null || gVar == null) {
            return;
        }
        com.tencent.mm.plugin.finder.profile.uic.ic icVar = (com.tencent.mm.plugin.finder.profile.uic.ic) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.profile.uic.ic.class);
        icVar.getClass();
        icVar.O6().f107600f = list;
        icVar.O6().f107601g = gVar;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(icVar.O6(), false, 1, null);
    }
}
