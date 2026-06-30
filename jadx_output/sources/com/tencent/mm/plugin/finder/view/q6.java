package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class q6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132877d;

    public q6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132877d = finderCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132877d;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = finderCommentFooter.getPostContent().f132878a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo != null ? iEmojiInfo.getMd5() : null)) {
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = finderCommentFooter.getPostContent().f132878a;
            java.lang.String md52 = iEmojiInfo2 != null ? iEmojiInfo2.getMd5() : null;
            if (md52 == null) {
                md52 = "";
            }
            qk.u uVar = new qk.u(md52, finderCommentFooter.getPostContent().f132878a);
            uVar.f364155a = 41;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var != null) {
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(finderCommentFooter.getContext(), uVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
