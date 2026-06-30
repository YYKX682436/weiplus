package uy3;

/* loaded from: classes2.dex */
public final class s0 implements com.tencent.mm.modelbase.u0, xq1.g {

    /* renamed from: d, reason: collision with root package name */
    public final wq1.d f431994d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.model.y f431995e;

    public s0(wq1.d uiComponent) {
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        this.f431994d = uiComponent;
        gm0.j1.d().a(1532, this);
    }

    @Override // xq1.g
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebData", "requestDataFromServer requestId: %s, queryJson: %s", str, str2);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        try {
            if (this.f431995e != null) {
                gm0.j1.d().d(this.f431995e);
            }
            this.f431995e = new com.tencent.mm.plugin.scanner.model.y(str, str2, 1);
            gm0.j1.d().g(this.f431995e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanBoxWebData", e17, "requestDataFromServer exception", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        java.lang.String str3 = null;
        objArr[3] = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebData", "onSceneEnd errType: %d, errCode: %d, errMsg: %s, scene type: %s", objArr);
        if (kotlin.jvm.internal.o.b(m1Var, this.f431995e)) {
            xq1.f u17 = this.f431994d.u();
            com.tencent.mm.plugin.scanner.model.y yVar = this.f431995e;
            if (yVar == null || (str2 = yVar.f159099d) == null) {
                str2 = "";
            }
            if (yVar != null) {
                com.tencent.mm.protobuf.f fVar = yVar.f159101f.f70711b.f70700a;
                r45.xi xiVar = fVar != null ? (r45.xi) fVar : null;
                if (xiVar != null) {
                    str3 = xiVar.f390114d;
                }
            }
            u17.a(str2, i18, str, str3 != null ? str3 : "");
        }
    }
}
