package ke2;

/* loaded from: classes.dex */
public final class e0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306945t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j17, long j18, r45.z42 item, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(null, null, 2, null);
        java.lang.String str;
        int i19 = (i18 & 8) != 0 ? 1 : i17;
        kotlin.jvm.internal.o.g(item, "item");
        this.f306945t = "Finder.CgiFinderLivePushOrCancelPromote";
        r45.yg1 yg1Var = new r45.yg1();
        yg1Var.set(1, db2.t4.f228171a.a(5970));
        yg1Var.set(3, java.lang.Long.valueOf(j17));
        yg1Var.set(4, java.lang.Long.valueOf(j18));
        gk2.e eVar = dk2.ef.I;
        yg1Var.set(2, (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o) == null) ? xy2.c.f(this.f16135n) : str);
        yg1Var.set(5, java.lang.Long.valueOf(item.getLong(0)));
        yg1Var.set(6, java.lang.Integer.valueOf(item.getBoolean(3) ? 2 : 1));
        yg1Var.set(7, java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = yg1Var;
        r45.zg1 zg1Var = new r45.zg1();
        zg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zg1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = zg1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveanchorsendpromoteinfo";
        lVar.f70667d = 5970;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLivePushOrCancelPromote", "init liveId:" + j18 + ", objectId:" + j17 + "}, promoteId:" + item.getLong(0) + ", scene:" + yg1Var.getInteger(6));
        xy2.b bVar = xy2.b.f458155b;
        java.lang.String string = yg1Var.getString(2);
        gk2.e eVar2 = dk2.ef.I;
        pm0.z.b(bVar, "livePromoteUserErr", kotlin.jvm.internal.o.b(string, eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f328852o : null), null, "Finder.CgiFinderLivePushOrCancelPromote", false, false, null, 116, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.zg1 resp = (r45.zg1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306945t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        switch (i18) {
            case -200194:
            case -200193:
                pm0.v.X(ke2.d0.f306942d);
                return;
            default:
                return;
        }
    }
}
