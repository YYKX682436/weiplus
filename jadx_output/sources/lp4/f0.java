package lp4;

/* loaded from: classes5.dex */
public final class f0 extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f320343f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f320344g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f320345h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f320346i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f320347m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320348n;

    /* renamed from: o, reason: collision with root package name */
    public long f320349o;

    /* renamed from: p, reason: collision with root package name */
    public long f320350p;

    /* renamed from: q, reason: collision with root package name */
    public long f320351q;

    /* renamed from: r, reason: collision with root package name */
    public long f320352r;

    /* renamed from: s, reason: collision with root package name */
    public long f320353s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.a f320354t;

    /* renamed from: u, reason: collision with root package name */
    public final lp4.b0 f320355u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(status, "status");
        this.f320343f = holder;
        jz5.h.b(new lp4.z(this));
        this.f320344g = jz5.h.b(new lp4.d0(this));
        this.f320345h = jz5.h.b(new lp4.e0(this));
        this.f320346i = jz5.h.b(new lp4.v(this));
        this.f320347m = jz5.h.b(new lp4.a0(this));
        this.f320355u = new lp4.b0(this, status);
    }

    @Override // bp4.a0
    public void c(long j17) {
        z().getVisibility();
        z().setProgress(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f320343f;
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
            this.f320343f.setShow(false);
        }
    }

    public final com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup z() {
        return (com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((jz5.n) this.f320345h).getValue();
    }
}
