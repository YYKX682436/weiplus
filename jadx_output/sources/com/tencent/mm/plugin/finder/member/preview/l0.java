package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class l0 implements gx2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.n0 f121254d;

    public l0(com.tencent.mm.plugin.finder.member.preview.n0 n0Var) {
        this.f121254d = n0Var;
    }

    @Override // gx2.b
    public android.graphics.Rect G6(gx2.q drawer) {
        kotlin.jvm.internal.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListFragment finderPreviewFeedListFragment = this.f121254d.f121262e;
        if (finderPreviewFeedListFragment != null) {
            android.view.View view = finderPreviewFeedListFragment.f206301h;
            android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.f483236a25) : null;
            if (findViewById != null) {
                findViewById.getGlobalVisibleRect(rect);
            }
        }
        return rect;
    }
}
