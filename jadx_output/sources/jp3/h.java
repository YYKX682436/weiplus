package jp3;

/* loaded from: classes14.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jp3.k f301001a;

    public h(jp3.k kVar) {
        this.f301001a = kVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        byte[] initialProtobufBytes;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        jp3.t tVar = jp3.t.f301029a;
        jp3.k kVar = this.f301001a;
        java.lang.String str = kVar.f301011d.f152873f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f70616b);
        java.lang.String str2 = fVar.f70617c;
        r45.v10 v10Var = (r45.v10) fVar.f70618d;
        tVar.c("checkpalmuseronlineopenresource", str, valueOf, str2, (v10Var == null || (initialProtobufBytes = v10Var.initialProtobufBytes()) == null) ? null : java.lang.Integer.valueOf(initialProtobufBytes.length));
        boolean U6 = kVar.f301011d.U6();
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintLogic", "[doCheckPalmResult] resp: " + fVar + ", needPalmInfo:" + U6);
        int i17 = fVar.f70615a;
        jp3.g gVar = jp3.g.f301000a;
        if (i17 == 0 && fVar.f70616b == 0) {
            gVar.i(kVar.f301011d, 0, "ok", U6 ? kVar.f301015h : null, U6 ? kVar.f301016i : null);
        } else {
            com.tencent.mm.plugin.palm.ui.PalmPrintMainUI palmPrintMainUI = kVar.f301011d;
            int i18 = fVar.f70616b;
            if (i18 == 0) {
                i18 = 80021;
            }
            int i19 = i18;
            java.lang.String str3 = fVar.f70617c;
            gVar.i(palmPrintMainUI, i19, !(str3 == null || str3.length() == 0) ? fVar.f70617c : "ERR_PALM_SERVER_OPEN_RESULT_FAILED", U6 ? kVar.f301015h : null, U6 ? kVar.f301016i : null);
        }
        return jz5.f0.f302826a;
    }
}
