package com.tencent.mm.ui.findmore.preference.ting;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/findmore/preference/ting/TingIconViewTipWithPlayStatePreference;", "Lcom/tencent/mm/ui/FinderIconViewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class TingIconViewTipWithPlayStatePreference extends com.tencent.mm.ui.FinderIconViewTipPreference {

    /* renamed from: m3, reason: collision with root package name */
    public android.widget.TextView f208595m3;

    /* renamed from: n3, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f208596n3;

    /* renamed from: o3, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f208597o3;

    /* renamed from: p3, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f208598p3;

    /* renamed from: q3, reason: collision with root package name */
    public bw5.lp0 f208599q3;

    /* renamed from: r3, reason: collision with root package name */
    public qk.ia f208600r3;

    /* renamed from: s3, reason: collision with root package name */
    public boolean f208601s3;

    public TingIconViewTipWithPlayStatePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void g1() {
        android.widget.TextView textView = this.f208595m3;
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f208596n3;
        if (mMRoundCornerImageView != null) {
            mMRoundCornerImageView.setVisibility(8);
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView2 = this.f208597o3;
        if (mMRoundCornerImageView2 != null) {
            mMRoundCornerImageView2.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f208598p3;
        if (mMPAGView == null) {
            return;
        }
        mMPAGView.setVisibility(8);
    }

    public final void h1(bw5.lp0 lp0Var, boolean z17, qk.ia tingPlayState) {
        boolean z18;
        kotlin.jvm.internal.o.g(tingPlayState, "tingPlayState");
        if (lp0Var != null) {
            rk4.j5.j(lp0Var);
        }
        tingPlayState.toString();
        android.view.View view = this.W1;
        android.view.View findViewById = view == null ? null : view.findViewById(android.R.id.widget_frame);
        android.view.ViewGroup viewGroup = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
        L0();
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingIconViewTipWithPlayStatePreference", "initWidgetFrame fail, widgetFrame null");
            z18 = false;
        } else {
            this.f196699k2 = viewGroup;
            if (viewGroup.getChildCount() != 1 || !kotlin.jvm.internal.o.b("tingPlayView", viewGroup.getChildAt(0).getTag())) {
                viewGroup.removeAllViews();
                android.view.View.inflate(this.Y1, com.tencent.mm.R.layout.dvh, viewGroup).findViewById(com.tencent.mm.R.id.s8t).setTag("tingPlayView");
            }
            this.f208595m3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.s8r);
            this.f208596n3 = (com.tencent.mm.ui.widget.MMRoundCornerImageView) viewGroup.findViewById(com.tencent.mm.R.id.s8q);
            this.f208597o3 = (com.tencent.mm.ui.widget.MMRoundCornerImageView) viewGroup.findViewById(com.tencent.mm.R.id.s8p);
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) viewGroup.findViewById(com.tencent.mm.R.id.s8s);
            this.f208598p3 = mMPAGView;
            if (mMPAGView != null) {
                mMPAGView.o(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigRfxTingSwitch()) == 1);
            }
            z18 = true;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingIconViewTipWithPlayStatePreference", "showTingPlayStateView initWidgetFrame failed");
            return;
        }
        this.f208599q3 = lp0Var;
        this.f208601s3 = z17;
        this.f208600r3 = tingPlayState;
        if (lp0Var == null) {
            w0(true);
            g1();
            a1(this.f196699k2, 8);
        } else if (z17) {
            w0(false);
            i1(lp0Var, true, tingPlayState);
        } else {
            w0(true);
            i1(lp0Var, false, tingPlayState);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showTingPlayStateView tingItem: ");
        sb6.append(lp0Var != null ? rk4.j5.j(lp0Var) : null);
        sb6.append(", show: ");
        sb6.append(z17);
        sb6.append(", widgetFrame: ");
        sb6.append(this.f196699k2.getVisibility() == 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingIconViewTipWithPlayStatePreference", sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r26.i0.n(r5, "ting_discover_entry_play.pag", false) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r26.i0.n(r5, "ting_discover_entry_play.pag", false) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i1(bw5.lp0 r7, boolean r8, qk.ia r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipWithPlayStatePreference.i1(bw5.lp0, boolean, qk.ia):void");
    }

    @Override // com.tencent.mm.ui.FinderIconViewTipPreference, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        qk.ia iaVar;
        super.t(view);
        view.toString();
        bw5.lp0 lp0Var = this.f208599q3;
        if (lp0Var != null) {
            rk4.j5.j(lp0Var);
        }
        bw5.lp0 lp0Var2 = this.f208599q3;
        if (lp0Var2 == null || (iaVar = this.f208600r3) == null) {
            return;
        }
        boolean z17 = this.f208601s3;
        kotlin.jvm.internal.o.d(iaVar);
        h1(lp0Var2, z17, iaVar);
    }

    @Override // com.tencent.mm.ui.FinderIconViewTipPreference, com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.ui.base.preference.NormalIconPreference, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    @Override // com.tencent.mm.ui.FinderIconViewTipPreference
    public void w0(boolean z17) {
        android.view.ViewGroup viewGroup;
        super.w0(z17);
        if (z17 || (viewGroup = this.f196699k2) == null) {
            return;
        }
        a1(viewGroup.findViewById(com.tencent.mm.R.id.s8t), 0);
    }

    public TingIconViewTipWithPlayStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public TingIconViewTipWithPlayStatePreference(android.content.Context context) {
        super(context, null);
    }
}
