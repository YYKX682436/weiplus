package g42;

@j95.b
/* loaded from: classes15.dex */
public class f extends i95.w implements q42.m, e42.z {

    /* renamed from: d, reason: collision with root package name */
    public q42.l f268721d;

    /* renamed from: e, reason: collision with root package name */
    public h42.c f268722e;

    /* renamed from: f, reason: collision with root package name */
    public h42.c f268723f;

    /* renamed from: g, reason: collision with root package name */
    public z42.b f268724g;

    /* renamed from: h, reason: collision with root package name */
    public u42.a f268725h;

    /* renamed from: i, reason: collision with root package name */
    public m42.a f268726i;

    /* renamed from: m, reason: collision with root package name */
    public n42.a f268727m;

    /* renamed from: n, reason: collision with root package name */
    public o42.b f268728n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f268729o = new g42.a(this, "EdgeComputingMgr#mExecuteScriptHandler");

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f268730p = new g42.b(this);

    public static g42.f Bi() {
        return (g42.f) i95.n0.c(g42.f.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void wi(g42.f r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 2493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g42.f.wi(g42.f, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0244 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x024f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map Ai(v42.b r27, s42.b r28, java.util.Map r29, long r30, long r32) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g42.f.Ai(v42.b, s42.b, java.util.Map, long, long):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0 > o42.b.f342832b) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(long r10, s42.b r12, java.lang.String r13) {
        /*
            r9 = this;
            if (r12 == 0) goto La7
            boolean r0 = u46.l.e(r13)
            if (r0 == 0) goto La
            goto La7
        La:
            o42.b r0 = r9.f268728n
            java.lang.String r1 = r12.f402931a
            r0.getClass()
            boolean r2 = u46.l.e(r1)
            r3 = 0
            if (r2 == 0) goto L19
            goto L4d
        L19:
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Map r2 = r0.f342837a
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r6 = r2.get(r1)
            o42.a r6 = (o42.a) r6
            if (r6 != 0) goto L31
            o42.a r6 = new o42.a
            r6.<init>(r0, r4, r3)
            r2.put(r1, r6)
        L31:
            long r0 = r6.f342830a
            long r0 = r4 - r0
            r7 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L42
            r6.f342830a = r4
            r6.f342831b = r1
            goto L4c
        L42:
            int r0 = r6.f342831b
            int r0 = r0 + r1
            r6.f342831b = r0
            int r2 = o42.b.f342832b
            if (r0 <= r2) goto L4c
            goto L4d
        L4c:
            r3 = r1
        L4d:
            java.lang.String r0 = "EdgeComputingMgr"
            if (r3 != 0) goto L65
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "[EdgeComputingMgr] onDataReceive reject handle for frequency configID : "
            r10.<init>(r11)
            java.lang.String r11 = r12.f402931a
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r0, r10)
            return
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[EdgeComputingMgr] onDataReceive configID : "
            r1.<init>(r2)
            java.lang.String r2 = r12.f402931a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            g42.i.a(r0, r1)
            java.lang.String r0 = r12.f402931a
            r1 = 3
            t42.a.b(r0, r1, r10)
            r42.a r0 = new r42.a
            r0.<init>()
            r0.f369511t = r13
            java.lang.String r13 = r12.f402931a
            r0.f369509r = r13
            r0.f369510s = r10
            com.tencent.mm.sdk.platformtools.n3 r10 = r9.f268729o
            g42.c r11 = new g42.c
            r11.<init>(r9, r12, r0)
            r10.post(r11)
            r11 = 1004(0x3ec, float:1.407E-42)
            r10.removeMessages(r11)
            r12 = 3000(0xbb8, double:1.482E-320)
            r10.sendEmptyMessageDelayed(r11, r12)
            r11 = 1002(0x3ea, float:1.404E-42)
            r10.removeMessages(r11)
            r10.sendEmptyMessageDelayed(r11, r12)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g42.f.Di(long, s42.b, java.lang.String):void");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        z42.b bVar = this.f268724g;
        x51.k0 k0Var = bVar.f470096a;
        if (k0Var != null) {
            k0Var.W(bVar.hashCode());
        }
        x51.k0 k0Var2 = null;
        bVar.f470096a = null;
        try {
            k0Var2 = x51.l0.a(bVar.hashCode(), gm0.j1.u().h() + "Edge.db", new java.util.HashMap(), true, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EdgeComputingDataStorage", "[EdgeComputingDataStorage] resetDB createDBInstance throw Exception : " + e17.getMessage());
        }
        if (k0Var2 != null) {
            bVar.f470096a = k0Var2;
        }
        ((h42.a) this.f268722e).b();
        ((h42.a) this.f268723f).b();
        if (g42.i.h()) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f268729o;
            n3Var.removeMessages(1003);
            n3Var.sendEmptyMessageDelayed(1003, 5000L);
        }
        this.f268730p.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        z42.b bVar = this.f268724g;
        x51.k0 k0Var = bVar.f470096a;
        if (k0Var != null) {
            k0Var.W(bVar.hashCode());
        }
        bVar.f470096a = null;
        h42.a aVar = (h42.a) this.f268722e;
        j42.f fVar = aVar.f278906a;
        if (fVar != null) {
            fVar.close();
        }
        aVar.f278906a = null;
        h42.a aVar2 = (h42.a) this.f268723f;
        j42.f fVar2 = aVar2.f278906a;
        if (fVar2 != null) {
            fVar2.close();
        }
        aVar2.f278906a = null;
        this.f268730p.dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        this.f268721d = new q42.l(this);
        this.f268722e = h42.b.a(1);
        this.f268723f = h42.b.a(2);
        this.f268725h = new u42.a();
        this.f268726i = new m42.a();
        this.f268727m = new n42.a();
        this.f268728n = new o42.b();
        this.f268724g = new z42.b();
    }
}
