package rf4;

/* loaded from: classes4.dex */
public final class z1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.StoryMsgView f395131d;

    public z1(com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView) {
        this.f395131d = storyMsgView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f395131d.f172014i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateClose$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryMsgView$animateClose$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.story.ui.view.StoryMsgView storyMsgView = this.f395131d;
        yz5.q onMsgPanelStateCallback = storyMsgView.getOnMsgPanelStateCallback();
        if (onMsgPanelStateCallback != null) {
            onMsgPanelStateCallback.invoke(0, java.lang.Integer.valueOf(storyMsgView.f172011f.getCurrentItem()), java.lang.Boolean.valueOf(storyMsgView.f172020r));
        }
        com.tencent.mm.plugin.story.ui.view.StoryActionView storyActionView = storyMsgView.f172016n;
        storyActionView.f171920w = false;
        if (storyActionView.f171915r) {
            android.graphics.drawable.Drawable drawable = storyActionView.getResources().getDrawable(com.tencent.mm.R.drawable.b3s);
            android.widget.TextView textView = storyActionView.f171911n;
            textView.setBackground(drawable);
            android.graphics.drawable.Drawable drawable2 = storyActionView.getResources().getDrawable(com.tencent.mm.R.drawable.b3s);
            android.widget.TextView textView2 = storyActionView.f171912o;
            textView2.setBackground(drawable2);
            if4.a aVar = storyActionView.f171922y;
            if (aVar != null && aVar.f291238f) {
                storyActionView.d(true, textView2);
            } else {
                storyActionView.d(false, textView2);
            }
            if4.a aVar2 = storyActionView.f171922y;
            if (aVar2 != null && aVar2.f291237e) {
                storyActionView.d(true, textView);
            } else {
                storyActionView.d(false, textView);
            }
            storyActionView.b(textView);
            storyActionView.b(textView2);
        } else {
            android.view.View view = storyActionView.f171914q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgClosed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryActionView", "onMsgClosed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        storyMsgView.getCommentInputView().b();
        storyMsgView.getCommentInputView().setVisibility(8);
        mf4.d dVar = mf4.d.f326160a;
        mf4.d.f326167h = true;
        mf4.d.f326168i = true;
    }
}
