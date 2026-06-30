package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorSecondCutPromotionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EditorSecondCutPromotionView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f156019d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorSecondCutPromotionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorSecondCutPromotionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dq8, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486774s43);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = linearLayout.findViewById(com.tencent.mm.R.id.f486772s41);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.widget.ImageView) findViewById2).setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_miaojian, -1));
        android.view.View findViewById3 = linearLayout.findViewById(com.tencent.mm.R.id.f486775s44);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f156019d = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = linearLayout.findViewById(com.tencent.mm.R.id.f486773s42);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        ((android.widget.ImageView) findViewById4).setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.arrow_regular_right, -1));
    }
}
