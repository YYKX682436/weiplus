package gx0;

/* loaded from: classes5.dex */
public final class a2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f276181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ow0.g f276182e;

    public a2(gx0.u2 u2Var, ow0.g gVar) {
        this.f276181d = u2Var;
        this.f276182e = gVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) obj;
        if (mjid == null) {
            return;
        }
        gx0.u2 u2Var = this.f276181d;
        dx0.g gVar = u2Var.B;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("coverThumbnailProvider");
            throw null;
        }
        dx0.p d17 = gVar.d(mjid);
        if (d17 != null) {
            this.f276182e.E(mjid, d17);
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
        if (n76 != null) {
            n76.j();
        }
    }
}
