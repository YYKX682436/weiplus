package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class k80 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f127055a = jz5.h.b(com.tencent.mm.plugin.finder.storage.i80.f126935d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f127056b = jz5.h.b(com.tencent.mm.plugin.finder.storage.j80.f126988d);

    /* renamed from: c, reason: collision with root package name */
    public boolean f127057c;

    public k80() {
        b();
    }

    public static final java.lang.String a(com.tencent.mm.plugin.finder.storage.k80 k80Var, java.lang.String str) {
        if (!((java.lang.Boolean) ((jz5.n) k80Var.f127055a).getValue()).booleanValue()) {
            return str + " size=" + k80Var.c().size();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        java.util.Iterator it = k80Var.c().entrySet().iterator();
        while (it.hasNext()) {
            sb6.append(((java.util.Map.Entry) it.next()).getValue());
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final synchronized void b() {
        if (!this.f127057c) {
            try {
                ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).wi(new com.tencent.mm.plugin.finder.storage.h80(this));
                this.f127057c = true;
            } catch (c01.c e17) {
                com.tencent.mars.xlog.Log.e("FinderConfigInitExptData", "addFinderInitCallback err, " + e17.getMessage());
            } catch (java.lang.IllegalStateException e18) {
                com.tencent.mars.xlog.Log.e("FinderConfigInitExptData", "addFinderInitCallback err, " + e18.getMessage());
            }
        }
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f127056b).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00af, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r9, java.lang.String r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.k80.d(int, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
