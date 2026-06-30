package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;", "Landroid/widget/ImageView;", "", "bubbleLeft", "I", "getBubbleLeft", "()I", "setBubbleLeft", "(I)V", "bubbleTop", "getBubbleTop", "setBubbleTop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StoryCommentBubbleView extends android.widget.ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryCommentBubbleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getBubbleLeft() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return iArr[0];
    }

    public final int getBubbleTop() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return iArr[1];
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            animate().scaleX(1.3f).scaleY(1.3f).setDuration(100L).start();
        } else if (actionMasked == 1 || actionMasked == 3) {
            animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
        return super.onTouchEvent(event);
    }

    public final void setBubbleLeft(int i17) {
    }

    public final void setBubbleTop(int i17) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryCommentBubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
