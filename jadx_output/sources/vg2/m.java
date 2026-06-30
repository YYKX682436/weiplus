package vg2;

/* loaded from: classes3.dex */
public final class m extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final vg2.d H;
    public ce2.i I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f436540J;
    public android.view.View K;
    public android.widget.ImageView L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.ImageView P;
    public android.view.View Q;
    public com.tencent.mm.view.MMPAGView R;
    public vg2.e S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, ce2.i giftInfo, vg2.d listener) {
        super(context, false, zl2.u4.f473989e, 0.0f, 10, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(giftInfo, "giftInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.H = listener;
        this.I = giftInfo;
        this.S = vg2.e.f436492d;
    }

    public static final void e0(vg2.m mVar) {
        com.tencent.mm.plugin.finder.live.plugin.nl nlVar = (com.tencent.mm.plugin.finder.live.plugin.nl) mVar.H;
        nlVar.getClass();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = nlVar.f113646a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(hmVar.f365323d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.plugin.ll(1, hmVar, 2);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.plugin.ml(1, hmVar, 2);
        k0Var.v();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e7y;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View E(zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        if (uiMode == zl2.u4.f473988d) {
            return null;
        }
        android.content.Context context = this.f118183e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return null;
        }
        zl2.w4 w4Var = zl2.w4.f474017a;
        android.view.LayoutInflater layoutInflater = activity.getLayoutInflater();
        kotlin.jvm.internal.o.f(layoutInflater, "getLayoutInflater(...)");
        return w4Var.b(com.tencent.mm.R.layout.e7y, null, false, uiMode, activity, layoutInflater);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String str = this.I.field_name;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        d0();
        this.K = rootView.findViewById(com.tencent.mm.R.id.u0h);
        this.L = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.f486408l45);
        ((com.tencent.mm.ui.widget.button.WeButton) rootView.findViewById(com.tencent.mm.R.id.vkk)).setOnClickListener(new vg2.f(this));
        ((android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.vd9)).setOnClickListener(new vg2.g(this));
        this.M = rootView.findViewById(com.tencent.mm.R.id.u0i);
        this.N = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.vfv);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.utf);
        imageView.setClipToOutline(true);
        this.P = imageView;
        ((com.tencent.mm.ui.widget.button.WeButton) rootView.findViewById(com.tencent.mm.R.id.f483541so1)).setOnClickListener(new vg2.h(this));
        ((com.tencent.mm.ui.widget.button.WeButton) rootView.findViewById(com.tencent.mm.R.id.f483762st3)).setOnClickListener(new vg2.i(this));
        this.Q = rootView.findViewById(com.tencent.mm.R.id.u0g);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) rootView.findViewById(com.tencent.mm.R.id.f486405ut4);
        mMPAGView.setRepeatCount(-1);
        mMPAGView.setScaleMode(0);
        this.R = mMPAGView;
        ((com.tencent.mm.ui.widget.button.WeButton) rootView.findViewById(com.tencent.mm.R.id.f486662uz5)).setOnClickListener(new vg2.j(this));
        g0(this.I);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        com.tencent.mm.plugin.finder.live.plugin.nl nlVar = (com.tencent.mm.plugin.finder.live.plugin.nl) this.H;
        nlVar.getClass();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = nlVar.f113646a;
        hmVar.N1 = null;
        com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar, null, null, null, 7, null);
    }

    public final void f0(vg2.e eVar) {
        if (this.S == eVar) {
            return;
        }
        this.S = eVar;
        android.view.View view = this.K;
        if (view != null) {
            int i17 = eVar == vg2.e.f436493e ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.M;
        if (view2 != null) {
            int i18 = eVar == vg2.e.f436494f ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.Q;
        if (view3 == null) {
            return;
        }
        int i19 = eVar == vg2.e.f436495g ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(ce2.i r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vg2.m.g0(ce2.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118183e);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_arrow);
        weImageView.setBackgroundResource(com.tencent.mm.R.drawable.f481778a82);
        weImageView.setRotation(90.0f);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_F_Alpha_0_8));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        return weImageView;
    }
}
