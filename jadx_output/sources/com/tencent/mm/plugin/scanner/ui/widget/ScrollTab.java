package com.tencent.mm.plugin.scanner.ui.widget;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScrollTab;", "Landroid/widget/LinearLayout;", "Ld04/k;", "", "getTabId", "", "getTabTitle", "tabId", "Ljz5/f0;", "setTabId", "tabTitle", "setTabTitle", "", "enable", "setTabEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ScrollTab extends android.widget.LinearLayout implements d04.k {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f159807d;

    /* renamed from: e, reason: collision with root package name */
    public int f159808e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollTab(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // d04.k
    /* renamed from: getTabId, reason: from getter */
    public int getF159808e() {
        return this.f159808e;
    }

    public java.lang.String getTabTitle() {
        android.widget.TextView textView = this.f159807d;
        if (textView != null) {
            return textView.getText().toString();
        }
        kotlin.jvm.internal.o.o("tabTitle");
        throw null;
    }

    @Override // d04.k
    public void setTabEnabled(boolean z17) {
        if (z17) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.3f);
        }
    }

    public void setTabId(int i17) {
        this.f159808e = i17;
    }

    public void setTabTitle(java.lang.String tabTitle) {
        kotlin.jvm.internal.o.g(tabTitle, "tabTitle");
        android.widget.TextView textView = this.f159807d;
        if (textView != null) {
            textView.setText(tabTitle);
        } else {
            kotlin.jvm.internal.o.o("tabTitle");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollTab(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f159808e = -1;
        android.view.View findViewById = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489212bp3, this).findViewById(com.tencent.mm.R.id.mck);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f159807d = textView;
        textView.setAlpha(0.5f);
    }
}
