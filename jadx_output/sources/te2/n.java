package te2;

/* loaded from: classes3.dex */
public final class n implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.o f418240d;

    public n(te2.o oVar) {
        this.f418240d = oVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        te2.o oVar = this.f418240d;
        com.tencent.mm.view.MMPAGView mMPAGView2 = oVar.f418264g;
        if (mMPAGView2 != null) {
            mMPAGView2.n();
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = oVar.f418264g;
        if (mMPAGView3 != null) {
            android.content.res.AssetManager assets = oVar.f418262e.getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView3.k(assets, "finder_live_allowance_gift_bubble_icon_2.pag");
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = oVar.f418264g;
        if (mMPAGView4 != null) {
            mMPAGView4.setRepeatCount(0);
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = oVar.f418264g;
        if (mMPAGView5 != null) {
            mMPAGView5.setProgress(0.0d);
        }
        com.tencent.mm.view.MMPAGView mMPAGView6 = oVar.f418264g;
        if (mMPAGView6 != null) {
            mMPAGView6.g();
        }
        com.tencent.mm.view.MMPAGView mMPAGView7 = oVar.f418264g;
        if (mMPAGView7 != null) {
            mMPAGView7.d();
        }
        com.tencent.mm.view.MMPAGView mMPAGView8 = oVar.f418264g;
        if (mMPAGView8 != null) {
            mMPAGView8.i(this);
        }
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
