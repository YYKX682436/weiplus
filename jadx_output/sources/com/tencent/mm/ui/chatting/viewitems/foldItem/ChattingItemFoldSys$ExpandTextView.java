package com.tencent.mm.ui.chatting.viewitems.foldItem;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemFoldSys$ExpandTextView", "Lcom/tencent/mm/mvvm/MvvmView;", "Lye5/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingItemFoldSys$ExpandTextView extends com.tencent.mm.mvvm.MvvmView<ye5.c> {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f203989f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingItemFoldSys$ExpandTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(context.getString(com.tencent.mm.R.string.k8m));
        textView.setGravity(17);
        int color = context.getColor(com.tencent.mm.R.color.f479311vr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        textView.setTextColor(color);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        textView.setTextSize(14.0f);
        textView.setPadding(c44.b.a(6), c44.b.a(6), c44.b.a(6), c44.b.a(6));
        this.f203989f = textView;
        return textView;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        ye5.c cVar = (ye5.c) pVar2;
        android.widget.TextView textView = this.f203989f;
        if (textView != null) {
            textView.setOnClickListener(cVar != null ? cVar.f461244d : null);
        }
    }

    public /* synthetic */ ChattingItemFoldSys$ExpandTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingItemFoldSys$ExpandTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
