package rf4;

/* loaded from: classes4.dex */
public final class a1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395019d;

    public a1(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395019d = storyCommentView;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView2;
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395019d;
        storyCommentView.f(2);
        if (!storyCommentView.f171973y) {
            rf4.a aVar = storyCommentView.f171972x;
            storyCommentView.A = (aVar == null || (storyCommentInputView2 = aVar.f395015f) == null) ? null : storyCommentInputView2.getContent();
        }
        rf4.a aVar2 = storyCommentView.f171972x;
        if (aVar2 == null || (storyCommentInputView = aVar2.f395015f) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        pf4.q qVar = storyCommentInputView.f171943p;
        qVar.x(arrayList);
        qVar.notifyDataSetChanged();
        storyCommentInputView.f171946s.a();
    }
}
