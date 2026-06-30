package lp4;

/* loaded from: classes10.dex */
public final class p extends yt3.a implements bp4.m2, bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f320388f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f320389g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f320390h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f320391i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f320392m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f320393n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f320394o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f320395p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f320396q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f320397r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f320398s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f320399t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f320400u;

    /* renamed from: v, reason: collision with root package name */
    public long f320401v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f320402w;

    /* renamed from: x, reason: collision with root package name */
    public bp4.c0 f320403x;

    /* renamed from: y, reason: collision with root package name */
    public final lp4.i f320404y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f320388f = layout;
        android.content.Context context = layout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder(context);
        layout.addView(editorPanelHolder);
        editorPanelHolder.setVisibility(8);
        this.f320389g = editorPanelHolder;
        this.f320390h = jz5.h.b(new lp4.j(this));
        this.f320391i = jz5.h.b(new lp4.o(this));
        this.f320392m = jz5.h.b(new lp4.g(this));
        this.f320393n = jz5.h.b(new lp4.a(this));
        this.f320394o = jz5.h.b(new lp4.h(this));
        this.f320395p = jz5.h.b(new lp4.n(this));
        this.f320396q = jz5.h.b(new lp4.m(this));
        this.f320397r = jz5.h.b(new lp4.f(this));
        this.f320398s = jz5.h.b(new lp4.l(this));
        this.f320399t = jz5.h.b(new lp4.k(this));
        this.f320404y = new lp4.i(this, status);
    }

    public final com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView A() {
        return (com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView) ((jz5.n) this.f320391i).getValue();
    }

    public final void B(rm5.v composition, long j17) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.f320402w = false;
        boolean z17 = this.f320400u;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f320389g;
        if (!z17) {
            this.f320400u = true;
            editorPanelHolder.setCloseTouchOutside(false);
            A().setCallback(this.f320404y);
            dq4.c cVar = dq4.c.f242369a;
            jz5.g gVar = this.f320393n;
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(imageView, "<get-cancelView>(...)");
            cVar.f(imageView);
            jz5.g gVar2 = this.f320394o;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(imageView2, "<get-okView>(...)");
            cVar.f(imageView2);
            android.content.Context context = z().getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            ((android.widget.TextView) ((jz5.n) this.f320395p).getValue()).setTextSize(1, (displayMetrics.density * 17.0f) / context.getResources().getDisplayMetrics().density);
            ((android.widget.ImageView) ((jz5.n) gVar).getValue()).setOnClickListener(new lp4.b(this));
            ((android.widget.ImageView) ((jz5.n) gVar2).getValue()).setOnClickListener(new lp4.c(this));
            ((android.view.View) ((jz5.n) this.f320399t).getValue()).setOnClickListener(new lp4.d(this));
            editorPanelHolder.setOnVisibleChangeCallback(new lp4.e(this));
        }
        this.f320401v = j17;
        editorPanelHolder.setShow(true);
        A().setTrack(composition);
        C();
    }

    public final void C() {
        long c17 = a06.d.c(((float) java.lang.Math.min(this.f320401v, A().getCutDuration())) / 1000.0f);
        jz5.g gVar = this.f320392m;
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(this.f320389g.getContext().getString(com.tencent.mm.R.string.k8_, java.lang.Long.valueOf(c17)));
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(A().getSourceDuration() > this.f320401v ? 0 : 4);
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f320389g.h()) {
            A().setProgress(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        this.f320403x = c0Var;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f320389g;
        if (!editorPanelHolder.h()) {
            return false;
        }
        this.f320402w = false;
        editorPanelHolder.setShow(false);
        return true;
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // bp4.m2
    public void onVideoPause() {
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f320398s).getValue()).setImageDrawable(com.tencent.mm.ui.uk.e(this.f320388f.getContext(), com.tencent.mm.R.raw.icons_filled_play, -1));
        ((android.view.View) ((jz5.n) this.f320399t).getValue()).setContentDescription(z().getContext().getString(com.tencent.mm.R.string.f490358sq));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f320397r).getValue()).setContentDescription(z().getContext().getString(com.tencent.mm.R.string.f490358sq));
    }

    @Override // bp4.m2
    public void onVideoPlay() {
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f320398s).getValue()).setImageDrawable(com.tencent.mm.ui.uk.e(this.f320388f.getContext(), com.tencent.mm.R.raw.icons_filled_pause, -1));
        ((android.view.View) ((jz5.n) this.f320399t).getValue()).setContentDescription(z().getContext().getString(com.tencent.mm.R.string.f490511x5));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f320397r).getValue()).setContentDescription(z().getContext().getString(com.tencent.mm.R.string.f490511x5));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (i17 == 8) {
            this.f320402w = false;
            this.f320389g.setShow(false);
        }
    }

    public final android.view.ViewGroup z() {
        return (android.view.ViewGroup) ((jz5.n) this.f320390h).getValue();
    }
}
