package lp4;

/* loaded from: classes10.dex */
public final class a1 extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f320313f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f320314g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f320315h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f320316i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f320317m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f320318n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f320319o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320320p;

    /* renamed from: q, reason: collision with root package name */
    public long f320321q;

    /* renamed from: r, reason: collision with root package name */
    public long f320322r;

    /* renamed from: s, reason: collision with root package name */
    public long f320323s;

    /* renamed from: t, reason: collision with root package name */
    public long f320324t;

    /* renamed from: u, reason: collision with root package name */
    public long f320325u;

    /* renamed from: v, reason: collision with root package name */
    public final lp4.x0 f320326v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(status, "status");
        this.f320313f = holder;
        this.f320314g = "MicroMsg.VLogTrackEditPlugin";
        this.f320315h = jz5.h.b(new lp4.y0(this));
        this.f320316i = jz5.h.b(new lp4.z0(this));
        this.f320317m = jz5.h.b(new lp4.v0(this));
        this.f320318n = jz5.h.b(new lp4.r0(this));
        this.f320319o = jz5.h.b(new lp4.w0(this));
        this.f320326v = new lp4.x0(this, status);
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f320313f.h()) {
            ((com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView) ((jz5.n) this.f320316i).getValue()).setProgress(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f320313f;
        if (!editorPanelHolder.h()) {
            return false;
        }
        editorPanelHolder.setShow(false);
        return true;
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (i17 == 8) {
            this.f320313f.setShow(false);
        }
    }

    public final void z() {
        ((android.widget.TextView) ((jz5.n) this.f320317m).getValue()).setText(this.f320313f.getContext().getString(com.tencent.mm.R.string.k8_, java.lang.Integer.valueOf(a06.d.b(((float) (this.f320324t - this.f320323s)) / 1000.0f))));
    }
}
