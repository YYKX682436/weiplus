package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0 implements com.tencent.mm.pluginsdk.res.downloader.checkresupdate.j0 {
    public k0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%d", java.lang.Integer.valueOf(i17));
        r45.fs5 fs5Var = new r45.fs5();
        fs5Var.f374591d = i17;
        ((java.util.LinkedList) this.f189624e).clear();
        ((java.util.LinkedList) this.f189624e).add(fs5Var);
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0
    public com.tencent.mm.network.v0 H() {
        boolean isWifi;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.c20 c20Var = new r45.c20();
        c20Var.f371238d.addAll(this.f189624e);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        if (isWifi) {
            c20Var.f371239e = 1;
        } else {
            c20Var.f371239e = 2;
        }
        lVar.f70664a = c20Var;
        lVar.f70665b = new r45.d20();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkresupdate";
        lVar.f70667d = 721;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        return lVar.a();
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0
    public java.lang.String I() {
        return "MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate";
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0
    public r45.d20 J(com.tencent.mm.network.v0 v0Var) {
        return (r45.d20) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 721;
    }

    public k0(java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.NetSceneCheckResUpdate", "NetSceneCheckResUpdate init, resType:%s", list.toString());
        ((java.util.LinkedList) this.f189624e).clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            r45.fs5 fs5Var = new r45.fs5();
            fs5Var.f374591d = num.intValue();
            ((java.util.LinkedList) this.f189624e).add(fs5Var);
        }
    }
}
