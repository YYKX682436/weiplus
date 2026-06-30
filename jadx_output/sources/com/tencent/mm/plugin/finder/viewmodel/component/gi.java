package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gi {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f134524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134525b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134526c;

    /* renamed from: d, reason: collision with root package name */
    public int f134527d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f134528e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f134529f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f134530g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f134531h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f134532i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f134533j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderLoadBar f134534k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.hi f134535l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public gi(java.lang.Object tab, int i17, boolean z17, boolean z18, boolean z19) {
        float f17;
        float f18;
        boolean z27;
        com.tencent.mm.plugin.finder.viewmodel.component.ei eiVar;
        int i18;
        android.widget.ImageView imageView;
        android.content.Context context;
        android.content.res.Resources resources;
        android.view.View findViewById;
        int i19;
        boolean z28;
        android.view.View findViewById2;
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f134524a = tab;
        this.f134525b = i17;
        this.f134526c = z19;
        this.f134535l = new com.tencent.mm.plugin.finder.viewmodel.component.hi(com.tencent.mm.plugin.finder.viewmodel.component.fi.f134405d);
        if (z19) {
            zx2.u uVar = tab instanceof zx2.u ? (zx2.u) tab : null;
            if (uVar != null) {
                uVar.f477081a = this;
            }
        } else {
            oa.i iVar = tab instanceof oa.i ? (oa.i) tab : null;
            if (iVar != null) {
                iVar.f343778a = this;
            }
        }
        if (z17) {
            f18 = 15.0f * 1.0f * j65.f.g();
            f17 = 400;
        } else {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            java.lang.Object systemService = context2.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f19 = displayMetrics.density;
            f17 = context2.getResources().getDisplayMetrics().density;
            f18 = 15.0f * f19;
        }
        float f27 = f18 / f17;
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479264ug);
        d92.f fVar = d92.f.f227470a;
        if (i17 == 1) {
            int i27 = z18 ? com.tencent.mm.R.layout.e7n : com.tencent.mm.R.layout.akc;
            if (z19) {
                zx2.u uVar2 = tab instanceof zx2.u ? (zx2.u) tab : null;
                if (uVar2 != null) {
                    uVar2.c(i27);
                }
            } else {
                oa.i iVar2 = tab instanceof oa.i ? (oa.i) tab : null;
                if (iVar2 != null) {
                    iVar2.c(i27);
                }
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ei eiVar2 = com.tencent.mm.plugin.finder.viewmodel.component.bl.M;
            android.view.View a17 = eiVar2.a(this);
            android.widget.TextView textView = a17 != null ? (android.widget.TextView) a17.findViewById(com.tencent.mm.R.id.nuw) : null;
            this.f134528e = textView;
            android.view.View a18 = eiVar2.a(this);
            if (a18 == null || (findViewById2 = a18.findViewById(com.tencent.mm.R.id.nvk)) == null) {
                i19 = 1;
                z28 = false;
            } else {
                i19 = 1;
                z28 = false;
                d92.f.o(fVar, findViewById2, true, false, false, 4, null);
            }
            if (textView != null) {
                textView.setTextSize(i19, f27);
            }
            android.view.View a19 = eiVar2.a(this);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = a19 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) a19.findViewById(com.tencent.mm.R.id.nuz) : null;
            this.f134529f = weImageView;
            if (weImageView != null) {
                d92.f.o(fVar, weImageView, true, false, false, 4, null);
            }
            android.view.View a27 = eiVar2.a(this);
            this.f134530g = a27 != null ? (android.widget.ImageView) a27.findViewById(com.tencent.mm.R.id.f487196nv0) : null;
            android.view.View a28 = eiVar2.a(this);
            this.f134531h = a28 != null ? (android.widget.ImageView) a28.findViewById(com.tencent.mm.R.id.f483370ah1) : null;
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_little_like);
            }
            z27 = z28;
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.ei eiVar3 = com.tencent.mm.plugin.finder.viewmodel.component.bl.M;
            if (com.tencent.mm.plugin.finder.viewmodel.component.bl.N.contains(java.lang.Integer.valueOf(i17))) {
                int i28 = z18 ? com.tencent.mm.R.layout.e7o : com.tencent.mm.R.layout.akb;
                if (z19) {
                    zx2.u uVar3 = tab instanceof zx2.u ? (zx2.u) tab : null;
                    if (uVar3 != null) {
                        uVar3.c(i28);
                    }
                } else {
                    oa.i iVar3 = tab instanceof oa.i ? (oa.i) tab : null;
                    if (iVar3 != null) {
                        iVar3.c(i28);
                    }
                }
                android.view.View a29 = eiVar3.a(this);
                if (a29 == null || (findViewById = a29.findViewById(com.tencent.mm.R.id.nvk)) == null) {
                    eiVar = eiVar3;
                    i18 = 1;
                    z27 = false;
                } else {
                    eiVar = eiVar3;
                    i18 = 1;
                    z27 = false;
                    d92.f.o(fVar, findViewById, true, false, false, 4, null);
                }
                android.view.View a37 = eiVar.a(this);
                android.widget.TextView textView2 = a37 != null ? (android.widget.TextView) a37.findViewById(com.tencent.mm.R.id.nuw) : null;
                this.f134528e = textView2;
                if (textView2 != null) {
                    textView2.setTextSize(i18, f27);
                }
                android.view.View a38 = eiVar.a(this);
                this.f134530g = a38 != null ? (android.widget.ImageView) a38.findViewById(com.tencent.mm.R.id.nut) : null;
                android.view.View a39 = eiVar.a(this);
                this.f134531h = a39 != null ? (android.widget.ImageView) a39.findViewById(com.tencent.mm.R.id.f483369ah0) : null;
                android.view.View a47 = eiVar.a(this);
                android.view.ViewGroup viewGroup = a47 != null ? (android.view.ViewGroup) a47.findViewById(com.tencent.mm.R.id.nuy) : null;
                this.f134532i = viewGroup;
                if (viewGroup != null && (imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.nux)) != null) {
                    rr.v.a(imageView, com.tencent.mm.R.raw.finder_icon_live_onlive, (viewGroup == null || (context = viewGroup.getContext()) == null || (resources = context.getResources()) == null) ? z27 : resources.getColor(com.tencent.mm.R.color.aaw));
                }
                android.view.View a48 = eiVar.a(this);
                android.widget.TextView textView3 = a48 != null ? (android.widget.TextView) a48.findViewById(com.tencent.mm.R.id.f487197nv1) : null;
                this.f134533j = textView3;
                if (textView3 != null) {
                    textView3.setTextSize(i18, 9.0f);
                }
                android.view.View a49 = eiVar.a(this);
                this.f134534k = a49 != null ? (com.tencent.mm.plugin.finder.view.FinderLoadBar) a49.findViewById(com.tencent.mm.R.id.s7q) : null;
            } else {
                z27 = false;
                if (z19) {
                    zx2.u uVar4 = tab instanceof zx2.u ? (zx2.u) tab : null;
                    if (uVar4 != null) {
                        uVar4.c(com.tencent.mm.R.layout.aka);
                    }
                } else {
                    oa.i iVar4 = tab instanceof oa.i ? (oa.i) tab : null;
                    if (iVar4 != null) {
                        iVar4.c(com.tencent.mm.R.layout.aka);
                    }
                }
            }
        }
        b(color, z27);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f134528e;
        if (textView != null) {
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }

    public final void b(int i17, boolean z17) {
        com.google.android.material.tabs.TabLayout tabLayout;
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout;
        android.widget.TextView textView = this.f134528e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f134529f;
        if (weImageView != null) {
            weImageView.setIconColor(i17);
        }
        int i18 = this.f134525b;
        if (z17) {
            return;
        }
        boolean z18 = this.f134526c;
        java.lang.Object obj = this.f134524a;
        if (z18) {
            zx2.u uVar = obj instanceof zx2.u ? (zx2.u) obj : null;
            if (uVar == null || (finderTabLayout = uVar.f477087g) == null) {
                return;
            }
            finderTabLayout.setSelectedTabIndicatorColor(i17);
            return;
        }
        oa.i iVar = obj instanceof oa.i ? (oa.i) obj : null;
        if (iVar == null || (tabLayout = iVar.f343784g) == null) {
            return;
        }
        tabLayout.setSelectedTabIndicatorColor(i17);
    }

    public final void c(int i17) {
        java.lang.String str;
        android.content.Context context;
        android.content.res.Resources resources;
        android.widget.TextView textView = this.f134528e;
        int i18 = this.f134525b;
        if (i18 == 4 && !hc2.e.a()) {
            if (textView == null) {
                return;
            }
            textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i17));
        } else {
            if (textView == null) {
                return;
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            android.view.View a17 = com.tencent.mm.plugin.finder.viewmodel.component.bl.M.a(this);
            if (a17 == null || (context = a17.getContext()) == null || (resources = context.getResources()) == null || (str = resources.getString(i17)) == null) {
                str = "";
            }
            textView.setText(t70Var.H2(i18, str));
        }
    }
}
