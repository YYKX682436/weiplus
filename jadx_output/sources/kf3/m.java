package kf3;

/* loaded from: classes5.dex */
public class m implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.u f307394d;

    public m(kf3.u uVar) {
        this.f307394d = uVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        kf3.u uVar = this.f307394d;
        if (uVar.f307439d == -1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            uVar.f307439d = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = uVar.f307439d;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        int ceil = (int) java.lang.Math.ceil((60000 - elapsedRealtime) / 1000);
        com.tencent.mm.plugin.masssend.ui.MassSendMsgUI massSendMsgUI = uVar.f307436a;
        if (elapsedRealtime >= 50000 && elapsedRealtime <= 60000 && !uVar.f307448m) {
            android.os.Vibrator vibrator = (android.os.Vibrator) massSendMsgUI.getContext().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(150L);
            }
            uVar.f307448m = true;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = uVar.f307437b;
        chatFooter.setVoiceReactArea(ceil);
        if (elapsedRealtime < 60000) {
            return true;
        }
        db5.d5 d5Var = chatFooter.X3;
        if (d5Var != null && d5Var.isShowing()) {
            if ((chatFooter.f189968c6 == com.tencent.mm.pluginsdk.ui.chat.b5.MODE_CANCEL) && chatFooter.T3) {
                chatFooter.S0(false);
            } else {
                chatFooter.c1();
            }
        } else {
            if (uVar.f307438c.stop()) {
                massSendMsgUI.c7(new kf3.o(uVar));
            }
            chatFooter.d1(com.tencent.mm.pluginsdk.ui.chat.f5.SendVoice);
        }
        com.tencent.mm.sdk.platformtools.v5.e(massSendMsgUI, com.tencent.mm.R.string.f493378jy3);
        return false;
    }
}
