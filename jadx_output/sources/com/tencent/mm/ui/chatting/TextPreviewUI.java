package com.tencent.mm.ui.chatting;

@db5.a(131)
@ul5.d(0)
/* loaded from: classes9.dex */
public class TextPreviewUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    public static final /* synthetic */ int H = 0;
    public com.tencent.mm.ui.chatting.hc A;
    public com.tencent.mm.ui.chatting.ToolsBar E;
    public android.view.View F;
    public android.view.View G;

    /* renamed from: g, reason: collision with root package name */
    public r15.g f198328g;

    /* renamed from: h, reason: collision with root package name */
    public int f198329h;

    /* renamed from: i, reason: collision with root package name */
    public wl5.x f198330i;

    /* renamed from: m, reason: collision with root package name */
    public rl5.r f198331m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f198332n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f198333o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f198334p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f198335q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.base.CustomScrollView f198336r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.Animation f198337s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.Animation f198338t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198339u;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f198343y;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f198325d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f198326e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f198327f = null;

    /* renamed from: v, reason: collision with root package name */
    public int f198340v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f198341w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f198342x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f198344z = false;
    public boolean B = false;
    public final com.tencent.mm.pluginsdk.ui.span.z C = new com.tencent.mm.ui.chatting.be(this);
    public boolean D = false;

    public static void U6(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI, android.content.Context context, java.lang.CharSequence charSequence) {
        textPreviewUI.getClass();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", charSequence);
        intent.putExtra("Retr_Msg_Id", textPreviewUI.f198339u.getMsgId());
        intent.putExtra("Retr_MsgTalker", textPreviewUI.f198339u.Q0());
        intent.putExtra("Retr_Msg_Type", 4);
        intent.putExtra("scene_from", 17);
        intent.putExtra("ForwardParams_ForwardMsgType", 5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", "sendMsg", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/TextPreviewUI", "sendMsg", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    public static void V6(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        if (textPreviewUI.F == null || !com.tencent.mm.sdk.platformtools.t8.K0(c01.ia.u(textPreviewUI.f198339u)) || textPreviewUI.f198344z) {
            return;
        }
        textPreviewUI.F.setAnimation(textPreviewUI.f198337s);
        android.view.View view = textPreviewUI.F;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", "showToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/TextPreviewUI", "showToolsBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static void W6(com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        int j17;
        if (f9Var != null && (j17 = c01.ia.j(f9Var)) > 0) {
            com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct messageSecurityInterceptStruct = new com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct();
            int i19 = com.tencent.mm.storage.z3.R4(f9Var.Q0()) || com.tencent.mm.storage.z3.q4(f9Var.Q0()) ? 2 : 1;
            int i27 = f9Var.A0() == 1 ? 1 : 0;
            messageSecurityInterceptStruct.f59202f = f9Var.I0();
            messageSecurityInterceptStruct.f59200d = i19;
            messageSecurityInterceptStruct.f59201e = i27;
            messageSecurityInterceptStruct.f59205i = j17;
            messageSecurityInterceptStruct.f59203g = i17;
            messageSecurityInterceptStruct.f59204h = i18;
            messageSecurityInterceptStruct.k();
        }
    }

    public static void X6(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        wl5.x xVar = textPreviewUI.f198330i;
        if (xVar != null) {
            xVar.k();
            wl5.x xVar2 = textPreviewUI.f198330i;
            xVar2.M = true;
            xVar2.N = true;
            xVar2.i();
        }
    }

    public final void Y6() {
        android.view.View view = this.G;
        if (view == null || this.f198325d == null) {
            return;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        this.f198325d.getLocationOnScreen(iArr2);
        boolean z17 = false;
        int i17 = iArr[0];
        int i18 = iArr[1];
        int width = this.G.getWidth() + i17;
        int height = this.G.getHeight() + i18;
        int i19 = iArr2[0];
        int i27 = iArr2[1];
        int width2 = this.f198325d.getWidth() + i19;
        int height2 = this.f198325d.getHeight() + i27;
        if (width >= i19 && i17 <= width2 && height >= i27 && i18 <= height2) {
            z17 = true;
        }
        if (z17) {
            this.G.setElevation(10.0f);
        } else {
            this.G.setElevation(0.0f);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488525vz;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r15.f b17;
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        if (fp.h.c(19)) {
            getWindow().setFlags(67109888, 67109888);
        }
        this.f198333o = findViewById(com.tencent.mm.R.id.o4t);
        this.f198327f = getIntent().getCharSequenceExtra("key_chat_text");
        this.f198329h = getIntent().getIntExtra("key_msg_type", 0);
        getIntent().getIntExtra("key_quote_msg_wait_send", 0);
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        java.lang.Object a17 = ok5.d.a(getIntent(), "kPartialQuoteContent");
        if (a17 instanceof r15.g) {
            this.f198328g = (r15.g) a17;
        }
        this.f198339u = pt0.f0.wg(stringExtra, longExtra, true);
        this.f198325d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ghb);
        this.f198326e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ghc);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hrp);
        this.f198334p = findViewById;
        this.f198335q = findViewById.findViewById(com.tencent.mm.R.id.hpz);
        this.f198336r = (com.tencent.mm.ui.base.CustomScrollView) findViewById(com.tencent.mm.R.id.gh8);
        com.tencent.mm.ui.chatting.ec ecVar = new com.tencent.mm.ui.chatting.ec(this.f198325d);
        com.tencent.mm.ui.base.CustomScrollView customScrollView = this.f198336r;
        ecVar.f200474b = customScrollView;
        ecVar.f200475c = customScrollView != null;
        ecVar.f200478f = new yz5.a() { // from class: com.tencent.mm.ui.chatting.TextPreviewUI$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                wl5.x xVar = com.tencent.mm.ui.chatting.TextPreviewUI.this.f198330i;
                if (xVar == null || !(wl5.y.o(xVar.f447165j) instanceof android.text.Spannable)) {
                    return null;
                }
                xVar.f447174s = (android.text.Spannable) wl5.y.o(xVar.f447165j);
                return null;
            }
        };
        this.A = new com.tencent.mm.ui.chatting.hc(ecVar, null);
        android.widget.TextView textView = this.f198326e;
        java.lang.CharSequence charSequence = this.f198327f;
        java.lang.String Q0 = this.f198339u.Q0();
        if (charSequence instanceof java.lang.String) {
            charSequence = ((java.lang.String) charSequence).replaceAll(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, "\n").replaceAll("\r", "\n");
        }
        java.lang.String spannableString = new android.text.SpannableString(charSequence).toString();
        android.os.Bundle a18 = com.tencent.mm.pluginsdk.ui.span.m1.a(getIntent().getBooleanExtra("is_group_chat", false), k01.d.a(Q0));
        com.tencent.mm.plugin.wallet_core.utils.t.f180986a.a(a18, this.f198339u);
        a18.putString("geta8key_username", Q0);
        a18.putInt("KMsgType", this.f198339u.getType());
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        le0.r rVar = le0.x.P0;
        boolean z17 = !c01.ia.D(this.f198339u);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.s(context, spannableString, textSize, 1, a18, null, 1, rVar, z17));
        this.f198327f = textView.getText();
        android.widget.TextView textView2 = this.f198325d;
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        getContext();
        textView2.setText(Di.Ri(this.f198327f, true));
        if (this.f198328g != null && (b17 = r15.h.b(this.f198327f.toString(), this.f198328g)) != null) {
            com.tencent.mm.ui.chatting.hc hcVar = this.A;
            hcVar.f201673e = b17.f368644a;
            hcVar.f201674f = b17.f368645b;
            this.f198325d.post(new com.tencent.mm.ui.chatting.ce(this));
        }
        this.f198343y = c01.z1.r();
        yd5.g gVar = yd5.h.f461099a;
        android.widget.TextView textView3 = this.f198325d;
        com.tencent.mm.storage.f9 f9Var = this.f198339u;
        gVar.a(textView3, f9Var, com.tencent.mm.storage.z3.R4(f9Var.Q0()) || com.tencent.mm.storage.z3.q4(f9Var.Q0()), this.f198343y);
        this.f198325d.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.view.ViewTreeObserver viewTreeObserver = this.f198325d.getViewTreeObserver();
        this.f198344z = getIntent().getBooleanExtra("key_chat_preview_hide_toolbar", false);
        viewTreeObserver.addOnPreDrawListener(new com.tencent.mm.ui.chatting.de(this));
        this.f198337s = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477857df);
        this.f198338t = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477855dd);
        boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTextPreviewSupportQuote()) == 1 && ti3.i.k(this.f198339u) && !this.f198344z;
        rl5.r rVar2 = new rl5.r(getContext(), this.f198325d);
        this.f198331m = rVar2;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f397355y = new com.tencent.mm.ui.chatting.ee(this, z18);
        rVar2.f397351u = new com.tencent.mm.ui.chatting.fe(this);
        rVar2.f397354x = new com.tencent.mm.ui.chatting.he(this);
        com.tencent.mm.ui.chatting.je jeVar = new com.tencent.mm.ui.chatting.je(this);
        if (this.f198330i == null && !c01.ia.A(this.f198339u) && !c01.ia.y(this.f198339u) && !c01.ia.x(this.f198339u)) {
            wl5.o oVar = new wl5.o(this.f198325d, this.f198331m, null, null, jeVar);
            oVar.f447123g = com.tencent.mm.R.color.a3y;
            oVar.f447122f = com.tencent.mm.R.color.f478860j6;
            oVar.a(com.tencent.mm.ui.zk.a(getContext(), 20));
            wl5.x xVar2 = new wl5.x(oVar);
            this.f198330i = xVar2;
            xVar2.f447159d = new com.tencent.mm.ui.chatting.ke(this);
        }
        this.f198333o.setOnClickListener(new com.tencent.mm.ui.chatting.le(this));
        this.f198325d.setOnClickListener(new com.tencent.mm.ui.chatting.rd(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c01.ia.u(this.f198339u))) {
            android.view.View view = this.f198334p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/TextPreviewUI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f198335q.setOnClickListener(new com.tencent.mm.ui.chatting.sd(this));
        } else if (!c01.ia.A(this.f198339u) && !c01.ia.y(this.f198339u)) {
            if (!(this.f198329h == 1) && !c01.ia.x(this.f198339u)) {
                if (!com.tencent.mm.storage.z3.K3(this.f198339u.Q0())) {
                    android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f487588p34);
                    if (viewStub != null) {
                        this.F = viewStub.inflate();
                    }
                    com.tencent.mm.ui.chatting.ToolsBar toolsBar = (com.tencent.mm.ui.chatting.ToolsBar) findViewById(com.tencent.mm.R.id.f487362of0);
                    this.E = toolsBar;
                    toolsBar.setVisibility(!this.f198344z ? 0 : 8);
                }
                com.tencent.mm.ui.chatting.ToolsBar toolsBar2 = this.E;
                if (toolsBar2 != null) {
                    toolsBar2.a(0, new com.tencent.mm.ui.chatting.xd(this));
                    this.E.a(1, new com.tencent.mm.ui.chatting.yd(this));
                    this.E.a(2, new com.tencent.mm.ui.chatting.zd(this));
                }
            }
        }
        if (this.f198329h == 1) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.uck);
            this.G = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setElevation(0.0f);
                android.widget.Button button = (android.widget.Button) this.G.findViewById(com.tencent.mm.R.id.ucl);
                this.G.setOutlineProvider(new com.tencent.mm.ui.chatting.ae(this));
                android.text.TextPaint paint = button.getPaint();
                paint.setFakeBoldText(true);
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                paint.setStrokeWidth(0.8f);
                button.setGravity(16);
                this.G.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.TextPreviewUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = com.tencent.mm.ui.chatting.TextPreviewUI.H;
                        com.tencent.mm.ui.chatting.TextPreviewUI.this.Y6();
                    }
                });
            }
            android.view.View view2 = this.G;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/TextPreviewUI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.G.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.TextPreviewUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    int i17 = com.tencent.mm.ui.chatting.TextPreviewUI.H;
                    com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = com.tencent.mm.ui.chatting.TextPreviewUI.this;
                    textPreviewUI.getClass();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(view3);
                    java.lang.Object[] array = arrayList3.toArray();
                    arrayList3.clear();
                    yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", textPreviewUI, array);
                    textPreviewUI.setResult(100);
                    textPreviewUI.finish();
                    yj0.a.h(textPreviewUI, "com/tencent/mm/ui/chatting/TextPreviewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.widget.TextView textView4 = this.f198325d;
            textView4.setPadding(textView4.getPaddingLeft(), this.f198325d.getPaddingTop(), this.f198325d.getPaddingRight(), i65.a.a(this, 80.0f));
        }
        setBackBtn(new com.tencent.mm.ui.chatting.td(this));
        this.f198336r.setOnTouchListener(new com.tencent.mm.ui.chatting.ud(this));
        this.f198336r.setOnScrollChangeListener(new com.tencent.mm.ui.chatting.vd(this));
        com.tencent.mm.ui.chatting.ToolsBar toolsBar3 = this.E;
        if (toolsBar3 == null || toolsBar3.getVisibility() != 0) {
            setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
        } else {
            setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.chatting.hc hcVar = this.A;
        if (hcVar != null) {
            hcVar.f201671c.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.chatting.hc hcVar = this.A;
        if (hcVar != null) {
            hcVar.f201671c.removeCallbacksAndMessages(null);
        }
        qp1.h0.b();
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.C);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
        wl5.x xVar = this.f198330i;
        if (xVar != null) {
            if (!xVar.M) {
                xVar.q();
            }
            wl5.x xVar2 = this.f198330i;
            if (!xVar2.N) {
                xVar2.o();
            }
        }
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.C);
    }
}
