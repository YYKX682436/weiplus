package z12;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469309d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469310e;

    public i(java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.xe xeVar = new r45.xe();
        xeVar.f390003f = linkedList;
        xeVar.f390002e = 1;
        lVar.f70664a = xeVar;
        lVar.f70665b = new r45.ye();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        lVar.f70667d = 697;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469310e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469309d = u0Var;
        return dispatch(sVar, this.f469310e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 697;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneCheckEmoijExistByp", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 != 0 || i19 != 0) {
            this.f469309d.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.util.LinkedList linkedList = ((r45.ye) this.f469310e.f70711b.f70700a).f391008g;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneCheckEmoijExistByp", "Change MD5 to URL failed.");
        }
        this.f469309d.onSceneEnd(i18, i19, str, this);
    }
}
