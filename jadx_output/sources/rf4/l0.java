package rf4;

/* loaded from: classes4.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryCommentView f395081d;

    public l0(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        this.f395081d = storyCommentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf4.h2 h2Var = this.f395081d.H;
        boolean z17 = true;
        int i17 = h2Var.f395063d + 1;
        h2Var.f395063d = i17;
        if ((i17 != 1 || h2Var.f395062c != null) && i17 != 2 && i17 != 3) {
            z17 = false;
        }
        if (z17) {
            h2Var.a();
        }
        java.lang.Runnable runnable = h2Var.f395065f;
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, h2Var.f395064e);
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
