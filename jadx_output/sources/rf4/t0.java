package rf4;

/* loaded from: classes4.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395108d;

    public t0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395108d = storyCommentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView = this.f395108d;
        if (!storyCommentView.f171967s.f291239g.isEmpty()) {
            if (storyCommentView.f171969u == 3) {
                storyCommentView.f(2);
                mf4.d.f326160a.a(1);
            } else {
                storyCommentView.f(3);
                mf4.d dVar = mf4.d.f326160a;
                dVar.a(2);
                com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct storyPageExposeStruct = mf4.d.f326161b;
                storyPageExposeStruct.f60916d = 4L;
                storyPageExposeStruct.f60917e = storyPageExposeStruct.b("StoryId", java.lang.String.valueOf(storyCommentView.f171968t), true);
                dVar.b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
