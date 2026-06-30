package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f195041a;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.util.Map f195042b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f195043c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f195045e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f195047g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f195048h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.storage.m3 f195049i;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f195044d = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f195046f = false;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f195050j = new com.tencent.mm.storage.i3(this);

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0137, code lost:
    
        if (r11 != 0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j3(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.j3.<init>(java.lang.String):void");
    }

    public synchronized java.lang.Object a(int i17) {
        java.lang.Object obj = this.f195042b.get(java.lang.Integer.valueOf(i17));
        if (!i()) {
            return obj;
        }
        java.lang.Object c17 = this.f195049i.c(i17, null);
        if (!java.util.Objects.equals(obj, c17)) {
            this.f195049i.h(16);
            this.f195049i.k(null, false, 0L, 0L, 0L, java.lang.String.valueOf(i17), java.lang.String.valueOf(obj), java.lang.String.valueOf(c17), 16, false);
            this.f195042b.put(java.lang.Integer.valueOf(i17), c17);
        }
        return c17;
    }

    public synchronized java.lang.Object b(int i17, java.lang.Object obj) {
        java.lang.Object obj2 = this.f195042b.get(java.lang.Integer.valueOf(i17));
        if (!i()) {
            return obj2 == null ? obj : obj2;
        }
        java.lang.Object c17 = this.f195049i.c(i17, obj);
        if (!java.util.Objects.equals(obj2, c17)) {
            this.f195049i.h(17);
            this.f195049i.k(null, false, 0L, 0L, 0L, java.lang.String.valueOf(i17), java.lang.String.valueOf(obj2), java.lang.String.valueOf(c17), 17, false);
            this.f195042b.put(java.lang.Integer.valueOf(i17), c17);
        }
        return c17 == null ? obj : c17;
    }

    public synchronized int c(int i17, int i18) {
        if (i()) {
            java.lang.Object c17 = this.f195049i.c(i17, java.lang.Integer.valueOf(i18));
            if (c17 instanceof java.lang.Integer) {
                i18 = ((java.lang.Integer) c17).intValue();
            }
            return i18;
        }
        java.lang.Object b17 = b(i17, java.lang.Integer.valueOf(i18));
        if (!(b17 instanceof java.lang.Integer)) {
            return i18;
        }
        return ((java.lang.Integer) b17).intValue();
    }

    public synchronized long d(int i17, long j17) {
        if (i()) {
            return this.f195049i.d(i17, j17);
        }
        java.lang.Object b17 = b(i17, java.lang.Long.valueOf(j17));
        if (!(b17 instanceof java.lang.Long)) {
            return j17;
        }
        return ((java.lang.Long) b17).longValue();
    }

    public void e(int i17) {
        com.tencent.mm.storage.m3 m3Var = this.f195049i;
        if (m3Var != null) {
            m3Var.h(i17);
            this.f195049i.j(i17, null);
        }
    }

    public synchronized void f(int i17, java.lang.Object obj) {
        this.f195046f = true;
        if (i()) {
            this.f195049i.l(i17, obj);
        }
        if (this.f195042b != null) {
            this.f195042b.put(java.lang.Integer.valueOf(i17), obj);
        }
        if (!this.f195048h) {
            j();
        }
    }

    public void finalize() {
        com.tencent.mm.storage.m3 m3Var;
        super.finalize();
        if (this.f195045e && this.f195046f && (m3Var = this.f195049i) != null) {
            m3Var.h(27);
            this.f195049i.j(27, null);
        }
    }

    public synchronized void g(int i17, int i18) {
        f(i17, java.lang.Integer.valueOf(i18));
    }

    public synchronized void h(int i17, long j17) {
        f(i17, java.lang.Long.valueOf(j17));
    }

    public boolean i() {
        com.tencent.mm.storage.m3 m3Var = this.f195049i;
        return m3Var != null && m3Var.f195112a;
    }

    public final synchronized void j() {
        if (!i()) {
            k();
            return;
        }
        if (i() && this.f195047g) {
            this.f195049i.n(this.f195042b);
        }
        ((ku5.t0) ku5.t0.f312615d).A(java.lang.Integer.toString(hashCode()));
        ((ku5.t0) ku5.t0.f312615d).l(this.f195050j, 100L, java.lang.Integer.toString(hashCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0110: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:80:0x0110 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void k() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.j3.k():void");
    }
}
