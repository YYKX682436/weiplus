package dk5;

/* loaded from: classes9.dex */
public class v1 implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk5.w1 f234956a;

    public v1(dk5.w1 w1Var) {
        this.f234956a = w1Var;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        dk5.w1 w1Var = this.f234956a;
        if (j17) {
            byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
            com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = w1Var.f234974i;
            java.lang.String str2 = w1Var.f234971f;
            ot0.q qVar = w1Var.f234972g;
            com.tencent.mm.storage.f9 f9Var = w1Var.f234973h;
            int i17 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
            msgRetransmitUI.e7(str2, qVar, N, f9Var);
            return;
        }
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI2 = w1Var.f234974i;
        java.lang.String str3 = w1Var.f234971f;
        ot0.q qVar2 = w1Var.f234972g;
        byte[] bArr = w1Var.f234970e;
        com.tencent.mm.storage.f9 f9Var2 = w1Var.f234973h;
        int i18 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
        msgRetransmitUI2.e7(str3, qVar2, bArr, f9Var2);
    }
}
