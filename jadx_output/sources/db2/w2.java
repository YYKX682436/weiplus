package db2;

/* loaded from: classes.dex */
public final class w2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228213t;

    /* renamed from: u, reason: collision with root package name */
    public int f228214u;

    public /* synthetic */ w2(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.protobuf.g gVar, java.lang.String str4, r45.ip2 ip2Var, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? "" : str3, (i17 & 8) != 0 ? null : gVar, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? null : ip2Var);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.du2 resp = (r45.du2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228213t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(java.lang.String nickName, java.lang.String eventName, java.lang.String query, com.tencent.mm.protobuf.g gVar, java.lang.String requestId, r45.ip2 ip2Var) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        this.f228213t = "CgiFinderSearchEvent";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.cu2 cu2Var = new r45.cu2();
        cu2Var.set(1, db2.t4.f228171a.b(6241, this.f16135n));
        if (kotlin.jvm.internal.o.b(requestId, "")) {
            cu2Var.set(4, java.lang.String.valueOf(c01.id.c()));
        } else {
            cu2Var.set(4, requestId);
        }
        if (query.length() > 0) {
            cu2Var.set(3, query);
        } else {
            cu2Var.set(5, nickName);
            cu2Var.set(6, eventName);
        }
        cu2Var.set(2, gVar);
        cu2Var.set(8, ip2Var);
        lVar.f70664a = cu2Var;
        r45.du2 du2Var = new r45.du2();
        du2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) du2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = du2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersearchevent";
        lVar.f70667d = 6241;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderSearchEvent", "nickName: " + nickName + ", eventName: " + eventName + ", query: " + query);
    }
}
