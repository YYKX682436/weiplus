package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f134814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.m50 f134815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var) {
        super(0);
        this.f134814d = z17;
        this.f134815e = m50Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f134814d;
        com.tencent.mm.plugin.finder.viewmodel.component.m50 m50Var = this.f134815e;
        if (z17) {
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = m50Var.f135137t;
            if (finderFullSeekBarLayout != null) {
                cw2.ca.d(finderFullSeekBarLayout, null, false, 3, null);
            }
        } else {
            cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).S6(m50Var.getContext());
            android.view.ViewParent parentView = S6 != null ? S6.getParentView() : null;
            if (parentView instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout) {
                cw2.ca seekBarLayout = ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) parentView).getSeekBarLayout();
                if (seekBarLayout != null) {
                    cw2.ca.d(seekBarLayout, null, false, 3, null);
                }
            } else if (parentView instanceof com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout) {
                com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = (com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout) parentView;
                finderLandscapePreviewLayout.t();
                if (finderLandscapePreviewLayout.getIsPlay()) {
                    finderLandscapePreviewLayout.performClick();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
