package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public abstract class l extends hg5.d implements tj5.n {
    public final jz5.g A;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Boolean f128887r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.at.a f128888s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSEditTextView f128889t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f128890u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.base.AlphabetScrollBar f128891v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f128892w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f128893x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f128894y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f128895z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, java.lang.Boolean bool, com.tencent.mm.plugin.finder.ui.at.a callback) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f128887r = bool;
        this.f128888s = callback;
        this.f128892w = jz5.h.b(new com.tencent.mm.plugin.finder.ui.at.i(this));
        this.f128893x = jz5.h.b(new com.tencent.mm.plugin.finder.ui.at.b(this));
        this.f128894y = jz5.h.b(new com.tencent.mm.plugin.finder.ui.at.h(context));
        this.f128895z = "";
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.ui.at.k(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // tj5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C3(java.lang.String r1, java.lang.String r2, java.util.List r3, tj5.o r4) {
        /*
            r0 = this;
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            boolean r4 = r26.n0.N(r1)
            r4 = r4 ^ r2
            if (r4 == 0) goto Lc
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 == 0) goto L23
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r4 = r0.R()
            r4.D(r1)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f128891v
            if (r1 != 0) goto L1b
            goto L20
        L1b:
            r4 = 8
            r1.setVisibility(r4)
        L20:
            jz5.f0 r1 = jz5.f0.f302826a
            goto L24
        L23:
            r1 = r3
        L24:
            if (r1 != 0) goto L46
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r1 = r0.R()
            ym3.b r4 = r1.A
            r4.e()
            kotlinx.coroutines.r2 r1 = r1.B
            if (r1 == 0) goto L36
            kotlinx.coroutines.p2.a(r1, r3, r2, r3)
        L36:
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r1 = r0.R()
            com.tencent.mm.plugin.mvvmlist.MvvmList.r(r1, r3, r2, r3)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f128891v
            if (r1 != 0) goto L42
            goto L46
        L42:
            r2 = 0
            r1.setVisibility(r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.at.l.C3(java.lang.String, java.lang.String, java.util.List, tj5.o):void");
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(P(), (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView;
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f281403i;
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.f483758bz2)) != null) {
            findViewById.setContentDescription(findViewById.getContext().getString(com.tencent.mm.R.string.dkw));
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.ui.at.d(this));
        }
        if (getContext().getResources().getConfiguration().orientation == 2) {
            android.view.View view2 = this.f281404m;
            android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = mo0.h.a(getContext(), 512.0f);
            }
            android.view.View view3 = this.f281404m;
            android.view.ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.addRule(14);
            }
            android.view.View view4 = this.f281403i;
            android.view.ViewGroup.LayoutParams layoutParams4 = view4 != null ? view4.getLayoutParams() : null;
            if (layoutParams4 != null) {
                layoutParams4.width = mo0.h.a(getContext(), 512.0f);
            }
            android.view.View view5 = this.f281403i;
            android.view.ViewGroup.LayoutParams layoutParams5 = view5 != null ? view5.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.addRule(14);
            }
            android.view.View view6 = this.f281402h;
            if (view6 != null) {
                view6.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.ui.at.c(view6, this));
            }
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Boolean bool2 = this.f128887r;
        if (kotlin.jvm.internal.o.b(bool2, bool)) {
            android.view.View view7 = this.f281403i;
            if (view7 != null) {
                fTSEditTextView = (com.tencent.mm.ui.search.FTSEditTextView) view7.findViewById(com.tencent.mm.R.id.gfm);
            }
            fTSEditTextView = null;
        } else {
            android.view.View view8 = this.f281403i;
            if (view8 != null) {
                fTSEditTextView = (com.tencent.mm.ui.search.FTSEditTextView) view8.findViewById(com.tencent.mm.R.id.gfl);
            }
            fTSEditTextView = null;
        }
        this.f128889t = fTSEditTextView;
        if (fTSEditTextView != null) {
            fTSEditTextView.setVisibility(0);
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView2 = this.f128889t;
        if (fTSEditTextView2 != null) {
            fTSEditTextView2.g();
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView3 = this.f128889t;
        if (fTSEditTextView3 != null) {
            fTSEditTextView3.setFtsEditTextListener(this);
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView4 = this.f128889t;
        if (fTSEditTextView4 != null) {
            fTSEditTextView4.setHint(getContext().getResources().getString(com.tencent.mm.R.string.f490549y8));
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView5 = this.f128889t;
        if (fTSEditTextView5 != null) {
            fTSEditTextView5.f209816g.setTextSize(1, 17.0f);
        }
        android.view.View view9 = this.f281403i;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = view9 != null ? (com.tencent.mm.view.recyclerview.WxRecyclerView) view9.findViewById(com.tencent.mm.R.id.f483621bh0) : null;
        this.f128890u = wxRecyclerView;
        jz5.g gVar = this.f128893x;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter((xm3.t0) ((jz5.n) gVar).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f128890u;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) this.f128894y).getValue());
        }
        ((xm3.t0) ((jz5.n) gVar).getValue()).B = (com.tencent.mm.plugin.finder.ui.at.j) ((jz5.n) this.A).getValue();
        android.view.View view10 = this.f281403i;
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = view10 != null ? (com.tencent.mm.ui.base.AlphabetScrollBar) view10.findViewById(com.tencent.mm.R.id.f482946sj) : null;
        this.f128891v = alphabetScrollBar;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.setOnScrollBarTouchListener(new com.tencent.mm.plugin.finder.ui.at.e(this));
        }
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar2 = this.f128891v;
        if (alphabetScrollBar2 != null) {
            alphabetScrollBar2.setAlphabet(new java.lang.String[]{"🔍", "#"});
        }
        R().f152071u.observe(this, new com.tencent.mm.plugin.finder.ui.at.f(this));
        if (kotlin.jvm.internal.o.b(bool2, bool)) {
            M();
        } else {
            android.view.View view11 = this.f281404m;
            if (view11 != null) {
                view11.setBackground(null);
            }
            android.view.View view12 = this.f281403i;
            if (view12 != null) {
                view12.setBackgroundResource(com.tencent.mm.R.drawable.ag_);
            }
        }
        android.view.View view13 = this.f281403i;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = view13 != null ? (com.tencent.mm.ui.widget.LiveBottomSheetPanel) view13.findViewById(com.tencent.mm.R.id.enn) : null;
        if (liveBottomSheetPanel == null) {
            return;
        }
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.ui.at.g(this));
    }

    @Override // tj5.n
    public boolean G0() {
        return true;
    }

    public abstract in5.s K();

    public abstract java.lang.String L(com.tencent.mm.storage.z3 z3Var);

    public void M() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.widget.TextView textView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        android.view.View view = this.f281404m;
        if (view != null) {
            view.setBackground(null);
        }
        android.view.View view2 = this.f281403i;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.drawable.aga);
        }
        android.view.View view3 = this.f281403i;
        if (view3 != null && (weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view3.findViewById(com.tencent.mm.R.id.f483758bz2)) != null) {
            weImageView2.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        android.view.View view4 = this.f281403i;
        if (view4 != null && (textView = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.odf)) != null) {
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        }
        android.view.View view5 = this.f281403i;
        if (view5 != null && (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view5.findViewById(com.tencent.mm.R.id.meb)) != null) {
            weImageView.setIconColor(android.graphics.Color.parseColor("#6B6B6B"));
        }
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = this.f128891v;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_2));
        }
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar2 = this.f128891v;
        if (alphabetScrollBar2 != null) {
            alphabetScrollBar2.setSearchIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        }
    }

    public abstract ym3.a N();

    public abstract ym3.b O();

    public abstract int P();

    public final com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList R() {
        return (com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList) ((jz5.n) this.f128892w).getValue();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
    }
}
