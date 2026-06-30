package hb3;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f280123d;

    public i(hb3.j jVar, l75.w0 w0Var) {
        this.f280123d = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 V9;
        jz5.f0 f0Var;
        l75.w0 w0Var = this.f280123d;
        at4.k1 k1Var = (at4.k1) w0Var.f316976d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(k1Var.field_sender)) {
            return;
        }
        int i17 = w0Var.f316974b;
        if (3 == i17 || 4 == i17) {
            int i18 = k1Var.field_hbStatus;
            if ((i18 == 4 || i18 == 5) && (V9 = pt0.f0.V9(k1Var.field_sender, k1Var.field_msgSvrId)) != null) {
                long msgId = V9.getMsgId();
                java.lang.String Q0 = V9.Q0();
                if (Q0 != null) {
                    g95.u uVar = g95.u.f269821a;
                    g15.b wi6 = ((ez.j) uVar.e()).wi(Q0);
                    if (wi6 == null) {
                        wi6 = new g15.b();
                    }
                    boolean removeIf = wi6.j().removeIf(new g95.l(msgId, 4));
                    if (removeIf) {
                        uVar.n(Q0, wi6);
                    } else {
                        ((kk.l) ((jz5.n) g95.u.f269822b).getValue()).put(new com.tencent.mm.plugin.msg.MsgIdTalker(msgId, Q0), 4);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConvRedHintStorage", "remove, [" + Q0 + ", " + msgId + ", 4], result: " + removeIf);
                    f0Var = jz5.f0.f302826a;
                } else {
                    g95.u uVar2 = g95.u.f269821a;
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ConvRedHintStorage", "talker is null");
                }
            }
        }
    }
}
