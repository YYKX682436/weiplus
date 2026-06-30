package ma2;

/* loaded from: classes2.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI f325203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f325204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f325207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325208f;

    public a(com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI finderPostPlayUI, long j17, java.lang.String str, java.lang.String str2, long j18, java.lang.String str3) {
        this.f325203a = finderPostPlayUI;
        this.f325204b = j17;
        this.f325205c = str;
        this.f325206d = str2;
        this.f325207e = j18;
        this.f325208f = str3;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.activity.postplay.ui.FinderPostPlayUI activity = this.f325203a;
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        jz5.l lVar = new jz5.l("finder_tab_context_id", V6.getString(2));
        jz5.l lVar2 = new jz5.l("finder_context_id", V6.getString(1));
        jz5.l lVar3 = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
        jz5.l lVar4 = new jz5.l("source_comment_scene", java.lang.Integer.valueOf(V6.getInteger(7)));
        jz5.l lVar5 = new jz5.l("cluster_id", pm0.v.u(this.f325204b));
        jz5.l lVar6 = new jz5.l("cluster_name", this.f325205c);
        jz5.l lVar7 = new jz5.l("cluster_reason_recommendation", this.f325206d);
        jz5.l lVar8 = new jz5.l("source_feedid", pm0.v.u(this.f325207e));
        jz5.l lVar9 = new jz5.l("source_session_buffer", this.f325208f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(((java.lang.Number) activity.f101800u.get(0)).longValue());
        sb6.append('#');
        sb6.append(((java.lang.Number) activity.f101800u.get(1)).longValue());
        jz5.l lVar10 = new jz5.l("cluster_tab_staytime", sb6.toString());
        long longValue = ((java.lang.Number) activity.f101800u.get(0)).longValue();
        java.lang.Object obj = activity.f101800u.get(1);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, new jz5.l("stay_time_ms", java.lang.Long.valueOf(longValue + ((java.lang.Number) obj).longValue())));
    }
}
