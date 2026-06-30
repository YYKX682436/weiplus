package hd2;

/* loaded from: classes2.dex */
public final class x0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment f280545a;

    public x0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment finderRecommendReasonFragment) {
        this.f280545a = finderRecommendReasonFragment;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment fragment = this.f280545a;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        return kz5.c1.k(new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("source_feedid", pm0.v.u(fragment.f110063z)), new jz5.l("source_session_buffer", fragment.A), new jz5.l("start_expose_time_ms", java.lang.Long.valueOf(fragment.D)), new jz5.l("end_expose_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new jz5.l("jump_info_by_pass_info", fragment.f110062y), new jz5.l("jump_dstream_unexp_reason", java.lang.Integer.valueOf(fragment.B)));
    }
}
