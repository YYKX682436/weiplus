package mq4;

/* loaded from: classes14.dex */
public class r implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.s f330806d;

    public r(mq4.s sVar) {
        this.f330806d = sVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        byte[] bArr;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Redirect response:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" status:");
        mq4.s sVar = this.f330806d;
        sb6.append(sVar.f330796g.f176508a);
        vq4.d0.c("MicroMsg.Voip.Redirect", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            vq4.d0.b("MicroMsg.Voip.Redirect", " redirect response with error code:" + i18 + "error type" + i17);
            return;
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var = sVar.f330796g;
        com.tencent.mm.plugin.voip.model.l1 l1Var = g1Var.f176532x.M1;
        l1Var.getClass();
        l1Var.g((int) (java.lang.System.currentTimeMillis() - l1Var.Q));
        r45.j37 j37Var = (r45.j37) sVar.K();
        vq4.d0.c("MicroMsg.Voip.Redirect", "room " + j37Var.f377545d + " member " + j37Var.f377551m + " key " + j37Var.f377550i + " relay addr cnt " + j37Var.f377546e + " RedirectThreshold " + j37Var.f377554p + " RedirectDecision " + j37Var.f377555q);
        r45.c27 c27Var = new r45.c27();
        r45.c27 c27Var2 = new r45.c27();
        r45.c27 c27Var3 = new r45.c27();
        c27Var.f371249d = j37Var.f377546e;
        java.util.LinkedList linkedList = j37Var.f377547f;
        c27Var.f371250e = linkedList;
        c27Var2.f371249d = j37Var.f377548g;
        c27Var2.f371250e = j37Var.f377549h;
        c27Var3.f371249d = j37Var.f377552n;
        java.util.LinkedList linkedList2 = j37Var.f377553o;
        c27Var3.f371250e = linkedList2;
        boolean z17 = j37Var.f377555q == 2;
        com.tencent.mm.plugin.voip.model.i3 i3Var = g1Var.B;
        r45.d37 d37Var = j37Var.f377556r;
        i3Var.getClass();
        gm0.j1.e().j(new com.tencent.mm.plugin.voip.model.g3(i3Var, d37Var, z17));
        r45.d37 d37Var2 = j37Var.f377556r;
        if ((d37Var2 == null || d37Var2.f372058m == 0) && j37Var.f377546e > 0) {
            vq4.d0.c("MicroMsg.Voip.Redirect", "use old method to add redirect conn");
            r45.do5 do5Var = new r45.do5();
            r45.co5 co5Var = new r45.co5();
            co5Var.f371724d = 0;
            co5Var.f371725e = "";
            co5Var.f371726f = "";
            co5Var.f371727g = vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
            co5Var.f371728h = 4;
            co5Var.f371729i = 2;
            co5Var.f371730m = new r45.c27();
            r45.c27 c27Var4 = new r45.c27();
            co5Var.f371731n = c27Var4;
            r45.c27 c27Var5 = co5Var.f371730m;
            c27Var5.f371249d = j37Var.f377546e;
            c27Var5.f371250e = linkedList;
            c27Var4.f371249d = j37Var.f377552n;
            c27Var4.f371250e = linkedList2;
            do5Var.f372625e.add(co5Var);
            do5Var.f372624d = 1;
            try {
                bArr = do5Var.toByteArray();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.Redirect", "conn info to byte array fail..");
                bArr = null;
            }
            int AddNewRelayConns = g1Var.f176532x.AddNewRelayConns(bArr, bArr.length, 1, z17);
            if (AddNewRelayConns != 0) {
                vq4.d0.b("MicroMsg.Voip.Redirect", "redirect relay conns fail ret:" + AddNewRelayConns);
            }
        }
    }
}
