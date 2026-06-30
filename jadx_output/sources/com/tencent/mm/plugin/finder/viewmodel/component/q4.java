package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public abstract class q4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f135656g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f135657h = "";

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f135658d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f135659e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f135660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135660f = "";
    }

    public static /* synthetic */ void X6(com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var, android.view.View view, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report25496");
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        q4Var.W6(view, str, z17);
    }

    public abstract int O6();

    public final void P6() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("key_create_scene", 16);
        intent.putExtra("key_router_to_profile", false);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).rj(getActivity(), intent, O6());
    }

    public void Q6() {
        java.lang.String str;
        android.widget.TextView textView;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        this.f135658d = y1Var;
        y1Var.n(new com.tencent.mm.plugin.finder.viewmodel.component.d4(this));
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = this.f135658d;
        if (y1Var2 != null) {
            y1Var2.j(com.tencent.mm.R.layout.b5n);
            android.view.View rootView = y1Var2.f212027f;
            kotlin.jvm.internal.o.f(rootView, "rootView");
            W6(rootView, "finder_create_account_half_view", false);
            y1Var2.f212033o = true;
            r45.kw2 kw2Var = (r45.kw2) g92.b.f269769e.k2().d().getCustom(22);
            if (kw2Var == null || (str = kw2Var.getString(0)) == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "wording: ".concat(str));
            if ((str.length() > 0) && (textView = (android.widget.TextView) y1Var2.f212027f.findViewById(com.tencent.mm.R.id.ebe)) != null) {
                textView.setText(str);
            }
            android.view.View view = y1Var2.f212027f;
            if (view != null) {
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.eay);
                android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484449eb2);
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, c01.z1.r(), null);
                if (f135656g.length() == 0) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    java.lang.String j17 = com.tencent.mm.modelavatar.d1.Ai().j(c01.z1.r(), false);
                    f135656g = j17;
                    if (((int) com.tencent.mm.vfs.w6.k(j17)) == 0) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "WX avatar file size is zero");
                        f135656g = "";
                    }
                }
                java.lang.String str2 = f135657h;
                if (str2.length() == 0) {
                    str2 = c01.z1.l();
                }
                f135657h = str2;
                textView2.setText(str2);
                com.tencent.mars.xlog.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "lastAvatarPath: " + f135656g + ", lastNickName: " + f135657h);
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y0).getValue()).r()).intValue() == 1) {
                    pq5.g l17 = new db2.v2(1).l();
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    l17.f((com.tencent.mm.ui.MMActivity) activity);
                    l17.K(new com.tencent.mm.plugin.finder.viewmodel.component.c4(textView2, this));
                }
            }
            android.view.View findViewById = y1Var2.f212027f.findViewById(com.tencent.mm.R.id.f484447eb0);
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.e4(this));
            X6(this, findViewById, "half_create_account_page_edit_button", false, 4, null);
            android.widget.TextView textView3 = (android.widget.TextView) y1Var2.f212027f.findViewById(com.tencent.mm.R.id.g4d);
            com.tencent.mm.plugin.finder.assist.d8 d8Var = com.tencent.mm.plugin.finder.assist.d8.f102092a;
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.d(textView3);
            d8Var.e(context, textView3, "Finder.FinderBaseCreateAccountHalfScreenUIC");
            android.view.View findViewById2 = y1Var2.f212027f.findViewById(com.tencent.mm.R.id.g4a);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.f4(this, findViewById2));
            }
            android.widget.Button button = (android.widget.Button) y1Var2.f212027f.findViewById(com.tencent.mm.R.id.eaz);
            button.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.g4(this));
            X6(this, button, "half_create_account_page_create_post_button", false, 4, null);
            android.view.View findViewById3 = y1Var2.f212027f.findViewById(com.tencent.mm.R.id.f484448eb1);
            findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.h4(this));
            X6(this, findViewById3, "half_create_account_page_not_create_button", false, 4, null);
        }
    }

    public void R6() {
    }

    public void S6() {
    }

    public void T6() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((com.tencent.mm.plugin.finder.viewmodel.component.q4.f135657h.length() > 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6() {
        /*
            r3 = this;
            java.lang.String r0 = com.tencent.mm.plugin.finder.viewmodel.component.q4.f135656g
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1d
            java.lang.String r0 = com.tencent.mm.plugin.finder.viewmodel.component.q4.f135657h
            int r0 = r0.length()
            if (r0 <= 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r1 == 0) goto L28
            com.tencent.mm.ui.widget.dialog.y1 r0 = r3.f135658d
            if (r0 == 0) goto L2b
            r0.s()
            goto L2b
        L28:
            r3.P6()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.q4.U6():void");
    }

    public void V6(r45.r01 r01Var) {
        r45.nk2 nk2Var;
        java.lang.String string;
        az2.f fVar = this.f135659e;
        if (fVar != null) {
            fVar.b();
        }
        if (r01Var == null || (nk2Var = (r45.nk2) r01Var.getCustom(2)) == null) {
            return;
        }
        java.lang.String string2 = getString(com.tencent.mm.R.string.ev6);
        java.lang.String string3 = nk2Var.getString(1);
        if (!(string3 == null || string3.length() == 0) && (string = nk2Var.getString(1)) != null) {
            string2 = string;
        }
        db5.t7.m(getContext(), string2);
    }

    public final void W6(android.view.View view, java.lang.String str, boolean z17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new com.tencent.mm.plugin.finder.viewmodel.component.i4(this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, z17 ? 40 : 32, 25496);
    }

    public final void Y6(java.lang.String str) {
        c01.fb a17 = c01.fb.a();
        r45.hz0 hz0Var = new r45.hz0();
        r45.hz0 hz0Var2 = new r45.hz0();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f310116d = 1;
        hz0Var.set(3, java.lang.Integer.valueOf(a17.f37188b));
        if (a17.f37188b == 0) {
            f0Var.f310116d = 1;
        }
        java.lang.String str2 = a17.f37193g;
        if (!(str2 == null || str2.length() == 0)) {
            java.lang.String str3 = a17.f37195i;
            if (!(str3 == null || str3.length() == 0)) {
                java.lang.String str4 = a17.f37194h;
                if (!(str4 == null || str4.length() == 0)) {
                    f0Var2.f310116d = 0;
                    hz0Var.set(0, a17.f37193g);
                    hz0Var.set(1, a17.f37195i);
                    hz0Var.set(2, a17.f37194h);
                }
            }
        }
        pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.p4(str, hz0Var, hz0Var2, f0Var, f0Var2, this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("Finder.FinderBaseCreateAccountHalfScreenUIC", "requestCode: " + i17 + ", resultCode: " + i18);
        if (i17 == O6() && i18 == 1) {
            S6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String e17 = xy2.c.e(getActivity());
        kotlin.jvm.internal.o.g(e17, "<set-?>");
        this.f135660f = e17;
        Q6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f135658d;
        if (y1Var != null) {
            y1Var.f212033o = false;
        }
        if (y1Var != null) {
            y1Var.q();
        }
    }
}
