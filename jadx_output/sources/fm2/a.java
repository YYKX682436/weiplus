package fm2;

/* loaded from: classes3.dex */
public abstract class a extends com.tencent.mm.plugin.finder.live.view.k0 {

    /* renamed from: d, reason: collision with root package name */
    public sm2.k9 f264016d;

    /* renamed from: e, reason: collision with root package name */
    public sm2.o4 f264017e;

    /* renamed from: f, reason: collision with root package name */
    public sm2.f f264018f;

    /* renamed from: g, reason: collision with root package name */
    public in0.q f264019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = (com.tencent.mm.plugin.finder.ui.MMFinderUI) context;
        this.f264016d = new sm2.k9(mMFinderUI);
        this.f264017e = new sm2.o4(mMFinderUI);
        this.f264018f = new sm2.f(mMFinderUI);
    }

    public final in0.q getLiveCore() {
        return this.f264019g;
    }

    public final sm2.f getLiveEndUIC() {
        return this.f264018f;
    }

    public final sm2.k9 getLivePrepareUIC() {
        return this.f264016d;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public abstract /* synthetic */ int getLiveRole();

    public final sm2.o4 getLiveStartUIC() {
        return this.f264017e;
    }

    public final sm2.o4 getStartUIC() {
        return this.f264017e;
    }

    public void prepareToStart(boolean z17) {
        com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout renderRatioLayout;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        int i17;
        kn0.p pVar;
        sm2.o4 o4Var = this.f264017e;
        if (!z17) {
            o4Var.B();
            return;
        }
        fm2.a aVar = o4Var.f19595c;
        boolean z18 = false;
        if (aVar != null) {
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(aVar, false, 1, null);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", true);
        fm2.a aVar2 = o4Var.f19595c;
        if (aVar2 != null) {
            aVar2.statusChange(qo0.b.f365386n, bundle);
        }
        in0.q qVar = o4Var.f19597e;
        if (qVar != null && (pVar = qVar.D) != null && pVar.f309589i) {
            z18 = true;
        }
        if (z18 && (o9Var = o4Var.f409616i) != null && (i17 = ((mm2.c1) o9Var.P0(mm2.c1.class)).f328870q5) != 0) {
            com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = o9Var.f113720u;
            g90Var.l(i17);
            g90Var.j();
            o9Var.y1(true);
        }
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var2 = o4Var.f409616i;
        if (o9Var2 != null && (renderRatioLayout = o9Var2.f113717r.getRenderRatioLayout()) != null) {
            renderRatioLayout.post(new sm2.v2(o4Var));
        }
        com.tencent.mm.plugin.finder.live.plugin.na naVar = o4Var.W;
        if (naVar != null) {
            naVar.C1();
        }
        pm0.v.V(200L, new sm2.w2(o4Var));
        mm2.f6 f6Var = (mm2.f6) o4Var.c(mm2.f6.class);
        so2.j5 j5Var = ((mm2.f6) o4Var.f19609a.a(mm2.f6.class)).f329049w;
        c61.bc bcVar = j5Var instanceof c61.bc ? (c61.bc) j5Var : null;
        f6Var.f329050x = bcVar != null ? bcVar.c() : 0L;
        fm2.a aVar3 = o4Var.f19595c;
        if (aVar3 != null) {
            zl2.r4.f473950a.E2(o4Var.f19609a, aVar3);
        }
        ((we2.w) o4Var.c(we2.w.class)).N6();
    }

    public final void setLiveCore(in0.q qVar) {
        this.f264019g = qVar;
    }

    public final void setLiveEndUIC(sm2.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        this.f264018f = fVar;
    }

    public final void setLivePrepareUIC(sm2.k9 k9Var) {
        kotlin.jvm.internal.o.g(k9Var, "<set-?>");
        this.f264016d = k9Var;
    }

    public final void setLiveStartUIC(sm2.o4 o4Var) {
        kotlin.jvm.internal.o.g(o4Var, "<set-?>");
        this.f264017e = o4Var;
    }
}
