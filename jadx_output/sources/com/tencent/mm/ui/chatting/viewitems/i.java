package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.j f204147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.ui.chatting.viewitems.j jVar, com.tencent.mm.storage.f9 f9Var) {
        super(2);
        this.f204147d = jVar;
        this.f204148e = f9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zy2.c cVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.ui.chatting.viewitems.j jVar = this.f204147d;
        if (booleanValue) {
            jVar.f204213u = c01.id.c();
        } else {
            com.tencent.mars.xlog.Log.i("BaseChattingItemAppMsgFinderLiveFeed", "onViewExposedListener false, cancel it");
            kotlinx.coroutines.r2 r2Var = jVar.f204212t;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            long j17 = jVar.f204213u;
            com.tencent.mm.storage.f9 f9Var = this.f204148e;
            ot0.q v17 = ot0.q.v(f9Var.U1());
            r45.g92 g92Var = (v17 == null || (cVar = (zy2.c) v17.y(zy2.c.class)) == null) ? null : cVar.f477359b;
            if (g92Var != null) {
                r45.l71 Hj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(pm0.v.Z(g92Var.getString(0)));
                if (Hj != null && Hj.getBoolean(26)) {
                    com.tencent.mars.xlog.Log.i("ChatingItemAppMsgFinderLiveFeed", "reportExtReport: server close expose ext report, feedId=" + g92Var.getString(2) + ", liveId=" + g92Var.getString(0));
                } else {
                    r45.jn0 jn0Var = new r45.jn0();
                    jn0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(g92Var.getString(2))));
                    jn0Var.set(1, g92Var.getString(1));
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("feedActionType", 117);
                    jSONObject.put("value", j17);
                    jSONObject.put("duration", longValue);
                    jSONObject.put("AutoPlayDuration", 0);
                    jSONObject.put("GMsgID", ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).wi(f9Var));
                    yb5.d dVar = jVar.f204216x;
                    jSONObject.put("EntranceScene", dVar != null && dVar.C() ? 3 : 2);
                    yb5.d dVar2 = jVar.f204216x;
                    if (dVar2 != null && dVar2.C()) {
                        yb5.d dVar3 = jVar.f204216x;
                        java.lang.String x17 = dVar3 != null ? dVar3.x() : null;
                        if (x17 == null) {
                            x17 = "";
                        }
                        jSONObject.put("share_chatroom", x17);
                    }
                    jn0Var.set(3, jSONObject.toString());
                    ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).wi(null, 18054, jn0Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
