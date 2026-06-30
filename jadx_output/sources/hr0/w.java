package hr0;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f283337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f283338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283339f;

    public w(java.lang.Throwable th6, java.lang.String[] strArr, java.lang.String str) {
        this.f283337d = th6;
        this.f283338e = strArr;
        this.f283339f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String[] strArr = new java.lang.String[3];
        strArr[0] = "HiddenApiExempt";
        java.lang.String arrays = java.util.Arrays.toString(this.f283338e);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        strArr[1] = arrays;
        java.lang.String str2 = this.f283339f;
        if (str2 != null) {
            java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{"\n"}, false, 0, 6, null);
            java.util.Iterator it = f07.iterator();
            int i17 = -1;
            int i18 = 0;
            int i19 = -1;
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i27 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String obj = r26.n0.u0((java.lang.String) next).toString();
                    if (r26.n0.D(obj, "libwechatnormsg.so", false, 2, null)) {
                        str = "normsg";
                        break;
                    }
                    if (r26.n0.D(obj, "com.tencent.matrix.hook.jnihook.JniHookJni", false, 2, null)) {
                        i17 = i18;
                    }
                    if (r26.i0.o(obj, "libmatrix-jnihook.so", false, 2, null)) {
                        i19 = i18;
                    }
                    i18 = i27;
                } else {
                    if (i17 < i19) {
                        i17 = i19;
                    }
                    int i28 = i17 >= 0 ? i17 : 0;
                    int size = f07.size() - 1;
                    if (i28 > size) {
                        i28 = size;
                    }
                    str = kz5.n0.g0(kz5.n0.K0(f07.subList(i28, f07.size()), 50), ";", null, null, 0, null, null, 62, null);
                }
            }
        } else {
            str = null;
        }
        strArr[2] = str;
        ap.a.a(1, "CompatProfiler", this.f283337d, null, strArr);
    }
}
