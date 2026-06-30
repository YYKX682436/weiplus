package com.tencent.mm.plugin.finder.live.ktv.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/ktv/view/AttachLinearLayout;", "Landroid/widget/LinearLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "d", "Lyz5/a;", "getAttachBlock", "()Lyz5/a;", "setAttachBlock", "(Lyz5/a;)V", "attachBlock", "detachBlock", "getDetachBlock", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AttachLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a attachBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final yz5.a getAttachBlock() {
        return this.attachBlock;
    }

    public final yz5.a getDetachBlock() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yz5.a aVar = this.attachBlock;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setAttachBlock(yz5.a aVar) {
        this.attachBlock = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
