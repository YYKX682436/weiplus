package gx0;

/* loaded from: classes5.dex */
public final class sc extends pv0.y {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f276953t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f276954u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f276955v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276953t = jz5.h.b(new gx0.nc(this));
        this.f276954u = jz5.h.b(new gx0.rc(this));
        this.f276955v = jz5.h.b(new gx0.pc(this));
    }

    @Override // pv0.y, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void b7() {
        super.b7();
        ((gx0.bh) ((jz5.n) this.f276954u).getValue()).L.p();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.oc(this, null), 3, null);
    }

    @Override // pv0.y
    public gx0.hf n7() {
        return (gx0.hf) T6(gx0.kc.class);
    }

    @Override // pv0.y, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /* renamed from: o7 */
    public void a7(pv0.m panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.a7(panel);
        pv0.h timbrePanelArgs$plugin_mj_template_release = panel.getTimbrePanelArgs$plugin_mj_template_release();
        if (timbrePanelArgs$plugin_mj_template_release == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            timbrePanelArgs$plugin_mj_template_release = null;
        }
        if (timbrePanelArgs$plugin_mj_template_release == null) {
            return;
        }
        gx0.bh bhVar = (gx0.bh) ((jz5.n) this.f276954u).getValue();
        com.tencent.maas.moviecomposing.segments.Segment segment = timbrePanelArgs$plugin_mj_template_release.f358525a;
        gx0.qc qcVar = new gx0.qc(this, segment);
        bhVar.getClass();
        bhVar.L.addFirst(qcVar);
        jz5.g gVar = this.f276955v;
        gx0.bf bfVar = (gx0.bf) ((jz5.n) gVar).getValue();
        com.tencent.maas.model.time.MJTimeRange B = segment.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        bfVar.o7(B, true);
        ((gx0.bf) ((jz5.n) gVar).getValue()).D = 1;
    }
}
