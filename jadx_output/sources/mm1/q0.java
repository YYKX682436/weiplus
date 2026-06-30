package mm1;

@j95.b
/* loaded from: classes11.dex */
public class q0 extends i95.w implements nm1.e {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_playsound_rate_control_time, -1L);
        long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_playsound_evict_rate_control_time, -1L);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_playsound_rate_control_enable, true);
        com.tencent.mm.sdk.platformtools.d6 d6Var = com.tencent.mm.sdk.platformtools.d6.f192524a;
        com.tencent.mars.xlog.Log.i("MicroMsg.PlaySoundNew", "setRateControlParam enable:" + fj6 + ", rateControl:" + Ui + ", evictRateControl:" + Ui2);
        com.tencent.mm.sdk.platformtools.d6.f192528e = fj6;
        if (Ui > 0 && Ui2 > 0) {
            com.tencent.mm.sdk.platformtools.d6.f192526c = Ui;
            com.tencent.mm.sdk.platformtools.d6.f192527d = Ui2;
            com.tencent.mars.xlog.Log.i("MicroMsg.PlaySoundNew", "setRateControlParam " + Ui + ' ' + Ui2);
        }
        com.tencent.mm.sdk.platformtools.v5.f193040a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_playsound_notification_mute_check_enable, true);
    }
}
