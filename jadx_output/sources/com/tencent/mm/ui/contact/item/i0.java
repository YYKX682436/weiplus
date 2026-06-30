package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class i0 extends com.tencent.mm.ui.contact.item.a {
    public java.lang.CharSequence C;
    public final com.tencent.mm.ui.contact.item.c D;
    public final com.tencent.mm.ui.contact.item.b E;

    public i0(int i17) {
        super(5, i17);
        this.D = new com.tencent.mm.ui.contact.item.h0(this);
        this.E = new com.tencent.mm.ui.contact.item.g0(this);
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (java.lang.String str : this.A.f351131c) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.plugin.fts.ui.c.f138023a), 0, str.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            spannableStringBuilder.append((java.lang.CharSequence) "、");
        }
        this.C = android.text.TextUtils.concat(context.getString(com.tencent.mm.R.string.ife), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), context.getString(com.tencent.mm.R.string.ife));
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return this.D;
    }
}
