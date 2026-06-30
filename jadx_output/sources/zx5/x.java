package zx5;

/* loaded from: classes13.dex */
public class x implements ay5.c {

    /* renamed from: a, reason: collision with root package name */
    public static int f477280a;

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer c(zx5.f r22) {
        /*
            Method dump skipped, instructions count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx5.x.c(zx5.f):java.lang.Integer");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171 A[Catch: all -> 0x022c, IOException -> 0x022f, TryCatch #11 {IOException -> 0x022f, all -> 0x022c, blocks: (B:15:0x0113, B:17:0x0117, B:21:0x0129, B:23:0x0192, B:28:0x01a4, B:32:0x01bc, B:79:0x019a, B:80:0x01d7, B:82:0x014c, B:87:0x0171, B:88:0x018c, B:89:0x0153, B:91:0x015b, B:93:0x0163, B:97:0x0121), top: B:14:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018c A[Catch: all -> 0x022c, IOException -> 0x022f, TryCatch #11 {IOException -> 0x022f, all -> 0x022c, blocks: (B:15:0x0113, B:17:0x0117, B:21:0x0129, B:23:0x0192, B:28:0x01a4, B:32:0x01bc, B:79:0x019a, B:80:0x01d7, B:82:0x014c, B:87:0x0171, B:88:0x018c, B:89:0x0153, B:91:0x015b, B:93:0x0163, B:97:0x0121), top: B:14:0x0113 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer d(int r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx5.x.d(int, java.lang.String, java.lang.String):java.lang.Integer");
    }

    public void a(ay5.d dVar) {
        by5.c4.f("XWebRuntimeInstaller", "Core(" + dVar + ") install cancel.");
        zx5.i0.a();
    }

    public void b(ay5.d dVar) {
        by5.c4.f("XWebRuntimeInstaller", "Core(" + dVar + ") install start.");
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateStart");
        zx5.i0.d("start", 0, 0);
        yu5.c.b(new zx5.d0());
    }

    public void e(boolean z17) {
        java.lang.Object obj;
        ay5.d dVar = ay5.d.kEmbed;
        java.util.Map map = ay5.e.f15301a;
        synchronized (ay5.e.class) {
            java.util.Map map2 = ay5.e.f15301a;
            obj = (ay5.a) ((java.util.HashMap) map2).get(dVar);
            if (obj == null) {
                obj = new ay5.b();
                ((java.util.HashMap) map2).put(dVar, obj);
            }
        }
        final zx5.x xVar = z17 ? this : null;
        final ay5.b bVar = (ay5.b) obj;
        int d17 = org.xwalk.core.XWalkEnvironment.d();
        java.lang.String b17 = by5.a.b();
        if (!b17.equals("arm64-v8a")) {
            b17.equals("x86_64");
        }
        if (!(d17 <= 0 || d17 < 0)) {
            by5.c4.g("EmbedUpdater", "Cancel by No need to install.");
        } else {
            by5.c4.a("EmbedUpdater", "Start embed update.");
            new java.lang.Runnable() { // from class: ay5.b$$a
                @Override // java.lang.Runnable
                public final void run() {
                    ay5.b bVar2 = ay5.b.this;
                    bVar2.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    by5.c4.a("EmbedUpdater", "Do start embed update.");
                    new xx5.i();
                    bVar2.getClass();
                    ay5.d dVar2 = ay5.d.kEmbed;
                    ay5.c cVar = xVar;
                    if (cVar != null) {
                        ((zx5.x) cVar).b(dVar2);
                    }
                    java.lang.String b18 = by5.a.b();
                    if (b18.equals("arm64-v8a") || b18.equals("x86_64")) {
                        bVar2.getClass();
                        bVar2.getClass();
                        bVar2.getClass();
                    } else {
                        bVar2.getClass();
                        bVar2.getClass();
                        bVar2.getClass();
                    }
                    by5.c4.g("EmbedUpdater", "Cancel by SHOULD_EMEBED_XWEB_CORE is false.");
                    if (cVar != null) {
                        ((zx5.x) cVar).a(dVar2);
                    }
                    by5.c4.a("EmbedUpdater", "Finish embed update. cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }.run();
        }
    }
}
