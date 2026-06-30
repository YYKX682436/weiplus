package ke2;

/* loaded from: classes.dex */
public final class u extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306988t;

    public /* synthetic */ u(long j17, long j18, com.tencent.mm.protobuf.g gVar, java.lang.String str, int i17, java.lang.String str2, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(j17, j18, gVar, str, (i18 & 16) != 0 ? 2 : i17, (i18 & 32) != 0 ? null : str2, (i18 & 64) != 0 ? false : z17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ps1 resp = (r45.ps1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" resp = ");
        java.lang.Object obj = (r45.fr1) resp.getCustom(1);
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.tencent.mars.xlog.Log.i(this.f306988t, sb6.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, long j18, com.tencent.mm.protobuf.g liveCookies, java.lang.String nonceId, int i17, java.lang.String str, boolean z17) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(liveCookies, "liveCookies");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f306988t = "Finder.CgiFinderLiveGetGameTeamInfo";
        r45.os1 os1Var = new r45.os1();
        os1Var.set(1, db2.t4.f228171a.a(4159));
        os1Var.set(2, java.lang.Long.valueOf(j17));
        os1Var.set(3, java.lang.Long.valueOf(j18));
        os1Var.set(4, liveCookies);
        os1Var.set(5, nonceId);
        os1Var.set(6, xy2.c.f(this.f16135n));
        os1Var.set(7, java.lang.Integer.valueOf(i17));
        r45.l45 l45Var = new r45.l45();
        l45Var.set(0, java.lang.Boolean.valueOf(z17));
        l45Var.set(1, str);
        os1Var.set(8, l45Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = os1Var;
        r45.ps1 ps1Var = new r45.ps1();
        ps1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ps1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ps1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetgameteaminfo";
        lVar.f70667d = 4159;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetGameTeamInfo", "init feedId:" + j17 + ", liveId:" + j18 + ", nonceId:" + nonceId + ", liveCookies size:" + liveCookies.f192156a.length);
    }
}
