package com.tencent.mm.plugin.product.ui;

/* loaded from: classes12.dex */
public class HtmlTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public final android.text.Html.TagHandler f153191d;

    public HtmlTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f153191d = new com.tencent.mm.plugin.product.ui.b(this);
    }

    public void setText(java.lang.String str) {
        gm0.j1.e().g(new com.tencent.mm.plugin.product.ui.a(this, str));
    }

    public HtmlTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f153191d = new com.tencent.mm.plugin.product.ui.b(this);
    }
}
