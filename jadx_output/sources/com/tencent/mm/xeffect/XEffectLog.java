package com.tencent.mm.xeffect;

/* loaded from: classes10.dex */
public class XEffectLog {

    /* renamed from: a, reason: collision with root package name */
    public static tq5.n f214803a = new tq5.m(null);

    public static long a() {
        try {
            return nGetXLogImpl();
        } catch (java.lang.Throwable th6) {
            f214803a.e("XEffectLog", "get native log error %s", th6.getMessage());
            return 0L;
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        f214803a.w(str, str2, objArr);
    }

    private static native long nGetXLogImpl();
}
