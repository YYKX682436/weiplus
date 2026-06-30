package ke2;

/* loaded from: classes.dex */
public final class j extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306956t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.i f306957u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.fv0 f306958v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j17, long j18, java.lang.String audienceUsername, int i17, boolean z17, ke2.i callback) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(audienceUsername, "audienceUsername");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f306956t = "Finder.CgiFinderLiveBanComment";
        this.f306957u = callback;
        r45.fv0 fv0Var = new r45.fv0();
        this.f306958v = fv0Var;
        fv0Var.set(2, java.lang.Long.valueOf(j17));
        fv0Var.set(3, java.lang.Long.valueOf(j18));
        fv0Var.set(4, audienceUsername);
        fv0Var.set(5, java.lang.Integer.valueOf(i17));
        fv0Var.set(6, java.lang.Boolean.valueOf(z17));
        fv0Var.set(1, db2.t4.f228171a.a(6656));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = fv0Var;
        r45.gv0 gv0Var = new r45.gv0();
        gv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gv0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = gv0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderbanlivecomment";
        lVar.f70667d = 6656;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveBanComment", "CgiFinderLiveBanComment init " + fv0Var.getLong(2) + ',' + fv0Var.getString(4));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.gv0 resp = (r45.gv0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306956t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        r45.fv0 fv0Var = this.f306958v;
        ke2.i iVar = this.f306957u;
        if (i17 == 0 && i18 == 0) {
            iVar.b(fv0Var.getBoolean(6));
        } else {
            iVar.a(i17, i18, str, fv0Var.getBoolean(6));
        }
    }
}
