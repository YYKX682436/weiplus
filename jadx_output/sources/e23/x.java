package e23;

/* loaded from: classes12.dex */
public class x extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f246984q;

    /* renamed from: r, reason: collision with root package name */
    public final e23.w f246985r;

    /* renamed from: s, reason: collision with root package name */
    public final e23.v f246986s;

    public x(int i17) {
        super(10, i17);
        this.f246985r = new e23.w(this, null);
        this.f246986s = new e23.v(this, null);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (java.lang.String str : this.f423762e.f351131c) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.plugin.fts.ui.c.f138023a), 0, str.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            spannableStringBuilder.append((java.lang.CharSequence) "、");
        }
        this.f246984q = android.text.TextUtils.concat(context.getString(com.tencent.mm.R.string.igc), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), context.getString(com.tencent.mm.R.string.igb));
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246985r;
    }
}
