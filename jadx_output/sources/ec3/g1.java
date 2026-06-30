package ec3;

/* loaded from: classes9.dex */
public final class g1 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.ui.tools.c5 {
    public boolean A;
    public int B;
    public int C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Point f251010d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f251011e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f251012f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f251013g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f251014h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f251015i;

    /* renamed from: m, reason: collision with root package name */
    public long f251016m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.j f251017n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f251018o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f251019p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f251020q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f251021r;

    /* renamed from: s, reason: collision with root package name */
    public int f251022s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f251023t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f251024u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f251025v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f251026w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f251027x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f251028y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f251029z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251010d = new android.graphics.Point();
        this.f251011e = new java.util.ArrayList();
        this.f251024u = new java.util.LinkedHashMap();
        this.f251025v = "";
        this.f251026w = "";
        this.f251027x = "";
        this.f251028y = "";
        this.B = -1;
        this.D = "";
    }

    public static /* synthetic */ void d7(ec3.g1 g1Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        g1Var.c7(z17);
    }

    public static void e7(ec3.g1 g1Var, ec3.m mVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateRecommendList] itemCount: ");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = g1Var.f251012f;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("mSkinAdapter");
            throw null;
        }
        sb6.append(wxRecyclerAdapter.getItemCount());
        sb6.append("，animDirection：");
        sb6.append(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", sb6.toString());
        if (mVar != ec3.m.f251051e) {
            if (mVar == ec3.m.f251054h) {
                ec3.r1.f251087a.c(g1Var.X6(), ec3.m.f251053g, g1Var.getActivity(), new ec3.f1(g1Var, aVar));
            }
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = g1Var.f251012f;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyDataSetChanged();
            } else {
                kotlin.jvm.internal.o.o("mSkinAdapter");
                throw null;
            }
        }
    }

    public final boolean O6() {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.udo);
        if ((relativeLayout != null && relativeLayout.getVisibility() == 0) && this.f251020q) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ((ec3.l) pf5.z.f353948a.a(activity).a(ec3.l.class)).findViewById(com.tencent.mm.R.id.udp);
            if (relativeLayout2 != null && relativeLayout2.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean P6() {
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.udo);
        if ((relativeLayout != null && relativeLayout.getVisibility() == 0) && this.f251019p) {
            android.widget.LinearLayout Y6 = Y6();
            if (Y6 != null && Y6.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void Q6() {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f251013g;
        boolean z17 = false;
        if (mMEditText2 != null && mMEditText2.hasFocus()) {
            z17 = true;
        }
        if (!z17 || (mMEditText = this.f251013g) == null) {
            return;
        }
        mMEditText.clearFocus();
    }

    public final void R6(boolean z17) {
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHidePlaceOrder] needScrolltoTop：" + z17);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        if (luckyMoneyNewPrepareUI != null && (mMScrollView = luckyMoneyNewPrepareUI.f146285x) != null) {
            mMScrollView.postDelayed(new ec3.p(z17, this), 150L);
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        if (luckyMoneyNewPrepareUI2 != null) {
            luckyMoneyNewPrepareUI2.hideVKB();
        }
    }

    public final void S6() {
        boolean P6 = P6();
        boolean O6 = O6();
        boolean z17 = this.f251020q;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] isInRecommendStyle：" + P6 + ",isInEntranceStyle:" + O6 + "、needShowNewFunctionStyle：" + z17);
        if (O6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] only EntranceStyle, return ");
            return;
        }
        java.util.ArrayList arrayList = this.f251011e;
        ec3.r1 r1Var = ec3.r1.f251087a;
        if (z17 && P6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] has EntranceStyle, doHideRecommendLayout");
            ec3.q qVar = new ec3.q(this);
            this.f251019p = false;
            r1Var.c(Y6(), ec3.m.f251053g, getActivity(), new ec3.r(qVar));
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[12];
            objArr[0] = 19;
            objArr[1] = 0;
            objArr[2] = this.f251026w;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
            objArr[3] = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.s7() : null;
            objArr[4] = "";
            objArr[5] = "";
            objArr[6] = Z6();
            objArr[7] = java.lang.Integer.valueOf(arrayList.size());
            objArr[8] = this.f251027x;
            objArr[9] = 0;
            objArr[10] = "";
            objArr[11] = java.lang.Integer.valueOf(this.C);
            g0Var.d(18890, objArr);
            return;
        }
        if (!P6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doHideRecommendSkinLayout] has gone,return");
            return;
        }
        ec3.r1.a(r1Var, Y6(), 1.0f, 0.0f, null, 8, null);
        r1Var.b((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.udo), 0.0f, new ec3.s(this));
        this.f251019p = false;
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[12];
        objArr2[0] = 19;
        objArr2[1] = 0;
        objArr2[2] = this.f251026w;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        objArr2[3] = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.s7() : null;
        objArr2[4] = "";
        objArr2[5] = "";
        objArr2[6] = Z6();
        objArr2[7] = java.lang.Integer.valueOf(arrayList.size());
        objArr2[8] = this.f251027x;
        objArr2[9] = 0;
        objArr2[10] = "";
        objArr2[11] = java.lang.Integer.valueOf(this.C);
        g0Var2.d(18890, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T6(java.lang.String str) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        boolean z17 = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.f146256i2 : false;
        java.util.ArrayList arrayList = this.f251011e;
        int size = arrayList.size();
        boolean P6 = P6();
        boolean O6 = O6();
        int i17 = !com.tencent.mm.sdk.platformtools.t8.K0(str) ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] scene：" + i17 + "、isInRecommendStyle: " + P6 + "、isInEntranceStyle：" + O6 + "、isNewStyle：" + z17 + "、sizeCount：" + size);
        if (size <= 0 || !z17) {
            c7(true);
            S6();
            return;
        }
        if (i17 == 0) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f251013g;
            if ((mMEditText != null && mMEditText.hasFocus()) == false) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] do not has focus，do hide");
                c7(true);
                S6();
                return;
            }
        }
        if (P6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] has show recommend style，just update");
            U6(ec3.n.f251061e, i17, str, ec3.m.f251054h);
            this.B = i17;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[12];
            objArr[0] = 15;
            objArr[1] = 0;
            objArr[2] = this.f251026w;
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
            objArr[3] = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.s7() : null;
            objArr[4] = "";
            objArr[5] = "";
            objArr[6] = Z6();
            objArr[7] = java.lang.Integer.valueOf(arrayList.size());
            objArr[8] = this.f251027x;
            objArr[9] = 0;
            objArr[10] = this.f251025v;
            objArr[11] = java.lang.Integer.valueOf(this.C);
            g0Var.d(18890, objArr);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[12];
        objArr2[0] = 15;
        objArr2[1] = 0;
        objArr2[2] = this.f251026w;
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity3 : null;
        objArr2[3] = luckyMoneyNewPrepareUI3 != null ? luckyMoneyNewPrepareUI3.s7() : null;
        objArr2[4] = "";
        objArr2[5] = "";
        objArr2[6] = Z6();
        objArr2[7] = java.lang.Integer.valueOf(arrayList.size());
        objArr2[8] = this.f251027x;
        objArr2[9] = 0;
        objArr2[10] = this.f251025v;
        objArr2[11] = java.lang.Integer.valueOf(this.C);
        g0Var2.d(18890, objArr2);
        if (O6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] isInNewFunctionEntranceStyle, need hide newfunctionstyle，then show recommend style");
            androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            pf5.z zVar = pf5.z.f353948a;
            ec3.l lVar = (ec3.l) zVar.a(activity4).a(ec3.l.class);
            ec3.d0 d0Var = new ec3.d0(this, i17, str);
            androidx.appcompat.app.AppCompatActivity activity5 = lVar.getActivity();
            kotlin.jvm.internal.o.g(activity5, "activity");
            if (((ec3.g1) zVar.a(activity5).a(ec3.g1.class)).O6()) {
                ec3.r1.f251087a.c((android.widget.RelativeLayout) lVar.findViewById(com.tencent.mm.R.id.udp), ec3.m.f251053g, lVar.getActivity(), new ec3.b(d0Var));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doShowRecommendSkinLayout] NotInNewFunctionEntranceStyle, show recommend style");
            V6();
            android.widget.LinearLayout Y6 = Y6();
            if (Y6 != null) {
                Y6.postDelayed(new ec3.e0(this), 400L);
            }
            U6(ec3.n.f251061e, i17, str, ec3.m.f251051e);
        }
        this.B = i17;
    }

    public final void U6(ec3.n nVar, int i17, java.lang.String str, ec3.m mVar) {
        if (nVar != ec3.n.f251060d) {
            if (nVar == ec3.n.f251061e) {
                this.f251019p = true;
                if (i17 == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    android.widget.TextView W6 = W6();
                    if (W6 != null) {
                        W6.setText(str);
                    }
                } else if (i17 == 0 && this.B == 1) {
                    ec3.r1.f251087a.c(W6(), ec3.m.f251053g, getActivity(), new ec3.c1(this, null));
                }
                e7(this, mVar, null, 2, null);
                return;
            }
            return;
        }
        this.f251019p = true;
        android.widget.TextView W62 = W6();
        if (W62 != null) {
            W62.setText(getString(com.tencent.mm.R.string.f492439o80));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f251012f;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("mSkinAdapter");
            throw null;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        android.widget.LinearLayout Y6 = Y6();
        if (Y6 != null) {
            Y6.postDelayed(new ec3.g0(this), 70L);
        }
    }

    public final void V6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        android.widget.RelativeLayout relativeLayout = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.f146291z : null;
        float b17 = i65.a.b(getContext(), 8);
        if (relativeLayout != null) {
            relativeLayout.setOutlineProvider(new zl5.a(true, false, b17));
        }
        if (relativeLayout != null) {
            relativeLayout.setClipToOutline(true);
        }
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.udo);
        if (relativeLayout2 != null) {
            relativeLayout2.postDelayed(new ec3.i0(this), 150L);
        }
    }

    public final android.widget.TextView W6() {
        return (android.widget.TextView) findViewById(com.tencent.mm.R.id.udm);
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView X6() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.udv);
    }

    public final android.widget.LinearLayout Y6() {
        return (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.udx);
    }

    public final java.lang.String Z6() {
        return this.C == 1 ? this.D : a7();
    }

    public final java.lang.String a7() {
        android.text.Editable text;
        java.lang.String obj;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f251013g;
        return (mMEditText == null || (text = mMEditText.getText()) == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final void b7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openLiteAppForYuanBao] appid：" + str + "、path：" + str2 + "、query: " + str3 + "、miniversion：" + str4);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", str);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        bundle.putString("query", str3);
        bundle.putString("minVersion", str4);
        bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477876e0);
        bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new ec3.u0(this);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(getActivity(), bundle, true, false, sVar, new ec3.s0(this));
    }

    public final void c7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[resetRecommendData]");
        if (z17) {
            this.f251011e.clear();
            this.f251028y = "";
        }
        this.f251025v = "";
        this.f251027x = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[onDestroy]");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f251018o;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f251021r;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f251021r;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    @Override // com.tencent.mm.ui.tools.c5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w2(int r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.g1.w2(int, boolean):void");
    }
}
