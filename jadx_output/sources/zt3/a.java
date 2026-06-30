package zt3;

/* loaded from: classes10.dex */
public final class a extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f475576d;

    /* renamed from: e, reason: collision with root package name */
    public final bs0.j f475577e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f475578f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f475579g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f475580h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f475581i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.j0 f475582m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f475583n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f475584o;

    public a(androidx.lifecycle.y owner, bs0.j cameraUsage) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(cameraUsage, "cameraUsage");
        this.f475576d = owner;
        this.f475577e = cameraUsage;
        this.f475578f = new java.util.HashMap();
        this.f475579g = new java.util.HashMap();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f475580h = hashMap;
        this.f475581i = new androidx.lifecycle.j0();
        this.f475582m = new androidx.lifecycle.j0();
        hashMap.put(10, new androidx.lifecycle.j0());
        hashMap.put(11, new androidx.lifecycle.j0());
        hashMap.put(12, new androidx.lifecycle.j0());
        hashMap.put(13, new androidx.lifecycle.j0());
        hashMap.put(14, new androidx.lifecycle.j0());
        hashMap.put(15, new androidx.lifecycle.j0());
        hashMap.put(16, new androidx.lifecycle.j0());
        ((yy0.q7) ((pp0.n0) i95.n0.c(pp0.n0.class))).getClass();
        this.f475584o = py0.b.f358971a.a();
    }

    public static /* synthetic */ void U6(zt3.a aVar, int i17, int i18, android.os.Bundle bundle, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            bundle = null;
        }
        aVar.T6(i17, i18, bundle);
    }

    public static void V6(zt3.a aVar, int i17, boolean z17, android.os.Bundle bundle, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        boolean z27 = (i18 & 8) != 0 ? true : z18;
        boolean z28 = (i18 & 16) != 0 ? true : z19;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) aVar.f475579g.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.postValue(new zt3.c(i17, z17, bundle2, z27, z28));
    }

    public final int N6(int i17) {
        zt3.d dVar;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f475580h.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (dVar = (zt3.d) j0Var.getValue()) == null) {
            return 4;
        }
        return dVar.f475593b;
    }

    public final boolean O6(int i17) {
        zt3.c cVar;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f475579g.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null || (cVar = (zt3.c) j0Var.getValue()) == null) {
            return false;
        }
        return cVar.f475588b;
    }

    public final java.lang.Integer P6(int i17) {
        for (java.util.Map.Entry entry : this.f475578f.entrySet()) {
            if (((java.lang.Number) entry.getValue()).intValue() == i17) {
                return (java.lang.Integer) entry.getKey();
            }
        }
        return null;
    }

    public final void Q6(int i17, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f475580h.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.observe(this.f475576d, observer);
    }

    public final void R6(androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f475582m.observe(this.f475576d, observer);
    }

    public final void S6(int i17, androidx.lifecycle.k0 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f475579g.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.observe(this.f475576d, observer);
    }

    public final void T6(int i17, int i18, android.os.Bundle bundle) {
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f475580h.get(java.lang.Integer.valueOf(i17));
        if (j0Var == null) {
            return;
        }
        j0Var.postValue(new zt3.d(i17, i18, bundle));
    }

    public final void W6(int i17, boolean z17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (z17) {
            return;
        }
        db5.t7.m(context, i65.a.r(context, com.tencent.mm.R.string.f492724hm1));
        V6(this, i17, false, null, false, false, 28, null);
    }

    public final void X6(ku3.n0 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f475581i.postValue(value);
    }
}
