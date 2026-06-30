package mx0;

/* loaded from: classes5.dex */
public final class ea extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.ja f331969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(mx0.ja jaVar) {
        super(0);
        this.f331969d = jaVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean isWifi;
        int Ni;
        int i17 = ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.f331969d.f332078g).M1;
        if (60 == i17 || 61 == i17) {
            Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_record_template_red_packet_preload_limit, 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "redPacketPreloadLimit:" + Ni);
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (!r75.d.f393259f) {
                isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
            } else if (r75.d.f393257d == -100) {
                int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
                r75.d.f393257d = netType;
                isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
            } else {
                ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
                isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
            }
            if (isWifi) {
                Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_record_template_preload_wifi_limit, 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "wifiPreloadLimit: " + Ni);
            } else {
                Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_maas_record_template_preload_mobile_limit, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "4gPreloadLimit: " + Ni);
            }
        }
        return java.lang.Integer.valueOf(Ni);
    }
}
