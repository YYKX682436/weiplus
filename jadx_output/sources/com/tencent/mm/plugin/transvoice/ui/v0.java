package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class v0 extends androidx.appcompat.app.i0 {

    /* renamed from: l1, reason: collision with root package name */
    public static int f175477l1 = -1;
    public int A;
    public com.tencent.mm.plugin.transvoice.ui.w B;
    public long C;
    public java.lang.String D;
    public boolean E;
    public java.lang.String F;
    public int G;
    public com.tencent.mm.sdk.platformtools.b4 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.transvoice.ui.e f175478J;
    public com.tencent.mm.plugin.transvoice.ui.a K;
    public com.tencent.mm.sdk.platformtools.n3 L;
    public java.lang.String M;
    public final android.content.SharedPreferences N;
    public boolean P;
    public androidx.coordinatorlayout.widget.CoordinatorLayout Q;
    public android.support.design.widget.MMBottomSheetBehavior R;
    public com.tencent.mm.plugin.transvoice.ui.x S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public java.lang.String X;
    public final b31.d Y;
    public java.util.List Z;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.transvoice.model.e f175479f;

    /* renamed from: g, reason: collision with root package name */
    public long f175480g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f175481h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f175482i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout f175483m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f175484n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f175485o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f175486p;

    /* renamed from: p0, reason: collision with root package name */
    public final java.lang.Runnable f175487p0;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f175488q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f175489r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f175490s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f175491t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f175492u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f175493v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.transvoice.model.c f175494w;

    /* renamed from: x, reason: collision with root package name */
    public int f175495x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f175496x0;

    /* renamed from: y, reason: collision with root package name */
    public z21.a0 f175497y;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.plugin.transvoice.ui.y f175498y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f175499z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494620rt);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.transvoice.model.e eVar = com.tencent.mm.plugin.transvoice.model.e.I;
        this.f175479f = com.tencent.mm.plugin.transvoice.model.e.I;
        this.f175495x = 1;
        this.B = com.tencent.mm.plugin.transvoice.ui.w.f175500d;
        this.F = "";
        this.N = context.getSharedPreferences("voice2txt_sp", 0);
        this.S = com.tencent.mm.plugin.transvoice.ui.x.f175504d;
        this.X = "";
        C(1);
        this.Y = new b31.d();
        this.f175487p0 = new com.tencent.mm.plugin.transvoice.ui.s0(context, this);
        this.f175496x0 = "";
    }

    public static final void D(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(v0Var.f175496x0)) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
            if (mMEditText != null) {
                mMEditText.setText("");
                return;
            }
            return;
        }
        java.lang.String obj = r26.n0.u0(v0Var.f175496x0).toString();
        java.lang.String substring = obj.substring(obj.length() - 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.TransVoiceDialog", "delPunctuation, msg = %s, msg.length() = %s, punctuation = %s.", com.tencent.mm.sdk.platformtools.t8.G1(obj), java.lang.Integer.valueOf(obj.length()), substring);
        if (!r26.i0.p(substring, "。", true) && !r26.i0.p(substring, ".", true)) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = v0Var.f175484n;
            if (mMEditText2 != null) {
                mMEditText2.setText(obj);
                return;
            }
            return;
        }
        java.lang.String substring2 = obj.substring(0, obj.length() - 1);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = v0Var.f175484n;
        if (mMEditText3 != null) {
            mMEditText3.setText(substring2);
        }
    }

    public static final void E(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        int i17 = v0Var.f175495x;
        com.tencent.mm.plugin.transvoice.model.e eVar = v0Var.f175479f;
        eVar.f175392p = i17;
        com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
        java.lang.String valueOf = java.lang.String.valueOf(mMEditText != null ? mMEditText.getText() : null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(valueOf)) {
            eVar.f175396t = 0;
            v0Var.X = "";
        } else {
            eVar.f175396t = valueOf.length();
            v0Var.W = true;
            v0Var.X = valueOf;
        }
        if (v0Var.f175481h) {
            v0Var.K(8);
        } else {
            v0Var.K(5);
        }
    }

    public static final void F(com.tencent.mm.plugin.transvoice.ui.v0 v0Var, boolean z17) {
        if (z17) {
            android.view.View view = v0Var.f175486p;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = v0Var.f175486p;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setBottomBtnVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void G(com.tencent.mm.plugin.transvoice.ui.v0 v0Var, boolean z17) {
        if (z17) {
            android.view.View view = v0Var.f175488q;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = v0Var.f175488q;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "setSmileyItemVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void I(com.tencent.mm.plugin.transvoice.ui.v0 v0Var, boolean z17) {
        if (z17) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = v0Var.f175491t;
            if (chatFooterPanel == null) {
                return;
            }
            chatFooterPanel.setVisibility(0);
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = v0Var.f175491t;
        if (chatFooterPanel2 == null) {
            return;
        }
        chatFooterPanel2.setVisibility(4);
    }

    public final void J(boolean z17) {
        if (z17) {
            android.widget.ImageView imageView = this.f175485o;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        android.widget.ImageView imageView2 = this.f175485o;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    public final void K(int i17) {
        com.tencent.mm.plugin.transvoice.ui.y yVar;
        if (isShowing()) {
            this.f175479f.b(i17);
            L();
            dismiss();
            com.tencent.mm.plugin.transvoice.ui.y yVar2 = this.f175498y0;
            if (yVar2 != null) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.m2) yVar2).f190482a;
                if (chatFooter.M3.isShowing()) {
                    chatFooter.M3.dismiss();
                }
                chatFooter.f190054r2 = true;
            }
            if (!this.E && (yVar = this.f175498y0) != null) {
                java.lang.String str = this.D;
                com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = ((com.tencent.mm.pluginsdk.ui.chat.m2) yVar).f190482a.f190090x0;
                if (k5Var != null) {
                    k5Var.k(str);
                }
            }
            this.E = false;
        }
    }

    public final void L() {
        this.f175496x0 = "";
        this.G = 0;
        this.F = "";
        this.I = false;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f175484n;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f175484n;
        if (mMEditText2 != null) {
            mMEditText2.setCursorVisible(false);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f175484n;
        if (mMEditText3 != null) {
            mMEditText3.setFocusable(false);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f175484n;
        if (mMEditText4 != null) {
            mMEditText4.setFocusableInTouchMode(false);
        }
        android.view.View view = this.f175486p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f175488q;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog", "resetTransPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        M(false);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f175491t;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(8);
        }
        J(false);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.L;
        if (n3Var != null) {
            n3Var.removeMessages(5000);
        }
        this.S = com.tencent.mm.plugin.transvoice.ui.x.f175504d;
        this.T = false;
        this.U = false;
        this.V = false;
    }

    public final void M(boolean z17) {
        java.lang.Runnable runnable = this.f175487p0;
        if (z17) {
            android.view.View view = this.f175482i;
            if (view != null) {
                view.removeCallbacks(runnable);
            }
            android.view.View view2 = this.f175482i;
            if (view2 != null) {
                view2.post(runnable);
                return;
            }
            return;
        }
        android.view.View view3 = this.f175482i;
        if (view3 != null) {
            view3.removeCallbacks(runnable);
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f175484n;
            inputMethodManager.hideSoftInputFromWindow(mMEditText != null ? mMEditText.getWindowToken() : null, 0);
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        K(6);
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        this.f175482i = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d2b, (android.view.ViewGroup) null, false);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.view.View view = this.f175482i;
        kotlin.jvm.internal.o.d(view);
        setContentView(view, layoutParams);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(34);
            window.setDimAmount(0.5f);
            window.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.View view2 = this.f175482i;
        com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout transVoicePanelLayout = view2 != null ? (com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout) view2.findViewById(com.tencent.mm.R.id.hdo) : null;
        this.f175483m = transVoicePanelLayout;
        if (transVoicePanelLayout != null) {
            transVoicePanelLayout.setOnInputPanelChange(new com.tencent.mm.plugin.transvoice.ui.f0(this));
        }
        android.view.View view3 = this.f175482i;
        this.Q = view3 != null ? (androidx.coordinatorlayout.widget.CoordinatorLayout) view3.findViewById(com.tencent.mm.R.id.f483047v6) : null;
        android.view.View view4 = this.f175482i;
        android.support.design.widget.MMBottomSheetBehavior A = android.support.design.widget.MMBottomSheetBehavior.A(view4 != null ? view4.findViewById(com.tencent.mm.R.id.lj7) : null);
        this.R = A;
        if (A != null) {
            A.f8899w = new com.tencent.mm.plugin.transvoice.ui.h0(this);
        }
        if (A != null) {
            A.G = new com.tencent.mm.plugin.transvoice.ui.i0(this);
        }
        android.view.View view5 = this.f175482i;
        com.tencent.mm.ui.widget.MMEditText mMEditText = view5 != null ? (com.tencent.mm.ui.widget.MMEditText) view5.findViewById(com.tencent.mm.R.id.oip) : null;
        this.f175484n = mMEditText;
        if (mMEditText != null) {
            mMEditText.setCursorVisible(false);
            mMEditText.setOnEditorActionListener(new com.tencent.mm.plugin.transvoice.ui.j0(this));
            mMEditText.setMaxLines(Integer.MAX_VALUE);
            mMEditText.setHorizontallyScrolling(false);
            mMEditText.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.k0(this));
            mMEditText.addTextChangedListener(new com.tencent.mm.plugin.transvoice.ui.l0(this));
        }
        android.view.View view6 = this.f175482i;
        android.widget.ImageView imageView = view6 != null ? (android.widget.ImageView) view6.findViewById(com.tencent.mm.R.id.bzn) : null;
        if (imageView != null) {
            imageView.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.m0(this));
        }
        android.view.View view7 = this.f175482i;
        android.widget.ImageView imageView2 = view7 != null ? (android.widget.ImageView) view7.findViewById(com.tencent.mm.R.id.oir) : null;
        this.f175485o = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.n0(this));
        }
        android.view.View view8 = this.f175482i;
        android.widget.ImageView imageView3 = view8 != null ? (android.widget.ImageView) view8.findViewById(com.tencent.mm.R.id.bze) : null;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.o0(this));
        }
        android.view.View view9 = this.f175482i;
        this.f175486p = view9 != null ? view9.findViewById(com.tencent.mm.R.id.f486526lj5) : null;
        android.view.View view10 = this.f175482i;
        this.f175488q = view10 != null ? view10.findViewById(com.tencent.mm.R.id.n0s) : null;
        android.view.View view11 = this.f175482i;
        android.widget.ImageView imageView4 = view11 != null ? (android.widget.ImageView) view11.findViewById(com.tencent.mm.R.id.n0w) : null;
        this.f175489r = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.p0(this));
        }
        android.view.View view12 = this.f175482i;
        this.f175490s = view12 != null ? (android.widget.FrameLayout) view12.findViewById(com.tencent.mm.R.id.dds) : null;
        this.f175491t = qk.w9.b(getContext());
        this.A = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, this.A);
        android.widget.FrameLayout frameLayout = this.f175490s;
        if (frameLayout != null) {
            frameLayout.addView(this.f175491t, layoutParams2);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f175491t;
        if (chatFooterPanel != null) {
            chatFooterPanel.setPortHeightPx(this.A);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f175491t;
        if (chatFooterPanel2 != null) {
            int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            chatFooterPanel2.setEntranceScene(0);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = this.f175491t;
        if (chatFooterPanel3 != null) {
            chatFooterPanel3.c();
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel4 = this.f175491t;
        if (chatFooterPanel4 != null) {
            chatFooterPanel4.i();
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel5 = this.f175491t;
        if (chatFooterPanel5 != null) {
            chatFooterPanel5.setVisibility(0);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel6 = this.f175491t;
        if (chatFooterPanel6 != null) {
            chatFooterPanel6.setShowSend(true);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel7 = this.f175491t;
        if (chatFooterPanel7 != null) {
            chatFooterPanel7.setOnTextOperationListener(new com.tencent.mm.plugin.transvoice.ui.r0(this));
        }
        this.H = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.transvoice.ui.q0(this), true);
        android.view.View view13 = this.f175482i;
        android.widget.Button button = view13 != null ? (android.widget.Button) view13.findViewById(com.tencent.mm.R.id.b18) : null;
        this.f175492u = button;
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.z(this));
        }
        android.view.View view14 = this.f175482i;
        android.widget.Button button2 = view14 != null ? (android.widget.Button) view14.findViewById(com.tencent.mm.R.id.b19) : null;
        this.f175493v = button2;
        if (button2 != null) {
            button2.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.a0(this));
        }
        android.widget.Button button3 = this.f175492u;
        com.tencent.mm.ui.bk.r0(button3 != null ? button3.getPaint() : null, 0.8f);
        android.widget.Button button4 = this.f175493v;
        com.tencent.mm.ui.bk.r0(button4 != null ? button4.getPaint() : null, 0.8f);
        this.K = new com.tencent.mm.plugin.transvoice.ui.b0(this);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.transvoice.ui.e eVar = new com.tencent.mm.plugin.transvoice.ui.e(context);
        this.f175478J = eVar;
        eVar.setOnDismissListener(com.tencent.mm.plugin.transvoice.ui.c0.f175415d);
        eVar.f175427q = this.K;
        this.L = new com.tencent.mm.sdk.platformtools.n3(new com.tencent.mm.plugin.transvoice.ui.d0(this));
        setOnDismissListener(new com.tencent.mm.plugin.transvoice.ui.e0(this));
    }

    @Override // android.app.Dialog
    public void show() {
        ba5.a.f18702b = true;
        super.show();
    }
}
