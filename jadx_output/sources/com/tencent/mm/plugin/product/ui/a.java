package com.tencent.mm.plugin.product.ui;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public volatile android.text.Spanned f153263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.HtmlTextView f153265c;

    public a(com.tencent.mm.plugin.product.ui.HtmlTextView htmlTextView, java.lang.String str) {
        this.f153265c = htmlTextView;
        this.f153264b = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        this.f153263a = android.text.Html.fromHtml(this.f153264b, null, this.f153265c.f153191d);
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        super/*android.widget.TextView*/.setText(this.f153263a, android.widget.TextView.BufferType.SPANNABLE);
        this.f153265c.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        return true;
    }

    public java.lang.String toString() {
        return super.toString() + "|setText";
    }
}
