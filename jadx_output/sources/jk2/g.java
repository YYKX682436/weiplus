package jk2;

/* loaded from: classes3.dex */
public final class g extends jk2.j {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f300066e;

    /* renamed from: f, reason: collision with root package name */
    public kk2.p f300067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jk2.a plugin, r45.zd2 guideData) {
        super(plugin, guideData);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(guideData, "guideData");
        this.f300066e = jz5.h.b(jk2.f.f300065d);
    }

    @Override // jk2.j
    public boolean a() {
        boolean z17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f300066e).getValue()).getInt("live_close_square_guide_forbid_tips", 0) == 1;
        com.tencent.mars.xlog.Log.i(this.f300072d, "checkGuideShow hadForbid: " + z17);
        return !z17;
    }

    @Override // jk2.j
    public java.lang.String e() {
        return "GoSquareGuide";
    }

    @Override // jk2.j
    public boolean f() {
        kk2.p pVar = this.f300067f;
        return (pVar == null || pVar.z()) ? false : true;
    }

    @Override // jk2.j
    public void h() {
        this.f300067f = new kk2.p(this.f300069a, this.f300070b);
    }

    @Override // jk2.j
    public void i() {
        kk2.p pVar = this.f300067f;
        if (pVar != null) {
            pVar.w();
        }
    }

    @Override // jk2.j
    public void k() {
        super.k();
        kk2.p pVar = this.f300067f;
        if (pVar != null) {
            pVar.A(true);
        }
    }

    @Override // jk2.j
    public void l() {
        this.f300067f = null;
    }
}
