package z51;

/* loaded from: classes10.dex */
public final class p extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f470199f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer f470200g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f470201h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f470202i;

    /* renamed from: j, reason: collision with root package name */
    public y51.d f470203j;

    /* renamed from: k, reason: collision with root package name */
    public a61.c f470204k;

    /* renamed from: l, reason: collision with root package name */
    public a61.d f470205l;

    /* renamed from: m, reason: collision with root package name */
    public y51.e f470206m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f470207n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f470208o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f470209p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y51.a pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoTPPlayerViewPc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        kotlin.jvm.internal.o.g(config, "config");
        super.d(config);
        a61.c cVar = config.f1718b;
        this.f470204k = cVar;
        this.f470205l = config.f1717a;
        this.f470207n = cVar.f1720b;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("sourceConfig");
            throw null;
        }
        this.f470203j = cVar.f1723e;
        f("init isParsed " + this.f470207n);
    }

    @Override // z51.x
    public void h() {
        f("pausePlay isBitmapLoadFinish: " + this.f470209p + " isParseFinish: " + this.f470207n + " isPlaying: " + k());
        this.f470208o = true;
        if (k()) {
            ((z51.g) a(z51.g.class)).k();
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f470200g;
            if (thumbPlayerViewContainer != null) {
                thumbPlayerViewContainer.stop();
            } else {
                kotlin.jvm.internal.o.o("tpPlayerView");
                throw null;
            }
        }
    }

    @Override // z51.x
    public void i() {
        boolean k17 = k();
        if (k17) {
            g("go to play but isPlaying to return");
            return;
        }
        f("startPlay parseFinish: " + this.f470207n + " isPause: " + this.f470208o + " isBitmapLoadFinish: " + this.f470209p + " isPlaying: " + k17);
        boolean z17 = false;
        this.f470208o = false;
        boolean z18 = this.f470207n;
        kotlinx.coroutines.y0 y0Var = this.f470236c;
        if (!z18) {
            kotlinx.coroutines.r2 r2Var = this.f470201h;
            if (r2Var != null && r2Var.a()) {
                z17 = true;
            }
            if (z17) {
                g("waitParseJob is active return");
                return;
            } else {
                this.f470201h = kotlinx.coroutines.l.d(y0Var, null, null, new z51.m(this, null), 3, null);
                return;
            }
        }
        boolean z19 = ((z51.c) a(z51.c.class)).f470176h;
        f("parsed finish case >> parseIsSuccess: " + z19);
        if (z19) {
            if (!this.f470209p) {
                this.f470202i = kotlinx.coroutines.l.d(y0Var, null, null, new z51.o(this, null), 3, null);
                return;
            }
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f470200g;
            if (thumbPlayerViewContainer == null) {
                kotlin.jvm.internal.o.o("tpPlayerView");
                throw null;
            }
            a61.c cVar = this.f470204k;
            if (cVar != null) {
                thumbPlayerViewContainer.setVideoPath(cVar.f1721c);
            } else {
                kotlin.jvm.internal.o.o("sourceConfig");
                throw null;
            }
        }
    }

    @Override // z51.x
    public void j() {
        kotlinx.coroutines.r2 r2Var = this.f470201h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f470202i;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f470200g;
        if (thumbPlayerViewContainer == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        thumbPlayerViewContainer.stop();
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer2 = this.f470200g;
        if (thumbPlayerViewContainer2 == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        thumbPlayerViewContainer2.onDetach();
        super.j();
    }

    public final boolean k() {
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = this.f470200g;
        if (thumbPlayerViewContainer != null) {
            return thumbPlayerViewContainer.isPlaying();
        }
        kotlin.jvm.internal.o.o("tpPlayerView");
        throw null;
    }
}
