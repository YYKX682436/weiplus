package com.tencent.mm.plugin.kidswatch.ui.reg;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lal5/e0;", "Lkv/i0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class KidsWatchRegGetInfoUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, al5.e0, kv.i0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f143139t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143140d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143141e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143142f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143143g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143144h;

    /* renamed from: i, reason: collision with root package name */
    public int f143145i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f143147n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f143148o;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f143150q;

    /* renamed from: s, reason: collision with root package name */
    public final js.a1 f143152s;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f143146m = "+86";

    /* renamed from: p, reason: collision with root package name */
    public boolean f143149p = true;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f143151r = jz5.h.b(new z83.n(this));

    public KidsWatchRegGetInfoUI() {
        ((is.m1) ((js.b1) i95.n0.c(js.b1.class))).getClass();
        this.f143152s = new x51.c1();
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            V6();
            return;
        }
        T6().f443997i.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = T6().f443992d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        marginLayoutParams.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        T6().f443992d.setLayoutParams(marginLayoutParams);
        T6().f443998j.setPadding(T6().f443998j.getPaddingLeft(), T6().f443998j.getPaddingTop(), T6().f443998j.getPaddingRight(), i17);
        int height = T6().f444004p.getHeight();
        T6().f443998j.requestLayout();
        T6().f443998j.post(new z83.l(this, height));
    }

    public final w83.h T6() {
        return (w83.h) ((jz5.n) this.f143151r).getValue();
    }

    public final void U6(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI.class);
        java.lang.String str3 = this.f143140d;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str3);
        intent.putExtra("intent.key.reg.nickname", T6().f444002n.getText().toString());
        intent.putExtra("intent.key.reg.mobile", T6().f444001m.getText().toString());
        intent.putExtra("intent.key.reg.session.id", this.f143141e);
        intent.putExtra("intent.key.hasSetAvatar", this.f143147n);
        intent.putExtra("intent.key.reg.head_img.file.id", str);
        intent.putExtra("intent.key.reg.head_img.aes.key", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "get info page:(fileId:" + str + ") , (aesKey:" + str2 + ')');
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI", "gotoMobileVerifyCodePage", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegGetInfoUI", "gotoMobileVerifyCodePage", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        T6().f443997i.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = T6().f443992d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
        marginLayoutParams.topMargin = 0;
        T6().f443992d.setLayoutParams(marginLayoutParams);
        T6().f443998j.setPadding(T6().f443998j.getPaddingLeft(), T6().f443998j.getPaddingTop(), T6().f443998j.getPaddingRight(), 0);
        T6().f444004p.scrollBy(0, 0);
    }

    public final void W6() {
        if (!this.f143147n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "uploadHeadImg, gotoMobileVerifyCodePage, " + this.f143147n);
            U6("", "");
            return;
        }
        this.f143150q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        java.lang.String str = lp0.b.j() + "temp.avatar";
        ((com.tencent.mm.feature.avatar.k0) ((kv.l0) i95.n0.c(kv.l0.class))).getClass();
        new com.tencent.mm.modelavatar.q0(str, this).a();
    }

    @Override // kv.i0
    public void X(java.lang.String fileID, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(fileID, "fileID");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        ((ku5.t0) ku5.t0.f312615d).B(new z83.m(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "IImgUploadCallback, ok, fileId:" + fileID + ", aesKey:" + aesKey);
        U6(fileID, aesKey);
    }

    @Override // kv.i0
    public void d(int i17, int i18, java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).B(new z83.k(this));
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        com.tencent.mars.xlog.Log.e("MicroMsg.KidsWatchRegGetInfoUI", "upload head fail, errType:%s, errCode:%s, errMsg:%s", objArr);
        U6("", "");
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
        return com.tencent.mm.R.layout.f489190bn0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = T6().f443996h;
        java.lang.String string = getString(com.tencent.mm.R.string.g7n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kidsWatchHeadComponent.setTitle(string);
        T6().f443996h.f143110e.f443960c.setVisibility(0);
        T6().f443996h.setCloseBtnCallBack(new z83.b(this));
        T6().f443998j.e(this);
        T6().f443995g.setOnClickListener(new z83.c(this));
        T6().f443990b.setVisibility(0);
        T6().f443991c.setVisibility(8);
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = T6().f443991c;
        int b17 = i65.a.b(getContext(), 22);
        int b18 = i65.a.b(getContext(), 22);
        roundCornerImageView.f211406f = b17;
        roundCornerImageView.f211407g = b18;
        T6().f444002n.addTextChangedListener(new z83.d(this));
        T6().f444001m.addTextChangedListener(new z83.e(this));
        gm0.j1.e().g(new z83.f(this));
        com.tencent.mm.sdk.platformtools.t8.q(T6().f443999k, 250, 250, 250, 250);
        T6().f444003o.setEnabled(false);
        T6().f443999k.setOnCheckedChangeListener(new z83.g(this));
        java.lang.String string2 = getString(com.tencent.mm.R.string.g87);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = getString(com.tencent.mm.R.string.g88);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        int P = r26.n0.P(string2, string3, 0, false, 6, null);
        if (P < 0) {
            return;
        }
        int length = string3.length() + P;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string2);
        spannableStringBuilder.setSpan(new z83.h(this), P, length, 18);
        T6().f444000l.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        T6().f444000l.setClickable(true);
        T6().f444000l.setText(spannableStringBuilder);
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f143140d = stringExtra;
        T6().f444003o.setOnClickListener(new z83.j(this));
        a93.a aVar = a93.a.f2429a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.c(context, T6().f443994f, T6().f443992d);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "onActivityResult, requestCode:" + i17 + ", resultCode: " + i18);
        if (i17 == 30846) {
            if (i18 == -1) {
                bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
                if (bundleExtra == null || !kotlin.jvm.internal.o.b(bundleExtra.getString("go_next", ""), "get_reg_verify_code")) {
                    return;
                }
                W6();
                return;
            }
            return;
        }
        if (i17 != 30847) {
            android.graphics.Bitmap Vi = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent);
            this.f143148o = Vi;
            if (Vi != null) {
                T6().f443991c.setImageBitmap(this.f143148o);
                this.f143147n = true;
                T6().f443991c.setVisibility(0);
                T6().f443990b.setVisibility(8);
                return;
            }
            return;
        }
        bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
        if (bundleExtra == null || !kotlin.jvm.internal.o.b(bundleExtra.getString("go_next", ""), "agree_privacy")) {
            return;
        }
        this.f143149p = false;
        ((x51.c1) this.f143152s).a(this, new z83.a(this, this.f143146m + this.f143144h));
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

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        T6().f443998j.e(null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T6().f443998j.e(this);
        V6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f143150q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i18 == -75) {
            db5.e1.i(this, com.tencent.mm.R.string.f489998i0, com.tencent.mm.R.string.hv6);
            return;
        }
        if (m1Var instanceof hv.f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
            gm0.j1.d().q(145, this);
            h11.e eVar = (h11.e) ((hv.f) m1Var);
            int M = eVar.M();
            com.tencent.mm.network.v0 v0Var = eVar.f278071d;
            this.f143141e = ((h11.d) v0Var).f278069b.f342925a.A;
            if (M == 22) {
                if (i17 == 0 && i18 == 0) {
                    W6();
                    return;
                }
                if (i18 == -59 || i18 == -41) {
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        b17.c(this, null, null);
                        return;
                    } else {
                        db5.e1.i(this, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                        return;
                    }
                }
                this.f143144h = com.tencent.mm.sdk.platformtools.c5.h(this.f143144h);
                this.f143143g = this.f143146m + this.f143144h;
                this.f143141e = ((h11.d) v0Var).f278069b.f342925a.A;
                if (i18 != -36 && i18 != -35 && i18 != -3) {
                    if (i18 == -355) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "showBlockBySpam");
                        ((is.o1) ((js.c1) i95.n0.c(js.c1.class))).getClass();
                        x51.i1.c(this, str, 30846);
                        return;
                    } else if (i18 == -34) {
                        db5.e1.s(this, getString(com.tencent.mm.R.string.ag7), "");
                        return;
                    } else {
                        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
                        com.tencent.mm.ui.pc.a(this, i17, i18, str, 4);
                        return;
                    }
                }
                java.lang.String str2 = ((h11.d) v0Var).f278069b.f342925a.f373522t;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    kotlin.jvm.internal.o.d(str2);
                    int length = str2.length() - 1;
                    int i19 = 0;
                    boolean z17 = false;
                    while (i19 <= length) {
                        boolean z18 = kotlin.jvm.internal.o.i(str2.charAt(!z17 ? i19 : length), 32) <= 0;
                        if (z17) {
                            if (!z18) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z18) {
                            i19++;
                        } else {
                            z17 = true;
                        }
                    }
                    this.f143144h = str2.subSequence(i19, length + 1).toString();
                }
                if (i18 == -36) {
                    W6();
                    return;
                }
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    b18.c(getContext(), null, null);
                } else {
                    db5.e1.s(this, getString(com.tencent.mm.R.string.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), "");
                }
            }
        }
    }
}
