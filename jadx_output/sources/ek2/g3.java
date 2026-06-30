package ek2;

/* loaded from: classes.dex */
public final class g3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final r45.e52 f253455u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253456v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.es1 f253457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(gk2.e buContext, r45.e52 coverInfo) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(coverInfo, "coverInfo");
        this.f253455u = coverInfo;
        this.f253456v = "Finder.CgiUpdateRedPacketCoverInfo";
        r45.es1 es1Var = new r45.es1();
        this.f253457w = es1Var;
        es1Var.set(1, db2.t4.f228171a.a(8259));
        es1Var.set(2, ((mm2.c1) buContext.a(mm2.c1.class)).f328852o);
        java.lang.String f17 = xy2.c.f(this.f16135n);
        if (f17 != null) {
            java.lang.String str = (f17.length() == 0) ^ true ? f17 : null;
            if (str != null) {
                es1Var.set(3, str);
            }
        }
        es1Var.set(4, new com.tencent.mm.protobuf.g(((mm2.e1) buContext.a(mm2.e1.class)).f328985o));
        es1Var.set(5, java.lang.Long.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f328983m));
        es1Var.set(6, java.lang.Long.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0)));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gn3 gn3Var = new r45.gn3();
        gn3Var.set(0, 1);
        gn3Var.set(1, new com.tencent.mm.protobuf.g(coverInfo.toByteArray()));
        linkedList.add(gn3Var);
        es1Var.set(7, linkedList);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = es1Var;
        r45.fs1 fs1Var = new r45.fs1();
        fs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fs1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = fs1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetextrainfo";
        lVar.f70667d = 8259;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiUpdateRedPacketCoverInfo", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String string;
        r45.fs1 resp = (r45.fs1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] scene:" + this.f253457w.getLong(6) + ",errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f253456v;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList list = resp.getList(1);
            kotlin.jvm.internal.o.f(list, "getGet_resp_list(...)");
            r45.mn3 mn3Var = (r45.mn3) kz5.n0.Z(list);
            if (mn3Var != null) {
                r45.i52 i52Var = new r45.i52();
                com.tencent.mm.protobuf.g byteString = mn3Var.getByteString(2);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 != null) {
                    try {
                        i52Var.parseFrom(g17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                com.tencent.mars.xlog.Log.i(str3, "status = " + pm0.b0.b(i52Var));
                java.util.LinkedList list2 = this.f253455u.getList(0);
                kotlin.jvm.internal.o.f(list2, "getInfos(...)");
                r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(list2);
                if (wd5Var == null || (string = wd5Var.getString(2)) == null) {
                    return;
                }
                com.tencent.mm.plugin.finder.live.util.k0 k0Var = com.tencent.mm.plugin.finder.live.util.k0.f115585a;
                com.tencent.mars.xlog.Log.i("FinderLiveRedPacketCache", "[saveStatus] status:" + pm0.b0.g(i52Var) + ", url:" + string);
                com.tencent.mm.plugin.finder.live.util.k0.f115586b.put(string, i52Var);
            }
        }
    }
}
