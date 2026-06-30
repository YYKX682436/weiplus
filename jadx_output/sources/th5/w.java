package th5;

/* loaded from: classes12.dex */
public final class w extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f419471v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f419472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.BizPhotoImageBottomBar");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
    }

    @Override // rf3.h
    public void D() {
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        android.view.View view = this.f419471v;
        if (view == null) {
            return;
        }
        Y(this, new th5.v(oVar, view));
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        D();
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        if (oVar != null) {
            android.view.View view = this.f419471v;
            boolean z17 = false;
            if (view != null && view.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                th5.v0.f419470a.a(oVar.f419344c, oVar.f419342a, oVar.f419343b, th5.a.f419333e, th5.e.f419366e);
            }
        }
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dzs, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        android.view.View view = this.f419471v;
        if (view == null) {
            return;
        }
        Y(this, new th5.t(view));
        b0();
    }

    public final void g0() {
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        android.view.View view = this.f419471v;
        if (view == null) {
            return;
        }
        Y(this, new th5.u(oVar, view));
        a0();
    }

    @Override // rf3.h
    public void h() {
        D();
    }

    @Override // mf3.l
    public void onResume() {
        D();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        lg3.a aVar;
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mf3.k kVar = bindContext.f326117a;
        th5.o oVar = kVar instanceof th5.o ? (th5.o) kVar : null;
        if (oVar == null) {
            return;
        }
        if (oVar.d()) {
            if (oVar.f419423h.length() == 0) {
                if (oVar.f419421f == mf3.w.f326129e) {
                    float f17 = oVar.f419424i;
                    if (f17 > 0.0f && f17 < 1.0f) {
                        lg3.a aVar2 = this.f419472w;
                        if (aVar2 != null) {
                            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(oVar, new vf3.f(vf3.e.f436380g, null, 0, f17, 6, null));
                        }
                        oVar.f419425j = new th5.s(this, oVar);
                    }
                }
                lg3.a aVar3 = this.f419472w;
                if (aVar3 != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar3).h(oVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                }
                long j17 = oVar.f419343b;
                if (j17 > 0 && (aVar = this.f419472w) != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
                }
                oVar.f419425j = new th5.s(this, oVar);
            }
        }
        g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        android.view.View findViewById = M().findViewById(com.tencent.mm.R.id.smo);
        this.f419471v = findViewById;
        this.f419472w = findViewById instanceof lg3.a ? (lg3.a) findViewById : null;
        if (findViewById != 0) {
            pf3.d.W(this, findViewById, null, 1, null);
            pf3.d.U(this, findViewById, null, new th5.r(this), 1, null);
        }
    }
}
