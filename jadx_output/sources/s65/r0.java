package s65;

/* loaded from: classes11.dex */
public class r0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.s f403510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.s0 f403511e;

    public r0(s65.s0 s0Var, com.tencent.mm.network.s sVar) {
        this.f403511e = s0Var;
        this.f403510d = sVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.Map d17;
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        s65.s0 s0Var = this.f403511e;
        r1Var.q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, s0Var.f403515b.f192329m);
        s0Var.f403515b.f192329m = null;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.modelsimple.q0) m1Var).f71399d;
            long j17 = 0;
            if (((r45.hn3) oVar.f70710a.f70684a).f376312d == 0) {
                java.lang.String str2 = ((r45.in3) oVar.f70711b.f70700a).f377166d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "resourcecontrolinfo", null)) != null) {
                    java.lang.String str3 = (java.lang.String) d17.get(".resourcecontrolinfo.enableupdate");
                    java.lang.String str4 = (java.lang.String) d17.get(".resourcecontrolinfo.expiredtime");
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate getDisableUpdateTime values[%s]", d17);
                    if (com.tencent.mm.sdk.platformtools.t8.P(str3, 1) == 0) {
                        j17 = com.tencent.mm.sdk.platformtools.t8.V(str4, 0L);
                    }
                }
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            if (j17 > currentTimeMillis) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "summerupdate checkcontrol time[%d] > now[%d] control not auto download and ret", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 0L, 1L, true);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService after checkcontrol");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 59L, 1L, true);
        android.content.Intent intent = new android.content.Intent(s0Var.f403515b.getContext(), (java.lang.Class<?>) com.tencent.mm.sandbox.updater.UpdaterService.class);
        com.tencent.mm.sandbox.updater.Updater.a(s0Var.f403515b, intent, this.f403510d, s0Var.f403514a);
        intent.putExtra("intent_extra_run_in_foreground", true);
        intent.putExtra("intent_extra_download_mode", 2);
        l85.h1.e(intent, "sandbox", true, j45.l.e("sandbox"));
    }
}
