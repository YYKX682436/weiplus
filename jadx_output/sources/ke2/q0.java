package ke2;

/* loaded from: classes.dex */
public final class q0 extends az2.j {

    /* renamed from: w, reason: collision with root package name */
    public static final ke2.p0 f306981w = new ke2.p0(null);

    /* renamed from: t, reason: collision with root package name */
    public final gk2.e f306982t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.r f306983u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f306984v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r45.ch1 appMsg, gk2.e roomData, r45.qt2 qt2Var, yz5.r rVar) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        kotlin.jvm.internal.o.g(roomData, "roomData");
        int i17 = 2;
        this.f306982t = roomData;
        this.f306983u = rVar;
        this.f306984v = "Finder.CgiFinderPostLiveAppMsg";
        r45.sp2 sp2Var = new r45.sp2();
        sp2Var.set(2, com.tencent.mm.protobuf.g.b(((mm2.e1) ((mm2.c1) roomData.a(mm2.c1.class)).business(mm2.e1.class)).f328985o));
        sp2Var.set(3, appMsg);
        sp2Var.set(4, java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f328988r.getLong(0)));
        sp2Var.set(5, java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f328983m));
        sp2Var.set(6, ((mm2.e1) roomData.a(mm2.e1.class)).f328992v);
        if (zl2.r4.f473950a.w1()) {
            i17 = 1;
        } else {
            if (((mm2.n0) roomData.a(mm2.n0.class)).f329273r) {
                i17 = 16;
            }
        }
        sp2Var.set(7, java.lang.Integer.valueOf(i17));
        sp2Var.set(8, xy2.c.f(qt2Var));
        db2.t4 t4Var = db2.t4.f228171a;
        sp2Var.set(1, t4Var.a(6888));
        t4Var.h((r45.kv0) sp2Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f328983m), ((mm2.e1) roomData.a(mm2.e1.class)).f328984n)));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = sp2Var;
        r45.tp2 tp2Var = new r45.tp2();
        tp2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tp2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = tp2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpostliveappmsg";
        lVar.f70667d = 6888;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderPostLiveAppMsg init ");
        sb6.append(sp2Var.getLong(4));
        sb6.append(",msgType ");
        r45.ch1 ch1Var = (r45.ch1) sp2Var.getCustom(3);
        sb6.append(ch1Var != null ? java.lang.Integer.valueOf(ch1Var.getInteger(1)) : null);
        sb6.append(",is_float:");
        r45.ch1 ch1Var2 = (r45.ch1) sp2Var.getCustom(3);
        sb6.append(ch1Var2 != null ? java.lang.Integer.valueOf(ch1Var2.getInteger(9)) : null);
        sb6.append(",floatType:");
        r45.ch1 ch1Var3 = (r45.ch1) sp2Var.getCustom(3);
        sb6.append(ch1Var3 != null ? java.lang.Integer.valueOf(ch1Var3.getInteger(10)) : null);
        sb6.append(", replyMsgSeq:");
        r45.ch1 ch1Var4 = (r45.ch1) sp2Var.getCustom(3);
        sb6.append(ch1Var4 != null ? java.lang.Long.valueOf(ch1Var4.getLong(3)) : null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPostLiveAppMsg", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tp2 resp = (r45.tp2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", toastInfo:");
        r45.zm6 zm6Var = (r45.zm6) resp.getCustom(7);
        sb6.append(zm6Var != null ? java.lang.Boolean.valueOf(zm6Var.getBoolean(1)) : null);
        com.tencent.mars.xlog.Log.i(this.f306984v, sb6.toString());
        zl2.r4 r4Var = zl2.r4.f473950a;
        int integer = resp.getInteger(6);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.K(integer, context, this.f306982t);
        yz5.r rVar = this.f306983u;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, resp);
        }
    }
}
