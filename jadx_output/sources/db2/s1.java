package db2;

/* loaded from: classes.dex */
public final class s1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228148t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.util.List exptIds) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(exptIds, "exptIds");
        this.f228148t = "Finder.CgiFinderGetSvrExptConfig";
        r45.ha1 ha1Var = new r45.ha1();
        ha1Var.set(1, db2.t4.f228171a.b(5864, this.f16135n));
        ha1Var.getList(2).addAll(exptIds);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ha1Var;
        r45.ia1 ia1Var = new r45.ia1();
        ia1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ia1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ia1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetsvrexptconfig";
        lVar.f70667d = 5864;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetSvrExptConfig", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ia1 resp = (r45.ia1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228148t, "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
