package ke2;

/* loaded from: classes.dex */
public final class b extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String anchorFinderUserName, int i17, int i18, r45.qt2 qt2Var, int i19, long j17, java.lang.Long l17) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(anchorFinderUserName, "anchorFinderUserName");
        r45.pu0 pu0Var = new r45.pu0();
        pu0Var.set(1, db2.t4.f228171a.a(11126));
        pu0Var.set(2, anchorFinderUserName);
        pu0Var.set(3, java.lang.Integer.valueOf(i17));
        pu0Var.set(4, java.lang.Integer.valueOf(i18));
        pu0Var.set(5, java.lang.Integer.valueOf(i19));
        pu0Var.set(6, java.lang.Long.valueOf(j17));
        pu0Var.set(8, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pu0Var.set(9, xy2.c.e(context));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = pu0Var;
        r45.qu0 qu0Var = new r45.qu0();
        qu0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qu0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = qu0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderaudiencereservelivenotification";
        lVar.f70667d = 11126;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.qu0 resp = (r45.qu0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderAudienceReserveLiveNotification", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ' + pm0.b0.g(resp));
    }
}
