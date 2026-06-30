package wu3;

/* loaded from: classes15.dex */
public class m1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f449779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton f449780e;

    public m1(com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f449780e = mMEditorRecordButton;
        this.f449779d = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f449780e.f156042m = false;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f449779d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f449780e.f156042m = true;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f449779d;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}
