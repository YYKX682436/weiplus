package e23;

/* loaded from: classes12.dex */
public class a0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public boolean f246771q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f246772r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f246773s;

    /* renamed from: t, reason: collision with root package name */
    public final e23.z f246774t;

    public a0(int i17) {
        super(12, i17);
        this.f246774t = new e23.z(this);
        this.f423761d = false;
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String str = this.f423762e.f351132d[0];
        android.text.TextPaint textPaint = com.tencent.mm.plugin.fts.ui.d.f138036e;
        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(str, textPaint, 200.0f, android.text.TextUtils.TruncateAt.MIDDLE);
        java.lang.CharSequence ellipsize2 = android.text.TextUtils.ellipsize(this.f423762e.f351132d[1], textPaint, 400.0f, android.text.TextUtils.TruncateAt.MIDDLE);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f246772r)) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.idy);
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.idz);
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f492947ie0);
            int length = string.length();
            int length2 = string.length() + ellipsize.length() + string2.length();
            this.f246773s = o13.q.l(o13.q.l(string + ((java.lang.Object) ellipsize) + string2 + ((java.lang.Object) ellipsize2) + string3, length, ellipsize.length() + length), length2, ellipsize2.length() + length2);
            return;
        }
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.f492948ie1);
        java.lang.String string5 = context.getString(com.tencent.mm.R.string.idz);
        java.lang.String string6 = context.getString(com.tencent.mm.R.string.f492947ie0);
        int length3 = string4.length();
        int length4 = string4.length() + ellipsize.length() + string5.length();
        this.f246773s = o13.q.l(o13.q.l(string4 + ((java.lang.Object) ellipsize) + string5 + ((java.lang.Object) ellipsize2) + string6, length3, ellipsize.length() + length3), length4, ellipsize2.length() + length4);
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246774t;
    }
}
