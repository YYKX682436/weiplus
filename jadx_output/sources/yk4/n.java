package yk4;

/* loaded from: classes3.dex */
public final class n implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462847d;

    public n(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462847d = tingCommentFooter;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$onFinishInflate$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462847d;
        tingCommentFooter.getEditText().postDelayed(new yk4.m(tingCommentFooter), 0L);
        yj0.a.i(false, this, "com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$onFinishInflate$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
