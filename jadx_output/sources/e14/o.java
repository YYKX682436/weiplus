package e14;

/* loaded from: classes12.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f246432a;

    /* renamed from: b, reason: collision with root package name */
    public int f246433b;

    /* renamed from: c, reason: collision with root package name */
    public int f246434c;

    /* renamed from: d, reason: collision with root package name */
    public int f246435d;

    public o(int i17) {
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.f246432a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public final java.lang.Object a(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        synchronized (this) {
            java.lang.Object obj2 = this.f246432a.get(obj);
            if (obj2 != null) {
                this.f246434c++;
                return obj2;
            }
            this.f246435d++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f246433b     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 + 1
            r1.f246433b = r0     // Catch: java.lang.Throwable -> L7c
            java.util.LinkedHashMap r0 = r1.f246432a     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r2 = r0.put(r2, r3)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L15
            int r3 = r1.f246433b     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + (-1)
            r1.f246433b = r3     // Catch: java.lang.Throwable -> L7c
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7c
        L16:
            monitor-enter(r1)
            int r3 = r1.f246433b     // Catch: java.lang.Throwable -> L79
            if (r3 < 0) goto L5c
            java.util.LinkedHashMap r3 = r1.f246432a     // Catch: java.lang.Throwable -> L79
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L27
            int r3 = r1.f246433b     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L5c
        L27:
            int r3 = r1.f246433b     // Catch: java.lang.Throwable -> L79
            r0 = 32
            if (r3 <= r0) goto L5a
            java.util.LinkedHashMap r3 = r1.f246432a     // Catch: java.lang.Throwable -> L79
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L36
            goto L5a
        L36:
            java.util.LinkedHashMap r3 = r1.f246432a     // Catch: java.lang.Throwable -> L79
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L79
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r3.getKey()     // Catch: java.lang.Throwable -> L79
            r3.getValue()     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashMap r3 = r1.f246432a     // Catch: java.lang.Throwable -> L79
            r3.remove(r0)     // Catch: java.lang.Throwable -> L79
            int r3 = r1.f246433b     // Catch: java.lang.Throwable -> L79
            int r3 = r3 + (-1)
            r1.f246433b = r3     // Catch: java.lang.Throwable -> L79
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            goto L16
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            return r2
        L5c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L79
            java.lang.Class<e14.o> r3 = e14.o.class
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r0.<init>()     // Catch: java.lang.Throwable -> L79
            r0.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L79
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L79
            throw r2     // Catch: java.lang.Throwable -> L79
        L79:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            throw r2
        L7c:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7c
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e14.o.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object remove;
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f246432a.remove(obj);
            if (remove != null) {
                this.f246433b--;
            }
        }
        return remove;
    }

    public final synchronized java.lang.String toString() {
        int i17;
        int i18;
        i17 = this.f246434c;
        i18 = this.f246435d + i17;
        return java.lang.String.format(java.util.Locale.getDefault(), "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", 32, java.lang.Integer.valueOf(this.f246434c), java.lang.Integer.valueOf(this.f246435d), java.lang.Integer.valueOf(i18 != 0 ? (i17 * 100) / i18 : 0));
    }
}
