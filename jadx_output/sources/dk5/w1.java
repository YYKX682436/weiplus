package dk5;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f234970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot0.q f234972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f234973h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234974i;

    public w1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, ot0.q qVar, byte[] bArr, java.lang.String str, ot0.q qVar2, com.tencent.mm.storage.f9 f9Var) {
        this.f234974i = msgRetransmitUI;
        this.f234969d = qVar;
        this.f234970e = bArr;
        this.f234971f = str;
        this.f234972g = qVar2;
        this.f234973h = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q qVar = this.f234969d;
        boolean r17 = qVar.r();
        byte[] bArr = this.f234970e;
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234974i;
        if ((r17 || qVar.f348666i == 93) && bArr == null && !com.tencent.mm.sdk.platformtools.t8.K0(msgRetransmitUI.f210964q)) {
            java.lang.String str = msgRetransmitUI.f210964q;
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(msgRetransmitUI.f210964q, new dk5.v1(this));
            return;
        }
        com.tencent.mm.storage.f9 f9Var = this.f234973h;
        boolean n27 = f9Var.n2();
        java.lang.String str2 = this.f234971f;
        if (!n27) {
            int i17 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
            msgRetransmitUI.e7(str2, this.f234972g, bArr, f9Var);
            return;
        }
        c01.h7 h7Var = new c01.h7();
        h7Var.f37227b = f9Var.getMsgId();
        h7Var.f37229d = f9Var.Q0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        ut.s0 s0Var = new ut.s0(str2, "");
        s0Var.f430723g = h7Var;
        s0Var.f430721e = "forward_file_msg";
        dk5.w.f234966a.c(s0Var);
    }
}
