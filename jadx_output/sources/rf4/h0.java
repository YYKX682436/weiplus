package rf4;

/* loaded from: classes4.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentInputView f395057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395058e;

    public h0(com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView, int i17) {
        this.f395057d = storyCommentInputView;
        this.f395058e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f395057d.f171942o.getLayoutManager();
        kotlin.jvm.internal.o.d(layoutManager);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f395058e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
