package ek2;

/* loaded from: classes.dex */
public final class d3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f253433u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(java.lang.String str, int i17, long j17, long j18, long j19, java.lang.String userName, ek2.c3 c3Var, int i18, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f253433u = new org.json.JSONObject();
        r45.h13 h13Var = new r45.h13();
        h13Var.set(1, db2.t4.f228171a.b(11174, this.f16135n));
        h13Var.set(2, str);
        h13Var.set(3, java.lang.Integer.valueOf(i17));
        h13Var.set(4, java.lang.Long.valueOf(j17));
        h13Var.set(5, java.lang.Long.valueOf(j18));
        h13Var.set(6, java.lang.Long.valueOf(j19));
        h13Var.set(7, userName);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = h13Var;
        r45.i13 i13Var = new r45.i13();
        i13Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) i13Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = i13Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderupdatelivesongstate";
        lVar.f70667d = 11174;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.i13 resp = (r45.i13) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderUpdateLiveSongState", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253433u;
    }
}
