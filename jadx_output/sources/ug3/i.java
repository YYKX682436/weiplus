package ug3;

/* loaded from: classes11.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f427536g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f427537h = null;

    /* renamed from: i, reason: collision with root package name */
    public static java.util.ArrayList f427538i = null;

    /* renamed from: m, reason: collision with root package name */
    public static int f427539m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f427540n = -1;

    /* renamed from: o, reason: collision with root package name */
    public static int f427541o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f427542p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f427543q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static volatile boolean f427544r = true;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f427545s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public static l90.j f427546t = null;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f427547d;

    /* renamed from: e, reason: collision with root package name */
    public final int f427548e;

    /* renamed from: f, reason: collision with root package name */
    public final ug3.j f427549f;

    public i(int i17) {
        this.f427548e = 0;
        this.f427549f = null;
        f427539m = i17;
    }

    public static void H(final ug3.k kVar, final com.tencent.mm.modelsimple.r1 r1Var) {
        if (kVar == null || r1Var == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kVar.f392471n);
        int i17 = r1Var.f71406d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeDeviceAutoLogin iconType:%s, setting:%s", valueOf, java.lang.Integer.valueOf(i17));
        com.tencent.mm.protobuf.g gVar = kVar.f392465e;
        int i18 = kVar.f392470m;
        com.tencent.mm.modelsimple.k[] kVarArr = com.tencent.mm.modelsimple.k.f71353d;
        new com.tencent.mm.modelsimple.g(gVar, i18, 1, i17).l().q(new gm5.a() { // from class: ug3.i$$a
            @Override // gm5.a
            public final java.lang.Object call(java.lang.Object obj) {
                com.tencent.mm.modelsimple.r1 r1Var2 = com.tencent.mm.modelsimple.r1.this;
                ug3.k kVar2 = kVar;
                com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeDeviceAutoLogin errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
                if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                    return null;
                }
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.ghy, 0).show();
                if (r1Var2 == com.tencent.mm.modelsimple.r1.f71403e) {
                    kVar2.L = true;
                } else {
                    kVar2.L = false;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new ug3.i$$c());
                return null;
            }
        });
    }

    public static void I(final ug3.k kVar, final r45.l44 l44Var) {
        if (kVar == null || l44Var == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(kVar.f392471n);
        int i17 = l44Var.f379126d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeKeepLoggedIn iconType:%s, setting:%s", valueOf, java.lang.Integer.valueOf(i17));
        com.tencent.mm.protobuf.g gVar = kVar.f392465e;
        int i18 = kVar.f392470m;
        com.tencent.mm.modelsimple.k[] kVarArr = com.tencent.mm.modelsimple.k.f71353d;
        new com.tencent.mm.modelsimple.g(gVar, i18, 2, i17).l().q(new gm5.a() { // from class: ug3.i$$b
            @Override // gm5.a
            public final java.lang.Object call(java.lang.Object obj) {
                r45.l44 l44Var2 = r45.l44.this;
                ug3.k kVar2 = kVar;
                com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOnlineInfo", "changeKeepLoggedIn errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
                if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                    return null;
                }
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.mtf, 0).show();
                if (l44Var2 == r45.l44.kKeepLoggedInDisabled) {
                    kVar2.N = true;
                } else {
                    kVar2.N = false;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new ug3.i$$d());
                return null;
            }
        });
    }

    public static ug3.k J() {
        java.util.ArrayList arrayList = f427538i;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return (ug3.k) f427538i.get(0);
    }

    public static java.util.ArrayList K() {
        java.util.ArrayList arrayList = f427538i;
        return arrayList != null ? arrayList : new java.util.ArrayList();
    }

    public static boolean L() {
        ug3.k kVar;
        java.util.Iterator it = K().iterator();
        while (true) {
            if (!it.hasNext()) {
                kVar = null;
                break;
            }
            kVar = (ug3.k) it.next();
            if (!kVar.G && kVar.f427554J) {
                break;
            }
        }
        return kVar != null;
    }

    public static void M(ug3.l lVar) {
        java.util.List list = f427545s;
        synchronized (list) {
            ((java.util.ArrayList) list).add(lVar);
        }
        if (f427544r) {
            N();
        }
    }

    public static void N() {
        java.util.ArrayList arrayList;
        java.util.List list = f427545s;
        synchronized (list) {
            arrayList = new java.util.ArrayList(list);
            ((java.util.ArrayList) list).clear();
        }
        boolean L = L();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iy4.b1 b1Var = (iy4.b1) ((ug3.l) it.next());
            b1Var.getClass();
            if (L) {
                android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.webwx.ui.WebWXUnlockUI.class);
                intent.setFlags(872415232);
                intent.putExtra("deviceName", b1Var.f295932a);
                intent.putExtra("lockDevice", b1Var.f295933b);
                intent.putExtra("uuid", b1Var.f295934c);
                intent.putExtra("unlockTitle", iy4.c1.f295938d);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension$2", "onOnlineInfoReady", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webwx/model/StatusNotifyMsgExtension$2", "onOnlineInfoReady", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        f427544r = false;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.rj3 rj3Var = new r45.rj3();
        rj3Var.f384943d = com.tencent.mm.sdk.platformtools.m2.d();
        rj3Var.f384946g = this.f427548e;
        lVar.f70664a = rj3Var;
        lVar.f70665b = new r45.sj3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getonlineinfo";
        lVar.f70667d = uc1.x1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f427547d = u0Var;
        return dispatch(sVar, lVar.a(), this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return uc1.x1.CTRL_INDEX;
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0472  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r25, int r26, int r27, java.lang.String r28, com.tencent.mm.network.v0 r29, byte[] r30) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug3.i.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    public i(int i17, int i18, ug3.j jVar) {
        this.f427548e = 0;
        this.f427549f = null;
        f427539m = i17;
        this.f427548e = i18;
        this.f427549f = jVar;
    }
}
