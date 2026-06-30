package eg2;

/* loaded from: classes3.dex */
public final class n extends eg2.c0 {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f252589g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView f252590h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.sl f252591i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f252592m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f252593n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f252594o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f252595p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f252596q;

    /* renamed from: r, reason: collision with root package name */
    public int f252597r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.p f252598s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ju3.d0 status, android.view.ViewGroup parent, qc0.a editContext) {
        super(status, parent, editContext);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(editContext, "editContext");
        this.f252589g = jz5.h.b(new eg2.m(parent));
        this.f252592m = kotlinx.coroutines.z0.b();
        this.f252597r = 1;
    }

    public static final void a(eg2.n nVar, boolean z17) {
        yz5.p pVar;
        yz5.p pVar2;
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView = nVar.f252590h;
        if (finderLiveHDCheckboxView != null) {
            finderLiveHDCheckboxView.setRedDotVisible(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "onCheckboxToggled: isChecked=" + z17 + ", localHDPath=" + nVar.f252593n + ", originalImagePath=" + nVar.f252594o);
        te2.m3.f418224a.a(te2.j3.f418134g, nVar.f252597r == 2 ? te2.l3.f418201e : te2.l3.f418200d, 0L);
        ut3.f.f431176c.f431178b.putBoolean("has_apply_hd", z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "onCheckboxToggled: set EXTRA_KEY_HAS_APPLY_HD=" + z17 + " to extData");
        if (z17) {
            java.lang.String str = nVar.f252593n;
            if (str == null || (pVar2 = nVar.f252598s) == null) {
                return;
            }
            pVar2.invoke(java.lang.Boolean.TRUE, str);
            return;
        }
        java.lang.String str2 = nVar.f252594o;
        if (str2 == null || (pVar = nVar.f252598s) == null) {
            return;
        }
        pVar.invoke(java.lang.Boolean.FALSE, str2);
    }

    public static final void b(eg2.n nVar, boolean z17) {
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView;
        if (nVar.f252595p && (finderLiveHDCheckboxView = nVar.f252590h) != null) {
            finderLiveHDCheckboxView.setVisibility(z17 ? 4 : 0);
        }
    }

    @Override // yt3.r2
    public void onAttach() {
        qc0.a aVar = this.f252546f;
        android.os.Bundle bundle = aVar.f361348c.M;
        this.f252594o = bundle != null ? bundle.getString("original_image_path") : null;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = aVar.f361348c;
        android.os.Bundle bundle2 = recordConfigProvider.M;
        this.f252596q = bundle2 != null ? bundle2.getBoolean("show_hd_red_dot", false) : false;
        android.os.Bundle bundle3 = recordConfigProvider.M;
        this.f252597r = bundle3 != null ? bundle3.getInt("hd_scene", 1) : 1;
        if (this.f252590h == null) {
            android.view.ViewGroup viewGroup = this.f252545e;
            android.view.View childAt = viewGroup.getChildAt(0);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 == null) {
                viewGroup2 = viewGroup;
            }
            android.content.Context context = viewGroup.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
            com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView = new com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView(context, null, 0, 6, null);
            finderLiveHDCheckboxView.setOnCheckedChangeListener(new eg2.e(this));
            this.f252590h = finderLiveHDCheckboxView;
            viewGroup2.addView(finderLiveHDCheckboxView, new android.widget.RelativeLayout.LayoutParams(-2, dimensionPixelSize2));
            viewGroup2.post(new eg2.f(this, dimensionPixelSize));
        }
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView2 = this.f252590h;
        if (finderLiveHDCheckboxView2 != null) {
            finderLiveHDCheckboxView2.setVisibility(8);
        }
        jz5.g gVar = this.f252589g;
        ((hk0.u0) ((jz5.n) gVar).getValue()).Z6(2, new eg2.g(this));
        ((hk0.u0) ((jz5.n) gVar).getValue()).Z6(3, new eg2.h(this));
        ((hk0.u0) ((jz5.n) gVar).getValue()).Z6(4, new eg2.i(this));
        ((hk0.u0) ((jz5.n) gVar).getValue()).a7(1, new eg2.j(this));
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "onDetach");
        com.tencent.mm.plugin.finder.live.widget.sl slVar = this.f252591i;
        if (slVar != null) {
            slVar.dismiss();
        }
        this.f252591i = null;
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView = this.f252590h;
        if (finderLiveHDCheckboxView != null) {
            finderLiveHDCheckboxView.setVisibility(8);
        }
        kotlinx.coroutines.z0.e(this.f252592m, null, 1, null);
    }
}
