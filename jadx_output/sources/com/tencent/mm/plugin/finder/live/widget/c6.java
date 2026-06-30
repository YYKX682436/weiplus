package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class c6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f117967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f117968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, r45.xq1 xq1Var) {
        super(2);
        this.f117967d = d6Var;
        this.f117968e = xq1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.u24 it = (r45.u24) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f117967d;
        java.lang.String str = d6Var.f118062d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gamteam select value:");
        sb6.append(it.getInteger(1));
        sb6.append(", tip:");
        sb6.append(it.getString(0));
        sb6.append(", expose:");
        java.lang.String string = it.getString(0);
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.xq1 xq1Var = this.f117968e;
        java.lang.Integer valueOf = xq1Var != null ? java.lang.Integer.valueOf(xq1Var.getInteger(1)) : null;
        r45.o63 o63Var = new r45.o63();
        o63Var.f381980d = it.getInteger(1);
        r45.j73 j73Var = new r45.j73();
        r45.j73 j73Var2 = (r45.j73) it.getCustom(2);
        j73Var.set(0, java.lang.Integer.valueOf(j73Var2 != null ? j73Var2.getInteger(0) : 0));
        r45.j73 j73Var3 = (r45.j73) it.getCustom(2);
        j73Var.set(2, j73Var3 != null ? j73Var3.getList(2) : null);
        j73Var.set(1, java.lang.Integer.valueOf(intValue));
        o63Var.f381981e = j73Var;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = d6Var.f118061c;
        dk2.xf j17 = efVar.j(lVar.R0());
        if (j17 != null) {
            android.content.Context context = d6Var.f118059a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            long j18 = ((mm2.e1) lVar.S0().a(mm2.e1.class)).f328988r.getLong(0);
            long j19 = ((mm2.e1) lVar.S0().a(mm2.e1.class)).f328983m;
            com.tencent.mm.plugin.finder.live.widget.b6 b6Var = new com.tencent.mm.plugin.finder.live.widget.b6(this.f117967d, it, this.f117968e, intValue, valueOf);
            dk2.r4 r4Var = (dk2.r4) j17;
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "setGameTeamMode liveId:" + j18 + " objectId:" + j19 + " gameTeamMode:" + o63Var);
            ke2.g gVar = new ke2.g(j18, j19, ((mm2.c1) r4Var.m(mm2.c1.class)).f328866q, xy2.c.e(context), 0, null, o63Var, null, null, 0L, new dk2.o3(b6Var, context), null, 2480, null);
            gVar.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
            pq5.g l17 = gVar.l();
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                l17.f((im5.b) context);
            }
        }
        return jz5.f0.f302826a;
    }
}
