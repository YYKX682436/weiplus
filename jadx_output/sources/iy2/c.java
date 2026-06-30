package iy2;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    public static int f295883j = -1;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f295884a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.StringBuilder f295885b;

    /* renamed from: c, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f295886c;

    /* renamed from: d, reason: collision with root package name */
    public android.text.SpannableString f295887d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f295888e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.style.CharacterStyle f295889f;

    /* renamed from: g, reason: collision with root package name */
    public int f295890g;

    /* renamed from: h, reason: collision with root package name */
    public int f295891h;

    /* renamed from: i, reason: collision with root package name */
    public int f295892i;

    public c(android.content.Context mContext) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f295884a = mContext;
        this.f295886c = new android.text.SpannableStringBuilder();
        this.f295888e = new android.text.SpannableStringBuilder();
        this.f295889f = new android.text.style.ForegroundColorSpan(-5066062);
        this.f295892i = 3;
    }

    public final void a(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        if (mMEditText == null) {
            return;
        }
        this.f295890g = mMEditText.getSelectionStart();
        this.f295891h = mMEditText.getSelectionEnd();
        this.f295885b = new java.lang.StringBuilder(mMEditText.getText());
        if (r26.i0.p(mMEditText.getText().toString(), "", true)) {
            this.f295886c.clear();
        }
        if (this.f295890g < 0) {
            this.f295890g = 0;
        }
        if (this.f295891h < 0) {
            this.f295891h = 0;
        }
    }

    public final void b(com.tencent.mm.ui.widget.MMEditText mMEditText) {
        if (mMEditText == null) {
            return;
        }
        this.f295892i = 0;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String obj = mMEditText.getText().toString();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(this.f295884a, obj);
        this.f295887d = i17;
        mMEditText.setText(i17);
        android.text.SpannableString spannableString = this.f295887d;
        kotlin.jvm.internal.o.d(spannableString);
        mMEditText.setSelection(spannableString.length());
    }

    public final void c(com.tencent.mm.ui.widget.MMEditText mMEditText, java.lang.String text, boolean z17) {
        int length;
        kotlin.jvm.internal.o.g(text, "text");
        if (mMEditText == null) {
            return;
        }
        if (this.f295885b == null) {
            throw new java.lang.IllegalStateException("You should saveHistory before setText".toString());
        }
        int length2 = this.f295890g + text.length();
        android.text.SpannableStringBuilder spannableStringBuilder = this.f295886c;
        spannableStringBuilder.clear();
        android.text.SpannableStringBuilder spannableStringBuilder2 = this.f295888e;
        spannableStringBuilder2.clear();
        android.content.Context context = this.f295884a;
        if (z17) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.StringBuilder sb6 = this.f295885b;
            kotlin.jvm.internal.o.d(sb6);
            int i17 = 0;
            java.lang.CharSequence subSequence = sb6.subSequence(0, this.f295890g);
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, subSequence);
            this.f295887d = i18;
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) i18);
            if (spannableStringBuilder2 != null && text.length() != 0) {
                if (text.length() < this.f295892i) {
                    length = text.length();
                } else {
                    length = text.length();
                    i17 = length - this.f295892i;
                }
                spannableStringBuilder2.append((java.lang.CharSequence) text).setSpan(this.f295889f, i17, length, 33);
            }
            android.text.SpannableStringBuilder append2 = append.append((java.lang.CharSequence) spannableStringBuilder2);
            java.lang.StringBuilder sb7 = this.f295885b;
            kotlin.jvm.internal.o.d(sb7);
            int i19 = this.f295891h;
            java.lang.StringBuilder sb8 = this.f295885b;
            kotlin.jvm.internal.o.d(sb8);
            append2.append(sb7.subSequence(i19, sb8.length()));
        } else {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i27 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, text);
            this.f295887d = i27;
            spannableStringBuilder.append((java.lang.CharSequence) i27);
        }
        spannableStringBuilder.length();
        mMEditText.setText(spannableStringBuilder);
        if (length2 <= spannableStringBuilder.length()) {
            if (length2 == 0) {
                mMEditText.setSelection(spannableStringBuilder.length());
            } else {
                mMEditText.setSelection(length2);
            }
        }
    }
}
