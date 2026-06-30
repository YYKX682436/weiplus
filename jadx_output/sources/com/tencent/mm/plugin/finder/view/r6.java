package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class r6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132931d;

    public r6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132931d = finderCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132931d;
        java.lang.String str = finderCommentFooter.getPostContent().f132879b;
        if (str != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("nowUrl", str);
            intent.putExtra("urlList", new java.lang.String[]{str});
            intent.putExtra("ShowIndicator", false);
            intent.putExtra("BottomSheetStyle", 0);
            intent.putExtra("shouldRunDragAnimation", true);
            intent.putExtra("showmenu", false);
            intent.putExtra("showGifAsPic", true);
            intent.putExtra("KEY_FINDER_OPEN_CONTEXT_HASH", finderCommentFooter.getContext().hashCode());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cl(zy2.z5.f477639d, true);
            j45.l.j(finderCommentFooter.getContext(), "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
