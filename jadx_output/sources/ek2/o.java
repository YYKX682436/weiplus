package ek2;

/* loaded from: classes2.dex */
public final class o extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.n f253508u;

    /* JADX WARN: Multi-variable type inference failed */
    public o(int i17, ek2.n nVar) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f253508u = nVar;
        r45.kx0 kx0Var = new r45.kx0();
        kx0Var.f379011d = db2.t4.f228171a.a(8947);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kx0Var.f379012e = xy2.c.e(context);
        kx0Var.f379013f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = kx0Var;
        r45.lx0 lx0Var = new r45.lx0();
        r45.ie ieVar = new r45.ie();
        lx0Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        lVar.f70665b = lx0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercolivecreateinvitation";
        lVar.f70667d = 8947;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiCoLiveCreateInvitation", "init settlementMode=" + i17 + ", myFinderUsername=" + kx0Var.f379012e);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.lx0 resp = (r45.lx0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", invitationId=");
        sb6.append(resp.f379918d);
        sb6.append(", qrcodeUrl=");
        java.lang.String str2 = resp.f379919e;
        sb6.append(str2 != null ? r26.p0.E0(str2, 50) : null);
        com.tencent.mars.xlog.Log.i("Finder.CgiCoLiveCreateInvitation", sb6.toString());
        ek2.n nVar = this.f253508u;
        if (nVar != null) {
            re2.a1 a1Var = (re2.a1) nVar;
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "createInvitation success: invitationId=" + resp.f379918d);
                yz5.l lVar = a1Var.f394359a;
                if (lVar != null) {
                    lVar.invoke(resp);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.e("Finder.CoLiveRequestHelper", "createInvitation failed: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            yz5.p pVar = a1Var.f394360b;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), str);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
