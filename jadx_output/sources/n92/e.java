package n92;

/* loaded from: classes8.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f335913t;

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f335914u;

    public e(int i17) {
        super(null, null, 3, null);
        java.lang.String str = "Cgi.FinderNewUserPrepare#" + i17 + '@' + hashCode();
        this.f335913t = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g23 g23Var = new r45.g23();
        g23Var.set(1, java.lang.Integer.valueOf(i17));
        g23Var.set(2, db2.t4.f228171a.a(7289));
        lVar.f70664a = g23Var;
        r45.lk2 lk2Var = new r45.lk2();
        lk2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) lk2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = lk2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findernewuserprepare";
        lVar.f70667d = 7289;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i(str, "[CgiFinderNewUserPrepare] created...");
        this.f335914u = new org.json.JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    @Override // az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r18, int r19, java.lang.String r20, com.tencent.mm.protobuf.f r21, com.tencent.mm.modelbase.m1 r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n92.e.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i(this.f335913t, "[run]...");
        return super.l();
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335914u;
    }
}
