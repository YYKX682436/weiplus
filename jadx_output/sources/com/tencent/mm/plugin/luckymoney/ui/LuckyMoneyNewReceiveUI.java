package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI;", "Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBaseUI;", "<init>", "()V", "com/tencent/mm/plugin/luckymoney/ui/zd", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes9.dex */
public final class LuckyMoneyNewReceiveUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final com.tencent.mm.plugin.luckymoney.ui.zd Q1 = new com.tencent.mm.plugin.luckymoney.ui.zd(null);
    public android.widget.ImageView A;
    public android.os.ResultReceiver A1;
    public android.view.View B;
    public int B1;
    public android.view.View C;
    public int C1;
    public com.tencent.mm.view.MMPAGView D;
    public long D1;
    public android.view.View E;
    public int E1;
    public com.tencent.mm.view.MMPAGView F;
    public com.tencent.mm.plugin.luckymoney.model.l6 F1;
    public ym5.w1 G;
    public boolean G1;
    public kotlinx.coroutines.y0 H;
    public boolean H1;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public float f146296J;
    public long J1;
    public float K;
    public boolean K1;
    public android.view.View L;
    public boolean L1;
    public com.tencent.mm.chatting.component.ListScrollPAGView M;
    public ym5.w1 N;
    public int O1;
    public android.view.ViewGroup P;
    public android.widget.RelativeLayout Q;
    public com.tencent.mm.emoji.view.BaseEmojiView R;
    public android.widget.TextView S;
    public android.widget.LinearLayout T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public at4.k1 X;
    public long Y;
    public com.tencent.mm.api.IEmojiInfo Z;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f146297g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f146298h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f146299i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f146300l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146301m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f146302n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f146303o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f146304p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f146305p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f146306p1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f146307q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f146308r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f146309s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f146310t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f146311u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f146312v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f146313w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f146314x;

    /* renamed from: x0, reason: collision with root package name */
    public int f146315x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f146316x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f146317y;

    /* renamed from: y0, reason: collision with root package name */
    public int f146318y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f146319y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f146320z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f146321z1;
    public final java.util.Set I1 = new java.util.HashSet();
    public final com.tencent.mm.feature.emoji.api.q5 M1 = new com.tencent.mm.plugin.luckymoney.ui.he(this);
    public int N1 = 3;
    public final com.tencent.mm.modelbase.u0 P1 = new com.tencent.mm.plugin.luckymoney.ui.ae(this);

    static {
        new java.util.HashMap();
    }

    public static final void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        luckyMoneyNewReceiveUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "[RootView-closePage]");
        if (luckyMoneyNewReceiveUI.isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "[RootView-closePage] isFinishing");
            return;
        }
        if (luckyMoneyNewReceiveUI.L1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "[RootView-closePage] hasFinish");
            return;
        }
        if (luckyMoneyNewReceiveUI.K1) {
            android.os.ResultReceiver resultReceiver = luckyMoneyNewReceiveUI.A1;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            luckyMoneyNewReceiveUI.finish();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            long j17 = luckyMoneyNewReceiveUI.D1;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g0Var.d(22105, 4, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() - j17) / 1000));
            return;
        }
        luckyMoneyNewReceiveUI.L1 = true;
        android.view.View view = luckyMoneyNewReceiveUI.f146313w;
        com.tencent.mm.plugin.luckymoney.ui.be beVar = new com.tencent.mm.plugin.luckymoney.ui.be(luckyMoneyNewReceiveUI);
        if (view == null) {
            return;
        }
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(250L);
        scaleAnimation.setInterpolator(new android.view.animation.AnticipateInterpolator(1.5f));
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(beVar);
        view.startAnimation(scaleAnimation);
    }

    public final void W6(java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.model.o5 f6Var;
        android.view.ViewGroup viewGroup;
        java.lang.String str2 = str == null || str.length() == 0 ? "" : str;
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.t(this.f146306p1)) {
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var = this.F1;
            int i17 = l6Var != null ? l6Var.f145418h : 0;
            int i18 = l6Var != null ? l6Var.f145419i : 0;
            java.lang.String str3 = l6Var != null ? l6Var.f145420m : null;
            java.lang.String str4 = l6Var != null ? l6Var.f145421n : null;
            java.lang.String l17 = com.tencent.mm.plugin.luckymoney.model.m5.l();
            java.lang.String l18 = c01.z1.l();
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var2 = this.F1;
            f6Var = new com.tencent.mm.plugin.luckymoney.model.g6(i17, i18, str3, str4, l17, l18, stringExtra, "v1.0", l6Var2 != null ? l6Var2.P : null, str2);
        } else if (this.f146316x1 == 3) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_live_id");
            java.lang.String str5 = stringExtra2 == null ? "" : stringExtra2;
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_live_attach");
            java.lang.String str6 = stringExtra3 == null ? "" : stringExtra3;
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var3 = this.F1;
            int i19 = l6Var3 != null ? l6Var3.f145418h : 0;
            int i27 = l6Var3 != null ? l6Var3.f145419i : 0;
            java.lang.String str7 = l6Var3 != null ? l6Var3.f145420m : null;
            java.lang.String str8 = l6Var3 != null ? l6Var3.f145421n : null;
            java.lang.String l19 = com.tencent.mm.plugin.luckymoney.model.m5.l();
            java.lang.String l27 = c01.z1.l();
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var4 = this.F1;
            f6Var = new yb3.b(i19, i27, str7, str8, l19, l27, stringExtra, "v1.0", l6Var4 != null ? l6Var4.P : null, str2, str5, str6, this.B1);
        } else {
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var5 = this.F1;
            int i28 = l6Var5 != null ? l6Var5.f145418h : 0;
            int i29 = l6Var5 != null ? l6Var5.f145419i : 0;
            java.lang.String str9 = l6Var5 != null ? l6Var5.f145420m : null;
            java.lang.String str10 = l6Var5 != null ? l6Var5.f145421n : null;
            java.lang.String l28 = com.tencent.mm.plugin.luckymoney.model.m5.l();
            java.lang.String l29 = c01.z1.l();
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var6 = this.F1;
            f6Var = new com.tencent.mm.plugin.luckymoney.model.f6(i28, i29, str9, str10, l28, l29, stringExtra, "v1.0", l6Var6 != null ? l6Var6.P : null, str2);
        }
        if (c01.e2.L(stringExtra)) {
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_emoji_md5");
            java.lang.String str11 = stringExtra4 != null ? stringExtra4 : "";
            f6Var.f145516g = new com.tencent.mm.plugin.luckymoney.model.y3(true ^ com.tencent.mm.sdk.platformtools.t8.K0(str11), str11);
            gb3.n.a(2);
        }
        doSceneProgress(f6Var, false);
        android.widget.Button button = this.f146303o;
        if (button != null) {
            button.setVisibility(8);
        }
        android.widget.ImageView imageView = this.f146304p;
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var7 = this.F1;
        com.tencent.mm.plugin.luckymoney.model.m5.G(imageView, l6Var7 != null ? l6Var7.f145432y : 0);
        if (this.K1 || (viewGroup = this.P) == null) {
            return;
        }
        viewGroup.setOnTouchListener(new com.tencent.mm.plugin.luckymoney.ui.ce());
    }

    public final void X6(android.view.View view, java.lang.String str) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 8, 25561);
    }

    public final int Y6() {
        return kotlin.jvm.internal.o.b(c01.z1.r(), this.W) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0472  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.Z6(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7(com.tencent.mm.plugin.luckymoney.model.f6 r22) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.a7(com.tencent.mm.plugin.luckymoney.model.f6):void");
    }

    public final void b7(android.content.Intent intent) {
        intent.putExtra("key_detail_envelope_url", getIntent().getStringExtra("key_detail_envelope_url"));
        intent.putExtra("key_detail_envelope_md5", getIntent().getStringExtra("key_detail_envelope_md5"));
        intent.putExtra("key_detail_envelope_dynamic_url", getIntent().getStringExtra("key_detail_envelope_dynamic_url"));
        intent.putExtra("key_detail_envelope_dynamic_md5", getIntent().getStringExtra("key_detail_envelope_dynamic_md5"));
        intent.putExtra("key_detail_envelope_atmosphere_dynamic_url", getIntent().getStringExtra("key_detail_envelope_atmosphere_dynamic_url"));
        intent.putExtra("key_detail_envelope_atmosphere_dynamic_y", this.f146296J);
        intent.putExtra("key_detail_envelope_atmosphere_dynamic_width", this.K);
        intent.putExtra("key_about_url", getIntent().getStringExtra("key_about_url"));
        intent.putExtra("key_store_action_type", getIntent().getStringExtra("key_store_action_type"));
        intent.putExtra("key_story_url", getIntent().getStringExtra("key_story_url"));
        intent.putExtra("key_cropname", getIntent().getStringExtra("key_cropname"));
        intent.putExtra("key_packet_id", getIntent().getStringExtra("key_packet_id"));
        intent.putExtra("key_receive_envelope_widget_status_flag", getIntent().getIntExtra("key_receive_envelope_widget_status_flag", 0));
        intent.putExtra("key_receive_envelope_fission_info", getIntent().getStringExtra("key_receive_envelope_fission_info"));
        intent.putExtra("key_packet_create_time", getIntent().getIntExtra("key_packet_create_time", 0));
        intent.putExtra("key_packet_source", getIntent().getIntExtra("key_packet_source", 0));
        intent.putExtra("key_has_story", getIntent().getBooleanExtra("key_has_story", false));
        intent.putExtra("key_material_flag", this.f146318y0);
        intent.putExtra("key_from", getIntent().getIntExtra("key_from", 0));
        intent.putExtra("key_live_id", getIntent().getStringExtra("key_live_id"));
        intent.putExtra("key_live_attach", getIntent().getStringExtra("key_live_attach"));
        intent.putExtra("key_live_anchor_type", getIntent().getIntExtra("key_live_anchor_type", 0));
    }

    public final void c7() {
        jz5.f0 f0Var;
        android.widget.Button button = this.f146303o;
        if (button != null) {
            fo3.s.INSTANCE.Tc(button.getId());
            java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (o17 != null && o17.length() > 0 && (kotlin.jvm.internal.o.b(o17, "zh_CN") || kotlin.jvm.internal.o.b(o17, "zh_TW") || kotlin.jvm.internal.o.b(o17, "zh_HK"))) {
                return;
            }
            button.setBackgroundResource(com.tencent.mm.R.drawable.amv);
            button.setText(com.tencent.mm.R.string.gmm);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "[renderOpenBtn] is null");
        }
    }

    public final void d7(ml2.f5 f5Var, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146319y1) || i95.n0.c(c50.c1.class) == null) {
            return;
        }
        ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).Ek(f5Var, ml2.e5.f327389e, z17, 0);
    }

    public final void e7() {
        com.tencent.mm.plugin.luckymoney.model.l6 l6Var = this.F1;
        if (l6Var == null) {
            return;
        }
        int i17 = 0;
        if (l6Var != null && l6Var.f145426s == 5) {
            d7(ml2.f5.f327463n, true);
            ml2.d5[] d5VarArr = ml2.d5.f327367d;
            i17 = 2;
        } else {
            if (l6Var != null && l6Var.f145427t == 1) {
                d7(ml2.f5.f327462m, true);
                ml2.d5[] d5VarArr2 = ml2.d5.f327367d;
                i17 = 1;
            } else {
                if (l6Var != null && l6Var.f145426s == 4) {
                    d7(ml2.f5.f327461i, true);
                    ml2.d5[] d5VarArr3 = ml2.d5.f327367d;
                } else {
                    i17 = -1;
                }
            }
        }
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("red_packet_err_type", java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_red_packet_hold_up", this.B, arrayMap, 25561);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    public final void f7() {
        if (this.f146316x1 == 3) {
            android.view.ViewGroup viewGroup = this.P;
            if (viewGroup != null) {
                viewGroup.setBackgroundResource(com.tencent.mm.R.drawable.amc);
            }
            com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.j5q);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (com.tencent.mm.ui.bk.C()) {
                android.view.ViewGroup viewGroup2 = this.P;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundResource(com.tencent.mm.R.color.BW_0_Alpha_0_8);
                }
                com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_8));
            } else {
                android.view.ViewGroup viewGroup3 = this.P;
                if (viewGroup3 != null) {
                    viewGroup3.setBackgroundResource(com.tencent.mm.R.color.f479354x8);
                }
                com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.f479354x8));
            }
            if (this.H1) {
                com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
            }
            if (!this.K1) {
                android.view.View view = this.f146312v;
                if (view != null) {
                    view.setClickable(true);
                }
                android.view.ViewGroup viewGroup4 = this.P;
                if (viewGroup4 != null) {
                    viewGroup4.setOnTouchListener(new com.tencent.mm.plugin.luckymoney.ui.cf(this));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "[setActivityBg] hasEnvelopeFullAtmos：" + this.H1);
        }
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(contentView, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, com.tencent.mm.R.anim.b_);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if ((r2 != null && r2.I1()) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7(boolean r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.g7(boolean):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bv6;
    }

    public final void h7(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = mMActivity.getString(com.tencent.mm.R.string.l0g);
        }
        db5.e1.G(mMActivity, str, null, false, new com.tencent.mm.plugin.luckymoney.ui.df(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.j69);
        if (!(findViewById instanceof android.view.View)) {
            findViewById = null;
        }
        this.f146312v = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ude);
        if (!(findViewById2 instanceof android.view.View)) {
            findViewById2 = null;
        }
        this.f146313w = findViewById2;
        this.P = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j66);
        this.f146297g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j6u);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.j67);
        this.f146298h = findViewById3 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById3 : null;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.j68);
        this.f146299i = findViewById4 instanceof android.widget.TextView ? (android.widget.TextView) findViewById4 : null;
        this.f146301m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6_);
        this.f146302n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6c);
        this.Q = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.j0r);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.j0n);
        this.R = findViewById5 instanceof com.tencent.mm.emoji.view.BaseEmojiView ? (com.tencent.mm.emoji.view.BaseEmojiView) findViewById5 : null;
        this.S = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6t);
        this.T = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j2g);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.j6g);
        this.f146303o = findViewById6 instanceof android.widget.Button ? (android.widget.Button) findViewById6 : null;
        this.f146304p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6h);
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.j6d);
        this.f146309s = findViewById7 instanceof android.widget.TextView ? (android.widget.TextView) findViewById7 : null;
        this.f146307q = findViewById(com.tencent.mm.R.id.j6e);
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.iy6);
        this.f146308r = findViewById8 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById8 : null;
        this.f146317y = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5v);
        this.f146320z = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5w);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5z);
        this.B = findViewById(com.tencent.mm.R.id.f485811j60);
        this.C = findViewById(com.tencent.mm.R.id.j5y);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.j5x);
        this.D = mMPAGView;
        if (mMPAGView != null) {
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        this.E = findViewById(com.tencent.mm.R.id.f485813j62);
        com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f485812j61);
        this.F = mMPAGView2;
        if (mMPAGView2 != null) {
            mMPAGView2.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        this.L = findViewById(com.tencent.mm.R.id.quu);
        this.M = (com.tencent.mm.chatting.component.ListScrollPAGView) findViewById(com.tencent.mm.R.id.qut);
        this.f146310t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6i);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.j6f);
        this.f146311u = weImageView;
        if (weImageView != null) {
            weImageView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.de(this));
        }
        if (this.f146316x1 == 3) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f146311u;
            if (weImageView2 != null) {
                weImageView2.setEnableColorFilter(true);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f146311u;
            if (weImageView3 != null) {
                weImageView3.setImageResource(com.tencent.mm.R.raw.icons_outlined_close2);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f146311u;
            if (weImageView4 != null) {
                weImageView4.setIconColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
            }
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f146311u;
            if (weImageView5 != null) {
                weImageView5.setEnableColorFilter(false);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f146311u;
            if (weImageView6 != null) {
                weImageView6.setImageResource(com.tencent.mm.R.drawable.alt);
            }
        }
        android.widget.TextView textView = this.S;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.ee(this));
        }
        android.widget.TextView textView2 = this.f146301m;
        if (textView2 != null) {
            textView2.setLines(2);
        }
        android.widget.TextView textView3 = this.f146301m;
        if (textView3 != null) {
            androidx.core.widget.a0.c(textView3, 1);
        }
        i65.a.f(getContext(), com.tencent.mm.R.dimen.a4t);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.a4t);
        android.view.View contentView = getContentView();
        if (contentView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        showLoading();
        c7();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String queryParameter;
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.luckymoney.model.o5 l6Var;
        long j17;
        long j18;
        fixStatusbar(true);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        this.K1 = ih.a.h("clicfg_lucky_money_rece_close_switch", false);
        this.D1 = android.os.SystemClock.elapsedRealtime();
        java.lang.String stringExtra = getIntent().getStringExtra("key_native_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.V = stringExtra;
        getIntent().getStringExtra("key_cropname");
        this.Y = getIntent().getLongExtra("key_msgid", 0L);
        this.f146318y0 = getIntent().getIntExtra("key_material_flag", 0);
        this.f146306p1 = getIntent().getIntExtra("scene_id", 1002);
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f146300l1 = stringExtra2;
        this.f146316x1 = getIntent().getIntExtra("key_from", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_live_id");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f146319y1 = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_live_attach");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f146321z1 = stringExtra4;
        this.A1 = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_open_result_receiver");
        this.B1 = getIntent().getIntExtra("key_live_anchor_type", 0);
        this.C1 = getIntent().getIntExtra("key_swipe", 0);
        initView();
        java.lang.String str = this.V;
        if (str == null) {
            str = "";
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse != null) {
            try {
                queryParameter = parse.getQueryParameter("sendid");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "[onCreate] parse uri fail:  " + com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        } else {
            queryParameter = null;
        }
        this.U = queryParameter;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "[onCreate] mSendId :" + this.U + " ， needClosePageAnimation：" + this.K1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCreate] nativeUrl： ");
        sb6.append(this.V);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", sb6.toString());
        at4.k1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().z0(this.V);
        this.X = z07;
        if (z07 != null) {
            if (z07 != null) {
                j18 = z07.field_receiveAmount;
                j17 = 0;
            } else {
                j17 = 0;
                j18 = 0;
            }
            if (j18 > j17) {
                if (java.lang.System.currentTimeMillis() - (z07 != null ? z07.field_receiveTime : 0L) < 86400000) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onCreate] use cache to detail，receiveTime: ");
                    at4.k1 k1Var = this.X;
                    sb7.append(k1Var != null ? java.lang.Long.valueOf(k1Var.field_receiveTime) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", sb7.toString());
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
                    intent.putExtra("key_swipe", this.C1);
                    at4.k1 k1Var2 = this.X;
                    intent.putExtra("key_native_url", k1Var2 != null ? k1Var2.field_mNativeUrl : null);
                    intent.putExtra("key_sendid", this.U);
                    intent.putExtra("key_anim_slide", true);
                    intent.putExtra("key_lucky_money_can_received", true);
                    intent.putExtra("key_username", getIntent().getStringExtra("key_username"));
                    intent.putExtra("key_from_username", getIntent().getStringExtra("key_from_username"));
                    intent.putExtra("scene_id", this.f146306p1);
                    intent.putExtra("key_msgid", this.Y);
                    b7(intent);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                    return;
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.U)) {
            z17 = false;
            z18 = true;
            finish();
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "[onCreate] sendid null & finish");
        } else {
            int P = com.tencent.mm.sdk.platformtools.t8.P(parse != null ? parse.getQueryParameter("channelid") : null, 1);
            this.W = parse != null ? parse.getQueryParameter("sendusername") : null;
            java.lang.String stringExtra5 = getIntent().getStringExtra("key_username");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            if (com.tencent.mm.plugin.luckymoney.model.m5.t(this.f146306p1)) {
                l6Var = new com.tencent.mm.plugin.luckymoney.model.m6(1, P, this.U, this.V, getIntent().getIntExtra("key_way", 0), "v1.0");
            } else if (this.f146316x1 == 3) {
                java.lang.String stringExtra6 = getIntent().getStringExtra("key_live_id");
                java.lang.String str2 = stringExtra6 == null ? "" : stringExtra6;
                java.lang.String stringExtra7 = getIntent().getStringExtra("key_live_attach");
                l6Var = new yb3.e(1, P, this.U, this.V, getIntent().getIntExtra("key_way", 0), "v1.0", stringExtra5, str2, stringExtra7 == null ? "" : stringExtra7, this.B1);
            } else {
                l6Var = new com.tencent.mm.plugin.luckymoney.model.l6(1, P, this.U, this.V, getIntent().getIntExtra("key_way", 0), "v1.0", stringExtra5);
            }
            if (c01.e2.L(stringExtra5)) {
                java.lang.String stringExtra8 = getIntent().getStringExtra("key_emoji_md5");
                z18 = true;
                l6Var.f145516g = new com.tencent.mm.plugin.luckymoney.model.x3(!com.tencent.mm.sdk.platformtools.t8.K0(r3), stringExtra8 != null ? stringExtra8 : "");
            } else {
                z18 = true;
            }
            z17 = false;
            doSceneProgress(l6Var, false);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f146314x;
            if (u3Var != null) {
                u3Var.show();
            }
        }
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.ie(this));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.LuckyMoneyNotHookReceiveUI)).Rj(this, iy1.a.FinderLive);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.U)) {
            return;
        }
        ml2.f5 f5Var = ml2.f5.f327459g;
        if (this.f146316x1 == 3) {
            z17 = z18;
        }
        d7(f5Var, z17);
        if (this.f146316x1 == 3) {
            java.util.HashMap hashMap = new java.util.HashMap();
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            hashMap.put("comment_scene", a52.a.f1584l);
            hashMap.put("finder_username", this.f146300l1);
            hashMap.put("live_id", this.f146319y1);
            hashMap.put("feed_id", getIntent().getStringExtra("key_live_feed_id"));
            hashMap.put("session_buffer", getIntent().getStringExtra("key_live_session_buff"));
            hashMap.put("live_start_time", java.lang.Long.valueOf(getIntent().getLongExtra("key_live_start_time", 0L)));
            hashMap.put("live_time", java.lang.Long.valueOf(getIntent().getLongExtra("key_live_now_live_time", 0L)));
            hashMap.put("enter_session_id", java.lang.Long.valueOf(getIntent().getLongExtra("key_live_enter_session_id", 0L)));
            hashMap.put("behaviour_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            hashMap.put("finder_context_id", b52.b.b());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            hashMap.put("finder_tab_context_id", b52.b.c());
            hashMap.put("cur_red_packet_source", java.lang.Integer.valueOf(this.B1));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, hashMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 25561);
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        super.onDestroy();
        int i17 = this.O1;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f59936d = 9L;
            redEnvSendWithEmoticonClickStruct.k();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f146314x;
        if (u3Var2 != null) {
            if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = this.f146314x) != null) {
                u3Var.dismiss();
            }
        }
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(null);
        gm0.j1.n().f273288b.q(697, this.P1);
        java.util.Set set = this.I1;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            ((c01.k7) c01.n8.a()).f((java.lang.String) it.next());
        }
        ((java.util.HashSet) set).clear();
        com.tencent.mm.view.MMPAGView mMPAGView = this.D;
        if (mMPAGView != null && mMPAGView.getVisibility() == 0) {
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.D;
            if (mMPAGView2 != null) {
                mMPAGView2.n();
            }
            com.tencent.mm.view.MMPAGView mMPAGView3 = this.D;
            if (mMPAGView3 != null) {
                mMPAGView3.i(this.G);
            }
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = this.F;
        if (mMPAGView4 != null && mMPAGView4.getVisibility() == 0) {
            com.tencent.mm.view.MMPAGView mMPAGView5 = this.F;
            if (mMPAGView5 != null) {
                mMPAGView5.n();
            }
            com.tencent.mm.view.MMPAGView mMPAGView6 = this.F;
            if (mMPAGView6 != null) {
                mMPAGView6.i(this.G);
            }
        }
        this.G = null;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.M;
        if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = this.M;
            if (listScrollPAGView2 != null) {
                listScrollPAGView2.n();
            }
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView3 = this.M;
            if (listScrollPAGView3 != null) {
                listScrollPAGView3.i(this.N);
            }
        }
        this.N = null;
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.H);
        this.H = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x05eb, code lost:
    
        if ((r1 != null && r1.f145426s == 4) == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0601, code lost:
    
        if ((r1 != null && r1.f145426s == 4) == false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0622, code lost:
    
        if ((r1 != null && r1.S) != false) goto L488;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x062a  */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v127, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v81, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v85, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v124 */
    /* JADX WARN: Type inference failed for: r3v152 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v58, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v51 */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r25, int r26, java.lang.String r27, com.tencent.mm.modelbase.m1 r28) {
        /*
            Method dump skipped, instructions count: 2653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }

    public final void showLoading() {
        this.f146314x = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.ef(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.luckymoney.ui.ff.class);
        set.add(com.tencent.mm.plugin.luckymoney.ui.ud.class);
    }
}
