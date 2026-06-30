package yw;

/* loaded from: classes11.dex */
public final class a3 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f466269d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f466270e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f466271f;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f466273h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f466274i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f466275j;

    /* renamed from: a, reason: collision with root package name */
    public static final yw.a3 f466266a = new yw.a3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f466267b = jz5.h.b(yw.w2.f466496d);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f466268c = yw.x0.f466500a.b();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f466272g = true;

    static {
        com.tencent.wechat.mm.brand_service.z.f219257a = yw.y2.f466515a;
        if (com.tencent.mm.sdk.platformtools.x2.n() && ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f312615d).a(yw.t2.f466471d);
        }
    }

    public final com.tencent.wechat.mm.brand_service.i a() {
        com.tencent.wechat.mm.brand_service.b bVar;
        if (f466270e && f466274i) {
            bVar = com.tencent.wechat.mm.brand_service.b.f218850b;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBrandServiceBridge", "getAffBrandServiceRedDotManagerInstance hasInit=" + f466270e + " zidl2IvokeReady:" + f466274i);
            f466275j = true;
            bVar = null;
        }
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final com.tencent.wechat.aff.brand_service.v b() {
        if (f466270e) {
            return com.tencent.wechat.aff.brand_service.v.f216049c;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBrandServiceBridge", "getBizManagerInstance hasInit=" + f466270e);
        return null;
    }

    public final com.tencent.wechat.mm.brand_service.g0 c() {
        if (f466270e && f466274i) {
            return com.tencent.wechat.mm.brand_service.g0.f218913c;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBrandServiceBridge", "getBrandServiceNotiManagerInstance hasInit=" + f466270e + " zidl2IvokeReady:" + f466274i);
        f466275j = true;
        return null;
    }

    public final com.tencent.wechat.aff.brand_service.a d() {
        if (f466270e && f466274i) {
            return com.tencent.wechat.aff.brand_service.a.f216045b;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBrandServiceBridge", "getReportMgr hasInit=" + f466270e + " zidl2IvokeReady:" + f466274i);
        f466275j = true;
        return null;
    }

    public final synchronized void e() {
        if (f466269d) {
            return;
        }
        f466269d = true;
        if (f466270e) {
            return;
        }
        if (gm0.j1.h() && gm0.j1.a()) {
            zv.q qVar = zv.q.f476079a;
            if (!qVar.g()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init but not use aff ");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBrandServiceBridge", sb6.toString());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBrandServiceBridge", "init resetData= " + f466273h);
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
            zv.l.f476016a.b(qVar.f());
            dw.f.f244070a.c();
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("brand_service_persist"), false);
            java.lang.String j17 = gm0.j1.b().j();
            com.tencent.wechat.mm.brand_service.jni.BrandServiceAffBridge.INSTANCE.setCallBack(new aw.a());
            if (!com.tencent.mm.vfs.w6.j(i17)) {
                com.tencent.mm.vfs.w6.u(i17);
            }
            com.tencent.wechat.mm.brand_service.f fVar = new com.tencent.wechat.mm.brand_service.f();
            fVar.f218884d = false;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            fVar.f218885e = false;
            java.lang.Boolean bool = f466273h;
            fVar.f218886f = bool != null ? bool.booleanValue() : false;
            fVar.f218887g = f466268c;
            fVar.f218888h = yw.h1.f466339h;
            fVar.f218889i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
            x20.a aVar = x20.a.f451484a;
            aVar.getClass();
            fVar.f218890m = ((java.lang.Number) x20.a.f451486c.b(aVar, x20.a.f451485b[0])).intValue() == 1 ? com.tencent.wechat.mm.brand_service.g.kBizAffInitConfigAbstractTypeUnreadNotiDigestAlwaysShowInBox : com.tencent.wechat.mm.brand_service.g.kBizAffInitConfigAbstractTypeNone;
            fVar.f218901x = aVar.d();
            fVar.A = aVar.c();
            fVar.B = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgKeepPosEndResortSwitch", 0) == 1;
            fVar.C = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgSerialResortReqSwitch", 0) == 1;
            com.tencent.wechat.aff.brand_service.v.f216049c.g(i17, j17, o45.wf.f343029g, fVar, yw.u2.f466478a);
            ow.i iVar = ow.i.f349251d;
            com.tencent.wechat.mm.brand_service.g0 g0Var = com.tencent.wechat.mm.brand_service.g0.f218913c;
            g0Var.i("notimsg-edit", new ow.e(iVar));
            g0Var.j("notimsg-insert", new ow.f(iVar));
            g0Var.h("notimsg-del", new ow.g(iVar));
            g0Var.k("notimsg-readed", new ow.h(iVar));
            f466270e = true;
            f466269d = false;
            f();
            ((ku5.t0) ku5.t0.f312615d).B(yw.v2.f466483d);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBrandServiceBridge", "hy: account not ready yet!");
    }

    public final void f() {
        com.tencent.wechat.mm.brand_service.f fVar = new com.tencent.wechat.mm.brand_service.f();
        x20.a aVar = x20.a.f451484a;
        fVar.f218891n = aVar.b();
        f06.v[] vVarArr = x20.a.f451485b;
        fVar.f218894q = ((java.lang.Number) x20.a.f451495l.b(aVar, vVarArr[8])).intValue();
        fVar.f218896s = ((java.lang.Number) x20.a.f451498o.b(aVar, vVarArr[11])).intValue();
        fVar.f218897t = ((java.lang.Number) x20.a.f451499p.b(aVar, vVarArr[12])).intValue();
        fVar.f218898u = ((java.lang.Number) x20.a.f451500q.b(aVar, vVarArr[13])).intValue();
        fVar.f218899v = ((java.lang.Number) x20.a.f451501r.b(aVar, vVarArr[14])).intValue();
        fVar.f218901x = aVar.d();
        fVar.f218902y = ((java.lang.Number) x20.a.f451508y.b(aVar, vVarArr[21])).intValue();
        fVar.f218900w = (java.lang.String) x20.a.f451506w.b(aVar, vVarArr[19]);
        fVar.A = aVar.c();
        fVar.B = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgKeepPosEndResortSwitch", 0) == 1;
        fVar.C = ((lr1.t) ((ww.e) i95.n0.c(ww.e.class))).wi().o("ReSortBizMsgSerialResortReqSwitch", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBrandServiceBridge", "[BRS]updateBSConfig subscribeCountLowerLimit: " + fVar.f218891n + ", requestFrequencyTime: " + fVar.f218894q + ", requestNotifyFrequencyTime: " + fVar.f218896s + "requestMassMsgCount: " + fVar.f218897t + "requestNotifyMsgFrequencyTime: " + fVar.f218898u + "requestMainTabFrequencyTime: " + fVar.f218899v + "notifyExpireSpecifiedTime: " + fVar.f218901x + "requestReliableNotifyFrequencyTime: " + fVar.f218902y + "requestCgiBufferMaxSize: " + fVar.A + "strategyBuffer: " + fVar.f218900w);
        com.tencent.wechat.aff.brand_service.v.f216049c.w(fVar, yw.z2.f466520a);
    }
}
