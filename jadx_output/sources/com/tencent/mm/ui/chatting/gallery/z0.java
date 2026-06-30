package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public final class z0 implements com.tencent.mm.ui.chatting.gallery.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f201589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f201590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f201591c;

    /* renamed from: d, reason: collision with root package name */
    public final int f201592d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.SpannableString f201593e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.SpannableString f201594f;

    public z0(android.widget.TextView tv6, java.lang.String hdLengthStr, boolean z17, int i17, int i18) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(hdLengthStr, "hdLengthStr");
        this.f201589a = tv6;
        this.f201590b = z17;
        this.f201591c = i17;
        this.f201592d = i18;
        this.f201593e = new android.text.SpannableString("");
        this.f201594f = new android.text.SpannableString("");
        android.content.Context context = tv6.getContext();
        int color = context.getColor(com.tencent.mm.R.color.adi);
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491025bm5);
        java.lang.String str = string + ' ' + hdLengthStr;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        this.f201593e = spannableString;
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), string.length() + 1, str.length(), 33);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.ncv);
        java.lang.String str2 = string2 + ' ' + hdLengthStr;
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str2);
        this.f201594f = spannableString2;
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(color), string2.length() + 1, str2.length(), 33);
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int a() {
        this.f201589a.setText(this.f201594f);
        return getMinWidth();
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getMinWidth() {
        if (this.f201590b) {
            return ((int) this.f201589a.getPaint().measureText(this.f201594f.toString())) + this.f201591c;
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getPriority() {
        return this.f201592d;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int getWidth() {
        if (this.f201590b) {
            return ((int) this.f201589a.getPaint().measureText(this.f201593e.toString())) + this.f201591c;
        }
        return 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.c1
    public int reset() {
        this.f201589a.setText(this.f201593e);
        return getWidth();
    }
}
