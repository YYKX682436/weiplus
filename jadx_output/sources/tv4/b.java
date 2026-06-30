package tv4;

/* loaded from: classes12.dex */
public final class b extends jv4.q {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f422360b;

    /* renamed from: c, reason: collision with root package name */
    public final sv4.j f422361c;

    /* renamed from: d, reason: collision with root package name */
    public final rv4.a0 f422362d;

    /* renamed from: e, reason: collision with root package name */
    public final jv4.m f422363e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.ref.WeakReference r2, sv4.j r3, rv4.a0 r4) {
        /*
            r1 = this;
            java.lang.String r0 = "settingDelete"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r4, r0)
            jv4.m r0 = jv4.m.f302250p
            r1.<init>(r0)
            r1.f422360b = r2
            r1.f422361c = r3
            r1.f422362d = r4
            r1.f422363e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tv4.b.<init>(java.lang.ref.WeakReference, sv4.j, rv4.a0):void");
    }

    @Override // jv4.j
    public int a() {
        return this.f422362d.f400430d ? 1 : 0;
    }

    public final void b(com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, java.lang.String str) {
        if (mMSwitchBtn == null) {
            return;
        }
        java.lang.String string = mMSwitchBtn.f211363x ? mMSwitchBtn.getContext().getString(com.tencent.mm.R.string.jnq) : mMSwitchBtn.getContext().getString(com.tencent.mm.R.string.f493301jo0);
        kotlin.jvm.internal.o.d(string);
        mMSwitchBtn.setContentDescription(str + ' ' + string);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // jv4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(androidx.recyclerview.widget.k3 r18) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv4.b.c(androidx.recyclerview.widget.k3):void");
    }

    @Override // jv4.q, jv4.n
    public jv4.m getType() {
        return this.f422363e;
    }

    @Override // nv4.g
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setting-item]-");
        rv4.a0 a0Var = this.f422362d;
        sb6.append(a0Var.f400429c);
        sb6.append('-');
        sb6.append(a0Var.d());
        return sb6.toString();
    }

    @Override // nv4.g
    public void w() {
        this.f422362d.w();
    }
}
