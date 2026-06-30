package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class k4 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final r45.kv1 f117189h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f117190i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f117191m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f117192n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f117193o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f117194p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f117195q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f117196r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k4(android.content.Context r8, r45.kv1 r9, zl2.u4 r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r7 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L6
            zl2.u4 r10 = zl2.u4.f473988d
        L6:
            r3 = r10
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)
            java.lang.String r10 = "uiMode"
            kotlin.jvm.internal.o.g(r3, r10)
            r2 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f117189h = r9
            java.lang.String r8 = "FinderLiveGiftWallTopFirstDialog"
            r7.f117190i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.k4.<init>(android.content.Context, r45.kv1, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.ast;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f117191m = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.khs);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f117192n = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f485171gs3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f117193o = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.hlh);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f117194p = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f117195q = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f117196r = (android.widget.TextView) findViewById6;
        android.view.View view = this.f117191m;
        if (view == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.h4(this));
        android.view.View view2 = this.f117192n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("confirmBtn");
            throw null;
        }
        view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.i4(this));
        android.widget.TextView textView = this.f117196r;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleView");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.b0m);
        kotlin.jvm.internal.o.d(viewGroup);
        y(viewGroup, (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz));
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.cgi);
        kotlin.jvm.internal.o.d(viewGroup2);
        y(viewGroup2, (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        jz5.f0 f0Var;
        java.lang.String string;
        android.widget.ImageView imageView = this.f117194p;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("avatarImgView");
            throw null;
        }
        ng5.a.a(imageView, c01.z1.r());
        android.content.Context context = this.f118381d;
        r45.kv1 kv1Var = this.f117189h;
        java.lang.String str = "";
        if (kv1Var != null) {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            java.lang.String string2 = kv1Var.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            wo0.c a17 = d1Var.a(new mn2.q3(string2, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            android.widget.ImageView imageView2 = this.f117193o;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("giftImgView");
                throw null;
            }
            ((wo0.b) a17).c(imageView2);
            android.widget.TextView textView = this.f117195q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("descView");
                throw null;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.String string3 = kv1Var.getString(8);
            if (string3 == null) {
                string3 = "";
            }
            objArr[0] = string3;
            textView.setText(context.getString(com.tencent.mm.R.string.djx, objArr));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView3 = this.f117193o;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("giftImgView");
                throw null;
            }
            imageView3.setImageResource(com.tencent.mm.R.drawable.c4i);
            android.widget.TextView textView2 = this.f117195q;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("descView");
                throw null;
            }
            textView2.setText(context.getString(com.tencent.mm.R.string.djx, ""));
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.Z1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 6);
        if (kv1Var != null && (string = kv1Var.getString(0)) != null) {
            str = string;
        }
        jSONObject.put("gift_id", str);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        super.w();
    }

    public final void y(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i17 + (k0Var != null ? k0Var.isLandscape() : false ? 0 : com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a)));
    }
}
