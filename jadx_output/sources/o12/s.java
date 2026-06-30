package o12;

/* loaded from: classes10.dex */
public final class s extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer f342179d;

    public s(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTextDecorationsContainer emojiEditorTextDecorationsContainer) {
        this.f342179d = emojiEditorTextDecorationsContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yz5.a onAnimateResetEnd = this.f342179d.getOnAnimateResetEnd();
        if (onAnimateResetEnd != null) {
            onAnimateResetEnd.invoke();
        }
    }
}
