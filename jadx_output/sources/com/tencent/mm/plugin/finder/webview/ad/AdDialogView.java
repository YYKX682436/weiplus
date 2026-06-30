package com.tencent.mm.plugin.finder.webview.ad;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/finder/webview/ad/AdDialogView;", "Lcom/tencent/mm/plugin/finder/webview/BaseBoxDialogView;", "", "getLayoutId", "getCloseLayoutHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AdDialogView extends com.tencent.mm.plugin.finder.webview.BaseBoxDialogView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.webview.BaseBoxDialogView
    public android.view.View d(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.bzg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.tencent.mm.plugin.finder.webview.BaseBoxDialogView
    public int getCloseLayoutHeight() {
        return (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
    }

    @Override // com.tencent.mm.plugin.finder.webview.BaseBoxDialogView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.adz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
