package com.tencent.xweb;

/* loaded from: classes13.dex */
public class c0 implements tx5.d {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.xweb.c0 f220218b;

    /* renamed from: a, reason: collision with root package name */
    public tx5.d f220219a;

    public static synchronized com.tencent.xweb.c0 a() {
        com.tencent.xweb.c0 c0Var;
        synchronized (com.tencent.xweb.c0.class) {
            if (f220218b == null) {
                f220218b = new com.tencent.xweb.c0();
            }
            c0Var = f220218b;
        }
        return c0Var;
    }

    @Override // tx5.d
    public tx5.c getOrCreateProfile(java.lang.String str) {
        by5.a1.a();
        tx5.d dVar = this.f220219a;
        if (dVar != null) {
            return dVar.getOrCreateProfile(str);
        }
        return null;
    }
}
