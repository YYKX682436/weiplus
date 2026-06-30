package rf4;

/* loaded from: classes4.dex */
public final class c1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395031d;

    public c1(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395031d = storyCommentView;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView;
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395031d;
        if (!storyCommentView.f171973y) {
            com.tencent.mm.plugin.story.ui.view.StoryCommentView.c(storyCommentView);
        }
        storyCommentView.f(2);
        rf4.a aVar = storyCommentView.f171972x;
        if (aVar == null || (storyCommentInputView = aVar.f395015f) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        pf4.q qVar = storyCommentInputView.f171943p;
        qVar.x(arrayList);
        qVar.notifyDataSetChanged();
        storyCommentInputView.f171946s.a();
    }
}
