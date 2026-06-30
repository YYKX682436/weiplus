package dv2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public long f243880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.v f243881b;

    public k(dv2.v vVar) {
        this.f243881b = vVar;
    }

    public final void a(java.lang.String eventId, int i17, long j17) {
        com.tencent.mm.plugin.finder.report.u3 u3Var = com.tencent.mm.plugin.finder.report.u3.f125383a;
        androidx.appcompat.app.AppCompatActivity activity = this.f243881b.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        r45.qt2 b17 = u3Var.b(activity);
        java.util.Map l17 = kz5.c1.l(new jz5.l("comment_scene", 403), new jz5.l("follow_frequently_viewed_tab", java.lang.Integer.valueOf(i17)));
        l17.putAll(u3Var.a(b17));
        if (kotlin.jvm.internal.o.b(eventId, "page_out")) {
            l17.put("stay_time", java.lang.Long.valueOf(j17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FollowFreqReport] page_event event=");
        sb6.append(eventId);
        sb6.append(" page_id=50457 comment_scene=403 follow_frequently_viewed_tab=");
        sb6.append(i17);
        sb6.append(" stay_time=");
        sb6.append(j17);
        sb6.append(" ref_commentscene=");
        sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.getInteger(7)) : null);
        sb6.append(" finder_context_id=");
        sb6.append(b17 != null ? b17.getString(1) : null);
        sb6.append(" finder_tab_context_id=");
        sb6.append(b17 != null ? b17.getString(2) : null);
        com.tencent.mars.xlog.Log.i("Finder.SelfReporter", sb6.toString());
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Aj(50457, eventId, l17, 1, false);
    }
}
