package kv4;

/* loaded from: classes12.dex */
public final class b0 implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f312684a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f312685b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f312686c;

    /* renamed from: d, reason: collision with root package name */
    public final rv4.p f312687d;

    /* renamed from: e, reason: collision with root package name */
    public g75.s f312688e;

    public b0(int i17, kv4.m delegate, java.util.List data, rv4.p hotSearchData) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(hotSearchData, "hotSearchData");
        this.f312684a = i17;
        this.f312685b = delegate;
        this.f312686c = data;
        this.f312687d = hotSearchData;
    }

    public static final void a(android.widget.TextView textView, java.lang.String str, float f17) {
        if ((textView != null ? textView.getPaint() : null) == null || f17 <= 0.0f) {
            return;
        }
        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(str, textView.getPaint(), f17, android.text.TextUtils.TruncateAt.END);
        textView.setMaxWidth((int) textView.getPaint().measureText(ellipsize.toString()));
        textView.setText(ellipsize);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0336  */
    @Override // jv4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(androidx.recyclerview.widget.k3 r52) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kv4.b0.c(androidx.recyclerview.widget.k3):void");
    }

    @Override // jv4.n
    public jv4.m getType() {
        return jv4.m.f302254t;
    }

    @Override // nv4.g
    public java.lang.String v() {
        jv4.l lVar = jv4.m.f302242e;
        return "11:".concat(kz5.n0.g0(this.f312686c, "-", null, null, 0, null, kv4.z.f312751d, 30, null));
    }

    @Override // nv4.g
    public void w() {
        this.f312687d.k(vu4.a.f440239f, vu4.b.B, "", kz5.n0.g0(this.f312686c, "#", null, null, 0, null, kv4.a0.f312681d, 30, null), "");
    }
}
