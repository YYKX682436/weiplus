package ya3;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f460598d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f460599e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460600f;

    /* renamed from: g, reason: collision with root package name */
    public int f460601g;

    /* renamed from: i, reason: collision with root package name */
    public r45.hn5 f460603i;

    /* renamed from: m, reason: collision with root package name */
    public final int f460604m;

    /* renamed from: h, reason: collision with root package name */
    public r45.io6 f460602h = null;

    /* renamed from: n, reason: collision with root package name */
    public int f460605n = 0;

    public c(java.lang.String str, int i17, r45.mw6 mw6Var, int i18, r45.io6 io6Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gn5();
        lVar.f70665b = new r45.hn5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/refreshtrackroom";
        lVar.f70667d = uc1.o.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f460599e = a17;
        r45.gn5 gn5Var = (r45.gn5) a17.f70710a.f70684a;
        gn5Var.f375382d = str;
        gn5Var.f375383e = i17;
        gn5Var.f375384f = mw6Var;
        gn5Var.f375385g = i18;
        gn5Var.f375386h = io6Var;
        this.f460604m = i17;
        java.lang.String str2 = mw6Var.f380872d;
        r45.wa5 wa5Var = mw6Var.f380873e;
        double d17 = wa5Var.f389011d;
        double d18 = wa5Var.f389012e;
        double d19 = wa5Var.f389013f;
        double d27 = io6Var.f377222d;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f460598d = u0Var;
        return dispatch(sVar, this.f460599e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return uc1.o.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.hn5 hn5Var = (r45.hn5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f460603i = hn5Var;
        if (hn5Var != null) {
            this.f460600f = hn5Var.f376318f;
        }
        if (i18 == 0 && i19 == 0) {
            this.f460601g = hn5Var.f376319g;
            this.f460605n = hn5Var.f376321i;
            this.f460602h = hn5Var.f376320h;
            java.util.LinkedList linkedList = hn5Var.f376317e;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(java.lang.String.format("[ resp count %d ] ", java.lang.Integer.valueOf(this.f460603i.f376316d)));
            r45.io6 io6Var = this.f460602h;
            if (io6Var != null) {
                stringBuffer.append(java.lang.String.format("[ roomPoi  %f %f %s] ", java.lang.Double.valueOf(io6Var.f377222d), java.lang.Double.valueOf(this.f460602h.f377223e), this.f460602h.f377224f));
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = this.f460603i.f376317e.iterator();
            while (it.hasNext()) {
                r45.mw6 mw6Var = (r45.mw6) it.next();
                if (mw6Var == null) {
                    linkedList2.add(mw6Var);
                } else {
                    if (mw6Var.f380873e == null) {
                        linkedList2.add(mw6Var);
                    }
                    if (java.lang.Math.abs(mw6Var.f380873e.f389012e) > 180.0d || java.lang.Math.abs(mw6Var.f380873e.f389011d) > 90.0d) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneRefreshTrackRoom", "server lat lng invalid %s %f %f %f", mw6Var.f380872d, java.lang.Double.valueOf(mw6Var.f380873e.f389011d), java.lang.Double.valueOf(mw6Var.f380873e.f389012e), java.lang.Double.valueOf(mw6Var.f380873e.f389013f));
                        linkedList2.add(mw6Var);
                    }
                }
            }
            r45.hn5 hn5Var2 = this.f460603i;
            hn5Var2.f376316d = hn5Var2.f376317e.size();
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f460598d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
