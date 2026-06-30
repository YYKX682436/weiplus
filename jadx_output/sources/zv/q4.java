package zv;

@j95.b
/* loaded from: classes11.dex */
public final class q4 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final zv.n4 f476093d = new zv.n4();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginBrandEcs", "onAccountInitialized");
        super.onAccountInitialized(context);
        this.f476093d.alive();
        if (gm0.j1.a() && (!com.tencent.mm.sdk.platformtools.a0.c() || ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).aj())) {
            yw.q3 q3Var = yw.q3.f466437a;
            if (yw.h1.f466332a.n()) {
                if (yw.q3.f466440d) {
                    com.tencent.wechat.mm.biz.g0.f218063b.A();
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizMsgBridge", "onWechatIntoActive hasInit=" + yw.q3.f466440d);
                }
            }
            zv.q qVar = zv.q.f476079a;
            if (qVar.g()) {
                yw.a3 a3Var = yw.a3.f466266a;
                if (qVar.g()) {
                    if (yw.a3.f466270e) {
                        com.tencent.wechat.aff.brand_service.v.f216049c.o();
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBrandServiceBridge", "onWechatIntoActive hasInit=" + yw.a3.f466270e);
                    }
                }
            } else {
                zv.l.f476016a.b(false);
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
                if (z40.e.l4()) {
                    ((y40.i0) z40.e.get()).getClass();
                    if (a50.e1.f1474d) {
                        com.tencent.wechat.mm.finder_box.c0.f219335b.A();
                    } else {
                        com.tencent.mars.xlog.Log.w("Finder.BoxFlutterBizMsgBridge", "resetBrandServiceDataMigrateStatusTemp hasInit=" + a50.e1.f1474d);
                    }
                } else if (yw.q3.f466440d) {
                    com.tencent.wechat.mm.biz.g0.f218063b.I();
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizMsgBridge", "resetBrandServiceDataMigrateStatusTemp hasInit=" + yw.q3.f466440d);
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(zv.p4.f476078d);
    }
}
