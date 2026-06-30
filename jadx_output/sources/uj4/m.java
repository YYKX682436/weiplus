package uj4;

/* loaded from: classes5.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f428442d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f428443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f428444f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f428445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f428442d = jz5.h.b(uj4.k.f428439d);
    }

    public final void O6() {
        android.view.ViewGroup viewGroup;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        java.lang.ref.WeakReference weakReference2 = this.f428444f;
        if (weakReference2 == null || (viewGroup = (android.view.ViewGroup) weakReference2.get()) == null || (weakReference = this.f428445g) == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public final void P6(android.view.ViewGroup viewGroup, java.lang.String str) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (!((java.lang.Boolean) ((jz5.n) this.f428442d).getValue()).booleanValue() || viewGroup == null || kotlin.jvm.internal.o.b(str, en1.a.a()) || this.f428443e) {
            return;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_LIKE_EDUCATION_SHOWED_INT;
        int r17 = c17.r(u3Var, 0);
        if (r17 < 3) {
            this.f428443e = true;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getActivity());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(android.graphics.Color.parseColor("#4d000000"));
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(getActivity());
            mMPAGView.o(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigRfxTextStatusSwitch()) == 1);
            int dimension = (int) getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479659bw);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(dimension, dimension);
            layoutParams2.gravity = 17;
            linearLayout.addView(mMPAGView, layoutParams2);
            android.widget.TextView textView = new android.widget.TextView(getActivity());
            textView.setText(getActivity().getResources().getString(com.tencent.mm.R.string.jwx));
            textView.setTextColor(-1);
            textView.setTextSize(1, 20.0f);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = (int) getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            layoutParams3.gravity = 17;
            linearLayout.addView(textView, layoutParams3);
            mMPAGView.setRepeatCount(-1);
            android.content.res.AssetManager assets = getContext().getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView.k(assets, "finder_full_like_guide.pag");
            mMPAGView.g();
            if (viewGroup instanceof android.widget.FrameLayout) {
                android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams4.gravity = 17;
                layoutParams = layoutParams4;
            } else if (viewGroup instanceof android.widget.RelativeLayout) {
                android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams5.addRule(13, -1);
                layoutParams = layoutParams5;
            } else {
                layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            }
            viewGroup.addView(linearLayout, layoutParams);
            linearLayout.setClickable(false);
            linearLayout.setOnTouchListener(new uj4.l(viewGroup, linearLayout));
            this.f428444f = new java.lang.ref.WeakReference(viewGroup);
            this.f428445g = new java.lang.ref.WeakReference(linearLayout);
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        }
    }
}
