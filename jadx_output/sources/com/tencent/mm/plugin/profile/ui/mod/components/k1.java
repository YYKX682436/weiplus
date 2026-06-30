package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class k1 extends kr3.j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f153942u = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f153943r;

    /* renamed from: s, reason: collision with root package name */
    public final android.text.TextWatcher f153944s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f153945t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f153944s = new com.tencent.mm.plugin.profile.ui.mod.components.j1(this);
        this.f153945t = new java.util.ArrayList();
    }

    @Override // kr3.j
    public void O6() {
        java.lang.String username;
        com.tencent.mm.ui.base.FlowLayout flowLayout;
        if (!Q6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "canUseRecommendRemark(): false");
            return;
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        if (mMLimitedClearEditText == null || (username = getUsername()) == null || (flowLayout = this.f311390e) == null) {
            return;
        }
        flowLayout.setVisibility(0);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(gc0.p2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        gc0.p2 p2Var = (gc0.p2) a17;
        com.tencent.mm.storage.z3 U6 = U6();
        p2Var.W6(new gc0.b0(username, U6 != null ? U6.f2() : null), flowLayout, new com.tencent.mm.plugin.profile.ui.mod.components.g1(mMLimitedClearEditText), new com.tencent.mm.plugin.profile.ui.mod.components.h1(this), null);
    }

    @Override // kr3.j
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
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436646f, m7(str, this.f153943r), cgiBack.f70616b, kz5.b0.c(getUsername())));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kr3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R6(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.mod.components.k1.R6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kr3.j
    public java.lang.Object S6(kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.profile.ui.mod.components.a1(this, null), continuation);
    }

    @Override // kr3.j
    public void T6(yz5.l onResult) {
        kotlin.jvm.internal.o.g(onResult, "onResult");
        java.lang.String stringExtra = getIntent().getStringExtra("contact_set_remark_from_recommend");
        if (stringExtra == null) {
            onResult.invoke(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "recommend remark: ".concat(stringExtra));
        com.tencent.mm.storage.z3 U6 = U6();
        java.lang.String w07 = U6 != null ? U6.w0() : null;
        if (w07 == null) {
            w07 = "";
        }
        if (!r26.n0.N(stringExtra)) {
            if (!r26.n0.B(w07, stringExtra, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "current remark does not contains recommend remark, len: " + w07.length());
                if (w07.length() > 0) {
                    com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
                    if (mMLimitedClearEditText != null) {
                        mMLimitedClearEditText.setText(w07 + ' ' + stringExtra);
                    }
                } else {
                    com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
                    if (mMLimitedClearEditText2 != null) {
                        mMLimitedClearEditText2.setText(stringExtra);
                    }
                }
                ((java.util.ArrayList) this.f153945t).add(stringExtra);
                onResult.invoke(1);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ModRemarkUI", "current remark contains recommend remark, len: " + w07.length());
        }
        onResult.invoke(0);
    }

    @Override // kr3.j
    public java.lang.String V6() {
        return "ModRemarkUIC";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r2.r2() == true) goto L14;
     */
    @Override // kr3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xg3.q0 X6() {
        /*
            r12 = this;
            android.view.View r0 = r12.f311393h
            com.tencent.mm.ui.base.MMLimitedClearEditText r0 = (com.tencent.mm.ui.base.MMLimitedClearEditText) r0
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r2 = com.tencent.mm.ui.tools.v4.g(r0)
            android.content.res.Resources r3 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r4 = 2131361815(0x7f0a0017, float:1.8343393E38)
            int r3 = r3.getInteger(r4)
            if (r2 <= r3) goto L20
            return r1
        L20:
            com.tencent.mm.storage.z3 r2 = r12.W6()
            if (r2 == 0) goto L2e
            boolean r3 = r2.r2()
            r4 = 1
            if (r3 != r4) goto L2e
            goto L2f
        L2e:
            r4 = 0
        L2f:
            if (r4 == 0) goto L6f
            java.lang.String r3 = r2.d1()
            boolean r3 = com.tencent.mm.storage.z3.m4(r3)
            if (r3 != 0) goto L6f
            vg3.m3 r1 = vg3.n3.f436736n1
            vg3.n3 r1 = r1.a()
            vg3.e r11 = new vg3.e
            vg3.d r4 = vg3.d.f436681g
            vg3.b r5 = vg3.b.f436645e
            java.lang.String r3 = r12.f153943r
            vg3.c r6 = r12.m7(r0, r3)
            r7 = 0
            java.lang.String r3 = r2.d1()
            java.util.List r8 = kz5.b0.c(r3)
            r9 = 8
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.messenger.foundation.g r1 = (com.tencent.mm.plugin.messenger.foundation.g) r1
            r1.wi(r11)
            r2.n1(r0)
            xg3.p0 r1 = new xg3.p0
            r45.tn4 r0 = c01.e2.n(r2)
            r2 = 2
            r1.<init>(r2, r0)
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.mod.components.k1.X6():xg3.q0");
    }

    @Override // kr3.j
    public lr3.a Z6() {
        return new com.tencent.mm.plugin.profile.ui.mod.components.d1(this);
    }

    @Override // kr3.j
    public boolean a7() {
        return n7();
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
        mMLimitedClearEditText.setTextLimitLength(mMLimitedClearEditText.getResources().getInteger(com.tencent.mm.R.integer.f487821a0));
        mMLimitedClearEditText.getEditText().setInputType(131073);
        mMLimitedClearEditText.setMaxHeight(i65.a.f(getActivity(), com.tencent.mm.R.dimen.ao9));
        mMLimitedClearEditText.setHint(i65.a.r(getActivity(), com.tencent.mm.R.string.f492551gy1));
        mMLimitedClearEditText.getEditText().setImeOptions(5);
        mMLimitedClearEditText.setHintToText(true);
        mMLimitedClearEditText.setShowClearBtn(true);
        java.lang.String w07 = contact.w0();
        if (w07 == null) {
            w07 = "";
        }
        if (w07.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            ((ke0.e) xVar).getClass();
            mMLimitedClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, w07));
            this.f153943r = w07;
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname()) == 1) {
            mMLimitedClearEditText.setHintToText(false);
            mMLimitedClearEditText.setHint(getString(com.tencent.mm.R.string.f492551gy1));
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            java.lang.String f27 = contact.f2();
            java.lang.String str = f27 != null ? f27 : "";
            ((ke0.e) xVar2).getClass();
            mMLimitedClearEditText.setHint(com.tencent.mm.pluginsdk.ui.span.c0.i(activity2, str));
        }
        mMLimitedClearEditText.setSelection(mMLimitedClearEditText.getText().length());
        mMLimitedClearEditText.b(this.f153944s);
        mMLimitedClearEditText.setOnFocusChangeListener(new com.tencent.mm.plugin.profile.ui.mod.components.i1(this));
        mMLimitedClearEditText.setEdited(false);
        android.widget.TextView textView = this.f311391f;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // kr3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d7() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.mod.components.k1.d7():void");
    }

    @Override // kr3.j
    public void g7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        java.lang.String str;
        long j17;
        java.lang.CharSequence text;
        kotlin.jvm.internal.o.g(struct, "struct");
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        if (mMLimitedClearEditText == null || (text = mMLimitedClearEditText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (n7()) {
            java.util.List list = this.f153945t;
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

    @Override // kr3.j
    public int k7() {
        return 38;
    }

    @Override // kr3.j
    public int l7() {
        return com.tencent.mm.R.string.f492552gy2;
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
        return (str3 == null || str4 != null) ? (str3 != null || str4 == null) ? (str3 == null || str4 == null || kotlin.jvm.internal.o.b(str3, str4)) ? vg3.c.D : vg3.c.E : vg3.c.F : vg3.c.D;
    }

    public final boolean n7() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f311393h;
        if (mMLimitedClearEditText == null || !mMLimitedClearEditText.isEdited) {
            return false;
        }
        java.lang.String obj = mMLimitedClearEditText.getText().toString();
        java.lang.String str = this.f153943r;
        if (str == null || !kotlin.jvm.internal.o.b(str, obj)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(this.f153943r) && com.tencent.mm.sdk.platformtools.t8.K0(obj)) ? false : true;
        }
        return false;
    }
}
