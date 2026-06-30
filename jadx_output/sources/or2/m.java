package or2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or2.h f347660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f347661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(or2.h hVar, r45.qt2 qt2Var) {
        super(0);
        this.f347660d = hVar;
        this.f347661e = qt2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        or2.h hVar = this.f347660d;
        jz5.l lVar = new jz5.l("feed_id", pm0.v.u(hVar.f347642o));
        jz5.l lVar2 = new jz5.l("jank", java.lang.Integer.valueOf(hVar.f()));
        jz5.l lVar3 = new jz5.l("big_jank", java.lang.Integer.valueOf(hVar.c()));
        jz5.l lVar4 = new jz5.l("stutter", java.lang.Float.valueOf(hVar.g()));
        jz5.l lVar5 = new jz5.l(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, java.lang.Integer.valueOf(hVar.e()));
        jz5.l lVar6 = new jz5.l("display_fps", java.lang.Integer.valueOf(hVar.f347629b));
        jz5.l lVar7 = new jz5.l(ya.b.SCORE, 0);
        jz5.l lVar8 = new jz5.l("duration_ms", java.lang.Long.valueOf(hVar.d()));
        r45.qt2 qt2Var = this.f347661e;
        ((cy1.a) ((dy1.r) c17)).Ej("end_scroll_in_feed", kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, new jz5.l("finder_tab_context_id", qt2Var.getString(2)), new jz5.l("finder_context_id", qt2Var.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.getInteger(5)))), 34937);
        return jz5.f0.f302826a;
    }
}
