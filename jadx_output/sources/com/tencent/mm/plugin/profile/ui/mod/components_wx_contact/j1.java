package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class j1 extends kr3.t {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f154083r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f154084s;

    /* renamed from: t, reason: collision with root package name */
    public final android.text.TextWatcher f154085t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f154086u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f154083r = j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigSetContactPropertySyncEnable()) == 1;
        this.f154085t = new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i1(this);
        this.f154086u = new java.util.ArrayList();
    }

    @Override // kr3.t
    public void O6() {
        java.lang.String username;
        com.tencent.mm.ui.base.FlowLayout flowLayout;
        if (!Q6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "canUseRecommendRemark(): false");
            return;
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311480h;
        if (mMLimitedClearEditText == null || (username = getUsername()) == null || (flowLayout = this.f311477e) == null) {
            return;
        }
        flowLayout.setVisibility(0);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(gc0.p2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        gc0.p2 p2Var = (gc0.p2) a17;
        com.tencent.mm.contact.o U6 = U6();
        p2Var.W6(new gc0.b0(username, U6 != null ? ((yq3.v) U6).d() : null), flowLayout, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.f1(mMLimitedClearEditText), new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g1(this), null);
    }

    @Override // kr3.t
    public void P6(xg3.q0 op6, com.tencent.mm.modelbase.f cgiBack) {
        r45.du5 du5Var;
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        super.P6(op6, cgiBack);
        com.tencent.mm.protobuf.f fVar = op6.f454431j;
        java.lang.String str = null;
        r45.tn4 tn4Var = fVar instanceof r45.tn4 ? (r45.tn4) fVar : null;
        if (tn4Var != null && (du5Var = tn4Var.f386599p) != null) {
            str = du5Var.f372756d;
        }
        if (str == null) {
            str = "";
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436646f, l7(str, this.f154084s), cgiBack.f70616b, kz5.b0.c(getUsername())));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kr3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R6(kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1.R6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kr3.t
    public java.lang.Object S6(kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.z0(this, null), continuation);
    }

    @Override // kr3.t
    public void T6(yz5.l onResult) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(onResult, "onResult");
        java.lang.String stringExtra = getIntent().getStringExtra("contact_set_remark_from_recommend");
        if (stringExtra == null) {
            onResult.invoke(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "recommend remark: ".concat(stringExtra));
        com.tencent.mm.contact.o U6 = U6();
        if (U6 == null || (str = ((yq3.v) U6).c()) == null) {
            str = "";
        }
        if (!r26.n0.N(stringExtra)) {
            if (!r26.n0.B(str, stringExtra, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "current remark does not contains recommend remark, len: " + str.length());
                if (str.length() > 0) {
                    com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311480h;
                    if (mMLimitedClearEditText != null) {
                        mMLimitedClearEditText.setText(str + ' ' + stringExtra);
                    }
                } else {
                    com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311480h;
                    if (mMLimitedClearEditText2 != null) {
                        mMLimitedClearEditText2.setText(stringExtra);
                    }
                }
                ((java.util.ArrayList) this.f154086u).add(stringExtra);
                onResult.invoke(1);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "current remark contains recommend remark, len: " + str.length());
        }
        onResult.invoke(0);
    }

    @Override // kr3.t
    public java.lang.String V6() {
        return "ModRemarkUIC";
    }

    @Override // kr3.t
    public xg3.q0 W6() {
        com.tencent.mm.contact.o U6;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311480h;
        if (mMLimitedClearEditText == null) {
            return null;
        }
        java.lang.String obj = mMLimitedClearEditText.getText().toString();
        if (com.tencent.mm.ui.tools.v4.g(obj) > com.tencent.mm.sdk.platformtools.x2.f193075e.getInteger(com.tencent.mm.R.integer.f487821a0) || (U6 = U6()) == null) {
            return null;
        }
        yq3.v vVar = (yq3.v) U6;
        if (!vVar.k() || com.tencent.mm.storage.z3.m4(vVar.h())) {
            return null;
        }
        vVar.q(obj);
        if (this.f154083r) {
            return null;
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436645e, l7(obj, this.f154084s), 0, kz5.b0.c(vVar.h()), 8, null));
        return new xg3.p0(2, c01.e2.n(vVar.f464535f));
    }

    @Override // kr3.t
    public lr3.a Y6() {
        return new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.c1(this);
    }

    @Override // kr3.t
    public boolean Z6() {
        return m7();
    }

    @Override // kr3.t
    public boolean a7() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311480h;
        return (mMLimitedClearEditText == null || mMLimitedClearEditText.c()) ? false : true;
    }

    @Override // kr3.t
    public android.view.View b7(java.lang.String username, com.tencent.mm.contact.o contact) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = new com.tencent.mm.ui.base.MMLimitedClearEditText(getActivity(), null, 2, null);
        mMLimitedClearEditText.setTextLimitLength(mMLimitedClearEditText.getResources().getInteger(com.tencent.mm.R.integer.f487821a0));
        mMLimitedClearEditText.getEditText().setInputType(131073);
        mMLimitedClearEditText.setMaxHeight(i65.a.f(getActivity(), com.tencent.mm.R.dimen.ao9));
        mMLimitedClearEditText.setHint(i65.a.r(getActivity(), com.tencent.mm.R.string.f492551gy1));
        mMLimitedClearEditText.getEditText().setImeOptions(5);
        mMLimitedClearEditText.setHintToText(true);
        mMLimitedClearEditText.setShowClearBtn(true);
        yq3.v vVar = (yq3.v) contact;
        java.lang.String c17 = vVar.c();
        if (c17.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            ((ke0.e) xVar).getClass();
            mMLimitedClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, c17));
            this.f154084s = c17;
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname()) == 1) {
            mMLimitedClearEditText.setHintToText(false);
            mMLimitedClearEditText.setHint(getString(com.tencent.mm.R.string.f492551gy1));
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            java.lang.String d17 = vVar.d();
            ((ke0.e) xVar2).getClass();
            mMLimitedClearEditText.setHint(com.tencent.mm.pluginsdk.ui.span.c0.i(activity2, d17));
        }
        mMLimitedClearEditText.setSelection(mMLimitedClearEditText.getText().length());
        mMLimitedClearEditText.b(this.f154085t);
        mMLimitedClearEditText.setOnFocusChangeListener(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.h1(this));
        mMLimitedClearEditText.setEdited(false);
        android.widget.TextView textView = this.f311478f;
        if (textView != null) {
            int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.aii);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = h17;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayout_marginLeft", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        }
        return mMLimitedClearEditText;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // kr3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1.c7():void");
    }

    @Override // kr3.t
    public void f7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        java.lang.String str;
        long j17;
        java.lang.CharSequence text;
        kotlin.jvm.internal.o.g(struct, "struct");
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311480h;
        if (mMLimitedClearEditText == null || (text = mMLimitedClearEditText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (m7()) {
            java.util.List list = this.f154086u;
            boolean z17 = false;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (r26.n0.B(str, (java.lang.String) it.next(), false)) {
                        z17 = true;
                        break;
                    }
                }
            }
            j17 = z17 ? 1L : 2L;
        } else {
            j17 = 3;
        }
        struct.f59978q = j17;
    }

    @Override // kr3.t
    public int i7() {
        return 38;
    }

    @Override // kr3.t
    public int k7() {
        return com.tencent.mm.R.string.f492552gy2;
    }

    public final vg3.c l7(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String obj;
        java.lang.String str4 = null;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null || !(!r26.n0.N(str3))) {
            str3 = null;
        }
        if (str2 != null && (obj = r26.n0.u0(str2).toString()) != null && (!r26.n0.N(obj))) {
            str4 = obj;
        }
        return (str3 == null || str4 != null) ? (str3 != null || str4 == null) ? (str3 == null || str4 == null || kotlin.jvm.internal.o.b(str3, str4)) ? vg3.c.D : vg3.c.E : vg3.c.F : vg3.c.D;
    }

    public final boolean m7() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311480h;
        if (mMLimitedClearEditText == null || !mMLimitedClearEditText.isEdited) {
            return false;
        }
        java.lang.String obj = mMLimitedClearEditText.getText().toString();
        java.lang.String str = this.f154084s;
        if (str == null || !kotlin.jvm.internal.o.b(str, obj)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(this.f154084s) && com.tencent.mm.sdk.platformtools.t8.K0(obj)) ? false : true;
        }
        return false;
    }
}
