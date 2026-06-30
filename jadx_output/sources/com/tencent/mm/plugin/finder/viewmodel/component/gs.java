package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gs extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f134549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f134550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qq f134551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, r45.zk2 zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq qqVar) {
        super(1);
        this.f134549d = hsVar;
        this.f134550e = zk2Var;
        this.f134551f = qqVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed it = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long itemId = it.getItemId();
        r45.al2 al2Var = (r45.al2) com.tencent.mm.plugin.finder.viewmodel.component.hs.C.get(java.lang.Long.valueOf(itemId));
        r45.yk2 yk2Var = (r45.yk2) com.tencent.mm.plugin.finder.viewmodel.component.hs.B.get(java.lang.Long.valueOf(itemId));
        long j17 = yk2Var != null ? yk2Var.getLong(0) : 0L;
        int integer = al2Var != null ? al2Var.getInteger(1) : 0;
        long j18 = al2Var != null ? al2Var.getLong(0) : 0L;
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f134549d;
        hsVar.getClass();
        java.lang.Object obj2 = com.tencent.mm.plugin.finder.viewmodel.component.hs.D.get(java.lang.Long.valueOf(itemId));
        if (obj2 == null) {
            obj2 = new com.tencent.mm.plugin.finder.viewmodel.component.pq(com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d, 0L, 0, hsVar.f134658n, null, null, null, null, null, null, null, null, 4086, null);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pq pqVar = (com.tencent.mm.plugin.finder.viewmodel.component.pq) obj2;
        long j19 = pqVar.f135582b;
        java.lang.Long l17 = (java.lang.Long) pqVar.f135589i.get(java.lang.Long.valueOf(this.f134550e.getLong(0)));
        long longValue = l17 != null ? l17.longValue() : 0L;
        com.tencent.mm.plugin.finder.viewmodel.component.qq qqVar = com.tencent.mm.plugin.finder.viewmodel.component.qq.f135730e;
        com.tencent.mm.plugin.finder.viewmodel.component.qq qqVar2 = this.f134551f;
        long currentTimeMillis = qqVar2 == qqVar ? java.lang.System.currentTimeMillis() : 0L;
        long currentTimeMillis2 = qqVar2 == com.tencent.mm.plugin.finder.viewmodel.component.qq.f135731f ? java.lang.System.currentTimeMillis() : 0L;
        r45.rt2 rt2Var = new r45.rt2();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(0, b52.b.q(itemId));
        rt2Var.set(1, java.lang.Integer.valueOf(pqVar.f135584d + 1));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(2, b52.b.q(j18));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(3, b52.b.q(j17));
        rt2Var.set(4, java.lang.Integer.valueOf(pqVar.f135583c));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        for (java.lang.Object obj3 : pqVar.f135585e) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            long longValue2 = ((java.lang.Number) obj3).longValue();
            java.lang.Long l18 = (java.lang.Long) kz5.n0.a0(pqVar.f135586f, i18);
            long longValue3 = l18 != null ? l18.longValue() : 0L;
            r45.st2 st2Var = new r45.st2();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            st2Var.set(0, b52.b.q(longValue2));
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            st2Var.set(1, b52.b.q(longValue3));
            byte[] bytes = pqVar.f135588h.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            st2Var.set(2, android.util.Base64.encodeToString(bytes, 0));
            st2Var.getList(3).addAll(pqVar.f135587g);
            linkedList.add(st2Var);
            i18 = i19;
        }
        rt2Var.set(5, linkedList);
        rt2Var.set(6, java.lang.Integer.valueOf(integer));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(7, b52.b.q(longValue));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(8, b52.b.q(currentTimeMillis));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(9, b52.b.q(j19));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(10, b52.b.q(currentTimeMillis2));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(11, b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        rt2Var.set(12, b52.b.c());
        java.lang.String jSONObject = rt2Var.toJSON().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        androidx.appcompat.app.AppCompatActivity context = hsVar.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        int ordinal = qqVar2.ordinal();
        if (ordinal == 0) {
            i17 = 47;
        } else if (ordinal == 1) {
            i17 = 48;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i17 = 118;
        }
        com.tencent.mm.plugin.finder.report.l0.f(com.tencent.mm.plugin.finder.report.l0.f125109a, V6, it, i17, jSONObject, null, null, 48, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "report NPS: ".concat(jSONObject));
        return jz5.f0.f302826a;
    }
}
