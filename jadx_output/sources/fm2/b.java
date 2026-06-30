package fm2;

/* loaded from: classes3.dex */
public abstract class b extends com.tencent.mm.plugin.finder.live.view.k0 {

    /* renamed from: d, reason: collision with root package name */
    public tm2.t2 f264020d;

    /* renamed from: e, reason: collision with root package name */
    public tm2.s2 f264021e;

    /* renamed from: f, reason: collision with root package name */
    public tm2.g f264022f;

    /* renamed from: g, reason: collision with root package name */
    public tn0.w0 f264023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = (com.tencent.mm.plugin.finder.ui.MMFinderUI) context;
        this.f264020d = new tm2.t2(mMFinderUI);
        this.f264021e = new tm2.s2(mMFinderUI);
        this.f264022f = new tm2.g(mMFinderUI);
    }

    public final tn0.w0 getLiveCore() {
        return this.f264023g;
    }

    public final tm2.g getLiveEndUIC() {
        return this.f264022f;
    }

    public final tm2.t2 getLivePrepareUIC() {
        return this.f264020d;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public abstract /* synthetic */ int getLiveRole();

    public final tm2.s2 getLiveStartUIC() {
        return this.f264021e;
    }

    public final tm2.s2 getStartUIC() {
        return this.f264021e;
    }

    public void prepareToStart(boolean z17) {
        tm2.s2 s2Var = this.f264021e;
        if (!z17) {
            s2Var.k();
            return;
        }
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null) {
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(bVar, false, 1, null);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", true);
        fm2.b bVar2 = s2Var.f19601c;
        if (bVar2 != null) {
            bVar2.statusChange(qo0.b.f365386n, bundle);
        }
        s2Var.i(true);
        mm2.f6 f6Var = (mm2.f6) s2Var.c(mm2.f6.class);
        so2.j5 j5Var = ((mm2.f6) s2Var.f19609a.a(mm2.f6.class)).f329049w;
        c61.bc bcVar = j5Var instanceof c61.bc ? (c61.bc) j5Var : null;
        f6Var.f329050x = bcVar != null ? bcVar.c() : 0L;
        fm2.b bVar3 = s2Var.f19601c;
        if (bVar3 != null) {
            zl2.r4.f473950a.E2(s2Var.f19609a, bVar3);
        }
        com.tencent.mm.plugin.finder.live.plugin.na naVar = s2Var.f420592i0;
        if (naVar != null) {
            naVar.C1();
        }
        ((we2.w) s2Var.c(we2.w.class)).N6();
    }

    public final void setLiveCore(tn0.w0 w0Var) {
        this.f264023g = w0Var;
    }

    public final void setLiveEndUIC(tm2.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<set-?>");
        this.f264022f = gVar;
    }

    public final void setLivePrepareUIC(tm2.t2 t2Var) {
        kotlin.jvm.internal.o.g(t2Var, "<set-?>");
        this.f264020d = t2Var;
    }

    public final void setLiveStartUIC(tm2.s2 s2Var) {
        kotlin.jvm.internal.o.g(s2Var, "<set-?>");
        this.f264021e = s2Var;
    }
}
