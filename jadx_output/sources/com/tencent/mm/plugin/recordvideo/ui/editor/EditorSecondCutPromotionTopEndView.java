package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorSecondCutPromotionTopEndView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "clickListener", "Ljz5/f0;", "setEntryClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EditorSecondCutPromotionTopEndView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView f156018d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorSecondCutPromotionTopEndView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setEntryClickListener(android.view.View.OnClickListener clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        this.f156018d.setOnClickListener(clickListener);
    }

    public /* synthetic */ EditorSecondCutPromotionTopEndView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorSecondCutPromotionTopEndView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dq9, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rj7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f156018d = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorSecondCutPromotionView) findViewById;
    }
}
