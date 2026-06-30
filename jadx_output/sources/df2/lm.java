package df2;

/* loaded from: classes3.dex */
public final class lm extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f230673m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f230674n;

    /* renamed from: z6, reason: collision with root package name */
    public android.widget.ImageView f230675z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6() {
        android.widget.RelativeLayout relativeLayout = this.f230673m;
        if (relativeLayout != null) {
            relativeLayout.animate().translationY(com.tencent.mm.ui.bl.b(relativeLayout.getContext()).y).setDuration(200L).start();
            relativeLayout.postDelayed(new df2.im(relativeLayout), 200L);
        }
    }

    public final void b(int i17) {
        if (this.f230673m == null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) T6(com.tencent.mm.R.id.fpg, com.tencent.mm.R.id.fpf);
            if (relativeLayout != null) {
                this.f230675z6 = (android.widget.ImageView) relativeLayout.findViewById(com.tencent.mm.R.id.hlm);
                android.widget.ImageView imageView = (android.widget.ImageView) relativeLayout.findViewById(com.tencent.mm.R.id.r6d);
                if (imageView != null) {
                    com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new x.s(imageView, null), 3, null);
                }
                relativeLayout.setOnClickListener(new x.t(this));
                android.view.View findViewById = relativeLayout.findViewById(com.tencent.mm.R.id.b5i);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new x.u(this, i17));
                }
                android.view.View findViewById2 = relativeLayout.findViewById(com.tencent.mm.R.id.mvb);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new x.v(this, i17));
                }
            } else {
                relativeLayout = null;
            }
            this.f230673m = relativeLayout;
        }
        android.widget.ImageView imageView2 = this.f230675z6;
        if (imageView2 != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(c01.z1.r());
            java.lang.String d17 = n07 != null ? n07.d() : null;
            if (d17 == null) {
                d17 = "";
            }
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.l().c(new mn2.n(d17, null, 2, null), imageView2, g1Var.h(mn2.f1.f329961o));
        }
        android.widget.RelativeLayout relativeLayout2 = this.f230673m;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
            relativeLayout2.animate().translationY(0.0f).setDuration(200L).setListener(null).start();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        jSONObject.put("click_soure", i17);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.S1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void c(int i17) {
        if (((mm2.c1) business(mm2.c1.class)).f328929z6 && ((mm2.c1) business(mm2.c1.class)).c7() == 1) {
            boolean U6 = U6();
            com.tencent.mars.xlog.Log.i("FinderLiveHonorVisitorGuideController", "#showCard isLandscape:" + U6);
            if (U6) {
                W6(new x.w(this, i17));
            } else {
                b(i17);
            }
        }
    }

    @Override // if2.e
    public boolean onBackPress() {
        android.widget.RelativeLayout relativeLayout = this.f230673m;
        if (!(relativeLayout != null && relativeLayout.getVisibility() == 0)) {
            return false;
        }
        Z6();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        ae2.in.f3688a.J();
        if (this.f230674n) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.km(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        Z6();
        this.f230673m = null;
        this.f230675z6 = null;
    }
}
