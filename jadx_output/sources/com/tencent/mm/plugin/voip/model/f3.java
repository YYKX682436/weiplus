package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d37 f176497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f176498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.i3 f176499f;

    public f3(com.tencent.mm.plugin.voip.model.i3 i3Var, r45.d37 d37Var, boolean z17) {
        this.f176499f = i3Var;
        this.f176497d = d37Var;
        this.f176498e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        r45.d37 d37Var = this.f176497d;
        if (d37Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("__onGotNewConnData begin local conn set seq ");
        com.tencent.mm.plugin.voip.model.i3 i3Var = this.f176499f;
        sb6.append(i3Var.f176677a.K);
        sb6.append(" recv conn set seq ");
        sb6.append(d37Var.f372058m);
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", sb6.toString());
        int i17 = d37Var.f372058m;
        com.tencent.mm.plugin.voip.model.g1 g1Var = i3Var.f176677a;
        if (i17 <= g1Var.K) {
            vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "the recieved conn set is too old");
            return;
        }
        g1Var.K = i17;
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "new relay conn cnt: " + d37Var.f372052d.f372624d + " new direct conn cnt: " + d37Var.f372053e.f388148d);
        byte[] bArr2 = null;
        try {
            bArr = d37Var.f372052d.toByteArray();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
            bArr = null;
        }
        int AddNewRelayConns = i3Var.f176677a.f176532x.AddNewRelayConns(bArr, bArr.length, 0, false);
        if (AddNewRelayConns != 0) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "add new relay conns fail ret:" + AddNewRelayConns);
        }
        try {
            bArr2 = d37Var.f372053e.toByteArray();
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
        }
        int AddNewDirectConns = i3Var.f176677a.f176532x.AddNewDirectConns(bArr2, bArr2.length, 0);
        if (AddNewDirectConns != 0) {
            vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "add new direct conns fail ret:" + AddNewDirectConns);
        }
        for (int i18 = 0; i18 < d37Var.f372054f; i18++) {
            int ActivateConn = i3Var.f176677a.f176532x.ActivateConn(((java.lang.Integer) d37Var.f372055g.get(i18)).intValue());
            if (ActivateConn != 0) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "activate conn " + d37Var.f372055g.get(i18) + " ret:" + ActivateConn);
            }
        }
        for (int i19 = 0; i19 < d37Var.f372056h; i19++) {
            int InactivateConn = i3Var.f176677a.f176532x.InactivateConn(((java.lang.Integer) d37Var.f372057i.get(i19)).intValue());
            if (InactivateConn != 0) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "inactivate conn " + d37Var.f372057i.get(i19) + " ret:" + InactivateConn);
            }
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "redirect relay conn cnt: " + d37Var.f372059n.f372624d);
        r45.do5 do5Var = d37Var.f372059n;
        if (do5Var.f372624d > 0) {
            try {
                bArr = do5Var.toByteArray();
            } catch (java.lang.Exception unused3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipSyncHandle", "conn info to byte array fail..");
            }
            int AddNewRelayConns2 = i3Var.f176677a.f176532x.AddNewRelayConns(bArr, bArr.length, 1, this.f176498e);
            if (AddNewRelayConns2 != 0) {
                vq4.d0.b("MicroMsg.Voip.VoipSyncHandle", "redirect relay conns fail ret:" + AddNewRelayConns2);
            }
        }
        vq4.d0.c("MicroMsg.Voip.VoipSyncHandle", "__onGotNewConnData end");
    }
}
