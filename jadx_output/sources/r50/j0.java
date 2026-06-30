package r50;

/* loaded from: classes5.dex */
public final class j0 extends wm3.a implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f392585d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f392586e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f392587f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f392588g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f392589h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f392590i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f392591m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f392592n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f392593o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f392594p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f392595q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f392596r;

    /* renamed from: s, reason: collision with root package name */
    public int f392597s;

    /* renamed from: t, reason: collision with root package name */
    public int f392598t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f392585d = jz5.h.b(r50.r.f392610d);
        this.f392586e = jz5.h.b(new r50.s(this));
        this.f392587f = jz5.h.b(new r50.v(activity, this));
        this.f392591m = jz5.h.b(new r50.i(activity));
        this.f392592n = jz5.h.b(new r50.q(activity));
        this.f392593o = jz5.h.b(new r50.y(activity));
        this.f392594p = jz5.h.b(new r50.h0(this));
        this.f392595q = jz5.h.b(new r50.i0(this));
        this.f392596r = jz5.h.b(new r50.x(this));
    }

    public final void T6(int i17, yz5.a aVar) {
        int measuredHeight = W6().g().getMeasuredHeight();
        em.b W6 = W6();
        if (W6.f254086i == null) {
            W6.f254086i = (android.widget.LinearLayout) W6.f254078a.findViewById(com.tencent.mm.R.id.sl6);
        }
        int measuredHeight2 = W6.f254086i.getMeasuredHeight();
        int i18 = i17 == 0 ? 0 : (i17 - measuredHeight) - measuredHeight2;
        int i19 = i18 < 0 ? 0 : i18;
        if (i18 != i19) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeBottomLayoutHeight: clamp emptyLayoutHeight raw:%d -> final:%d, height:%d, todo:%d, bottom:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(measuredHeight), java.lang.Integer.valueOf(measuredHeight2));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeBottomLayoutHeight " + i17 + " emptyLayoutHeight:" + i19);
        em.b W62 = W6();
        if (W62.f254083f == null) {
            W62.f254083f = (android.widget.LinearLayout) W62.f254078a.findViewById(com.tencent.mm.R.id.dfl);
        }
        android.view.ViewGroup.LayoutParams layoutParams = W62.f254083f.getLayoutParams();
        if (layoutParams != null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(layoutParams.height, i19);
            ofInt.addUpdateListener(new r50.j(layoutParams, this));
            ofInt.addListener(new r50.n(this, i17));
            int g17 = com.tencent.mm.sdk.platformtools.d2.g(getActivity());
            long j17 = g17 > 0 ? (((g17 - measuredHeight2) - measuredHeight) / g17) * 175 : 0L;
            long h17 = e06.p.h(j17, 0L, 175L);
            if (j17 != h17 || g17 <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeBottomLayoutHeight: adjust animDuration raw:%d -> final:%d, kbHeight:%d, todo:%d, bottom:%d, height:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(h17), java.lang.Integer.valueOf(g17), java.lang.Integer.valueOf(measuredHeight), java.lang.Integer.valueOf(measuredHeight2), java.lang.Integer.valueOf(i17));
            }
            ofInt.setDuration(h17);
            ofInt.start();
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = W6().d().getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(layoutParams3.rightMargin, i17 == 0 ? ((java.lang.Number) ((jz5.n) this.f392593o).getValue()).intValue() : !V6() ? ((java.lang.Number) ((jz5.n) this.f392592n).getValue()).intValue() : 0);
            ofInt2.addUpdateListener(new r50.k(layoutParams3, this));
            ofInt2.addListener(new r50.l(ofInt2, aVar));
            ofInt2.setDuration(150L);
            ofInt2.start();
        }
        if (!V6()) {
            int intValue = i17 != 0 ? ((java.lang.Number) ((jz5.n) this.f392595q).getValue()).intValue() : 0;
            android.view.ViewGroup.LayoutParams layoutParams4 = W6().i().getLayoutParams();
            if (layoutParams4 != null) {
                android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(layoutParams4.width, intValue);
                ofInt3.addUpdateListener(new r50.m(layoutParams4, this));
                ofInt3.setDuration(150L);
                ofInt3.start();
            }
        }
        gl5.d1 d1Var = (gl5.d1) ((jz5.n) this.f392586e).getValue();
        if (d1Var != null) {
            d1Var.h(i17);
        }
    }

    public final void U6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "changeInputMode from:" + this.f392598t + " to:" + i17);
        int i18 = this.f392598t;
        jz5.g gVar = this.f392591m;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 == 2) {
                    if (i17 == 0) {
                        W6().e().clearFocus();
                        hideVKB();
                        X6();
                        W6().f().setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
                        W6().e().clearFocus();
                        T6(0, null);
                    } else if (i17 == 1) {
                        W6().e().requestFocus();
                        X6();
                        showVKB();
                        W6().f().setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
                    }
                }
            } else if (i17 == 0) {
                W6().e().clearFocus();
                hideVKB();
                X6();
                W6().f().setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
                T6(0, null);
            } else if (i17 != 1 && i17 == 2) {
                W6().e().requestFocus();
                hideVKB();
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f392588g;
                if (chatFooterPanel != null) {
                    chatFooterPanel.i();
                }
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f392588g;
                if (chatFooterPanel2 != null) {
                    chatFooterPanel2.setVisibility(0);
                }
                W6().f().setImageResource(com.tencent.mm.R.drawable.f481236o2);
                T6(com.tencent.mm.sdk.platformtools.d2.g(getActivity()) + ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), null);
            }
        } else if (i17 != 0) {
            if (i17 == 1) {
                W6().e().requestFocus();
                X6();
                showVKB();
                W6().f().setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
                int g17 = com.tencent.mm.sdk.platformtools.d2.g(getActivity());
                int i19 = this.f392597s;
                if (i19 <= g17 * 1.5f) {
                    g17 = i19;
                }
                T6(g17 + ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), new r50.p(this));
            } else if (i17 == 2) {
                W6().e().requestFocus();
                hideVKB();
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = this.f392588g;
                if (chatFooterPanel3 != null) {
                    chatFooterPanel3.i();
                }
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel4 = this.f392588g;
                if (chatFooterPanel4 != null) {
                    chatFooterPanel4.setVisibility(0);
                }
                W6().f().setImageResource(com.tencent.mm.R.drawable.f481236o2);
                T6(com.tencent.mm.sdk.platformtools.d2.g(getActivity()) + ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), new r50.o(this));
            }
        }
        this.f392598t = i17;
    }

    public final boolean V6() {
        return ((java.lang.Boolean) ((jz5.n) this.f392585d).getValue()).booleanValue();
    }

    public final em.b W6() {
        return (em.b) ((jz5.n) this.f392594p).getValue();
    }

    public final void X6() {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f392588g;
        if (chatFooterPanel != null) {
            chatFooterPanel.h();
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f392588g;
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.postDelayed(new r50.t(this), 250L);
        }
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "startObserveKeyboard: keyboardHeightProviderStarted=" + this.f392589h);
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f392587f).getValue()).f();
        this.f392589h = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        if (this.f392598t == 0) {
            return false;
        }
        U6(0);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new r50.g0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f392587f).getValue()).f210400e = null;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f392588g;
        if (chatFooterPanel != null) {
            chatFooterPanel.l();
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f392588g;
        if (chatFooterPanel2 != null) {
            chatFooterPanel2.a();
        }
        ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
        com.tencent.mm.ui.i1.b();
        x90.m mVar = (x90.m) ((ct.f3) i95.n0.c(ct.f3.class));
        a31.m mVar2 = mVar.f452619d;
        if (mVar2 != null) {
            mVar2.c();
        }
        mVar.f452619d = null;
        b31.l.f17613a.a();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "stopObserveKeyboard: keyboardHeightProviderStarted=" + this.f392589h);
        ((com.tencent.mm.ui.tools.f5) ((jz5.n) this.f392587f).getValue()).d();
        this.f392589h = false;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f392588g;
        if (chatFooterPanel != null) {
            chatFooterPanel.h();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        Y6();
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f392588g;
        if (chatFooterPanel != null) {
            chatFooterPanel.i();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        U6(0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            Y6();
        }
    }

    public void showVKB() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "showVKB");
        java.lang.Object systemService = getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(W6().e(), 0);
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        int max = i17 == 0 ? 0 : java.lang.Math.max(com.tencent.mm.sdk.platformtools.d2.h(getActivity(), i17, 0), i17);
        this.f392597s = max;
        boolean z18 = max > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "onKeyboardHeightChanged() called with: height:" + i17 + " keyboardHeight:" + this.f392597s + ", isResized:" + z17 + " isKeyboardShow:" + z18 + " inputMode:" + this.f392598t);
        if (z18) {
            U6(1);
        } else if (this.f392598t != 2) {
            U6(0);
        }
    }
}
