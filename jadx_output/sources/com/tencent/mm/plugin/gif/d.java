package com.tencent.mm.plugin.gif;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.gif.d f142127c;

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f142128a = new jt0.j(10);

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f142129b = new jt0.j(10, new com.tencent.mm.plugin.gif.c(this));

    public static synchronized com.tencent.mm.plugin.gif.d c() {
        com.tencent.mm.plugin.gif.d dVar;
        synchronized (com.tencent.mm.plugin.gif.d.class) {
            if (f142127c == null) {
                synchronized (com.tencent.mm.plugin.gif.d.class) {
                    if (f142127c == null) {
                        f142127c = new com.tencent.mm.plugin.gif.d();
                    }
                }
            }
            dVar = f142127c;
        }
        return dVar;
    }

    public com.tencent.mm.plugin.gif.b a(java.lang.String str, java.lang.String str2) {
        kk.j jVar = this.f142129b;
        com.tencent.mm.plugin.gif.b bVar = ((lt0.f) jVar).get(str) != null ? (com.tencent.mm.plugin.gif.b) ((java.lang.ref.WeakReference) ((lt0.f) jVar).get(str)).get() : null;
        if (bVar == null) {
            java.lang.System.currentTimeMillis();
            bVar = com.tencent.mm.sdk.platformtools.y1.g(str2) ? new com.tencent.mm.plugin.gif.u(com.tencent.mm.vfs.w6.N(str2, 0, (int) com.tencent.mm.vfs.w6.k(str2))) : new com.tencent.mm.plugin.gif.k(str2);
            java.lang.System.currentTimeMillis();
            ((lt0.f) jVar).put(str, new java.lang.ref.WeakReference(bVar));
        }
        return bVar;
    }

    public com.tencent.mm.plugin.gif.b b(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        kk.j jVar = this.f142129b;
        com.tencent.mm.plugin.gif.b bVar = ((lt0.f) jVar).get(str) != null ? (com.tencent.mm.plugin.gif.b) ((java.lang.ref.WeakReference) ((lt0.f) jVar).get(str)).get() : null;
        if (bVar == null) {
            if (com.tencent.mm.sdk.platformtools.y1.h(bArr)) {
                ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
                if (gr.z.b()) {
                    bVar = new com.tencent.mm.plugin.gif.u(bArr);
                    ((lt0.f) jVar).put(str, new java.lang.ref.WeakReference(bVar));
                }
            }
            bVar = new com.tencent.mm.plugin.gif.k(bArr, false);
            ((lt0.f) jVar).put(str, new java.lang.ref.WeakReference(bVar));
        }
        if (!bVar.isRunning()) {
            bVar.c();
        }
        return bVar;
    }
}
