package ww1;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.wallet_core.model.h1 {
    public q(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiVoiceOperateSwitchMch", "CgiSaveQrcodeNotifyMch request：op_type：%s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g17 g17Var = new r45.g17();
        g17Var.f374829d = i17;
        g17Var.f374830e = j17;
        lVar.f70664a = g17Var;
        lVar.f70665b = new r45.h17();
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtoprecvvoice";
        lVar.f70667d = 4997;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }
}
