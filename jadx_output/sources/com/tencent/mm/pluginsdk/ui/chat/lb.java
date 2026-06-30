package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes9.dex */
public final class lb implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f190467d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.kb f190468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f190469f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f190470g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f190471h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f190472i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f190473m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f190474n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f190475o;

    public lb(android.content.Context context, android.view.View rootView, com.tencent.mm.pluginsdk.ui.chat.kb callback, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f190467d = rootView;
        this.f190468e = callback;
        this.f190469f = i17;
        this.f190475o = "";
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.plm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f190470g = linearLayout;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.plo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f190471h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.pln);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f190472i = (android.widget.TextView) findViewById3;
        this.f190473m = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.vpb);
        linearLayout.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.jb(this, context));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c())) {
            this.f190474n = true;
        }
        rn3.i.Di().k(this);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    public final int a() {
        int i17 = this.f190469f;
        if (i17 == 10) {
            return 47;
        }
        return i17 == 6 ? 54 : 49;
    }

    public final java.lang.String b() {
        return this.f190471h.getText().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa A[Catch: Exception -> 0x010e, TryCatch #0 {Exception -> 0x010e, blocks: (B:16:0x0067, B:18:0x0081, B:19:0x00b0, B:23:0x00f0, B:25:0x00fa, B:26:0x0100, B:31:0x00da, B:34:0x00e4), top: B:15:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.chat.lb.c():java.lang.String");
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    public final boolean d() {
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(a()));
        return c17.first == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null;
    }

    public final void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "refresh %s", java.lang.Boolean.valueOf(z17));
        android.widget.TextView textView = this.f190473m;
        android.widget.LinearLayout linearLayout = this.f190470g;
        if (!z17) {
            this.f190474n = false;
            if (linearLayout.getVisibility() == 0) {
                linearLayout.setVisibility(4);
            }
            if (textView == null || textView.getVisibility() != 0) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        java.lang.String c17 = c();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            this.f190474n = false;
            linearLayout.setVisibility(8);
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        if (!this.f190474n) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().n(a());
        }
        linearLayout.setVisibility(0);
        this.f190471h.setText(c17);
        if (textView != null) {
            textView.setVisibility(8);
        }
        boolean d17 = d();
        if (this.f190469f == 10) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_username", this.f190475o);
            hashMap.put("is_red_dot", java.lang.Integer.valueOf(d17 ? 1 : 0));
            hashMap.put("log_version", "20260409");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("wechat_keyboard_promote", "view_exp", hashMap, 36465);
            com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "reportWetypeGuideExposure: chat_username=" + this.f190475o + ", is_red_dot=" + hashMap.get("is_red_dot"));
        }
        this.f190468e.b(d17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        int i17 = this.f190469f;
        return i17 == 10 ? "attach_voiceinput_wxkeyboard" : i17 == 6 ? "custom_emoji_wetype" : "fulltext_input_wxkeyboard";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f190467d;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        android.widget.TextView textView = this.f190472i;
        if (z17) {
            textView.setVisibility(0);
            return true;
        }
        textView.setVisibility(4);
        return true;
    }
}
