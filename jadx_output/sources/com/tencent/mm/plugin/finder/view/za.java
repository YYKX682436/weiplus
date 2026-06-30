package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class za implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView f133456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f133457b;

    public za(com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView finderHomeTabFeedBackBubbleView, r45.qt2 qt2Var) {
        this.f133456a = finderHomeTabFeedBackBubbleView;
        this.f133457b = qt2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l lVar = new jz5.l("show_word", this.f133456a.f131135e);
        r45.qt2 qt2Var = this.f133457b;
        return kz5.c1.k(lVar, new jz5.l("finder_tab_context_id", qt2Var.getString(2)), new jz5.l("finder_context_id", qt2Var.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.getInteger(5))));
    }
}
