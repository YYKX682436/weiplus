package mi2;

/* loaded from: classes10.dex */
public final class l extends mi2.h {
    public boolean A;
    public final ni2.h0 B;

    /* renamed from: w, reason: collision with root package name */
    public int f326771w;

    /* renamed from: x, reason: collision with root package name */
    public int f326772x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f326773y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f326774z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, zh2.c pluginAbility, yz5.p dismiss) {
        super(context, pluginAbility, dismiss);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(dismiss, "dismiss");
        android.view.View view = this.f326757n;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.qrj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.B = new ni2.h0(findViewById, pluginAbility, new mi2.i(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.f118384g.f444837d.getLayoutParams();
        if (layoutParams != null) {
            android.view.View view2 = this.f326757n;
            if (view2 != null) {
                layoutParams.height = (com.tencent.mm.ui.bl.b(view2.getContext()).y * 2) / 3;
            } else {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
        }
    }

    @Override // mi2.h
    public void F() {
        int i17 = (int) ((mm2.o4) this.f326753h.g().a(mm2.o4.class)).U.f377129d;
        this.f326771w = i17;
        this.f326772x = i17;
        super.F();
        this.f326773y = false;
        this.f326774z = false;
        this.A = false;
        G();
    }

    public final void G() {
        android.widget.TextView textView;
        boolean z17 = this.f326773y;
        android.view.View view = this.f118383f;
        if (z17 || this.f326774z || this.A) {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478494f));
                textView.setEnabled(true);
                return;
            }
            return;
        }
        textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
            textView.setEnabled(false);
        }
    }

    @Override // mi2.h
    public void O() {
        com.tencent.mars.xlog.Log.i(this.f326756m, "commitSecondaryDraftOnCancel: discard drafts, no cgi");
        this.f326772x = this.f326771w;
        this.f326774z = false;
        this.A = false;
        G();
    }

    @Override // mi2.h
    public long P() {
        return this.f326772x;
    }

    @Override // mi2.h
    public void Q(int i17) {
        this.f326772x = i17;
        this.f326774z = pm0.v.z(this.f326771w, 16) != pm0.v.z(i17, 16);
        G();
    }

    @Override // mi2.h
    public void R(long j17) {
        this.f326772x = (int) j17;
        long j18 = this.f326771w;
        zl2.r4 r4Var = zl2.r4.f473950a;
        this.A = (r4Var.x2(j18) == r4Var.x2(j17) && r4Var.y2(j18) == r4Var.y2(j17) && r4Var.w2(j18) == r4Var.w2(j17) && r4Var.z2(j18) == r4Var.z2(j17)) ? false : true;
        G();
    }

    @Override // mi2.h
    public void S() {
        M();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        return f();
    }

    @Override // mi2.h, com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dko;
    }

    @Override // mi2.h, com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        this.B.h();
        super.t();
        android.view.View view = this.f326757n;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = view instanceof androidx.core.widget.NestedScrollView ? (androidx.core.widget.NestedScrollView) view : null;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, 0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        bj2.b bVar;
        this.f326765t = false;
        ni2.h0 h0Var = this.B;
        if (h0Var.i()) {
            a();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMicSettingSet openMicSettingFlag: ");
            sb6.append(this.f326771w);
            sb6.append(" newMicSettingFlag: ");
            sb6.append(this.f326772x);
            sb6.append(" isMicWayChange: ");
            sb6.append(this.f326774z);
            sb6.append(" isMicConditionChange: ");
            sb6.append(this.A);
            sb6.append(" isMicModeChange: ");
            sb6.append(this.f326773y);
            sb6.append(" focusUserId: ");
            sb6.append(h0Var.f337319u);
            sb6.append(" clickMicMode: ");
            sb6.append(h0Var.f337321w);
            sb6.append(" isOpenFocus: ");
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = h0Var.f337316r;
            sb6.append(mMSwitchBtn.f211363x);
            sb6.append(" anchorSeatPos: ");
            bj2.b bVar2 = h0Var.B;
            sb6.append(bVar2.f21146e);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i(this.f326756m, sb6.toString());
            int i17 = this.f326771w;
            int i18 = this.f326772x;
            zh2.c cVar = this.f326753h;
            if (i17 != i18) {
                this.f326771w = i18;
                ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377129d = this.f326772x;
            }
            if (this.A) {
                pm0.v.X(new mi2.j(this));
            }
            cVar.e(this.f326771w);
            ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377133h = mMSwitchBtn.f211363x;
            dk2.xf k17 = cVar.k();
            if (k17 != null) {
                bVar = bVar2;
                ((dk2.r4) k17).q0(((mm2.e1) cVar.g().a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) cVar.g().a(mm2.e1.class)).f328983m, this.f326771w, h0Var.f337319u, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377132g, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377133h, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377134i, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377135m, new mi2.k(this));
            } else {
                bVar = bVar2;
            }
            if (this.f326773y) {
                qo0.c f17 = cVar.f();
                qo0.b bVar3 = qo0.b.Q4;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PARAM_FINDER_LIVE_FORCE_USER_ID", h0Var.f337319u);
                bundle.putInt("PARAM_FINDER_LIVE_MIC_MODE", h0Var.f337321w);
                bundle.putInt("PARAM_FINDER_LIVE_MIC_ANCHOR_POSITION", bVar.f21146e);
                f17.statusChange(bVar3, bundle);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        zh2.c cVar = this.f326753h;
        r45.il4 il4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).U;
        java.lang.Object value = ((mm2.o4) cVar.g().a(mm2.o4.class)).A.getValue();
        if (il4Var == null || value == null) {
            return;
        }
        xh2.c cVar2 = (xh2.c) value;
        xh2.c a17 = cVar2.a();
        if (il4Var.f377133h) {
            if (cVar2.f454533c == 0) {
                a17.f454533c = 1;
            }
            if (cVar2.f454533c == 2) {
                a17.f454533c = 3;
            }
        }
        this.B.j(il4Var, a17, this.f326772x);
    }

    @Override // mi2.h
    public java.lang.String z() {
        return "NormalMoreActionWidget";
    }
}
