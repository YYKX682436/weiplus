package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class x1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.y1 f122488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f122489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.z1 f122490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122491d;

    public x1(com.tencent.mm.plugin.finder.playlist.y1 y1Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.playlist.z1 z1Var, int i17) {
        this.f122488a = y1Var;
        this.f122489b = s0Var;
        this.f122490c = z1Var;
        this.f122491d = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.vx0 vx0Var;
        r45.do2 do2Var;
        com.tencent.mm.plugin.finder.playlist.y1 y1Var = this.f122488a;
        y1Var.getClass();
        android.content.Context context = this.f122489b.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        lz5.m mVar = new lz5.m();
        com.tencent.mm.plugin.finder.playlist.z1 z1Var = this.f122490c;
        mVar.put("source_feedid", pm0.v.u(z1Var.f122509e));
        mVar.put("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(z1Var.getFeedObject().getFeedObject().getId(), z1Var.w(), V6.getInteger(5)));
        mVar.put("finder_tab_context_id", V6.getString(2));
        mVar.put("finder_context_id", V6.getString(1));
        mVar.put(ya.b.INDEX, java.lang.Integer.valueOf(this.f122491d));
        mVar.put("feed_id", pm0.v.u(z1Var.getFeedObject().getFeedObject().getId()));
        mVar.put("author_finder_username", z1Var.getFeedObject().getUserName());
        r45.dm2 object_extend = z1Var.getFeedObject().getFeedObject().getObject_extend();
        boolean z17 = y1Var.f122501h;
        if (object_extend != null && (do2Var = (r45.do2) object_extend.getCustom(39)) != null) {
            nr2.m mVar2 = new nr2.m(do2Var);
            mVar.put("comment_scene", java.lang.Integer.valueOf(z17 ? 345 : 344));
            mVar.put("collection_feed_num", java.lang.Integer.valueOf(mVar2.f()));
            mVar.put("is_intelligent_collection", 0);
            mVar.put("collection_id", pm0.v.u(mVar2.l()));
            return mVar;
        }
        r45.dm2 object_extend2 = z1Var.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend2 == null || (vx0Var = (r45.vx0) object_extend2.getCustom(0)) == null) {
            kz5.b1.b(mVar);
            return null;
        }
        mVar.put("comment_scene", java.lang.Integer.valueOf(z17 ? yc1.p.CTRL_INDEX : yc1.a0.CTRL_INDEX));
        mVar.put("collection_feed_num", java.lang.Integer.valueOf(vx0Var.getInteger(4)));
        mVar.put("is_intelligent_collection", java.lang.Integer.valueOf(hc2.q.b(vx0Var) ? 1 : 0));
        mVar.put("collection_id", pm0.v.u(vx0Var.getLong(0)));
        return mVar;
    }
}
