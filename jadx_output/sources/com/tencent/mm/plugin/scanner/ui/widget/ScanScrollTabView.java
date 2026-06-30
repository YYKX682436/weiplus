package com.tencent.mm.plugin.scanner.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanScrollTabView;", "Lcom/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ScanScrollTabView extends com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView {
    public int I;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanScrollTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView
    public void e(d04.k tab, int i17) {
        kotlin.jvm.internal.o.g(tab, "tab");
    }

    @Override // com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView
    public void g(d04.k tab, int i17) {
        kotlin.jvm.internal.o.g(tab, "tab");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i(d04.k tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        if (tab instanceof android.view.View) {
            int i17 = this.I;
            ((android.view.View) tab).setPadding(i17, 0, i17, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanScrollTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.I = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
    }
}
