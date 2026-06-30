package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class x extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f125423d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125424e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f125425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f125424e = "promotion_comment";
        this.f125425f = "";
    }

    public final void O6(android.view.View view, java.lang.String feedid, java.lang.String reportBuffer, in5.s0 holder) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(feedid, "feedid");
        kotlin.jvm.internal.o.g(reportBuffer, "reportBuffer");
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f125425f = reportBuffer;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, this.f125424e);
        aVar.ik(view, 160, 25496);
        aVar.Vj(view, 32, new com.tencent.mm.plugin.finder.report.v(holder, this, aVar, feedid));
        aVar.Vj(view, 128, new com.tencent.mm.plugin.finder.report.w(holder, aVar, this, feedid));
    }

    public final void P6(java.lang.String feedid, int i17) {
        kotlin.jvm.internal.o.g(feedid, "feedid");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Bj(this.f125424e, "view_clk", kz5.c1.k(new jz5.l("feed_id", feedid), new jz5.l("promotion_comment_click_zone", java.lang.Integer.valueOf(i17)), new jz5.l("promotion_buffer", this.f125425f)), 1, false);
    }
}
