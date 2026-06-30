package com.tencent.mm.plugin.kidswatch.ui.reg;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lal5/e0;", "<init>", "()V", "z83/o", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class KidsWatchRegMobileVerifyUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, al5.e0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f143153s = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143154d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143155e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143156f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143157g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143158h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f143159i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f143161n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f143162o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f143163p;

    /* renamed from: q, reason: collision with root package name */
    public z83.o f143164q;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f143160m = "+86";

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f143165r = jz5.h.b(new z83.v(this));

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            T6().f444010f.setVisibility(0);
            android.view.ViewGroup.LayoutParams layoutParams = T6().f444006b.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            marginLayoutParams.topMargin = 0;
            T6().f444006b.setLayoutParams(marginLayoutParams);
            T6().f444011g.setPadding(T6().f444011g.getPaddingLeft(), T6().f444011g.getPaddingTop(), T6().f444011g.getPaddingRight(), 0);
            return;
        }
        T6().f444010f.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams2 = T6().f444006b.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        marginLayoutParams2.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        T6().f444006b.setLayoutParams(marginLayoutParams2);
        T6().f444011g.setPadding(T6().f444011g.getPaddingLeft(), T6().f444011g.getPaddingTop(), T6().f444011g.getPaddingRight(), i17);
        T6().f444011g.requestLayout();
    }

    public final w83.i T6() {
        return (w83.i) ((jz5.n) this.f143165r).getValue();
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "startSmsListener");
        z83.o oVar = this.f143164q;
        if (oVar != null) {
            oVar.cancel();
        } else {
            this.f143164q = new z83.o(this, 60000L, 1000L);
        }
        T6().f444015k.setEnabled(false);
        T6().f444015k.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3_k));
        z83.o oVar2 = this.f143164q;
        if (oVar2 != null) {
            oVar2.start();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "requestSms, opCode:23");
        gm0.j1.d().a(145, this);
        this.f143159i = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492797hw3), true, true, z83.t.f470753d);
        hv.e eVar = (hv.e) i95.n0.c(hv.e.class);
        java.lang.String str = this.f143160m + this.f143155e;
        ((gv.a) eVar).getClass();
        h11.e eVar2 = new h11.e(str, 23, "", 0, "", 0);
        eVar2.S(this.f143158h);
        java.lang.String str2 = this.f143154d;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        ((o45.eh) eVar2.f278071d.getReqObj()).f342922a.C = str2;
        gm0.j1.d().g(eVar2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489191bn2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = T6().f444009e;
        java.lang.String string = getString(com.tencent.mm.R.string.g7n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kidsWatchHeadComponent.setTitle(string);
        T6().f444009e.setCloseBtnCallBack(new z83.p(this));
        T6().f444011g.e(this);
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f143154d = stringExtra;
        this.f143155e = getIntent().getStringExtra("intent.key.reg.mobile");
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.reg.nickname");
        kotlin.jvm.internal.o.d(stringExtra2);
        this.f143156f = stringExtra2;
        this.f143158h = getIntent().getStringExtra("intent.key.reg.session.id");
        this.f143161n = getIntent().getBooleanExtra("intent.key.hasSetAvatar", false);
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.reg.head_img.file.id");
        kotlin.jvm.internal.o.d(stringExtra3);
        this.f143162o = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("intent.key.reg.head_img.aes.key");
        kotlin.jvm.internal.o.d(stringExtra4);
        this.f143163p = stringExtra4;
        U6();
        T6().f444015k.setOnClickListener(new z83.q(this));
        T6().f444012h.addTextChangedListener(new z83.r(this));
        T6().f444008d.setEnabled(false);
        T6().f444008d.setOnClickListener(new z83.s(this));
        T6().f444014j.setText(this.f143155e);
        a93.a aVar = a93.a.f2429a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.c(context, T6().f444013i, T6().f444006b);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        supportActionBar.o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "stopSmsListener");
        z83.o oVar = this.f143164q;
        if (oVar != null) {
            oVar.cancel();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        T6().f444011g.e(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "stopSmsListener");
        z83.o oVar = this.f143164q;
        if (oVar != null) {
            oVar.cancel();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T6().f444011g.e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f143159i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!(m1Var instanceof hv.f)) {
            if (m1Var instanceof x83.h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "NetSceneExtReg");
                gm0.j1.d().q(5888, this);
                if (i17 != 0 || i18 != 0) {
                    x83.f[] fVarArr = x83.f.f452567d;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.g(21256, true, true, false, "", 2, java.lang.Integer.valueOf(i18));
                    x51.r1 r1Var = new x51.r1(i17, i18, str);
                    ((is.s) ((js.u0) i95.n0.c(js.u0.class))).getClass();
                    if (new x51.f().c(this, r1Var)) {
                        return;
                    }
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        b17.c(this, null, null);
                        return;
                    }
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    java.lang.String format = java.lang.String.format("注册失败，错误码(%s, %s)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)}, 2));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    db5.e1.s(context, format, "");
                    return;
                }
                x83.h hVar = (x83.h) m1Var;
                com.tencent.mm.protobuf.f fVar = hVar.f452570e.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                java.lang.String str2 = ((r45.hn0) fVar).f376308e;
                com.tencent.mm.protobuf.f fVar2 = hVar.f452570e.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                java.lang.String OpenID = ((r45.hn0) fVar2).f376311h;
                kotlin.jvm.internal.o.f(OpenID, "OpenID");
                this.f143157g = OpenID;
                java.lang.String str3 = str2 != null ? str2 : "";
                x83.f[] fVarArr2 = x83.f.f452567d;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.g(21256, true, true, false, str3, 1, 0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoRegSuccessUI, nickName:");
                java.lang.String str4 = this.f143156f;
                if (str4 == null) {
                    kotlin.jvm.internal.o.o("nickName");
                    throw null;
                }
                sb6.append(str4);
                sb6.append(", openId:");
                sb6.append(this.f143157g);
                com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", sb6.toString());
                finish();
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI.class);
                java.lang.String str5 = this.f143154d;
                if (str5 == null) {
                    kotlin.jvm.internal.o.o("loginUrl");
                    throw null;
                }
                intent.putExtra("intent.key.login.url", str5);
                java.lang.String str6 = this.f143156f;
                if (str6 == null) {
                    kotlin.jvm.internal.o.o("nickName");
                    throw null;
                }
                intent.putExtra("intent.key.reg.nickname", str6);
                intent.putExtra("intent.key.reg.openid", this.f143157g);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            return;
        }
        gm0.j1.d().q(145, this);
        h11.e eVar = (h11.e) ((hv.f) m1Var);
        int M = eVar.M();
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "NetSceneBindMobileForReg, opCode:" + M);
        if (M == 23) {
            if (i18 != 0) {
                if (i18 == -41) {
                    db5.e1.i(this, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                    return;
                }
                if (i18 == -34) {
                    db5.e1.s(this, getString(com.tencent.mm.R.string.ag7), "");
                    return;
                }
                x51.r1 r1Var2 = new x51.r1(i17, i18, str);
                ((is.s) ((js.u0) i95.n0.c(js.u0.class))).getClass();
                if (new x51.f().c(this, r1Var2)) {
                    return;
                }
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                com.tencent.mm.ui.pc.a(this, i17, i18, str, 4);
                return;
            }
            return;
        }
        if (M != 24) {
            return;
        }
        if (i18 == -212) {
            java.lang.String O = eVar.O();
            java.lang.String N = eVar.N();
            if (com.tencent.mm.sdk.platformtools.t8.K0(O)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.KidsWatchRegMobileVerifyUI", "rebind but last nickname is empty");
            }
            java.lang.String str7 = this.f143158h;
            kotlin.jvm.internal.o.d(str7);
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "gotoRebindUI, regSessionId:" + str7 + ", lastNickName:" + O + ", lastHeadImgUrl:" + N);
            finish();
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI.class);
            java.lang.String str8 = this.f143154d;
            if (str8 == null) {
                kotlin.jvm.internal.o.o("loginUrl");
                throw null;
            }
            intent2.putExtra("intent.key.login.url", str8);
            java.lang.String str9 = this.f143156f;
            if (str9 == null) {
                kotlin.jvm.internal.o.o("nickName");
                throw null;
            }
            intent2.putExtra("intent.key.reg.nickname", str9);
            intent2.putExtra("intent.key.reg.last.nickname", O);
            intent2.putExtra("intent.key.reg.last.head.img.url", N);
            intent2.putExtra("intent.key.reg.mobile", this.f143155e);
            intent2.putExtra("intent.key.reg.session.id", str7);
            intent2.putExtra("intent.key.hasSetAvatar", this.f143161n);
            java.lang.String str10 = this.f143162o;
            if (str10 == null) {
                kotlin.jvm.internal.o.o("headImgFileID");
                throw null;
            }
            intent2.putExtra("intent.key.reg.head_img.file.id", str10);
            java.lang.String str11 = this.f143163p;
            if (str11 == null) {
                kotlin.jvm.internal.o.o("headImgAesKey");
                throw null;
            }
            intent2.putExtra("intent.key.reg.head_img.aes.key", str11);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRebindUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRebindUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i18 != -35) {
            if (i18 != 0) {
                x51.r1 r1Var3 = new x51.r1(i17, i18, str);
                ((is.s) ((js.u0) i95.n0.c(js.u0.class))).getClass();
                if (new x51.f().c(this, r1Var3)) {
                    return;
                }
                java.lang.String string = getString(com.tencent.mm.R.string.f492365g82, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                kotlin.jvm.internal.o.f(string, "getString(...)");
                db5.e1.s(getContext(), string, "");
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startExtReg, ");
            java.lang.String str12 = this.f143156f;
            if (str12 == null) {
                kotlin.jvm.internal.o.o("nickName");
                throw null;
            }
            sb7.append(str12);
            sb7.append(", ");
            sb7.append(this.f143161n);
            sb7.append(", ");
            sb7.append(this.f143158h);
            sb7.append(", 4");
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", sb7.toString());
            gm0.j1.d().a(5888, this);
            java.lang.String str13 = this.f143156f;
            if (str13 == null) {
                kotlin.jvm.internal.o.o("nickName");
                throw null;
            }
            java.lang.String str14 = this.f143160m + this.f143155e;
            boolean z17 = this.f143161n;
            java.lang.String str15 = this.f143154d;
            if (str15 == null) {
                kotlin.jvm.internal.o.o("loginUrl");
                throw null;
            }
            java.lang.String str16 = this.f143162o;
            if (str16 == null) {
                kotlin.jvm.internal.o.o("headImgFileID");
                throw null;
            }
            java.lang.String str17 = this.f143163p;
            if (str17 == null) {
                kotlin.jvm.internal.o.o("headImgAesKey");
                throw null;
            }
            x83.h hVar2 = new x83.h(str13, str14, 4, z17, str15, str16, str17);
            hVar2.H(this.f143158h);
            gm0.j1.d().g(hVar2);
            this.f143159i = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.g8h), true, true, new z83.u(hVar2, this));
        }
    }
}
