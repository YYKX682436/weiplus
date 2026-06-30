package com.tencent.mm.plugin.zero;

@j95.b
/* loaded from: classes12.dex */
public class m1 extends i95.w implements a25.v {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f188659g = {6, 6, 0, 1, 2, 3, 4, 5};

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.zero.a f188660d = new com.tencent.mm.plugin.zero.a();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.zero.k1 f188661e = new com.tencent.mm.plugin.zero.k1();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.zero.j1 f188662f = new com.tencent.mm.plugin.zero.j1();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        new com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent().e();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        boolean z17;
        im0.a.a("configure [%s], setup broken library handler...", this);
        com.tencent.stubs.logger.Log.setLogger(new com.tencent.mm.plugin.zero.f1(this));
        jm5.b.f300456a = new com.tencent.mm.plugin.zero.g1(this);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            im0.a.a("configure [%s], for process[%s]...", this, bm5.f1.a());
            lm0.f fVar = new lm0.f(this.f188660d);
            gm0.j1.i();
            gm0.j1.o().f273294a.a(c25.e.class, fVar);
            im0.a.a("configure [%s], make worker core...", this);
            gm0.j1 i17 = gm0.j1.i();
            if (!i17.f273218k) {
                i17.f273211d = new gm0.b0();
                i17.f273212e = new gm0.m(im0.g.f292167g);
                i17.f273213f = new gm0.y(i17.f273215h, i17.f273216i);
                i17.f273218k = true;
            }
            synchronized (wo.w0.f447860v) {
                z17 = wo.w0.f447862x;
            }
            if (z17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "[!] makeLastLoginInvalid called since %s, stack: %s", "migrated to a new device", new com.tencent.mm.sdk.platformtools.z3());
                gm0.l.b(gm0.m.f273233v, 0);
            }
            com.tencent.mm.booter.NotifyReceiver.c();
            gm0.j1 i18 = gm0.j1.i();
            com.tencent.mm.plugin.zero.d1 d1Var = new com.tencent.mm.plugin.zero.d1(this);
            gm0.z1 z1Var = i18.f273208a;
            z1Var.a(z1Var.f273302g, d1Var);
            gm0.j1.i();
            lm5.j jVar = new lm5.j(new pq5.e(gm0.j1.e().d()), "WeChat.WORKER");
            pq5.j.f357688a = jVar;
            lm5.i.c("WeChat.WORKER", jVar);
        }
        if (bm5.f1.a().endsWith(":push")) {
            com.tencent.mars.WeChatMars.loadDependentLibrariesForNetwork();
            com.tencent.mars.xlog.Log.i("MicroMsg.FeatureZeroService", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.mars.MarsContext.getContext().getNativeHandle()));
            com.tencent.mars.app.AppManager appManager = new com.tencent.mars.app.AppManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.app.AppManager.class, appManager);
            appManager.setCallback(new com.tencent.mars.mm.AppManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a));
            com.tencent.mars.xlog.Log.i("MicroMsg.FeatureZeroService", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.mars.MarsContext.getContext().getNativeHandle()));
            com.tencent.mars.sdt.SdtManager sdtManager = new com.tencent.mars.sdt.SdtManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.sdt.SdtManager.class, sdtManager);
            sdtManager.setCallback(new com.tencent.mars.sdt.SdtManagerCallback());
            com.tencent.mars.sdt.MMSdtManager mMSdtManager = new com.tencent.mars.sdt.MMSdtManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.sdt.MMSdtManager.class, mMSdtManager);
            mMSdtManager.setCallback(new com.tencent.mars.sdt.MMSdtManagerCallback());
            ((com.tencent.mars.sdt.SdtManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.sdt.SdtManager.class)).setHttpNetCheckCGI("/mmnetcheck");
            if (com.tencent.paymars.WeChatMars.abtestOpen()) {
                com.tencent.paymars.WeChatMars.loadDependentLibrariesForNetwork();
                com.tencent.mars.xlog.Log.i("MicroMsg.FeatureZeroService", "paymars start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.mars.MarsContext.getContext().getNativeHandle()));
                com.tencent.paymars.app.AppManager appManager2 = new com.tencent.paymars.app.AppManager(com.tencent.paymars.MarsContext.getContext());
                com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.app.AppManager.class, appManager2);
                appManager2.setCallback(new com.tencent.paymars.mm.AppManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a));
                com.tencent.paymars.sdt.SdtManager sdtManager2 = new com.tencent.paymars.sdt.SdtManager(com.tencent.paymars.MarsContext.getContext());
                com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.sdt.SdtManager.class, sdtManager2);
                sdtManager2.setCallback(new com.tencent.paymars.sdt.SdtManagerCallback());
                com.tencent.paymars.sdt.MMSdtManager mMSdtManager2 = new com.tencent.paymars.sdt.MMSdtManager(com.tencent.paymars.MarsContext.getContext());
                com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.sdt.MMSdtManager.class, mMSdtManager2);
                mMSdtManager2.setCallback(new com.tencent.paymars.sdt.MMSdtManagerCallback());
                ((com.tencent.paymars.sdt.SdtManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.sdt.SdtManager.class)).setHttpNetCheckCGI("/mmnetcheck");
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.booter.NotifyReceiver.d();
        }
        com.tencent.mm.graphics.e.k(new com.tencent.mm.plugin.zero.e1(this));
    }
}
