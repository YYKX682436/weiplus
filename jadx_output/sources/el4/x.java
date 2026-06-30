package el4;

/* loaded from: classes11.dex */
public final class x extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        b66.x Zi;
        qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
        if (bj6 != null && (Zi = ((rk4.z8) bj6).Zi()) != null) {
            urgen.ur_2BA9.UR_5769.UR_B6B3(((b66.y) Zi).getCppPointer());
        }
        kl4.g.f308906b = true;
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = (com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic) ((jz5.n) ((ef0.t1) i95.n0.c(ef0.t1.class)).f252326d).getValue();
        com.tencent.mars.xlog.Log.i(tingAudioPushConfigLogic.f174639a, "tryHidePush");
        tingAudioPushConfigLogic.f174659u.a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // com.tencent.mm.app.a3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAppForeground(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: el4.x.onAppForeground(java.lang.String):void");
    }
}
