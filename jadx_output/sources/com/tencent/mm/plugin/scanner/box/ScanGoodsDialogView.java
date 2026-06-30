package com.tencent.mm.plugin.scanner.box;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/scanner/box/ScanGoodsDialogView;", "Lcom/tencent/mm/plugin/scanner/box/BaseBoxDialogView;", "", "getLayoutId", "getCloseLayoutHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ScanGoodsDialogView extends com.tencent.mm.plugin.scanner.box.BaseBoxDialogView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanGoodsDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.scanner.box.BaseBoxDialogView
    public android.view.View d(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.bzg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.tencent.mm.plugin.scanner.box.BaseBoxDialogView
    public int getCloseLayoutHeight() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a96);
    }

    @Override // com.tencent.mm.plugin.scanner.box.BaseBoxDialogView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanGoodsDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
