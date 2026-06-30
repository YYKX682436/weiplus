package lf4;

/* loaded from: classes4.dex */
public final class g implements cf4.a, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final cf4.b f318394d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f318395e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f318396f;

    /* renamed from: g, reason: collision with root package name */
    public long f318397g;

    /* renamed from: h, reason: collision with root package name */
    public long f318398h;

    /* renamed from: i, reason: collision with root package name */
    public long f318399i;

    /* renamed from: m, reason: collision with root package name */
    public int f318400m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318401n;

    public g(cf4.b view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f318394d = view;
        this.f318395e = "";
        this.f318396f = new java.util.LinkedHashMap();
    }

    public final void a(long j17) {
        ef4.v vVar = ef4.w.f252468t;
        nf4.l i17 = vVar.i();
        vVar.j();
        java.lang.String userName = this.f318395e;
        kotlin.jvm.internal.o.g(userName, "userName");
        long b17 = i17.b1(j17, 30);
        this.f318399i = b17;
        long j18 = this.f318397g;
        if (j18 != 0) {
            if (b17 >= j18) {
                b17 = j18;
            }
            this.f318399i = b17;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ff4.d) {
            ff4.d dVar = (ff4.d) m1Var;
            if (com.tencent.mm.sdk.platformtools.t8.D0(dVar.f261671d, this.f318395e)) {
                boolean z17 = i18 == 314 || i18 == 315;
                this.f318401n = z17;
                if (z17) {
                    qf4.f fVar = ((com.tencent.mm.plugin.story.ui.album.StoryAlbumUI) this.f318394d).f171871g;
                    if (fVar == null) {
                        kotlin.jvm.internal.o.o("mStoryAlbumAdapter");
                        throw null;
                    }
                    fVar.f362697m = true;
                    if (!fVar.f362695h.isEmpty()) {
                        fVar.notifyDataSetChanged();
                    }
                }
                if (dVar.f261678n) {
                    ef4.w.f252468t.l().post(new lf4.e(this));
                } else {
                    this.f318400m = 0;
                    ef4.w.f252468t.l().post(new lf4.f(this));
                }
                this.f318397g = dVar.f261677m;
            }
        }
    }
}
