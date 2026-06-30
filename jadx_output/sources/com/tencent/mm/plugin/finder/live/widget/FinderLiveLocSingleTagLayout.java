package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveLocSingleTagLayout;", "Lcom/tencent/mm/ui/base/MMSingelLinePanel;", "", dm.i4.COL_ID, "Ljz5/f0;", "setTagView", "Lcom/tencent/mm/plugin/finder/live/widget/ao;", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "Lcom/tencent/mm/plugin/finder/live/widget/ao;", "getOnTagClickListener", "()Lcom/tencent/mm/plugin/finder/live/widget/ao;", "setOnTagClickListener", "(Lcom/tencent/mm/plugin/finder/live/widget/ao;)V", "onTagClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveLocSingleTagLayout extends com.tencent.mm.ui.base.MMSingelLinePanel {
    public java.lang.Integer V;

    /* renamed from: W, reason: from kotlin metadata */
    public com.tencent.mm.plugin.finder.live.widget.ao onTagClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLocSingleTagLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.base.MMSingelLinePanel, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final com.tencent.mm.plugin.finder.live.widget.ao getOnTagClickListener() {
        return this.onTagClickListener;
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public android.widget.TextView j() {
        java.lang.Integer num = this.V;
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(num != null ? num.intValue() : com.tencent.mm.R.layout.f488967eb5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return (android.widget.TextView) inflate;
    }

    public final void setOnTagClickListener(com.tencent.mm.plugin.finder.live.widget.ao aoVar) {
        this.onTagClickListener = aoVar;
    }

    public final void setTagView(int i17) {
        this.V = java.lang.Integer.valueOf(i17);
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public void u(android.widget.TextView textView, boolean z17, boolean z18) {
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.bo(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveLocSingleTagLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
