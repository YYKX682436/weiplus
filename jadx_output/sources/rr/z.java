package rr;

/* loaded from: classes13.dex */
public final class z implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f399157d;

    /* renamed from: e, reason: collision with root package name */
    public final rr.y f399158e;

    /* renamed from: f, reason: collision with root package name */
    public final int f399159f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f399160g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f399161h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f399162i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f399163m;

    public z(android.content.Context context, android.view.View rootView, rr.y callback, int i17, java.lang.String guideStr) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(guideStr, "guideStr");
        this.f399157d = rootView;
        this.f399158e = callback;
        this.f399159f = i17;
        this.f399160g = guideStr;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.plm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f399161h = linearLayout;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.plo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f399162i = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.pln);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f399163m = findViewById3;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
        linearLayout.setOnClickListener(new rr.w(this, Di, context));
        Di.k(this);
        linearLayout.addOnAttachStateChangeListener(new rr.x(this, Di));
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
        int i17 = this.f399159f;
        if (i17 != 3) {
            return i17 != 6 ? 49 : 54;
        }
        return 47;
    }

    public final boolean b() {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(a()));
        return c17.first == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null;
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "refresh %s", java.lang.Boolean.valueOf(z17));
        android.widget.LinearLayout linearLayout = this.f399161h;
        if (!z17) {
            if (linearLayout.getVisibility() == 0) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().n(a());
        linearLayout.setVisibility(0);
        this.f399162i.setText(this.f399160g);
        boolean b17 = b();
        lr.i1 i1Var = (lr.i1) this.f399158e;
        i1Var.getClass();
        jz5.g gVar = rr.c.f399124a;
        rr.a config = i1Var.f320529a;
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomEmojiWetypeHelper", "onShown");
        com.tencent.mm.autogen.mmdata.rpt.CustomEmojiWetypeAdStruct customEmojiWetypeAdStruct = new com.tencent.mm.autogen.mmdata.rpt.CustomEmojiWetypeAdStruct();
        customEmojiWetypeAdStruct.f55761d = 8L;
        customEmojiWetypeAdStruct.f55763f = b17 ? 1L : 0L;
        customEmojiWetypeAdStruct.f55762e = customEmojiWetypeAdStruct.b("tips", config.f399118a, true);
        customEmojiWetypeAdStruct.f55764g = b17 ? 2L : 0L;
        customEmojiWetypeAdStruct.k();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        c17.x(com.tencent.mm.storage.u3.USERINFO_EMOJI_WETYPE_AD_SHOW_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_WETYPE_AD_SHOW_COUNT_INT_SYNC;
        c17.x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_EMOJI_WETYPE_AD_FIRST_SHOW_TIME_LONG_SYNC;
        if (c17.t(u3Var2, -1L) == -1) {
            c17.x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        int i17 = this.f399159f;
        return i17 != 3 ? i17 != 6 ? "fulltext_input_wxkeyboard" : "custom_emoji_wetype" : "attach_voiceinput_wxkeyboard";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f399157d;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.WetypeGuideHolder", "showRedPoint: " + z17);
        if (z17) {
            android.view.View view = this.f399163m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.view.View view2 = this.f399163m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
