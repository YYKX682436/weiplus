package dk5;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f234894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.w3 f234896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f234897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MsgRetransmitUI f234898h;

    public t1(com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI, boolean z17, java.lang.String str, com.tencent.mm.ui.chatting.w3 w3Var, boolean z18) {
        this.f234898h = msgRetransmitUI;
        this.f234894d = z17;
        this.f234895e = str;
        this.f234896f = w3Var;
        this.f234897g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        boolean z17 = this.f234894d;
        com.tencent.mm.ui.transmit.MsgRetransmitUI msgRetransmitUI = this.f234898h;
        dk5.s1 s1Var = (z17 && msgRetransmitUI.f210975y0) ? new dk5.s1(this) : null;
        if (msgRetransmitUI.f210975y0) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "MsgRetransmitUI.getLatch() await");
                msgRetransmitUI.f210972x0.await();
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "MsgRetransmitUI.getLatch() await done");
            } catch (java.lang.InterruptedException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        java.lang.String str = this.f234895e;
        boolean z18 = this.f234894d;
        boolean z19 = this.f234897g;
        if (msgRetransmitUI == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, context is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, username is empty");
            return;
        }
        com.tencent.mm.ui.chatting.w3 w3Var = this.f234896f;
        if (w3Var == null || (list = w3Var.f206201a) == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeRetransmitMsg", "do try retransmit fail, select items empty");
        } else {
            com.tencent.mm.ui.chatting.component.b5.f198693t.a(new com.tencent.mm.ui.chatting.t3(w3Var, str, msgRetransmitUI, z19, z18, s1Var));
        }
    }
}
