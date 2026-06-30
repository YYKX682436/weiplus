package fp4;

/* loaded from: classes10.dex */
public final class s extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f265374f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f265375g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f265376h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f265377i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f265378m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f265379n;

    /* renamed from: o, reason: collision with root package name */
    public long f265380o;

    /* renamed from: p, reason: collision with root package name */
    public long f265381p;

    /* renamed from: q, reason: collision with root package name */
    public long f265382q;

    /* renamed from: r, reason: collision with root package name */
    public long f265383r;

    /* renamed from: s, reason: collision with root package name */
    public long f265384s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.a f265385t;

    /* renamed from: u, reason: collision with root package name */
    public final fp4.o f265386u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(status, "status");
        this.f265374f = holder;
        jz5.h.b(new fp4.m(this));
        this.f265375g = jz5.h.b(new fp4.q(this));
        this.f265376h = jz5.h.b(new fp4.r(this));
        this.f265377i = jz5.h.b(new fp4.i(this));
        this.f265378m = jz5.h.b(new fp4.n(this));
        this.f265386u = new fp4.o(this, status);
    }

    public final void A(com.tencent.mm.plugin.vlog.model.h1 composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        zu3.a aVar = this.f265385t;
        if (aVar != null) {
            boolean z17 = this.f265379n;
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f265374f;
            if (!z17) {
                this.f265379n = true;
                editorPanelHolder.setCloseTouchOutside(true);
                com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup z18 = z();
                fp4.o oVar = this.f265386u;
                z18.setCallback(oVar);
                z().setRealTimeCallback(oVar);
                editorPanelHolder.setOnVisibleChangeCallback(new fp4.j(this));
                ((android.widget.ImageView) ((jz5.n) this.f265377i).getValue()).setOnClickListener(new fp4.k(this));
                ((android.widget.ImageView) ((jz5.n) this.f265378m).getValue()).setOnClickListener(new fp4.l(this));
            }
            long j17 = 1000;
            long startUs = composition.i().getStartUs() / j17;
            this.f265380o = composition.i().getEndUs() / j17;
            bv3.d dVar = aVar.f475760c;
            long b17 = dVar.b();
            long j18 = this.f265380o;
            if (b17 > j18) {
                bv3.c cVar = dVar.f24732b;
                cVar.c(cVar.f24728c + (j18 - cVar.a()));
            }
            this.f265381p = dVar.c();
            long b18 = dVar.b();
            this.f265382q = b18;
            this.f265383r = this.f265381p;
            this.f265384s = b18;
            bv3.d dVar2 = new bv3.d(0L, false, 3, null);
            dVar2.d(this.f265383r, this.f265384s);
            aVar.f475759b = dVar2;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogTimeEditPlugin", "time range:" + dVar);
            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup z19 = z();
            zu3.a aVar2 = this.f265385t;
            kotlin.jvm.internal.o.d(aVar2);
            long c17 = aVar2.f475760c.c();
            zu3.a aVar3 = this.f265385t;
            kotlin.jvm.internal.o.d(aVar3);
            z19.b(composition, c17, aVar3.f475760c.b());
            editorPanelHolder.setShow(true);
        }
    }

    @Override // bp4.a0
    public void c(long j17) {
        z().setProgress(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f265374f;
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
            this.f265374f.setShow(false);
        }
    }

    public final com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup z() {
        return (com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((jz5.n) this.f265376h).getValue();
    }
}
