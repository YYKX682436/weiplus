package oh1;

/* loaded from: classes4.dex */
public enum j2 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f345241d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f345242e = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f345243f = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public int f345244g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f345245h = 0;

    j2() {
    }

    public static void a(oh1.j2 j2Var, java.util.LinkedList linkedList) {
        j2Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.zr6 zr6Var = (r45.zr6) it.next();
            oh1.e2 e2Var = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) j2Var.f345241d).get(java.lang.Integer.valueOf(zr6Var.f392339d.hashCode()));
            if (e2Var == null) {
                return;
            }
            e2Var.f345206c = zr6Var.f392343h;
            e2Var.f345207d = java.lang.System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(oh1.j2 r10, java.util.LinkedList r11, int r12) {
        /*
            r10.getClass()
            java.util.Iterator r11 = r11.iterator()
        L7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r11.next()
            r45.zr6 r0 = (r45.zr6) r0
            r1 = 1
            if (r12 != r1) goto L2f
            java.lang.String r1 = r0.f392339d
            java.util.Map r2 = r10.f345241d
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r1 = r2.get(r1)
            oh1.e2 r1 = (oh1.e2) r1
            if (r1 == 0) goto L2f
            java.lang.String r1 = r1.f345209f
            goto L31
        L2f:
            java.lang.String r1 = ""
        L31:
            java.lang.Class<k01.x0> r2 = k01.x0.class
            i95.m r2 = i95.n0.c(r2)
            k01.x0 r2 = (k01.x0) r2
            java.lang.String r3 = r0.f392339d
            java.lang.String r4 = r0.f392341f
            java.lang.String r5 = r0.f392342g
            int r6 = r0.f392343h
            int r0 = r0.f392344i
            oh1.k2 r2 = (oh1.k2) r2
            r2.getClass()
            java.lang.Class<tt0.f> r2 = tt0.f.class
            java.lang.Object r2 = com.tencent.mm.plugin.appbrand.app.r9.fj(r2)
            tt0.f r2 = (tt0.f) r2
            if (r2 != 0) goto L5b
            java.lang.String r0 = "MicroMsg.WxaUpdateableMsgService"
            java.lang.String r1 = "wxaUpdateableMsgStorage is null, err"
            com.tencent.mars.xlog.Log.e(r0, r1)
            goto L7
        L5b:
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r7 == 0) goto L6a
            java.lang.String r0 = "MicroMsg.WxaUpdateableMsgStorage"
            java.lang.String r1 = "shareKey is null, err"
            com.tencent.mars.xlog.Log.e(r0, r1)
            goto L93
        L6a:
            tt0.e r7 = new tt0.e
            r7.<init>()
            int r8 = r3.hashCode()
            r7.field_shareKeyHash = r8
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[r8]
            boolean r9 = r2.get(r7, r9)
            r7.field_updatePeroid = r6
            r7.field_msgState = r0
            r7.field_content = r4
            r7.field_contentColor = r5
            r7.field_msgType = r12
            r7.field_weAppSourceUserName = r1
            if (r9 == 0) goto L90
            java.lang.String[] r0 = new java.lang.String[r8]
            r2.update(r7, r0)
            goto L93
        L90:
            r2.insert(r7)
        L93:
            r3.getClass()
            goto L7
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oh1.j2.b(oh1.j2, java.util.LinkedList, int):void");
    }

    public static void d(oh1.j2 j2Var, java.util.LinkedList linkedList) {
        j2Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.zr6 zr6Var = (r45.zr6) it.next();
            oh1.e2 e2Var = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) j2Var.f345241d).get(java.lang.Integer.valueOf(zr6Var.f392339d.hashCode()));
            if (e2Var == null) {
                return;
            }
            k01.w0 w0Var = e2Var.f345210g;
            if (w0Var != null) {
                w0Var.a(zr6Var.f392339d, zr6Var);
            }
        }
    }

    public static void e(oh1.j2 j2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        java.util.Map map;
        j2Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = j2Var.f345241d;
            if (!hasNext) {
                break;
            }
            oh1.e2 e2Var = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(((r45.l46) it.next()).f379128e.hashCode()));
            if (e2Var == null) {
                break;
            } else {
                e2Var.f345207d = java.lang.System.currentTimeMillis();
            }
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            oh1.e2 e2Var2 = (oh1.e2) ((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Integer.valueOf(((r45.l46) it6.next()).f379128e.hashCode()));
            if (e2Var2 == null) {
                return;
            } else {
                e2Var2.f345207d = java.lang.System.currentTimeMillis();
            }
        }
    }

    public static void f(oh1.j2 j2Var) {
        synchronized (j2Var) {
            if (java.lang.System.currentTimeMillis() - j2Var.f345245h > 300000) {
                j2Var.f345244g = 0;
            }
            if (j2Var.f345244g <= 1) {
                j2Var.f345245h = java.lang.System.currentTimeMillis();
                j2Var.f345244g++;
                j2Var.h();
            }
        }
    }

    public final void h() {
        ((ku5.t0) ku5.t0.f312615d).b(new oh1.f2(this), "MicroMsg.WxaUpdateableMsgService");
    }
}
