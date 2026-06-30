package pp3;

/* loaded from: classes5.dex */
public final class u extends androidx.appcompat.app.i0 implements sr.k, xg3.d0 {

    /* renamed from: s, reason: collision with root package name */
    public static pp3.u f357498s;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f357499f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f357500g;

    /* renamed from: h, reason: collision with root package name */
    public final int f357501h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.emoji.view.EmojiPanelInputComponent f357502i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f357503m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMClearEditText f357504n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f357505o;

    /* renamed from: p, reason: collision with root package name */
    public final pp3.m f357506p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f357507q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f357508r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context dialogContext) {
        super(dialogContext, com.tencent.mm.R.style.f494444nd);
        kotlin.jvm.internal.o.g(dialogContext, "dialogContext");
        this.f357499f = dialogContext;
        this.f357500g = "MicroMsg.Pat.PatSuffixSettingDialog";
        this.f357501h = 20;
        this.f357506p = new pp3.m(this);
        this.f357508r = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new pp3.n(this), false);
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = this.f357502i;
        if (emojiPanelInputComponent != null) {
            emojiPanelInputComponent.setVisibility(4);
        }
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent2 = this.f357502i;
        if (emojiPanelInputComponent2 != null) {
            emojiPanelInputComponent2.f64945q = null;
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = emojiPanelInputComponent2.f64938g;
            if (chatFooterPanel != null) {
                chatFooterPanel.l();
                emojiPanelInputComponent2.f64938g.a();
            }
        }
        hideVKB();
        super.dismiss();
    }

    @Override // sr.k
    public void hideVKB() {
        java.lang.Object systemService = this.f357499f.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = this.f357504n;
        inputMethodManager.hideSoftInputFromWindow(mMClearEditText != null ? mMClearEditText.getWindowToken() : null, 0);
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(this.f357499f).inflate(com.tencent.mm.R.layout.c8x, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f357502i = (com.tencent.mm.emoji.view.EmojiPanelInputComponent) findViewById(com.tencent.mm.R.id.hde);
        this.f357504n = (com.tencent.mm.ui.widget.MMClearEditText) findViewById(com.tencent.mm.R.id.kpy);
        this.f357505o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kpz);
        inflate.findViewById(com.tencent.mm.R.id.f484220df2).setOnTouchListener(new pp3.o(this));
        inflate.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new pp3.p(this));
        setCancelable(true);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.kpy);
        if (editText != null) {
            editText.requestFocus();
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        pp3.q qVar = new pp3.q(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(qVar, 128L, false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.khs);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pp3.r(this));
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
        java.lang.String str2 = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str2 == null) {
            str2 = "";
        }
        this.f357503m = str2;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 0);
        com.tencent.mars.xlog.Log.i(this.f357500g, "curSuffix %s, suffixVersion %d", this.f357503m, java.lang.Integer.valueOf(r17));
        if (r17 == 0 && com.tencent.mm.sdk.platformtools.m2.j() && (str = this.f357503m) != null) {
            this.f357503m = "的".concat(str);
        }
        java.lang.String str3 = this.f357503m;
        if (str3 != null) {
            com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = this.f357504n;
            if (mMClearEditText != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = this.f357499f;
                ((ke0.e) xVar).getClass();
                mMClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3));
            }
            com.tencent.mm.ui.widget.MMClearEditText mMClearEditText2 = this.f357504n;
            if (mMClearEditText2 != null) {
                mMClearEditText2.setSelection(str3.length());
            }
            if (str3.length() > 0) {
                com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = this.f357502i;
                if (emojiPanelInputComponent != null) {
                    emojiPanelInputComponent.setSmileySendButtonEnable(true);
                }
            } else {
                com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent2 = this.f357502i;
                if (emojiPanelInputComponent2 != null) {
                    emojiPanelInputComponent2.setSmileySendButtonEnable(false);
                }
            }
        }
        com.tencent.mm.ui.widget.MMClearEditText mMClearEditText3 = this.f357504n;
        if (mMClearEditText3 != null) {
            mMClearEditText3.addTextChangedListener(this.f357506p);
        }
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, this, true);
        setOnDismissListener(new pp3.s(this));
        com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct patSuffixActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct();
        patSuffixActionReportStruct.f59844d = patSuffixActionReportStruct.b("SessionId", java.lang.String.valueOf(c01.id.c()), true);
        patSuffixActionReportStruct.f59845e = 1;
        patSuffixActionReportStruct.f59847g = 3;
        patSuffixActionReportStruct.f59846f = 0;
        patSuffixActionReportStruct.k();
        patSuffixActionReportStruct.o();
        setOnCancelListener(pp3.t.f357497d);
        f357498s = this;
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent3 = this.f357502i;
        if (emojiPanelInputComponent3 != null) {
            emojiPanelInputComponent3.setMMEditText(this.f357504n);
        }
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent4 = this.f357502i;
        if (emojiPanelInputComponent4 != null) {
            emojiPanelInputComponent4.setInputComponentListener(this);
        }
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent5 = this.f357502i;
        if (emojiPanelInputComponent5 == null) {
            return;
        }
        emojiPanelInputComponent5.setVisibility(4);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyDown(i17, event);
        }
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent = this.f357502i;
        if (!(emojiPanelInputComponent != null && emojiPanelInputComponent.h())) {
            dismiss();
            return false;
        }
        com.tencent.mm.emoji.view.EmojiPanelInputComponent emojiPanelInputComponent2 = this.f357502i;
        if (emojiPanelInputComponent2 == null) {
            return true;
        }
        emojiPanelInputComponent2.g();
        emojiPanelInputComponent2.setVisibility(8);
        return true;
    }

    @Override // sr.k
    public void showVKB() {
        java.lang.Object systemService = this.f357499f.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f357504n, 0);
    }

    @Override // xg3.d0
    public void u0(int i17, r45.g25 g25Var, xg3.q0 q0Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = g25Var != null ? g25Var.f374841d : null;
        objArr[2] = g25Var != null ? g25Var.f374842e : null;
        java.lang.String str = this.f357500g;
        com.tencent.mars.xlog.Log.i(str, "ret:%d, content:%s, title:%s", objArr);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f357507q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        try {
            com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct patSuffixActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct();
            patSuffixActionReportStruct.f59844d = patSuffixActionReportStruct.b("SessionId", java.lang.String.valueOf(c01.id.c()), true);
            patSuffixActionReportStruct.f59845e = 2;
            patSuffixActionReportStruct.f59847g = 3;
            android.content.Context context = this.f357499f;
            if (i17 == 0) {
                db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490480w9));
                com.tencent.mm.protobuf.f fVar = q0Var != null ? q0Var.f454431j : null;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModPatSuffixOplog");
                r45.mo4 mo4Var = (r45.mo4) fVar;
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_STRING_SYNC;
                java.lang.Object m17 = c17.m(u3Var2, null);
                kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
                if (!kotlin.jvm.internal.o.b((java.lang.String) m17, mo4Var.f380712d)) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 2);
                }
                gm0.j1.u().c().x(u3Var2, mo4Var.f380712d);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG, java.lang.Long.valueOf(c01.id.c()));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT, 0);
                patSuffixActionReportStruct.f59846f = 0;
                dismiss();
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.K0(g25Var != null ? g25Var.f374841d : null)) {
                    db5.e1.i(context, com.tencent.mm.R.string.f490391to, com.tencent.mm.R.string.f490479w8);
                } else {
                    db5.e1.s(context, g25Var != null ? g25Var.f374841d : null, context.getString(com.tencent.mm.R.string.f490479w8));
                }
                patSuffixActionReportStruct.f59846f = i17;
            }
            patSuffixActionReportStruct.k();
            patSuffixActionReportStruct.o();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
        }
    }
}
