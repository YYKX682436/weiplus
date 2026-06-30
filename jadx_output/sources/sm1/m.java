package sm1;

/* loaded from: classes3.dex */
public final class m implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409327d;

    public m(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409327d = bizCommentFooter;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$onFinishInflate$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409327d;
        bizCommentFooter.getEditText().postDelayed(new sm1.l(bizCommentFooter), 0L);
        yj0.a.i(false, this, "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$onFinishInflate$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
