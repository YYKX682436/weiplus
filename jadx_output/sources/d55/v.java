package d55;

/* loaded from: classes12.dex */
public class v implements d55.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f226617a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f226618b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f226619c;

    public v(android.content.Context context, java.lang.String str) {
        java.io.File file = new java.io.File(new java.io.File(context.getFilesDir().getParentFile(), "MicroMsg/recovery"), str);
        this.f226618b = new android.os.Bundle();
        this.f226619c = new java.util.concurrent.atomic.AtomicBoolean();
        this.f226617a = new java.io.File(file, "fast_persist_data");
    }

    @Override // d55.x
    public d55.x a() {
        try {
            d55.m0.a(this.f226617a);
        } catch (java.lang.Throwable th6) {
            d55.q0.a("MicroMsg.recovery.fastPersist", "create persist dir fail", th6);
        }
        this.f226619c.set(true);
        return this;
    }

    public final void b() {
        if (!this.f226619c.get()) {
            throw new java.lang.IllegalStateException("Persis#load() has not yet been called");
        }
    }

    @Override // d55.x
    public /* bridge */ /* synthetic */ d55.x c() {
        g();
        return this;
    }

    @Override // d55.x
    public d55.x d() {
        g();
        return this;
    }

    public d55.x e(java.lang.String str) {
        b();
        this.f226618b.remove(str);
        android.util.Pair f17 = f(str);
        if (f17 != null) {
            d55.m0.d((java.io.File) f17.second);
        }
        return this;
    }

    public final android.util.Pair f(java.lang.String str) {
        java.io.File[] fileArr;
        java.lang.String name;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            fileArr = this.f226617a.listFiles();
            if (fileArr == null) {
                fileArr = new java.io.File[0];
            }
        } catch (java.lang.Throwable unused) {
            fileArr = new java.io.File[0];
        }
        int length = fileArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.io.File file = fileArr[i17];
            try {
                name = file.getName();
            } finally {
                try {
                } finally {
                }
            }
            if (name.startsWith(".FP") && name.contains("__KEY__")) {
                java.lang.String substring = name.substring(name.indexOf("__KEY__") + 7);
                if (!substring.contains("__VALUE__")) {
                    arrayList.add(file);
                } else {
                    if (substring.substring(0, substring.indexOf("__VALUE__")).equals(str)) {
                        return new android.util.Pair(substring.substring(substring.indexOf("__VALUE__") + 9), file);
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d55.m0.d((java.io.File) it.next());
                    }
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                d55.m0.d((java.io.File) it6.next());
            }
        }
        return null;
    }

    public d55.v g() {
        b();
        android.os.Bundle bundle = this.f226618b;
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                android.util.Pair f17 = f(str);
                if (f17 != null) {
                    d55.m0.d((java.io.File) f17.second);
                }
                try {
                    d55.m0.b(new java.io.File(this.f226617a, ".FP__KEY__" + str + "__VALUE__" + obj));
                } catch (java.lang.Throwable th6) {
                    d55.q0.a("MicroMsg.recovery.fastPersist", "create file pair store fail", th6);
                }
            }
        }
        return this;
    }

    @Override // d55.x
    public boolean getBoolean(java.lang.String str, boolean z17) {
        b();
        android.os.Bundle bundle = this.f226618b;
        if (bundle.containsKey(str)) {
            return bundle.getBoolean(str);
        }
        android.util.Pair f17 = f(str);
        if (f17 != null) {
            java.lang.String str2 = (java.lang.String) f17.first;
            if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("false")) {
                return java.lang.Boolean.parseBoolean(str2);
            }
        }
        return z17;
    }

    @Override // d55.x
    public int getInt(java.lang.String str, int i17) {
        return d55.n0.d(getLong(str, i17), i17);
    }

    @Override // d55.x
    public long getLong(java.lang.String str, long j17) {
        b();
        android.os.Bundle bundle = this.f226618b;
        if (bundle.containsKey(str)) {
            return bundle.getLong(str);
        }
        android.util.Pair f17 = f(str);
        if (f17 != null) {
            java.lang.String str2 = (java.lang.String) f17.first;
            if (d55.n0.b(str2)) {
                try {
                    return java.lang.Long.parseLong(str2);
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        return j17;
    }

    @Override // d55.x
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        b();
        android.os.Bundle bundle = this.f226618b;
        if (bundle.containsKey(str)) {
            return bundle.getString(str);
        }
        android.util.Pair f17 = f(str);
        return f17 != null ? (java.lang.String) f17.first : str2;
    }

    @Override // d55.x
    public d55.x putBoolean(java.lang.String str, boolean z17) {
        this.f226618b.putBoolean(str, z17);
        return this;
    }

    @Override // d55.x
    public d55.x putInt(java.lang.String str, int i17) {
        this.f226618b.putLong(str, i17);
        return this;
    }

    @Override // d55.x
    public d55.x putLong(java.lang.String str, long j17) {
        this.f226618b.putLong(str, j17);
        return this;
    }

    @Override // d55.x
    public d55.x putString(java.lang.String str, java.lang.String str2) {
        this.f226618b.putString(str, str2);
        return this;
    }
}
