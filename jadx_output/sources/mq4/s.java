package mq4;

/* loaded from: classes12.dex */
public class s extends mq4.e0 {
    public s(int i17, long j17, int i18, int i19, int i27, int[] iArr, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.i37();
        lVar.f70665b = new r45.j37();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipRedirect";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.eb.CTRL_INDEX;
        lVar.f70668e = 240;
        lVar.f70669f = 1000000240;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.i37 i37Var = (r45.i37) a17.f70710a.f70684a;
        i37Var.f376704d = i17;
        i37Var.f376705e = j17;
        i37Var.f376706f = i18;
        i37Var.f376707g = i19;
        i37Var.f376708h = i27;
        i37Var.f376715r = java.lang.System.currentTimeMillis();
        int i28 = 0;
        int i29 = 0;
        while (i28 < i27) {
            r45.l37 l37Var = new r45.l37();
            int i37 = i29 + 1;
            l37Var.f379116d = iArr[i29];
            int i38 = i37 + 1;
            l37Var.f379117e = iArr[i37];
            int i39 = i38 + 1;
            l37Var.f379118f = iArr[i38];
            int i47 = i39 + 1;
            l37Var.f379119g = iArr[i39];
            l37Var.f379120h = iArr[i47];
            i37Var.f376709i.add(l37Var);
            i28++;
            i29 = i47 + 1;
        }
        i37Var.f376710m = this.f330796g.f176532x.M1.B != 0 ? (int) ((java.lang.System.currentTimeMillis() - this.f330796g.f176532x.M1.B) / 1000) : 0;
        if (linkedList != null) {
            i37Var.f376711n = linkedList.size();
            i37Var.f376712o = linkedList;
        }
    }

    @Override // mq4.e0
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.Redirect", "Redirect error");
            return;
        }
        r45.j37 j37Var = (r45.j37) this.f330793d.f70711b.f70700a;
        if (j37Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.Redirect", "roomId:%d, roomKey:%s, member:%d", java.lang.Integer.valueOf(j37Var.f377545d), java.lang.Long.valueOf(j37Var.f377550i), java.lang.Integer.valueOf(j37Var.f377551m));
        }
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.r(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.eb.CTRL_INDEX;
    }
}
