package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes9.dex */
public class LiteAppPayTextView extends android.widget.TextView {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f144291f = "MicroMsg." + new java.lang.StringBuilder("weiVtxeTtellaW").reverse().toString();

    /* renamed from: d, reason: collision with root package name */
    public int f144292d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144293e;

    public LiteAppPayTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void setPrefix(java.lang.String str) {
        this.f144293e = str;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        java.lang.String charSequence2 = charSequence.toString();
        if (charSequence2 != null && charSequence2.length() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(7);
            for (int i17 = 0; i17 < 7; i17++) {
                sb6.append((char) ((6222620280936476253 >> ((6 - i17) * 8)) & 255));
            }
            java.lang.String sb7 = sb6.toString();
            sb6.delete(0, sb6.length());
            charSequence2.replaceAll(sb7, sb6.toString());
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f144293e) && !charSequence.toString().startsWith(this.f144293e)) {
            charSequence = this.f144293e + ((java.lang.Object) charSequence);
        }
        if (this.f144292d < 0 && !com.tencent.mm.sdk.platformtools.t8.J0(charSequence) && java.util.regex.Pattern.compile(".*?[a-zA-Z]+.*?").matcher(charSequence).matches()) {
            com.tencent.mars.xlog.Log.i(f144291f, "force use std font");
            if (charSequence instanceof java.lang.String) {
                charSequence = ((java.lang.String) charSequence).toLowerCase();
            }
        }
        super.setText(charSequence, bufferType);
    }

    public LiteAppPayTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ke.a.f306917a, i17, 0);
        this.f144292d = obtainStyledAttributes.getInteger(1, 4);
        this.f144293e = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        switch (this.f144292d) {
            case 1:
                str = "fonts/WeChatSansSS-Bold.ttf";
                break;
            case 2:
                str = "fonts/WeChatSansSS-Light.ttf";
                break;
            case 3:
                str = "fonts/WeChatSansSS-Regular.ttf";
                break;
            case 4:
                str = "fonts/WeChatSansStd-Medium.ttf";
                break;
            case 5:
                str = "fonts/WeChatSansStd-Bold.ttf";
                break;
            case 6:
                str = "fonts/WeChatSansStd-Light.ttf";
                break;
            case 7:
                str = "fonts/WeChatSansStd-Regular.ttf";
                break;
            default:
                str = "fonts/WeChatSansSS-Medium.ttf";
                break;
        }
        try {
            setTypeface(android.graphics.Typeface.createFromAsset(getContext().getAssets(), str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(f144291f, "updateWalletTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
