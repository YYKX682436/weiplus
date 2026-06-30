package db2;

/* loaded from: classes5.dex */
public final class l4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228060t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(java.lang.String sessionId, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Long l17) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f228060t = "Finder.CgiGetMsgSession";
        r45.ui2 ui2Var = new r45.ui2();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
        java.lang.String h17 = m4Var.h(sessionId);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String f17 = m4Var.f(sessionId);
        if (com.tencent.mm.storage.z3.S3(f17)) {
            ui2Var.set(0, 1);
        } else if (com.tencent.mm.storage.z3.T3(f17)) {
            ui2Var.set(0, 3);
        } else {
            ui2Var.set(0, 2);
        }
        ui2Var.set(2, sessionId);
        ui2Var.set(1, h17);
        ui2Var.set(3, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        if (num2 != null) {
            ui2Var.set(4, java.lang.Integer.valueOf(num2.intValue()));
        }
        if (num3 != null) {
            ui2Var.set(5, java.lang.Integer.valueOf(num3.intValue()));
        }
        if (l17 != null) {
            ui2Var.set(6, java.lang.Long.valueOf(l17.longValue()));
        }
        com.tencent.mars.xlog.Log.i("Finder.CgiGetMsgSession", "CgiGetMsgSession, sourceType: " + ui2Var.getInteger(3) + ", userPageEnterType: " + ui2Var.getInteger(4) + ", lastCommentScene: " + ui2Var.getInteger(5));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.s81 s81Var = new r45.s81();
        s81Var.set(1, db2.t4.f228171a.a(6218));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ui2Var);
        s81Var.set(2, linkedList);
        s81Var.set(4, g92.b.f269769e.U());
        lVar.f70664a = s81Var;
        r45.t81 t81Var = new r45.t81();
        t81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) t81Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = t81Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmsgsession";
        lVar.f70667d = 6218;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiGetMsgSession", "[CgiGetMsgSession] sessionId=".concat(sessionId));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.t81 resp = (r45.t81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228060t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ');
    }
}
