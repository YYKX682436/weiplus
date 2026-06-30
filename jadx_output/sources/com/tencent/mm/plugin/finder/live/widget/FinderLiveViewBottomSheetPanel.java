package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveViewBottomSheetPanel;", "Lcom/tencent/mm/ui/widget/LiveBottomSheetPanel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class FinderLiveViewBottomSheetPanel extends com.tencent.mm.ui.widget.LiveBottomSheetPanel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveViewBottomSheetPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, false, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.widget.LiveBottomSheetPanel
    public void a(yz5.a aVar) {
        super.a(aVar);
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).mj(this);
    }

    @Override // com.tencent.mm.ui.widget.LiveBottomSheetPanel
    public void f() {
        super.f();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.widget.zx(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveViewBottomSheetPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
