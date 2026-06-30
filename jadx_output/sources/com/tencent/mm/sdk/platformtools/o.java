package com.tencent.mm.sdk.platformtools;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f192885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f192886b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f192887c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f192888d;

    /* renamed from: e, reason: collision with root package name */
    public long f192889e;

    public o(long j17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 1) != 0 ? 900L : j17;
        i17 = (i18 & 2) != 0 ? 3 : i17;
        this.f192885a = j17;
        this.f192886b = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("_slots_id");
        sb6.append(j17 == 900 ? "" : "_" + j17);
        sb6.append('_');
        this.f192887c = sb6.toString();
        long[] jArr = new long[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            jArr[i19] = -1;
        }
        this.f192888d = jArr;
        this.f192889e = java.lang.System.currentTimeMillis() / (this.f192885a * 1000);
    }

    public static /* synthetic */ java.lang.Object h(com.tencent.mm.sdk.platformtools.o oVar, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSlotByKey");
        }
        if ((i17 & 2) != 0) {
            j17 = -1;
        }
        return oVar.g(str, j17);
    }

    public final void a() {
        int i17 = this.f192886b;
        if (i17 < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            b(-1L, h(this, e(i18), 0L, 2, null));
            if (i18 == i17) {
                return;
            } else {
                i18++;
            }
        }
    }

    public abstract void b(long j17, java.lang.Object obj);

    public abstract boolean c(java.lang.Object obj, java.lang.String str);

    public final java.lang.Object d(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        k();
        long currentTimeMillis = java.lang.System.currentTimeMillis() / (this.f192885a * 1000);
        int i17 = this.f192886b;
        long j17 = i17;
        long j18 = (currentTimeMillis % j17) + j17;
        long j19 = 3;
        int i18 = (int) (j18 % j19);
        java.lang.Object g17 = g(e(i18), currentTimeMillis);
        boolean c17 = c(g17, key);
        long[] jArr = this.f192888d;
        if (c17) {
            jArr[i18] = -1;
        } else {
            g17 = null;
        }
        if (g17 != null) {
            return g17;
        }
        long j27 = currentTimeMillis - 1;
        long j28 = i17;
        int i19 = (int) (((j27 % j28) + j28) % j19);
        java.lang.Object g18 = g(e(i19), j27);
        if (c(g18, key)) {
            jArr[i19] = -1;
        } else {
            g18 = null;
        }
        if (g18 != null) {
            return g18;
        }
        return null;
    }

    public final java.lang.String e(int i17) {
        return f() + (i17 % this.f192886b);
    }

    public java.lang.String f() {
        return this.f192887c;
    }

    public abstract java.lang.Object g(java.lang.String str, long j17);

    public final java.lang.Object i() {
        k();
        long currentTimeMillis = java.lang.System.currentTimeMillis() / (this.f192885a * 1000);
        long j17 = this.f192886b;
        return g(e((int) (((currentTimeMillis % j17) + j17) % 3)), currentTimeMillis);
    }

    public abstract void j(java.lang.String str, long j17);

    public final void k() {
        long[] jArr;
        int i17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() / (this.f192885a * 1000);
        boolean z17 = this.f192889e != currentTimeMillis;
        this.f192889e = currentTimeMillis;
        long j17 = currentTimeMillis - 1;
        long j18 = currentTimeMillis + 1;
        if (j17 > j18) {
            return;
        }
        long j19 = j17;
        while (true) {
            long j27 = this.f192886b;
            int i18 = (int) (((j19 % j27) + j27) % 3);
            java.lang.String e17 = e(i18);
            long[] jArr2 = this.f192888d;
            if (z17 || jArr2[i18] != j19) {
                if (l(e17, j19)) {
                    jArr = jArr2;
                    i17 = i18;
                } else {
                    jArr = jArr2;
                    i17 = i18;
                    b(j19, h(this, e17, 0L, 2, null));
                    if (j19 == currentTimeMillis) {
                        j(e17, j19);
                    }
                }
                jArr[i17] = j19;
            }
            if (j19 == j18) {
                return;
            } else {
                j19++;
            }
        }
    }

    public abstract boolean l(java.lang.String str, long j17);
}
