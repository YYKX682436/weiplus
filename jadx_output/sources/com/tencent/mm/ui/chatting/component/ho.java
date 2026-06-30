package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.o2.class)
/* loaded from: classes5.dex */
public final class ho extends com.tencent.mm.ui.chatting.component.a implements sb5.o2 {
    public static final java.util.Map E = kz5.c1.k(new jz5.l(0, java.lang.Integer.valueOf(com.tencent.mm.R.string.b6j)), new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.string.b6k)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.string.b6f)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.string.b6g)), new jz5.l(4, java.lang.Integer.valueOf(com.tencent.mm.R.string.b6h)));
    public static final java.util.Map F = kz5.c1.k(new jz5.l(0, "zh_CN"), new jz5.l(1, "zh_TW"), new jz5.l(2, "en"), new jz5.l(3, "ja"), new jz5.l(4, "ko"));
    public final jz5.g C;
    public final int D;

    /* renamed from: e, reason: collision with root package name */
    public sb5.n2 f199178e;

    /* renamed from: f, reason: collision with root package name */
    public sb5.m2 f199179f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout f199180g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f199181h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.TranslateControllerView f199182i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.LoadableTextView f199183m;

    /* renamed from: v, reason: collision with root package name */
    public int f199192v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f199194x;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f199184n = jz5.h.b(new com.tencent.mm.ui.chatting.component.qn(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f199185o = jz5.h.b(new com.tencent.mm.ui.chatting.component.nn(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f199186p = jz5.h.b(new com.tencent.mm.ui.chatting.component.on(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f199187q = jz5.h.b(new com.tencent.mm.ui.chatting.component.pn(this));

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.kn f199188r = com.tencent.mm.ui.chatting.component.kn.f199376d;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f199189s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f199190t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f199191u = "";

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f199193w = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f199195y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f199196z = new com.tencent.mm.ui.chatting.component.go(this);
    public final com.tencent.mm.ui.chatting.component.ln A = new com.tencent.mm.ui.chatting.component.ln(this);
    public final e75.a B = new com.tencent.mm.ui.chatting.component.fo(this);

    public ho() {
        jz5.h.b(new com.tencent.mm.ui.chatting.component.bo(this));
        this.C = jz5.h.b(new com.tencent.mm.ui.chatting.component.Cdo(this));
        this.D = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_translate_tool_expose_max_count, 5);
    }

    public void A0() {
        if (n0() == -1) {
            return;
        }
        com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout animSizeRelativeLayout = this.f199180g;
        if (animSizeRelativeLayout == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        qa5.l lVar = animSizeRelativeLayout.sizeAnimController;
        android.view.View view = lVar.f361126b;
        if (view.getVisibility() == 0) {
            return;
        }
        android.view.View view2 = lVar.f361126b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/anim/content/SizeAnimController", "requestVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/anim/content/SizeAnimController", "requestVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.requestLayout();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        nn4.a aVar = (nn4.a) com.tencent.mm.sdk.event.q.f192403a.a(nn4.a.class);
        e75.a observer = this.B;
        kotlin.jvm.internal.o.g(observer, "observer");
        aVar.f192369d.removeObserver(observer);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        com.tencent.mm.ui.chatting.component.ln lnVar = this.A;
        lnVar.getClass();
        if (com.tencent.mm.sdk.platformtools.o4.M(lnVar.f199451a.r0()).getInt(lnVar.a("useTrans"), 0) >= this.D) {
            v0(-1);
        }
        sb5.m2 m2Var = this.f199179f;
        if (m2Var != null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.z1) m2Var).f190768a;
            chatFooter.f190021m.setHint("");
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            if (y4Var == null || y4Var.a() == null) {
                return;
            }
            ((com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) chatFooter.f189955a3.a().f460708c.a(sb5.o2.class))).f199179f = null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        nn4.a aVar = (nn4.a) com.tencent.mm.sdk.event.q.f192403a.a(nn4.a.class);
        gm0.b bVar = gm0.j1.b().f273245h;
        kotlin.jvm.internal.o.f(bVar, "getAccountModelOwner(...)");
        e75.a observer = this.B;
        kotlin.jvm.internal.o.g(observer, "observer");
        aVar.f192369d.observe(bVar, observer);
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = this.f199183m;
        if (loadableTextView == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        loadableTextView.expectWidth = ((android.view.View) ((jz5.n) this.C).getValue()).getWidth();
        loadableTextView.requestLayout();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        java.util.List list = this.f199189s;
        ((java.util.ArrayList) list).clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateWhileWriteComponent", "initRootView(): Translate While Write init root view");
        android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.blf);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout");
        this.f199180g = (com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout) c17;
        if (n0() != -1) {
            y0();
        } else {
            w0(false);
        }
        android.view.View c18 = this.f198580d.c(com.tencent.mm.R.id.blc);
        kotlin.jvm.internal.o.e(c18, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.component.TranslateControllerView");
        com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView = (com.tencent.mm.ui.chatting.component.TranslateControllerView) c18;
        this.f199182i = translateControllerView;
        translateControllerView.setOnClickListener(new com.tencent.mm.ui.chatting.component.un(this));
        com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView2 = this.f199182i;
        if (translateControllerView2 == null) {
            kotlin.jvm.internal.o.o("controllerView");
            throw null;
        }
        translateControllerView2.setLanguageText(o0());
        ((java.util.ArrayList) list).add(new com.tencent.mm.ui.chatting.component.vn(this));
        android.view.View c19 = this.f198580d.c(com.tencent.mm.R.id.ble);
        kotlin.jvm.internal.o.e(c19, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.component.LoadableTextView");
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = (com.tencent.mm.ui.chatting.component.LoadableTextView) c19;
        this.f199183m = loadableTextView;
        loadableTextView.setVisibility(8);
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView2 = this.f199183m;
        if (loadableTextView2 == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        loadableTextView2.setOnDoubleClickListener(new com.tencent.mm.ui.chatting.component.wn(this));
        ((java.util.ArrayList) list).add(new com.tencent.mm.ui.chatting.component.xn(this));
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Global_TransInWriteMaxLine_Int, 1);
        if (g17 > 1) {
            com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView3 = this.f199183m;
            if (loadableTextView3 == null) {
                kotlin.jvm.internal.o.o("resultTv");
                throw null;
            }
            loadableTextView3.setSingleLine(false);
            com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView4 = this.f199183m;
            if (loadableTextView4 == null) {
                kotlin.jvm.internal.o.o("resultTv");
                throw null;
            }
            loadableTextView4.setMaxLines(g17);
        }
        android.view.View c27 = this.f198580d.c(com.tencent.mm.R.id.blg);
        kotlin.jvm.internal.o.e(c27, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) c27;
        this.f199181h = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.bli);
        android.view.ViewGroup viewGroup2 = this.f199181h;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("useBtn");
            throw null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup2.findViewById(com.tencent.mm.R.id.blh);
        android.view.ViewGroup viewGroup3 = this.f199181h;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("useBtn");
            throw null;
        }
        viewGroup3.setVisibility(8);
        android.view.ViewGroup viewGroup4 = this.f199181h;
        if (viewGroup4 == null) {
            kotlin.jvm.internal.o.o("useBtn");
            throw null;
        }
        viewGroup4.setOnClickListener(new com.tencent.mm.ui.chatting.component.yn(this));
        ((java.util.ArrayList) list).add(new com.tencent.mm.ui.chatting.component.zn(this, textView, weImageView));
    }

    public final java.lang.String m0() {
        java.lang.String str = (java.lang.String) F.get(java.lang.Integer.valueOf(n0()));
        return str == null ? "" : str;
    }

    public final int n0() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(r0());
        if (M.f(this.f198580d.x())) {
            return M.getInt(this.f198580d.x(), -1);
        }
        M.putInt(this.f198580d.x(), -1);
        return -1;
    }

    public final java.lang.String o0() {
        try {
            if (n0() == -1) {
                return "";
            }
            android.app.Activity g17 = this.f198580d.g();
            java.lang.Integer num = (java.lang.Integer) E.get(java.lang.Integer.valueOf(n0()));
            java.lang.String string = g17.getString(num != null ? num.intValue() : 0);
            kotlin.jvm.internal.o.d(string);
            return string;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public final java.lang.String p0() {
        return (this.f199191u.length() >= this.f199190t.length() && r26.n0.D(this.f199191u, this.f199190t, false, 2, null)) ? this.f199190t : "";
    }

    public qa5.l q0() {
        com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout animSizeRelativeLayout = this.f199180g;
        if (animSizeRelativeLayout != null) {
            return animSizeRelativeLayout.getSizeAnimController();
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    public final java.lang.String r0() {
        return gm0.j1.b().j() + "TransInWriting";
    }

    public void s0(java.lang.String text) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(text, "text");
        if (n0() != -1) {
            java.lang.String x17 = this.f198580d.x();
            int length = text.length();
            int length2 = this.f199190t.length();
            java.lang.String m07 = m0();
            com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct translateMsgStruct = new com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct();
            if (pn4.f1.f357105a.length() == 0) {
                str = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.o.f(str, "toString(...)");
                pn4.f1.f357105a = str;
            } else {
                str = pn4.f1.f357105a;
            }
            translateMsgStruct.r(str);
            translateMsgStruct.f61351f = 2;
            translateMsgStruct.p("7");
            translateMsgStruct.f61355j = length2;
            translateMsgStruct.f61356k = length;
            translateMsgStruct.f61357l = translateMsgStruct.b("TargetLanguage", m07, true);
            translateMsgStruct.q(x17);
            translateMsgStruct.k();
            this.f199190t = "";
        }
    }

    public final void t0(java.lang.String textMsg) {
        if (this.f198580d.C()) {
            gm0.j1.b().c();
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new pn4.g1()).a(pn4.k1.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            int i17 = pn4.k1.f357138d;
            pn4.k1.f357138d = i17 + 1;
            java.lang.String m07 = m0();
            java.lang.String x17 = this.f198580d.x();
            java.lang.String prefixContent = p0();
            kotlin.jvm.internal.o.g(prefixContent, "prefixContent");
            kotlin.jvm.internal.o.g(textMsg, "textMsg");
            ((pn4.k1) a17).N6(i17, m07, x17, prefixContent, 30, textMsg);
            return;
        }
        gm0.j1.b().c();
        androidx.lifecycle.c1 a18 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new pn4.g1()).a(pn4.k1.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        int i18 = pn4.k1.f357138d;
        pn4.k1.f357138d = i18 + 1;
        java.lang.String m08 = m0();
        java.lang.String x18 = this.f198580d.x();
        java.lang.String prefixContent2 = p0();
        kotlin.jvm.internal.o.g(prefixContent2, "prefixContent");
        kotlin.jvm.internal.o.g(textMsg, "textMsg");
        ((pn4.k1) a18).N6(i18, m08, x18, prefixContent2, 29, textMsg);
    }

    public final void u0(com.tencent.mm.ui.chatting.component.kn knVar) {
        com.tencent.mm.ui.chatting.component.kn knVar2 = this.f199188r;
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateWhileWriteComponent", "notifyStatusChange() called with: oldStatus = " + knVar2 + ", newValue = " + knVar);
        java.util.Iterator it = ((java.util.ArrayList) this.f199189s).iterator();
        while (it.hasNext()) {
            ((yz5.p) it.next()).invoke(knVar2, knVar);
        }
        this.f199188r = knVar;
    }

    public final void v0(int i17) {
        int n07 = n0();
        com.tencent.mm.sdk.platformtools.o4.M(r0()).putInt(this.f198580d.x(), i17);
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f199184n).getValue()).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        com.tencent.mm.ui.chatting.component.TranslateControllerView translateControllerView = this.f199182i;
        if (translateControllerView == null) {
            kotlin.jvm.internal.o.o("controllerView");
            throw null;
        }
        translateControllerView.setLanguageText(o0());
        if (n07 == i17 || i17 == -1) {
            return;
        }
        if (this.f199191u.length() > 0) {
            com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = this.f199183m;
            if (loadableTextView == null) {
                kotlin.jvm.internal.o.o("resultTv");
                throw null;
            }
            loadableTextView.setLoading(true);
            u0(com.tencent.mm.ui.chatting.component.kn.f199377e);
            t0(this.f199191u);
        }
    }

    public final void w0(boolean z17) {
        u0(com.tencent.mm.ui.chatting.component.kn.f199376d);
        if (z17) {
            x0();
            return;
        }
        com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout animSizeRelativeLayout = this.f199180g;
        if (animSizeRelativeLayout != null) {
            animSizeRelativeLayout.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout animSizeRelativeLayout = this.f199180g;
        if (animSizeRelativeLayout != null) {
            animSizeRelativeLayout.postDelayed(new com.tencent.mm.ui.chatting.component.ao(this), 500L);
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }

    public void x0() {
        com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout animSizeRelativeLayout = this.f199180g;
        if (animSizeRelativeLayout == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        qa5.l lVar = animSizeRelativeLayout.sizeAnimController;
        if (lVar.f361126b.getVisibility() == 8) {
            return;
        }
        lVar.c(lVar.f361132h, 0, true, new qa5.k(lVar));
    }

    public final void y0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateWhileWriteComponent", "tryShowRoot(): Translate While Write try show root");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        pn4.f1.f357105a = uuid;
        if (n0() == -1) {
            if (kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.a9.f192463a, "zh_CN") || kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.a9.f192463a, "zh_HK") || kotlin.jvm.internal.o.b(com.tencent.mm.sdk.platformtools.a9.f192463a, "zh_TW")) {
                v0(2);
            } else {
                v0(0);
            }
        }
        if (this.f199191u.length() == 0) {
            u0(com.tencent.mm.ui.chatting.component.kn.f199376d);
        }
        A0();
    }
}
