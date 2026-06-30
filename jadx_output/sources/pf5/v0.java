package pf5;

/* loaded from: classes5.dex */
public final class v0 extends androidx.lifecycle.l1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f353940b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f353941c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f353942d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f353943e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f353944f;

    public v0(boolean z17) {
        this.f353940b = z17;
        this.f353941c = new java.lang.Object();
        this.f353944f = jz5.h.b(pf5.u0.f353937d);
        java.lang.reflect.Field declaredField = androidx.lifecycle.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        pf5.t0 t0Var = new pf5.t0(this);
        this.f353943e = t0Var;
        declaredField.set(this, t0Var);
    }

    public final void b(yz5.l isExecuteOnCleared) {
        kotlin.jvm.internal.o.g(isExecuteOnCleared, "isExecuteOnCleared");
        java.util.HashMap hashMap = this.f353943e;
        if (hashMap != null) {
            synchronized (this.f353941c) {
                this.f353940b = true;
                java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
                java.util.HashMap hashMap3 = new java.util.HashMap();
                java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
                kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                for (java.util.Map.Entry entry : entrySet) {
                    java.lang.Object value = entry.getValue();
                    kotlin.jvm.internal.o.f(value, "<get-value>(...)");
                    if (((java.lang.Boolean) isExecuteOnCleared.invoke(value)).booleanValue()) {
                        java.lang.Object key = entry.getKey();
                        kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                        java.lang.Object value2 = entry.getValue();
                        kotlin.jvm.internal.o.f(value2, "<get-value>(...)");
                        hashMap3.put(key, value2);
                    }
                }
                hashMap.clear();
                hashMap.putAll(hashMap3);
                a();
                hashMap.putAll(hashMap2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f353941c
            monitor-enter(r0)
            java.util.HashMap r1 = r2.f353943e     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lf
        Ld:
            java.lang.String r1 = "null"
        Lf:
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pf5.v0.toString():java.lang.String");
    }

    public /* synthetic */ v0(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
