package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(7)
@gm0.a2
@ul5.d(0)
/* loaded from: classes9.dex */
public class LuckyMoneyNotHookReceiveUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {
    public static final /* synthetic */ int L1 = 0;
    public android.view.View A;
    public android.view.View B;
    public long B1;
    public com.tencent.mm.view.MMPAGView C;
    public android.view.View D;
    public com.tencent.mm.plugin.luckymoney.model.l6 D1;
    public com.tencent.mm.view.MMPAGView E;
    public ym5.w1 F;
    public kotlinx.coroutines.y0 G;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f146467J;
    public com.tencent.mm.chatting.component.ListScrollPAGView K;
    public ym5.w1 L;
    public android.view.ViewGroup M;
    public android.widget.RelativeLayout N;
    public com.tencent.mm.emoji.view.BaseEmojiView P;
    public android.widget.TextView Q;
    public android.widget.LinearLayout R;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public long W;
    public com.tencent.mm.api.IEmojiInfo X;
    public java.lang.String Y;
    public int Z;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f146468g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f146469h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f146470i;

    /* renamed from: l1, reason: collision with root package name */
    public int f146471l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f146472m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f146473n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f146474o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f146475p;

    /* renamed from: p0, reason: collision with root package name */
    public int f146476p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f146477p1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f146478q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f146479r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f146480s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f146481t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f146482u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f146483v;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f146485x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f146486x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f146487x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f146488y;

    /* renamed from: y0, reason: collision with root package name */
    public int f146489y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.os.ResultReceiver f146490y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f146491z;

    /* renamed from: z1, reason: collision with root package name */
    public int f146492z1;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f146484w = null;
    public float H = 0.0f;
    public float I = 0.0f;
    public at4.k1 V = null;
    public int A1 = 0;
    public int C1 = 0;
    public boolean E1 = false;
    public final java.util.Set F1 = new java.util.HashSet();
    public long G1 = 0;
    public final com.tencent.mm.feature.emoji.api.q5 H1 = new com.tencent.mm.plugin.luckymoney.ui.lj(this);
    public int I1 = 3;
    public int J1 = 0;
    public final com.tencent.mm.modelbase.u0 K1 = new com.tencent.mm.plugin.luckymoney.ui.dk(this);

    static {
        new java.util.HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static void b7(r45.wv3 wv3Var, android.view.View view, com.tencent.mm.view.MMPAGView mMPAGView, android.view.View view2, com.tencent.mm.view.MMPAGView mMPAGView2, ym5.w1 w1Var, kotlinx.coroutines.y0 y0Var) {
        ?? r86;
        r45.xv3 xv3Var = wv3Var.f389501g;
        if (xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i17 = wv3Var.f389501g.D;
        mMPAGView.a(w1Var);
        mMPAGView.setRepeatCount(0);
        mMPAGView.setScaleMode(3);
        mMPAGView2.a(w1Var);
        mMPAGView2.setRepeatCount(0);
        mMPAGView2.setScaleMode(3);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i17 == 2) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 1, y0Var, new com.tencent.mm.plugin.luckymoney.ui.sj(currentTimeMillis, view2, mMPAGView2, wv3Var));
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        if (view == 0) {
            r86 = 1;
        } else {
            r86 = 1;
            view.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (view != 0) {
            view.setClipToOutline(r86);
        }
        com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, r86, y0Var, new com.tencent.mm.plugin.luckymoney.ui.uj(currentTimeMillis, view2, mMPAGView, wv3Var, view));
    }

    public void V6(java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.model.o5 f6Var;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        if (com.tencent.mm.plugin.luckymoney.model.m5.t(this.f146489y0)) {
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var = this.D1;
            f6Var = new com.tencent.mm.plugin.luckymoney.model.g6(l6Var.f145418h, l6Var.f145419i, l6Var.f145420m, l6Var.f145421n, com.tencent.mm.plugin.luckymoney.model.m5.l(), c01.z1.l(), stringExtra, "v1.0", this.D1.P, str2);
        } else if (this.f146471l1 == 3) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_live_id");
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_live_attach");
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var2 = this.D1;
            f6Var = new yb3.b(l6Var2.f145418h, l6Var2.f145419i, l6Var2.f145420m, l6Var2.f145421n, com.tencent.mm.plugin.luckymoney.model.m5.l(), c01.z1.l(), stringExtra, "v1.0", this.D1.P, str2, stringExtra2, stringExtra3, this.f146492z1);
        } else {
            com.tencent.mm.plugin.luckymoney.model.l6 l6Var3 = this.D1;
            f6Var = new com.tencent.mm.plugin.luckymoney.model.f6(l6Var3.f145418h, l6Var3.f145419i, l6Var3.f145420m, l6Var3.f145421n, com.tencent.mm.plugin.luckymoney.model.m5.l(), c01.z1.l(), stringExtra, "v1.0", this.D1.P, str2);
        }
        if (c01.e2.L(stringExtra)) {
            f6Var.f145516g = new com.tencent.mm.plugin.luckymoney.model.y3(!com.tencent.mm.sdk.platformtools.t8.K0(r1), getIntent().getStringExtra("key_emoji_md5"));
            gb3.n.a(2);
        }
        doSceneProgress(f6Var, false);
        this.f146474o.setVisibility(8);
        com.tencent.mm.plugin.luckymoney.model.m5.G(this.f146475p, this.D1.f145432y);
    }

    public final void W6(android.view.View view, java.lang.String str) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 8, 25561);
    }

    public final int X6() {
        return c01.z1.r().equals(this.U) ? 1 : 0;
    }

    public final void Y6(com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = f6Var.f145280h;
        if (e1Var.A != 2) {
            this.f146474o.setBackgroundResource(com.tencent.mm.R.drawable.caz);
            this.f146474o.setText(com.tencent.mm.R.string.gmj);
            this.f146474o.setOnClickListener(null);
            this.f146474o.setVisibility(8);
            this.f146475p.setVisibility(8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.L)) {
                this.f146472m.setVisibility(8);
            } else {
                this.f146472m.setText(e1Var.L);
                this.f146472m.setVisibility(0);
            }
            this.f146473n.setText(e1Var.f145236f);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f146478q.getLayoutParams();
            layoutParams.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 30.0f);
            this.f146478q.setLayoutParams(layoutParams);
            if (c01.z1.r().equals(this.U) || e1Var.f145234d == 1) {
                android.view.View view = this.f146478q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f146478q.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.yj(this, f6Var));
                this.f146479r.setVisibility(8);
            } else {
                android.view.View view2 = this.f146478q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f146479r.setVisibility(8);
            }
            if (e1Var.f145234d == 1 && e1Var.f145235e == 4) {
                com.tencent.mm.plugin.luckymoney.model.m5.t(this.f146489y0);
            }
            android.os.ResultReceiver resultReceiver = this.f146490y1;
            if (resultReceiver != null) {
                resultReceiver.send(1, null);
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
        intent.putExtra("key_swipe", this.A1);
        intent.putExtra("key_lucky_intercept_win_after", f6Var.f145291v);
        intent.putExtra("key_lucky_money_can_received", true);
        try {
            gb3.l.b(this.S, f6Var.f145280h);
            intent.putExtra("key_jump_from", 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyNotHookReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e17.getLocalizedMessage());
        }
        intent.putExtra("key_native_url", f6Var.f145282m);
        intent.putExtra("key_sendid", f6Var.f145281i);
        Z6(intent);
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0) > 0) {
            intent.putExtra("play_sound", true);
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = f6Var.f145285p;
        if (realnameGuideHelper != null) {
            intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
        }
        intent.putExtra("key_username", getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", this.f146489y0);
        intent.putExtra("key_emoji_switch", f6Var.f145287r);
        intent.putExtra("key_detail_emoji_md5", f6Var.f145288s);
        intent.putExtra("key_detail_emoji_type", f6Var.f145289t);
        intent.putExtra("key_msgid", this.W);
        intent.putExtra("scene_id", this.f146489y0);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        if (!c01.e2.L(stringExtra)) {
            at4.k1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().z0(this.T);
            if (z07 == null) {
                z07 = new at4.k1();
            }
            z07.field_mNativeUrl = this.T;
            z07.field_receiveAmount = e1Var.f145245q;
            z07.field_receiveTime = java.lang.System.currentTimeMillis();
            z07.field_hbStatus = e1Var.f145235e;
            z07.field_receiveStatus = e1Var.A;
            z07.field_sender = stringExtra;
            z07.field_sendId = this.S;
            z07.field_exclusiveUsername = getIntent().getStringExtra("key_exclusive_username");
            if (z07.field_receiveAmount > 0) {
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(z07);
            }
        }
        android.os.ResultReceiver resultReceiver2 = this.f146490y1;
        if (resultReceiver2 != null) {
            resultReceiver2.send(-1, null);
        }
    }

    public final void Z6(android.content.Intent intent) {
        intent.putExtra("key_detail_envelope_url", getIntent().getStringExtra("key_detail_envelope_url"));
        intent.putExtra("key_detail_envelope_md5", getIntent().getStringExtra("key_detail_envelope_md5"));
        intent.putExtra("key_detail_envelope_dynamic_url", getIntent().getStringExtra("key_detail_envelope_dynamic_url"));
        intent.putExtra("key_detail_envelope_dynamic_md5", getIntent().getStringExtra("key_detail_envelope_dynamic_md5"));
        intent.putExtra("key_detail_envelope_atmosphere_dynamic_url", getIntent().getStringExtra("key_detail_envelope_atmosphere_dynamic_url"));
        intent.putExtra("key_detail_envelope_atmosphere_dynamic_y", this.H);
        intent.putExtra("key_detail_envelope_atmosphere_dynamic_width", this.I);
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
        intent.putExtra("key_material_flag", this.f146476p0);
        intent.putExtra("key_from", getIntent().getIntExtra("key_from", 0));
        intent.putExtra("key_live_id", getIntent().getStringExtra("key_live_id"));
        intent.putExtra("key_live_attach", getIntent().getStringExtra("key_live_attach"));
        intent.putExtra("key_live_anchor_type", getIntent().getIntExtra("key_live_anchor_type", 0));
    }

    public final void a7(r45.wv3 wv3Var) {
        r45.xv3 xv3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "[renderEnvelopeDecoration]");
        if (wv3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "[renderEnvelopeDecoration] envelopSource == null");
            return;
        }
        if (wv3Var.f389501g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "[renderEnvelopeStatic] envelopSource.sourceObject == null");
        } else {
            this.f146488y.setImageResource(com.tencent.mm.R.drawable.c9u);
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).aj(this.f146485x, wv3Var, null, 0, 0, 0);
            this.f146485x.setVisibility(0);
            this.f146479r.setVisibility(8);
            this.E1 = true;
            if (this.f146476p0 == 2) {
                this.f146481t.setVisibility(0);
            } else {
                this.f146481t.setVisibility(8);
            }
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f146468g.getLayoutParams();
            layoutParams.topMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), 88.0f);
            this.f146468g.setLayoutParams(layoutParams);
            com.tencent.mm.plugin.luckymoney.model.m5.D(this.f146473n);
            com.tencent.mm.plugin.luckymoney.model.m5.D(this.f146472m);
            com.tencent.mm.plugin.luckymoney.model.m5.D(this.f146470i);
            r45.xv3 xv3Var2 = wv3Var.f389501g;
            gb3.m.a(2, xv3Var2 != null ? xv3Var2.f390479f : "");
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.y() || (xv3Var = wv3Var.f389501g) == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x)) {
            android.view.View view = this.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "[renderEnvelopeDynamic] data == null");
        } else {
            kotlinx.coroutines.y0 b17 = com.tencent.mm.wallet_core.model.z1.f214041a.b();
            this.G = b17;
            com.tencent.mm.plugin.luckymoney.ui.qj qjVar = new com.tencent.mm.plugin.luckymoney.ui.qj(this, wv3Var.f389501g.D);
            this.F = qjVar;
            b7(wv3Var, this.B, this.C, this.D, this.E, qjVar, b17);
        }
        r45.xv3 xv3Var3 = wv3Var.f389501g;
        if (xv3Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var3.f390485o) || com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389501g.f390486p)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "[renderEnvelopeWidget] data == null");
            this.f146491z.setVisibility(8);
            android.view.View view3 = this.A;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeWidget", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeWidget", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f146482u.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = i65.a.b(getContext(), 24);
                this.f146482u.setLayoutParams(marginLayoutParams);
            }
        } else {
            this.f146491z.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.mj(this), c01.e2.L(getIntent().getStringExtra("key_username")) ? 30 : 0);
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).bj(this.f146491z, wv3Var, null, 0, 0);
            this.f146491z.setVisibility(0);
            android.view.View view4 = this.A;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeWidget", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeWidget", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.luckymoney.model.m5.A(this.f146491z);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.f146482u.getLayoutParams();
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = 0;
                this.f146482u.setLayoutParams(marginLayoutParams2);
            }
        }
        if (com.tencent.mm.plugin.luckymoney.model.m5.w()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "[renderEnvelopeAtmosphereDynamic] switch close, return ");
            return;
        }
        r45.xv3 xv3Var4 = wv3Var.f389501g;
        if (xv3Var4 == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var4.F)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "[renderEnvelopeAtmosphereDynamic] data is null ,return ");
            return;
        }
        if (this.G == null) {
            this.G = com.tencent.mm.wallet_core.model.z1.f214041a.b();
        }
        this.L = new com.tencent.mm.plugin.luckymoney.ui.vj(this);
        this.K.b(new com.tencent.mm.plugin.luckymoney.ui.wj(this));
        this.K.a(this.L);
        this.K.setScaleMode(3);
        this.K.setRepeatCount(0);
        com.tencent.mm.wallet_core.ui.r1.u0(this);
        this.f146483v.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.xj(this, wv3Var), 150L);
    }

    public final void c7() {
        android.widget.Button button = this.f146474o;
        if (button == null) {
            return;
        }
        fo3.s.INSTANCE.Tc(button.getId());
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (o17 == null || o17.length() <= 0 || !(o17.equals("zh_CN") || o17.equals("zh_TW") || o17.equals("zh_HK"))) {
            this.f146474o.setBackgroundResource(com.tencent.mm.R.drawable.amv);
            this.f146474o.setText(com.tencent.mm.R.string.gmm);
        }
    }

    public final void d7(ml2.f5 f5Var, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146477p1) || i95.n0.c(c50.c1.class) == null) {
            return;
        }
        ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).Ek(f5Var, ml2.e5.f327389e, z17, 0);
    }

    public final void e7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "showEmoji() circle:%s", java.lang.Boolean.TRUE);
        this.Q.setVisibility(8);
        this.J1 = 1;
        if (z17) {
            this.I1 = 3;
        } else {
            int i17 = this.I1 - 1;
            this.I1 = i17;
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "showEmoji() circle fail!");
                this.R.setVisibility(8);
                this.Q.setVisibility(0);
                this.J1 = 2;
                return;
            }
        }
        com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(this.Y);
        this.X = wi6;
        if (wi6 == null) {
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            this.X = emojiInfo;
            emojiInfo.field_md5 = this.Y;
            emojiInfo.setType(this.Z);
        } else if (com.tencent.mm.vfs.w6.k(((com.tencent.mm.storage.emotion.EmojiInfo) wi6).N0()) > 0 || this.X.k() || this.X.I1()) {
            this.P.setVisibility(0);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.X;
            this.J1 = 4;
            this.P.setEmojiInfo(iEmojiInfo);
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f59936d = 8L;
            redEnvSendWithEmoticonClickStruct.k();
            return;
        }
        if (z17) {
            this.P.setVisibility(8);
            this.R.setVisibility(0);
            ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(this.H1);
        }
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).Zi(this.X);
        gm0.j1.n().f273288b.a(697, this.K1);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, com.tencent.mm.R.anim.b_);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bv6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f146483v = findViewById(com.tencent.mm.R.id.j69);
        this.M = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j66);
        this.f146468g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j6u);
        this.f146469h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j67);
        this.f146470i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j68);
        this.f146472m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6_);
        this.f146473n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6c);
        this.N = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.j0r);
        this.P = (com.tencent.mm.emoji.view.BaseEmojiView) findViewById(com.tencent.mm.R.id.j0n);
        this.Q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6t);
        this.R = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j2g);
        this.f146474o = (android.widget.Button) findViewById(com.tencent.mm.R.id.j6g);
        this.f146475p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6h);
        this.f146480s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6d);
        this.f146478q = findViewById(com.tencent.mm.R.id.j6e);
        this.f146479r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.iy6);
        this.f146485x = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5v);
        this.f146488y = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5w);
        this.f146491z = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j5z);
        this.A = findViewById(com.tencent.mm.R.id.f485811j60);
        this.B = findViewById(com.tencent.mm.R.id.j5y);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.j5x);
        this.C = mMPAGView;
        if (mMPAGView != null) {
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        this.D = findViewById(com.tencent.mm.R.id.f485813j62);
        com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f485812j61);
        this.E = mMPAGView2;
        if (mMPAGView2 != null) {
            mMPAGView2.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        }
        this.f146467J = findViewById(com.tencent.mm.R.id.quu);
        this.K = (com.tencent.mm.chatting.component.ListScrollPAGView) findViewById(com.tencent.mm.R.id.qut);
        this.f146481t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6i);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.j6f);
        this.f146482u = weImageView;
        weImageView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.ak(this));
        if (this.f146471l1 == 3) {
            this.f146482u.setEnableColorFilter(true);
            this.f146482u.setImageResource(com.tencent.mm.R.raw.icons_outlined_close2);
            this.f146482u.setIconColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            this.f146482u.setEnableColorFilter(false);
            this.f146482u.setImageResource(com.tencent.mm.R.drawable.alt);
        }
        this.Q.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.bk(this));
        this.f146472m.setLines(2);
        androidx.core.widget.a0.c(this.f146472m, 1);
        i65.a.f(getContext(), com.tencent.mm.R.dimen.a4t);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.a4t);
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        showLoading();
        c7();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        fixStatusbar(true);
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(31063, "", 1, 32);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.B1 = android.os.SystemClock.elapsedRealtime();
        this.T = getIntent().getStringExtra("key_native_url");
        getIntent().getStringExtra("key_cropname");
        this.W = getIntent().getLongExtra("key_msgid", 0L);
        this.f146476p0 = getIntent().getIntExtra("key_material_flag", 0);
        this.f146489y0 = getIntent().getIntExtra("scene_id", 1002);
        this.f146486x0 = getIntent().getStringExtra("key_username");
        this.f146471l1 = getIntent().getIntExtra("key_from", 0);
        this.f146477p1 = getIntent().getStringExtra("key_live_id");
        this.f146487x1 = getIntent().getStringExtra("key_live_attach");
        this.f146490y1 = (android.os.ResultReceiver) getIntent().getParcelableExtra("key_open_result_receiver");
        this.f146492z1 = getIntent().getIntExtra("key_live_anchor_type", 0);
        this.A1 = getIntent().getIntExtra("key_swipe", 0);
        java.lang.String str = this.T;
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "nativeUrl= ".concat(str));
        initView();
        java.lang.String str2 = this.T;
        if (str2 == null) {
            str2 = "";
        }
        android.net.Uri parse = android.net.Uri.parse(str2);
        try {
            this.S = parse.getQueryParameter("sendid");
        } catch (java.lang.Exception unused) {
        }
        at4.k1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().z0(this.T);
        this.V = z07;
        if (z07 != null && z07.field_receiveAmount > 0) {
            if (java.lang.System.currentTimeMillis() - z07.field_receiveTime < 86400000) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Long.valueOf(this.V.field_receiveTime);
                java.lang.String str3 = this.T;
                objArr[1] = str3 != null ? str3 : "";
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "use cache this item %s %s", objArr);
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class);
                intent.putExtra("key_swipe", this.A1);
                intent.putExtra("key_native_url", this.V.field_mNativeUrl);
                intent.putExtra("key_sendid", this.S);
                intent.putExtra("key_anim_slide", true);
                intent.putExtra("key_lucky_money_can_received", true);
                intent.putExtra("key_username", getIntent().getStringExtra("key_username"));
                intent.putExtra("key_from_username", getIntent().getStringExtra("key_from_username"));
                intent.putExtra("scene_id", this.f146489y0);
                intent.putExtra("key_msgid", this.W);
                Z6(intent);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.S)) {
            z17 = false;
            z18 = true;
            finish();
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyNotHookReceiveUI", "sendid null & finish");
        } else {
            int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("channelid"), 1);
            this.U = parse.getQueryParameter("sendusername");
            java.lang.String stringExtra = getIntent().getStringExtra("key_username");
            com.tencent.mm.plugin.luckymoney.model.o5 m6Var = com.tencent.mm.plugin.luckymoney.model.m5.t(this.f146489y0) ? new com.tencent.mm.plugin.luckymoney.model.m6(1, P, this.S, this.T, getIntent().getIntExtra("key_way", 0), "v1.0") : this.f146471l1 == 3 ? new yb3.e(1, P, this.S, this.T, getIntent().getIntExtra("key_way", 0), "v1.0", stringExtra, getIntent().getStringExtra("key_live_id"), getIntent().getStringExtra("key_live_attach"), this.f146492z1) : new com.tencent.mm.plugin.luckymoney.model.l6(1, P, this.S, this.T, getIntent().getIntExtra("key_way", 0), "v1.0", stringExtra);
            if (c01.e2.L(stringExtra)) {
                z18 = true;
                m6Var.f145516g = new com.tencent.mm.plugin.luckymoney.model.x3(!com.tencent.mm.sdk.platformtools.t8.K0(r0), getIntent().getStringExtra("key_emoji_md5"));
            } else {
                z18 = true;
            }
            z17 = false;
            doSceneProgress(m6Var, false);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f146484w;
            if (u3Var != null) {
                u3Var.show();
            }
        }
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.zj(this));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.LuckyMoneyNotHookReceiveUI)).Rj(this, iy1.a.FinderLive);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.S)) {
            return;
        }
        ml2.f5 f5Var = ml2.f5.f327459g;
        if (this.f146471l1 == 3) {
            z17 = z18;
        }
        d7(f5Var, z17);
        if (this.f146471l1 == 3) {
            java.util.HashMap hashMap = new java.util.HashMap();
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            hashMap.put("comment_scene", a52.a.f1584l);
            hashMap.put("finder_username", this.f146486x0);
            hashMap.put("live_id", this.f146477p1);
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
            hashMap.put("cur_red_packet_source", java.lang.Integer.valueOf(this.f146492z1));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, hashMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 25561);
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i17 = this.J1;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f59936d = 9L;
            redEnvSendWithEmoticonClickStruct.k();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f146484w;
        if (u3Var != null && u3Var.isShowing()) {
            this.f146484w.dismiss();
        }
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(null);
        gm0.j1.n().f273288b.q(697, this.K1);
        java.util.HashSet hashSet = (java.util.HashSet) this.F1;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c01.k7) c01.n8.a()).f((java.lang.String) it.next());
        }
        hashSet.clear();
        com.tencent.mm.view.MMPAGView mMPAGView = this.C;
        if (mMPAGView != null && mMPAGView.getVisibility() == 0) {
            this.C.n();
            this.C.i(this.F);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.E;
        if (mMPAGView2 != null && mMPAGView2.getVisibility() == 0) {
            this.E.n();
            this.E.i(this.F);
        }
        this.F = null;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.K;
        if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
            this.K.n();
            this.K.i(this.L);
        }
        this.L = null;
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.G);
        this.G = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.sdk.platformtools.t8.i1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0482, code lost:
    
        if (r3.f145426s != 4) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x048a, code lost:
    
        if (r3.f145426s == r12) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05f3  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSceneEnd(int r29, int r30, java.lang.String r31, com.tencent.mm.modelbase.m1 r32) {
        /*
            Method dump skipped, instructions count: 2799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):boolean");
    }

    public void showLoading() {
        this.f146484w = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.ck(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.luckymoney.ui.wo.class);
    }
}
