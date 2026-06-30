package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class h extends kr3.j {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.profile.ui.mod.components.a f153917u = new com.tencent.mm.plugin.profile.ui.mod.components.a(null);

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f153918r;

    /* renamed from: s, reason: collision with root package name */
    public final android.text.TextWatcher f153919s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f153920t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f153919s = new com.tencent.mm.plugin.profile.ui.mod.components.g(this);
        this.f153920t = new int[3];
    }

    @Override // kr3.j
    public void P6(xg3.q0 op6, com.tencent.mm.modelbase.f cgiBack) {
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        super.P6(op6, cgiBack);
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436646f, m7(java.lang.String.valueOf(mMLimitedClearEditText != null ? mMLimitedClearEditText.getText() : null), this.f153918r), cgiBack.f70616b, kz5.b0.c(getUsername())));
    }

    @Override // kr3.j
    public java.lang.Object R6(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.storage.z3 W6 = W6();
        if (W6 != null) {
            com.tencent.mm.plugin.profile.ui.mod.components.a aVar = f153917u;
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
            com.tencent.mm.plugin.profile.ui.mod.components.a.a(aVar, W6, java.lang.String.valueOf(mMLimitedClearEditText != null ? mMLimitedClearEditText.getText() : null));
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // kr3.j
    public java.lang.Object S6(kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.profile.ui.mod.components.c(this, null), continuation);
    }

    @Override // kr3.j
    public java.lang.String V6() {
        return "ModDescriptionUIC";
    }

    @Override // kr3.j
    public xg3.q0 X6() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        if (mMLimitedClearEditText == null) {
            return null;
        }
        java.lang.String newDesc = mMLimitedClearEditText.getText().toString();
        com.tencent.mm.storage.z3 W6 = W6();
        if (W6 == null || ((int) W6.E2) <= 0 || !W6.r2()) {
            return null;
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436645e, m7(newDesc, this.f153918r), 0, kz5.b0.c(getUsername()), 8, null));
        java.lang.String d17 = W6.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        kotlin.jvm.internal.o.g(newDesc, "newDesc");
        r45.wn4 wn4Var = new r45.wn4();
        wn4Var.f389311d = d17;
        wn4Var.f389312e = newDesc;
        return new xg3.p0(54, wn4Var);
    }

    @Override // kr3.j
    public lr3.a Z6() {
        return new com.tencent.mm.plugin.profile.ui.mod.components.d(this);
    }

    @Override // kr3.j
    public boolean a7() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        if (mMLimitedClearEditText == null) {
            return false;
        }
        java.lang.String obj = mMLimitedClearEditText.getText().toString();
        java.lang.String str = this.f153918r;
        if (str == null || !kotlin.jvm.internal.o.b(str, obj)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(this.f153918r) && com.tencent.mm.sdk.platformtools.t8.K0(obj)) ? false : true;
        }
        return false;
    }

    @Override // kr3.j
    public boolean b7() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        return (mMLimitedClearEditText == null || mMLimitedClearEditText.c()) ? false : true;
    }

    @Override // kr3.j
    public android.view.View c7(java.lang.String username, com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = new com.tencent.mm.ui.base.MMLimitedClearEditText(getActivity(), null, 2, null);
        mMLimitedClearEditText.setTextLimitLength(mMLimitedClearEditText.getResources().getInteger(com.tencent.mm.R.integer.f487819y));
        mMLimitedClearEditText.getEditText().setInputType(131073);
        mMLimitedClearEditText.setHint(i65.a.r(getActivity(), com.tencent.mm.R.string.gxw));
        mMLimitedClearEditText.getEditText().setImeOptions(5);
        com.tencent.mm.ui.base.NestedScrollEditText editText = mMLimitedClearEditText.getEditText();
        int d17 = i65.a.d(getActivity(), com.tencent.mm.R.color.FG_0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        editText.setTextColor(d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        mMLimitedClearEditText.setHintToText(false);
        mMLimitedClearEditText.setShowClearBtn(false);
        mMLimitedClearEditText.getEditText().setMinimumHeight(mMLimitedClearEditText.getEditText().getLineHeight());
        mMLimitedClearEditText.getEditText().setMaxHeight(mMLimitedClearEditText.getEditText().getLineHeight() * 10);
        mMLimitedClearEditText.setId(com.tencent.mm.R.id.d98);
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(username);
        java.lang.String str = z07 != null ? z07.field_conDescription : null;
        if (str == null || str.length() == 0) {
            str = contact.f236589y1;
        }
        if (str == null) {
            str = "";
        }
        this.f153918r = str;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.lang.String str2 = this.f153918r;
        ((ke0.e) xVar).getClass();
        mMLimitedClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, str2));
        mMLimitedClearEditText.setSelection(mMLimitedClearEditText.getText().length());
        mMLimitedClearEditText.b(this.f153919s);
        mMLimitedClearEditText.setEdited(false);
        int f17 = i65.a.f(getActivity(), com.tencent.mm.R.dimen.f479688cn);
        android.widget.TextView textView = this.f311391f;
        if (textView != null) {
            textView.setPadding(f17, 0, f17, 0);
        }
        return mMLimitedClearEditText;
    }

    @Override // kr3.j
    public void d7() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        if (mMLimitedClearEditText == null) {
            return;
        }
        java.lang.String digest = getIntent().getStringExtra("Contact_verify_string");
        if (digest == null || r26.n0.N(digest)) {
            com.tencent.mm.storage.p7 b17 = r21.w.Ai().b1(getUsername());
            if (b17 == null) {
                return;
            }
            y35.r c17 = y35.r.c(getActivity(), b17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17.f459233b) || kotlin.jvm.internal.o.b(c17.f459233b, getString(com.tencent.mm.R.string.fbh))) {
                return;
            }
            digest = c17.f459233b;
            kotlin.jvm.internal.o.f(digest, "digest");
        }
        if (x51.t1.b(digest)) {
            return;
        }
        this.f153920t[0] = 1;
        android.widget.TextView textView = this.f311391f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f311391f;
        if (textView2 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            java.lang.String string = getActivity().getString(com.tencent.mm.R.string.bh9, digest);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string == null) {
                string = "";
            }
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, string));
        }
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la7));
        f0Var.c(new com.tencent.mm.plugin.profile.ui.mod.components.b(getActivity(), digest, new com.tencent.mm.plugin.profile.ui.mod.components.e(mMLimitedClearEditText), new com.tencent.mm.plugin.profile.ui.mod.components.f(this, mMLimitedClearEditText)), 0, f0Var.length(), 17);
        android.widget.TextView textView3 = this.f311391f;
        if (textView3 != null) {
            textView3.append(" ");
        }
        android.widget.TextView textView4 = this.f311391f;
        if (textView4 != null) {
            textView4.append(f0Var);
        }
        android.widget.TextView textView5 = this.f311391f;
        if (textView5 == null) {
            return;
        }
        textView5.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    @Override // kr3.j
    public void f7() {
        super.f7();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_get_desc_report_data", this.f153920t);
        getActivity().setResult(-1, intent);
    }

    @Override // kr3.j
    public void g7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        java.lang.CharSequence text;
        kotlin.jvm.internal.o.g(struct, "struct");
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        struct.f59980s = (mMLimitedClearEditText == null || (text = mMLimitedClearEditText.getText()) == null) ? 0L : text.length();
    }

    @Override // kr3.j
    public int k7() {
        return 41;
    }

    @Override // kr3.j
    public int l7() {
        return com.tencent.mm.R.string.gxx;
    }

    public final vg3.c m7(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String obj;
        java.lang.String str4 = null;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null || !(!r26.n0.N(str3))) {
            str3 = null;
        }
        if (str2 != null && (obj = r26.n0.u0(str2).toString()) != null && (!r26.n0.N(obj))) {
            str4 = obj;
        }
        return (str3 == null || str4 != null) ? (str3 != null || str4 == null) ? (str3 == null || str4 == null || kotlin.jvm.internal.o.b(str3, str4)) ? vg3.c.I : vg3.c.K : vg3.c.f436652J : vg3.c.I;
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        if (mMLimitedClearEditText != null) {
            mMLimitedClearEditText.e(this.f153919s);
        }
    }
}
