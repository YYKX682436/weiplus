package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI;", "Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBaseUI;", "Lcom/tencent/mm/sdk/platformtools/f7;", "Landroid/view/View;", "r", "Landroid/view/View;", "getMAmountArea", "()Landroid/view/View;", "setMAmountArea", "(Landroid/view/View;)V", "mAmountArea", "J", "getMHeaderView", "setMHeaderView", "mHeaderView", "y2", "getMToplinkArea", "setMToplinkArea", "mToplinkArea", "<init>", "()V", "com/tencent/mm/plugin/luckymoney/ui/j7", "com/tencent/mm/plugin/luckymoney/ui/k7", "com/tencent/mm/plugin/luckymoney/ui/o7", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class LuckyMoneyNewDetailUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: r3, reason: collision with root package name */
    public static final /* synthetic */ int f146171r3 = 0;
    public android.view.ViewGroup A;
    public com.tencent.mm.plugin.luckymoney.ui.b A1;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView A2;
    public android.view.View B;
    public android.view.View B1;
    public android.widget.TextView B2;
    public android.view.View C;
    public android.widget.ImageView C1;
    public android.widget.TextView C2;
    public android.view.View D;
    public android.view.View D1;
    public int D2;
    public android.widget.TextView E;
    public android.view.ViewGroup E1;
    public android.widget.TextView F;
    public android.widget.TextView F1;
    public android.graphics.Bitmap F2;
    public android.view.ViewGroup G;
    public android.widget.ImageView G1;
    public android.graphics.Bitmap G2;
    public android.widget.RelativeLayout H;
    public com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout H1;
    public android.graphics.Bitmap H2;
    public android.widget.ImageView I;
    public android.graphics.Bitmap I2;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public android.view.View mHeaderView;
    public boolean J1;
    public android.graphics.Bitmap J2;
    public android.media.SoundPool K;
    public int K1;
    public android.graphics.Bitmap K2;
    public int[] L;
    public java.lang.String L1;
    public android.graphics.Bitmap L2;
    public int M;
    public java.lang.String M1;
    public android.graphics.Bitmap M2;
    public android.view.ViewGroup N;
    public java.lang.String N1;
    public java.lang.String O1;
    public boolean O2;
    public android.app.Dialog P;
    public java.lang.String P1;
    public android.widget.RelativeLayout Q;
    public int Q2;
    public com.tencent.mm.emoji.view.BaseEmojiView R;
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter R2;
    public android.widget.TextView S;
    public int S2;
    public android.widget.LinearLayout T;
    public java.lang.String T2;
    public android.widget.LinearLayout U;
    public com.tencent.mm.plugin.luckymoney.model.e1 U2;
    public android.widget.LinearLayout V;
    public java.lang.String V2;
    public android.widget.LinearLayout W;
    public long W1;
    public java.lang.String W2;
    public android.widget.LinearLayout X;
    public boolean X1;
    public java.lang.String X2;
    public android.widget.ImageView Y;
    public boolean Y1;
    public java.lang.String Y2;
    public android.widget.TextView Z;
    public com.tencent.mm.api.IEmojiInfo Z1;
    public java.lang.String Z2;

    /* renamed from: a2, reason: collision with root package name */
    public java.lang.String f146173a2;

    /* renamed from: a3, reason: collision with root package name */
    public float f146174a3;

    /* renamed from: b2, reason: collision with root package name */
    public int f146175b2;

    /* renamed from: b3, reason: collision with root package name */
    public float f146176b3;

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f146177c2;

    /* renamed from: c3, reason: collision with root package name */
    public android.view.View f146178c3;

    /* renamed from: d2, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f146179d2;

    /* renamed from: d3, reason: collision with root package name */
    public com.tencent.mm.chatting.component.ListScrollPAGView f146180d3;

    /* renamed from: e2, reason: collision with root package name */
    public android.view.ViewGroup f146181e2;

    /* renamed from: e3, reason: collision with root package name */
    public ym5.w1 f146182e3;

    /* renamed from: f2, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch f146183f2;

    /* renamed from: f3, reason: collision with root package name */
    public kotlinx.coroutines.y0 f146184f3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f146185g;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct f146186g2;

    /* renamed from: g3, reason: collision with root package name */
    public int f146187g3;

    /* renamed from: h, reason: collision with root package name */
    public boolean f146188h;

    /* renamed from: h2, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct f146189h2;

    /* renamed from: h3, reason: collision with root package name */
    public wb3.a f146190h3;

    /* renamed from: i, reason: collision with root package name */
    public boolean f146191i;

    /* renamed from: i2, reason: collision with root package name */
    public int f146192i2;

    /* renamed from: i3, reason: collision with root package name */
    public int f146193i3;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f146194j2;

    /* renamed from: j3, reason: collision with root package name */
    public java.lang.String f146195j3;

    /* renamed from: k2, reason: collision with root package name */
    public java.lang.String f146196k2;

    /* renamed from: k3, reason: collision with root package name */
    public java.lang.String f146197k3;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.LinearLayout f146198l1;

    /* renamed from: l2, reason: collision with root package name */
    public int f146199l2;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f146201m;

    /* renamed from: m2, reason: collision with root package name */
    public int f146202m2;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f146204n;

    /* renamed from: n2, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.n f146205n2;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f146207o;

    /* renamed from: o2, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.utils.l0 f146208o2;

    /* renamed from: o3, reason: collision with root package name */
    public int f146209o3;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f146210p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.LinearLayout f146211p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f146212p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f146213p2;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f146215q;

    /* renamed from: q2, reason: collision with root package name */
    public int f146216q2;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public android.view.View mAmountArea;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f146220s;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f146221s2;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f146222t;

    /* renamed from: t2, reason: collision with root package name */
    public boolean f146223t2;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f146224u;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f146225u2;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f146226v;

    /* renamed from: v2, reason: collision with root package name */
    public android.widget.ImageView f146227v2;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f146228w;

    /* renamed from: w2, reason: collision with root package name */
    public android.widget.ImageView f146229w2;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f146230x;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.ImageView f146231x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.emoji.view.BaseEmojiView f146232x1;

    /* renamed from: x2, reason: collision with root package name */
    public android.view.View f146233x2;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f146234y;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f146235y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.RelativeLayout f146236y1;

    /* renamed from: y2, reason: collision with root package name and from kotlin metadata */
    public android.view.View mToplinkArea;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f146238z;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.ImageView f146239z1;

    /* renamed from: z2, reason: collision with root package name */
    public android.widget.TextView f146240z2;
    public boolean I1 = true;
    public int Q1 = -1;
    public final java.util.List R1 = new java.util.LinkedList();
    public final java.util.ArrayList S1 = new java.util.ArrayList();
    public final java.util.ArrayList T1 = new java.util.ArrayList();
    public final java.util.Map U1 = new java.util.HashMap();
    public java.lang.String V1 = "";

    /* renamed from: r2, reason: collision with root package name */
    public final java.util.Set f146219r2 = new java.util.HashSet();
    public final androidx.recyclerview.widget.w2 E2 = new com.tencent.mm.plugin.luckymoney.ui.t8(this);
    public final e51.f N2 = new com.tencent.mm.plugin.luckymoney.ui.b8(this);
    public final com.tencent.mm.feature.emoji.api.q5 P2 = new com.tencent.mm.plugin.luckymoney.ui.s8(this);

    /* renamed from: l3, reason: collision with root package name */
    public final android.view.View.OnClickListener f146200l3 = new com.tencent.mm.plugin.luckymoney.ui.w8(this);

    /* renamed from: m3, reason: collision with root package name */
    public int f146203m3 = 3;

    /* renamed from: n3, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f146206n3 = new com.tencent.mm.plugin.luckymoney.ui.u7(this);

    /* renamed from: p3, reason: collision with root package name */
    public final int f146214p3 = 750;

    /* renamed from: q3, reason: collision with root package name */
    public final int f146217q3 = 240;

    public static final android.graphics.Bitmap V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, int i17) {
        android.content.res.Resources resources = luckyMoneyNewDetailUI.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI", "createBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI", "createBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeResource, 28, 28, false);
        kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }

    public static final java.util.ArrayList X6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = luckyMoneyNewDetailUI.U2;
        if (e1Var == null) {
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.q6 a17 = com.tencent.mm.plugin.luckymoney.model.q6.a(e1Var.T);
        if ((a17 != null ? a17.f145566c : null) == null || a17.f145566c.size() <= 0) {
            return null;
        }
        return a17.f145566c;
    }

    public static final void Y6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, r45.zg5 zg5Var, android.app.Dialog dialog, java.lang.String str) {
        luckyMoneyNewDetailUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[goWalletLqtSaveFetchUI]");
        if (dialog != null) {
            dialog.dismiss();
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.LinkedList linkedList = zg5Var.f392022q;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = zg5Var.f392022q.iterator();
            while (it.hasNext()) {
                r45.if0 if0Var = (r45.if0) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376981d) && !com.tencent.mm.sdk.platformtools.t8.K0(if0Var.f376983f)) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    java.lang.String str2 = if0Var.f376981d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[0] = str2;
                    java.lang.String str3 = if0Var.f376983f;
                    objArr[1] = str3 != null ? str3 : "";
                    java.lang.String format = java.lang.String.format("%s||%s", java.util.Arrays.copyOf(objArr, 2));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    arrayList.add(format);
                }
            }
        }
        android.content.Intent intent = new android.content.Intent(luckyMoneyNewDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fund_code", zg5Var.f392023r);
        intent.putExtra("lqt_account_type", zg5Var.C);
        intent.putExtra("lqt_fund_spid", zg5Var.D);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("lqt_is_show_protocol", zg5Var.f392018o == 1);
        intent.putExtra("lqt_is_agree_protocol", zg5Var.f392019p == 1);
        intent.putExtra("operate_id", str);
        intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
        intent.putExtra("lqt_profile_wording", zg5Var.f392035z);
        intent.putExtra("entrance_type", 6);
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(luckyMoneyNewDetailUI.getContext(), intent, com.tencent.mm.plugin.luckymoney.ui.h8.f146983a)) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(luckyMoneyNewDetailUI, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI", "goWalletLqtSaveFetchUI", "(Lcom/tencent/mm/protocal/protobuf/QryUsrFundDetailRes;Landroid/app/Dialog;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewDetailUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(luckyMoneyNewDetailUI, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI", "goWalletLqtSaveFetchUI", "(Lcom/tencent/mm/protocal/protobuf/QryUsrFundDetailRes;Landroid/app/Dialog;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static final void Z6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        luckyMoneyNewDetailUI.f146192i2 = 2;
        com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct();
        luckyMoneyNewDetailUI.f146186g2 = redEnvReplyWithEmoticonClickStruct;
        redEnvReplyWithEmoticonClickStruct.f59932d = 3L;
        redEnvReplyWithEmoticonClickStruct.k();
        com.tencent.mm.plugin.luckymoney.ui.b bVar = luckyMoneyNewDetailUI.A1;
        if (bVar != null) {
            bVar.show();
        }
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = luckyMoneyNewDetailUI.f146183f2;
        if (com.tencent.mm.sdk.platformtools.t8.C0(luckyMoneyEmojiSwitch != null ? java.lang.Integer.valueOf(luckyMoneyEmojiSwitch.f145156g) : null, 0)) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = luckyMoneyNewDetailUI.f146177c2;
            if (chatFooterPanel != null) {
                chatFooterPanel.setHBScene(3);
            }
        } else {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = luckyMoneyNewDetailUI.f146177c2;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setHBScene(6);
            }
        }
        fc3.j.c("", luckyMoneyNewDetailUI.f146181e2, luckyMoneyNewDetailUI.f146177c2, 106, new com.tencent.mm.plugin.luckymoney.ui.o9(luckyMoneyNewDetailUI));
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = luckyMoneyNewDetailUI.f146177c2;
        if (chatFooterPanel3 != null) {
            chatFooterPanel3.setOnTextOperationListener(new com.tencent.mm.plugin.luckymoney.ui.p9(luckyMoneyNewDetailUI));
        }
    }

    public static /* synthetic */ void b7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exchangeThxEmojiState");
        }
        if ((i18 & 2) != 0) {
            str = "";
        }
        luckyMoneyNewDetailUI.a7(i17, str);
    }

    public static /* synthetic */ void m7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEmoji");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        luckyMoneyNewDetailUI.l7(str);
    }

    public final void a7(int i17, java.lang.String str) {
        android.widget.LinearLayout linearLayout;
        if (i17 == 0) {
            android.widget.LinearLayout linearLayout2 = this.U;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else if (i17 == 1) {
            android.widget.LinearLayout linearLayout3 = this.U;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout4 = this.V;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout5 = this.W;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING, "");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, "");
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "exchangeThxEmojiState emojiType :%s", java.lang.Integer.valueOf(this.f146213p2));
            int i18 = this.f146213p2;
            if (i18 == 1) {
                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
                java.lang.String o17 = n22.m.o(str);
                if (o17 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "exchangeThxEmojiState() emojiKey == null");
                    return;
                }
                ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
                android.graphics.drawable.Drawable c17 = com.tencent.mm.smiley.e1.b().c(o17);
                com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView = this.f146232x1;
                if (baseEmojiView != null) {
                    baseEmojiView.setImageDrawable(c17);
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, str);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING, "");
                android.widget.LinearLayout linearLayout6 = this.U;
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
                android.widget.LinearLayout linearLayout7 = this.V;
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(8);
                }
                android.widget.LinearLayout linearLayout8 = this.W;
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
            } else if (i18 != 2) {
                c7(str);
            } else {
                c7(str);
            }
        }
        if (!c01.e2.L(this.L1) || (linearLayout = this.U) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final void c7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(str);
        if (wi6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "exchangeThxEmojiState() temp == null");
            return;
        }
        this.f146179d2 = wi6;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f146179d2;
        c17.x(u3Var, iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, "");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = this.f146179d2;
        if (iEmojiInfo2 != null && !iEmojiInfo2.E0()) {
            ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).wi(iEmojiInfo2, new com.tencent.mm.plugin.luckymoney.ui.w7(this, iEmojiInfo2));
            return;
        }
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView = this.f146232x1;
        if (baseEmojiView != null) {
            baseEmojiView.setEmojiInfo(this.f146179d2);
        }
        android.widget.LinearLayout linearLayout = this.U;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.V;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout3 = this.W;
        if (linearLayout3 == null) {
            return;
        }
        linearLayout3.setVisibility(0);
    }

    public final void d7() {
        fc3.j.a(this, this.f146177c2);
        com.tencent.mm.plugin.luckymoney.ui.b bVar = this.A1;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return super.dispatchKeyEvent(event);
    }

    public final boolean e7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f146173a2)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = this.f146183f2;
        if (!com.tencent.mm.sdk.platformtools.t8.C0(luckyMoneyEmojiSwitch != null ? java.lang.Integer.valueOf(luckyMoneyEmojiSwitch.f145153d) : null, 1)) {
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch2 = this.f146183f2;
            if (!com.tencent.mm.sdk.platformtools.t8.C0(luckyMoneyEmojiSwitch2 != null ? java.lang.Integer.valueOf(luckyMoneyEmojiSwitch2.f145154e) : null, 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    public final boolean f7(com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        return e1Var.A == 2 && this.K1 != 3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (getIntent().hasExtra("key_realname_guide_helper")) {
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) getIntent().getParcelableExtra("key_realname_guide_helper");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNewDetailUI");
            bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
            boolean a17 = realnameGuideHelper != null ? realnameGuideHelper.a(this, bundle, new com.tencent.mm.plugin.luckymoney.ui.a8(this), null) : false;
            getIntent().removeExtra("key_realname_guide_helper");
            if (!a17) {
                super.finish();
            }
        } else {
            super.finish();
        }
        overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    public final int g7() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING, "");
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, "");
        java.lang.String str2 = m18 instanceof java.lang.String ? (java.lang.String) m18 : null;
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2 != null ? str2 : "")) ? 1 : 2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bu9;
    }

    public final void h7() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING, "");
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        java.lang.String str2 = str != null ? str : "";
        b7(this, 1, null, 2, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        a7(2, str2);
    }

    public final boolean i7(int i17) {
        boolean z17;
        if (com.tencent.mm.plugin.luckymoney.model.m5.t(this.f146202m2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[doCheckNormalLuckymoney] is rtx luckymoney");
        } else if (this.f146193i3 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[doCheckNormalLuckymoney] is live luckymoney");
        } else {
            if (this.f146199l2 != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[doCheckNormalLuckymoney] is normal luckymoney");
                z17 = true;
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                boolean z18 = ((com.tencent.mm.plugin.luckymoney.ui.ha) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.ha.class)).f146988g;
                android.widget.LinearLayout linearLayout = this.U;
                boolean z19 = !(linearLayout == null && linearLayout.getVisibility() == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(this.L1) && com.tencent.mm.storage.z3.N4(this.L1) && z17 && z18;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[needShowNewYeraStyle] final ret: %s , inTimeRange：%s, talkerName：%s, mSceneID: %s , hbType :%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18), this.L1, java.lang.Integer.valueOf(this.f146202m2), java.lang.Integer.valueOf(i17));
                return z19;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[doCheckNormalLuckymoney] is hk luckymoney");
        }
        z17 = false;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        boolean z182 = ((com.tencent.mm.plugin.luckymoney.ui.ha) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.luckymoney.ui.ha.class)).f146988g;
        android.widget.LinearLayout linearLayout2 = this.U;
        if (linearLayout2 == null && linearLayout2.getVisibility() == 0) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[needShowNewYeraStyle] final ret: %s , inTimeRange：%s, talkerName：%s, mSceneID: %s , hbType :%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z182), this.L1, java.lang.Integer.valueOf(this.f146202m2), java.lang.Integer.valueOf(i17));
        return z19;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI$initView$4] */
    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View findViewById;
        com.tencent.mm.plugin.luckymoney.ui.b bVar;
        this.f146208o2 = new com.tencent.mm.plugin.wallet_core.utils.l0(this);
        setMMTitle("");
        T6();
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nnk);
        android.widget.TextView textView = null;
        this.f146229w2 = findViewById2 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById2 : null;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nnc);
        android.widget.ImageView imageView = findViewById3 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById3 : null;
        this.f146227v2 = imageView;
        if (imageView != null) {
            imageView.post(new com.tencent.mm.plugin.luckymoney.ui.k8(this));
        }
        android.widget.ImageView imageView2 = this.f146227v2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.m8(this));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.izx);
        this.f146201m = recyclerView;
        boolean z17 = false;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        }
        this.mHeaderView = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bu8, (android.view.ViewGroup) this.f146201m, false);
        this.f146228w = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bu6, (android.view.ViewGroup) this.f146201m, false);
        com.tencent.mm.plugin.luckymoney.ui.n8 n8Var = new com.tencent.mm.plugin.luckymoney.ui.n8(new in5.s() { // from class: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI$initView$4
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == 2 ? new com.tencent.mm.plugin.luckymoney.ui.o7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.this) : new com.tencent.mm.plugin.luckymoney.ui.o7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.this);
            }
        }, this.T1);
        this.R2 = n8Var;
        android.view.View view4 = this.mHeaderView;
        if (view4 != null) {
            n8Var.T(view4, 1, false);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f146201m;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.R2);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f146201m;
        if (recyclerView3 != null) {
            recyclerView3.i(this.E2);
        }
        android.view.View view5 = this.mHeaderView;
        android.view.View findViewById4 = view5 != null ? view5.findViewById(com.tencent.mm.R.id.f485766j01) : null;
        this.f146204n = findViewById4 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById4 : null;
        android.view.View view6 = this.mHeaderView;
        android.view.View findViewById5 = view6 != null ? view6.findViewById(com.tencent.mm.R.id.j0j) : null;
        this.f146207o = findViewById5 instanceof android.widget.TextView ? (android.widget.TextView) findViewById5 : null;
        android.view.View view7 = this.mHeaderView;
        this.D1 = view7 != null ? view7.findViewById(com.tencent.mm.R.id.j0g) : null;
        android.view.View view8 = this.mHeaderView;
        android.view.View findViewById6 = view8 != null ? view8.findViewById(com.tencent.mm.R.id.izf) : null;
        this.f146215q = findViewById6 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById6 : null;
        android.view.View view9 = this.mHeaderView;
        android.view.View findViewById7 = view9 != null ? view9.findViewById(com.tencent.mm.R.id.j0m) : null;
        this.f146210p = findViewById7 instanceof android.widget.TextView ? (android.widget.TextView) findViewById7 : null;
        android.view.View view10 = this.mHeaderView;
        this.Q = view10 != null ? (android.widget.RelativeLayout) view10.findViewById(com.tencent.mm.R.id.j0r) : null;
        android.view.View view11 = this.mHeaderView;
        android.view.View findViewById8 = view11 != null ? view11.findViewById(com.tencent.mm.R.id.j0n) : null;
        this.R = findViewById8 instanceof com.tencent.mm.emoji.view.BaseEmojiView ? (com.tencent.mm.emoji.view.BaseEmojiView) findViewById8 : null;
        android.view.View view12 = this.mHeaderView;
        this.S = view12 != null ? (android.widget.TextView) view12.findViewById(com.tencent.mm.R.id.j6t) : null;
        android.view.View view13 = this.mHeaderView;
        this.T = view13 != null ? (android.widget.LinearLayout) view13.findViewById(com.tencent.mm.R.id.j2g) : null;
        android.view.View view14 = this.mHeaderView;
        if (view14 != null) {
        }
        android.view.View view15 = this.mHeaderView;
        android.view.View findViewById9 = view15 != null ? view15.findViewById(com.tencent.mm.R.id.iyx) : null;
        if (!(findViewById9 instanceof android.view.View)) {
            findViewById9 = null;
        }
        this.mAmountArea = findViewById9;
        android.view.View view16 = this.mHeaderView;
        android.view.View findViewById10 = view16 != null ? view16.findViewById(com.tencent.mm.R.id.iyw) : null;
        this.f146220s = findViewById10 instanceof android.widget.TextView ? (android.widget.TextView) findViewById10 : null;
        android.view.View view17 = this.mHeaderView;
        android.view.View findViewById11 = view17 != null ? view17.findViewById(com.tencent.mm.R.id.f485791j26) : null;
        this.E1 = findViewById11 instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById11 : null;
        android.view.View view18 = this.mHeaderView;
        android.view.View findViewById12 = view18 != null ? view18.findViewById(com.tencent.mm.R.id.j27) : null;
        this.F1 = findViewById12 instanceof android.widget.TextView ? (android.widget.TextView) findViewById12 : null;
        android.view.View view19 = this.mHeaderView;
        android.view.View findViewById13 = view19 != null ? view19.findViewById(com.tencent.mm.R.id.f485790j25) : null;
        this.G1 = findViewById13 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById13 : null;
        android.view.View view20 = this.mHeaderView;
        android.view.View findViewById14 = view20 != null ? view20.findViewById(com.tencent.mm.R.id.izi) : null;
        if (!(findViewById14 instanceof android.view.View)) {
            findViewById14 = null;
        }
        this.f146222t = findViewById14;
        android.view.View view21 = this.mHeaderView;
        android.view.View findViewById15 = view21 != null ? view21.findViewById(com.tencent.mm.R.id.j0e) : null;
        this.f146224u = findViewById15 instanceof android.widget.TextView ? (android.widget.TextView) findViewById15 : null;
        android.view.View view22 = this.mHeaderView;
        android.view.View findViewById16 = view22 != null ? view22.findViewById(com.tencent.mm.R.id.izh) : null;
        this.f146226v = findViewById16 instanceof com.tencent.mm.pluginsdk.ui.applet.CdnImageView ? (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById16 : null;
        android.view.View view23 = this.mHeaderView;
        android.view.View findViewById17 = view23 != null ? view23.findViewById(com.tencent.mm.R.id.f485762iz3) : null;
        this.f146230x = findViewById17 instanceof android.widget.TextView ? (android.widget.TextView) findViewById17 : null;
        android.view.View view24 = this.mHeaderView;
        android.view.View findViewById18 = view24 != null ? view24.findViewById(com.tencent.mm.R.id.izs) : null;
        if (!(findViewById18 instanceof android.view.View)) {
            findViewById18 = null;
        }
        this.f146234y = findViewById18;
        android.view.View view25 = this.mHeaderView;
        android.view.View findViewById19 = view25 != null ? view25.findViewById(com.tencent.mm.R.id.f485760iz1) : null;
        if (!(findViewById19 instanceof android.view.View)) {
            findViewById19 = null;
        }
        this.f146238z = findViewById19;
        android.view.View view26 = this.mHeaderView;
        android.view.View findViewById20 = view26 != null ? view26.findViewById(com.tencent.mm.R.id.f485759iz0) : null;
        if (findViewById20 instanceof android.widget.ImageView) {
        }
        android.view.View view27 = this.mHeaderView;
        this.U = view27 != null ? (android.widget.LinearLayout) view27.findViewById(com.tencent.mm.R.id.f485819j72) : null;
        android.view.View view28 = this.mHeaderView;
        this.V = view28 != null ? (android.widget.LinearLayout) view28.findViewById(com.tencent.mm.R.id.j76) : null;
        android.view.View view29 = this.mHeaderView;
        android.widget.TextView textView2 = view29 != null ? (android.widget.TextView) view29.findViewById(com.tencent.mm.R.id.j77) : null;
        com.tencent.mm.ui.bk.s0(textView2 != null ? textView2.getPaint() : null);
        android.view.View view30 = this.mHeaderView;
        this.W = view30 != null ? (android.widget.LinearLayout) view30.findViewById(com.tencent.mm.R.id.j79) : null;
        android.view.View view31 = this.mHeaderView;
        this.f146232x1 = view31 != null ? (com.tencent.mm.emoji.view.BaseEmojiView) view31.findViewById(com.tencent.mm.R.id.f485820j73) : null;
        android.view.View view32 = this.mHeaderView;
        this.f146236y1 = view32 != null ? (android.widget.RelativeLayout) view32.findViewById(com.tencent.mm.R.id.j78) : null;
        android.view.View view33 = this.mHeaderView;
        this.f146239z1 = view33 != null ? (android.widget.ImageView) view33.findViewById(com.tencent.mm.R.id.f485821j74) : null;
        android.view.View view34 = this.mHeaderView;
        this.A = view34 != null ? (android.view.ViewGroup) view34.findViewById(com.tencent.mm.R.id.f485764iz5) : null;
        android.view.View view35 = this.mHeaderView;
        this.B = view35 != null ? view35.findViewById(com.tencent.mm.R.id.f485763iz4) : null;
        android.view.View view36 = this.mHeaderView;
        this.C = view36 != null ? view36.findViewById(com.tencent.mm.R.id.iz6) : null;
        android.view.View view37 = this.mHeaderView;
        this.D = view37 != null ? view37.findViewById(com.tencent.mm.R.id.iz7) : null;
        android.view.View view38 = this.mHeaderView;
        android.view.View findViewById21 = view38 != null ? view38.findViewById(com.tencent.mm.R.id.f485760iz1) : null;
        this.H = findViewById21 instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) findViewById21 : null;
        android.view.View view39 = this.mHeaderView;
        android.view.View findViewById22 = view39 != null ? view39.findViewById(com.tencent.mm.R.id.f485759iz0) : null;
        this.I = findViewById22 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById22 : null;
        android.view.View view40 = this.mHeaderView;
        this.C1 = view40 != null ? (android.widget.ImageView) view40.findViewById(com.tencent.mm.R.id.j7b) : null;
        this.N = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.j1l);
        android.view.View view41 = this.mHeaderView;
        this.f146233x2 = view41 != null ? view41.findViewById(com.tencent.mm.R.id.f485765j00) : null;
        android.view.View view42 = this.mHeaderView;
        this.mToplinkArea = view42 != null ? view42.findViewById(com.tencent.mm.R.id.j0i) : null;
        android.view.View view43 = this.mHeaderView;
        this.f146240z2 = view43 != null ? (android.widget.TextView) view43.findViewById(com.tencent.mm.R.id.izj) : null;
        android.view.View view44 = this.mHeaderView;
        this.A2 = view44 != null ? (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view44.findViewById(com.tencent.mm.R.id.izu) : null;
        android.view.View view45 = this.mHeaderView;
        this.B2 = view45 != null ? (android.widget.TextView) view45.findViewById(com.tencent.mm.R.id.izv) : null;
        android.view.View view46 = this.mHeaderView;
        this.C2 = view46 != null ? (android.widget.TextView) view46.findViewById(com.tencent.mm.R.id.udi) : null;
        this.f146178c3 = findViewById(com.tencent.mm.R.id.quq);
        this.f146180d3 = (com.tencent.mm.chatting.component.ListScrollPAGView) findViewById(com.tencent.mm.R.id.qut);
        android.widget.TextView textView3 = this.S;
        if (textView3 != null) {
            textView3.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.o8(this));
        }
        this.A1 = new com.tencent.mm.plugin.luckymoney.ui.b(this);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.buc, (android.view.ViewGroup) null);
        this.B1 = inflate;
        if (inflate != null && (bVar = this.A1) != null) {
            bVar.setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        android.view.View view47 = this.B1;
        if (view47 != null && (findViewById = view47.findViewById(com.tencent.mm.R.id.j0q)) != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.p8(this));
        }
        com.tencent.mm.plugin.luckymoney.ui.b bVar2 = this.A1;
        if (bVar2 != null) {
            bVar2.f146732f = new com.tencent.mm.plugin.luckymoney.ui.q8(this);
        }
        android.view.View view48 = this.B1;
        android.view.View findViewById23 = view48 != null ? view48.findViewById(com.tencent.mm.R.id.j0s) : null;
        this.f146181e2 = findViewById23 instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById23 : null;
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "can't show correctly");
            finish();
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f146177c2 = wi6;
        wi6.setTalkerName(this.L1);
        fc3.j.b(this.f146177c2);
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f146177c2;
        if (chatFooterPanel != null) {
            chatFooterPanel.setShowSmiley(true);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f146177c2;
        if (chatFooterPanel2 != null) {
            int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            chatFooterPanel2.setSearchSource(7);
        }
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f146226v;
        if (cdnImageView != null) {
            cdnImageView.setUseSdcardCache(true);
        }
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView = this.R;
        if (baseEmojiView != null) {
            baseEmojiView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.j8(this));
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.luckymoney.ui.ha haVar = (com.tencent.mm.plugin.luckymoney.ui.ha) zVar.a(context).a(com.tencent.mm.plugin.luckymoney.ui.ha.class);
        androidx.appcompat.app.AppCompatActivity activity = haVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI) activity : null;
        com.tencent.mm.ui.widget.button.WeButton weButton = (luckyMoneyNewDetailUI == null || (view3 = luckyMoneyNewDetailUI.mHeaderView) == null) ? null : (com.tencent.mm.ui.widget.button.WeButton) view3.findViewById(com.tencent.mm.R.id.r7x);
        if (!(weButton instanceof com.tencent.mm.ui.widget.button.WeButton)) {
            weButton = null;
        }
        haVar.f146985d = weButton;
        androidx.appcompat.app.AppCompatActivity activity2 = haVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI) activity2 : null;
        haVar.f146986e = (luckyMoneyNewDetailUI2 == null || (view2 = luckyMoneyNewDetailUI2.mHeaderView) == null) ? null : view2.findViewById(com.tencent.mm.R.id.r7z);
        androidx.appcompat.app.AppCompatActivity activity3 = haVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI3 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI) activity3 : null;
        if (luckyMoneyNewDetailUI3 != null && (view = luckyMoneyNewDetailUI3.mHeaderView) != null) {
            textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.r7y);
        }
        haVar.f146987f = textView;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_lucky_money_new_year_style_time_limit_switch, "", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI.LuckyMoneyNewDetailUINewYearUIC", "[isInActivityServerTime] timeServer ：" + Zi + ' ');
        if (Zi == null || Zi.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUI.LuckyMoneyNewDetailUINewYearUIC", "[isInActivityServerTime] timeServer is null, return false ", Zi);
        } else {
            java.util.List f07 = r26.n0.f0(Zi, new java.lang.String[]{"-"}, false, 0, 6, null);
            if ((!f07.isEmpty()) && f07.size() == 2) {
                long j17 = 1000;
                long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) f07.get(0)) * j17;
                long E12 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) f07.get(1)) * j17;
                long c17 = c01.id.c();
                if (c17 > E1 && c17 < E12) {
                    z17 = true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI.LuckyMoneyNewDetailUINewYearUIC", "[isInActivityServerTime] finalRet：" + z17 + " , activityStartTime: " + E1 + " , activityEndTime: " + E12 + " , nowTime: " + c17);
            }
        }
        haVar.f146988g = z17;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.luckymoney.ui.fa) zVar.a(context2).a(com.tencent.mm.plugin.luckymoney.ui.fa.class)).getClass();
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = (com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout) findViewById(com.tencent.mm.R.id.j18);
        this.H1 = envelopeAppBarLayout;
        if (envelopeAppBarLayout != null) {
            envelopeAppBarLayout.setNewActivityLifeCycle(this);
        }
    }

    public final void j7() {
        android.view.View view = this.f146178c3;
        if (view != null && view.getVisibility() == 0) {
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f146180d3;
            if (listScrollPAGView != null) {
                listScrollPAGView.n();
            }
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = this.f146180d3;
            if (listScrollPAGView2 != null) {
                listScrollPAGView2.i(this.f146182e3);
            }
            android.view.View view2 = this.f146178c3;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI", "releasePagResource", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI", "releasePagResource", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f146180d3 = null;
        }
        this.f146182e3 = null;
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.f146184f3);
        this.f146184f3 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x05d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(com.tencent.mm.plugin.luckymoney.model.e1 r40) {
        /*
            Method dump skipped, instructions count: 2715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.k7(com.tencent.mm.plugin.luckymoney.model.e1):void");
    }

    public final void l7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "sendEmoji emojiType :%s", java.lang.Integer.valueOf(this.f146213p2));
        int i17 = this.f146213p2;
        if (i17 == 1) {
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Di(this, this.L1, str, getString(com.tencent.mm.R.string.gnp), new com.tencent.mm.plugin.luckymoney.ui.j9(this, str));
        } else if (i17 != 2) {
            n7();
        } else {
            n7();
        }
    }

    public final void n7() {
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        java.lang.String str = this.L1;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f146179d2;
        java.lang.String md52 = iEmojiInfo != null ? ((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo).getMd5() : null;
        java.lang.String string = getString(com.tencent.mm.R.string.gnp);
        com.tencent.mm.plugin.luckymoney.ui.l9 l9Var = new com.tencent.mm.plugin.luckymoney.ui.l9(this);
        ((r35.k1) q1Var).getClass();
        r35.i1 i1Var = new r35.i1(this);
        i1Var.l(str);
        i1Var.e(md52);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.f369137d = string;
        i1Var.a(l9Var);
        i1Var.k();
    }

    public final void o7(boolean z17) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        android.widget.LinearLayout linearLayout3;
        android.widget.LinearLayout linearLayout4;
        android.widget.LinearLayout linearLayout5;
        if (z17) {
            android.widget.ImageView imageView = this.f146229w2;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (this.f146221s2 && (linearLayout5 = this.X) != null) {
                linearLayout5.setVisibility(0);
            }
            if (this.f146225u2 && (linearLayout4 = this.f146198l1) != null) {
                linearLayout4.setVisibility(0);
            }
            if (!this.f146223t2 || (linearLayout3 = this.f146211p0) == null) {
                return;
            }
            linearLayout3.setVisibility(8);
            return;
        }
        android.widget.ImageView imageView2 = this.f146229w2;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        if (this.f146221s2 && (linearLayout2 = this.X) != null) {
            linearLayout2.setVisibility(8);
        }
        if (this.f146225u2 && (linearLayout = this.f146198l1) != null) {
            linearLayout.setVisibility(8);
        }
        if (this.f146223t2) {
            if (!this.f146191i) {
                gb3.m.a(41, this.V2);
                this.f146191i = true;
            }
            android.widget.LinearLayout linearLayout6 = this.f146211p0;
            if (linearLayout6 == null) {
                return;
            }
            linearLayout6.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str = null;
        if (i17 != 1) {
            if (i17 == 2) {
                gb3.n.a(8);
            } else if (i17 == 1111) {
                if (i18 == -1) {
                    java.lang.String stringExtra = intent != null ? intent.getStringExtra("gif_md5") : "";
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "md5 == null go emoji capture failed!");
                    } else {
                        this.f146213p2 = 2;
                        a7(2, stringExtra);
                        m7(this, null, 1, null);
                        d7();
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "go emoji capture failed!");
                }
            }
        } else if (i18 == -1 && intent != null) {
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                java.lang.String str2 = this.P1;
                if (str2 != null) {
                    boolean z17 = false;
                    if (str2 != null && r26.i0.y(str2, "wxpay://c2cbizmessagehandler/hongbao/festivalhongbao", false)) {
                        z17 = true;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "Not expected branch since 2015 fesitval");
                    }
                }
                if (stringExtra2 != null) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    str = compile.matcher(stringExtra2).replaceAll("|");
                    kotlin.jvm.internal.o.f(str, "replaceAll(...)");
                }
                doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.n6(str, this.N1, 1, "v1.0"));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0582  */
    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i17, menu);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482486fu);
        android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479349x3));
        }
        return onCreatePanelMenu;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i17 = this.f146209o3;
        if (i17 == 1 || i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f59936d = 12L;
            redEnvSendWithEmoticonClickStruct.k();
        }
        android.media.SoundPool soundPool = this.K;
        if (soundPool != null) {
            soundPool.release();
            int[] iArr = this.L;
            if (iArr == null) {
                kotlin.jvm.internal.o.o("soundId");
                throw null;
            }
            int length = iArr.length;
            for (int i18 = 0; i18 < length; i18++) {
                android.media.SoundPool soundPool2 = this.K;
                if (soundPool2 != null) {
                    int[] iArr2 = this.L;
                    if (iArr2 == null) {
                        kotlin.jvm.internal.o.o("soundId");
                        throw null;
                    }
                    soundPool2.unload(iArr2[i18]);
                }
            }
        }
        if (this.f146177c2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[onDestroy] commentfooter release");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f146177c2;
            if (chatFooterPanel != null) {
                chatFooterPanel.h();
            }
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f146177c2;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.a();
            }
        }
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).cj(null);
        ((java.util.HashMap) gb3.l.f270017a).clear();
        ((java.util.HashMap) gb3.l.f270018b).clear();
        gb3.m.b();
        com.tencent.mm.plugin.luckymoney.story.f1.a(1);
        gm0.j1.n().f273288b.q(697, this.f146206n3);
        java.util.HashSet hashSet = (java.util.HashSet) this.f146219r2;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c01.k7) c01.n8.a()).f((java.lang.String) it.next());
        }
        hashSet.clear();
        j7();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        com.tencent.mm.plugin.wallet_core.utils.n nVar;
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 == 4 && (nVar = this.f146205n2) != null && com.tencent.mm.plugin.wallet_core.utils.l0.d(nVar)) {
            com.tencent.mm.plugin.wallet_core.utils.l0 l0Var = this.f146208o2;
            if (l0Var != null) {
                l0Var.b(this.f146205n2, new com.tencent.mm.plugin.luckymoney.ui.x8(this));
            }
            this.f146205n2 = null;
            return true;
        }
        return super.onKeyUp(i17, event);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        keyboardState();
        keyboardState();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).Bi(context, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.sdk.platformtools.t8.i1();
        java.lang.Object bounceView = getBounceView();
        if (bounceView != null) {
            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).g(false);
        }
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).wi(context, this);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onSceneEnd] errType:");
        sb6.append(i17);
        sb6.append(" errCode:");
        sb6.append(i18);
        sb6.append(" errMsg:");
        sb6.append(str);
        sb6.append(" netsceneType:");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", sb6.toString());
        if (m1Var instanceof com.tencent.mm.plugin.luckymoney.model.v5) {
            if (i17 != 0 || i18 != 0) {
                db5.e1.T(this, str);
                return true;
            }
            com.tencent.mm.plugin.luckymoney.model.v5 v5Var = (com.tencent.mm.plugin.luckymoney.model.v5) m1Var;
            com.tencent.mm.plugin.luckymoney.model.e1 e1Var = v5Var.f145665h;
            this.V1 = v5Var.f145666i;
            this.f146173a2 = v5Var.f145667m;
            this.f146175b2 = v5Var.f145668n;
            this.f146183f2 = v5Var.f145669o;
            this.U2 = e1Var;
            q7(e1Var);
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.e6)) {
            if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.n6)) {
                return false;
            }
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.fw6), null, this, null, null);
                return true;
            }
            db5.e1.T(this, str);
            return true;
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            return true;
        }
        java.util.List list = this.R1;
        if (list != null) {
            int size = ((java.util.LinkedList) list).size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                com.tencent.mm.plugin.luckymoney.model.h5 h5Var = (com.tencent.mm.plugin.luckymoney.model.h5) ((java.util.LinkedList) list).get(i19);
                if ((h5Var == null || (str2 = h5Var.f145317i) == null || !r26.i0.p(str2, ((com.tencent.mm.plugin.luckymoney.model.e6) m1Var).f145263h, true)) ? false : true) {
                    h5Var.f145316h = ((com.tencent.mm.plugin.luckymoney.model.e6) m1Var).f145264i;
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.R2;
                    if (wxRecyclerAdapter != null) {
                        wxRecyclerAdapter.notifyDataSetChanged();
                    }
                } else {
                    i19++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if ((r1 != null && r1.I1()) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p7(boolean r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.p7(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x04c3, code lost:
    
        if ((r11 != null && r11.getVisibility() == 0) != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0592, code lost:
    
        if ((r11 != null && r11.getVisibility() == 0) != false) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0859 A[Catch: IOException -> 0x087f, TryCatch #0 {IOException -> 0x087f, blocks: (B:359:0x0840, B:361:0x0859, B:363:0x085d, B:364:0x0875, B:375:0x0878, B:376:0x087e), top: B:358:0x0840 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0878 A[Catch: IOException -> 0x087f, TryCatch #0 {IOException -> 0x087f, blocks: (B:359:0x0840, B:361:0x0859, B:363:0x085d, B:364:0x0875, B:375:0x0878, B:376:0x087e), top: B:358:0x0840 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7(com.tencent.mm.plugin.luckymoney.model.e1 r32) {
        /*
            Method dump skipped, instructions count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.q7(com.tencent.mm.plugin.luckymoney.model.e1):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r2 != null ? r2.Z2 : null) != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x064c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r7(r45.nm5 r27) {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.r7(r45.nm5):void");
    }

    public final void setMAmountArea(android.view.View view) {
        this.mAmountArea = view;
    }

    public final void setMHeaderView(android.view.View view) {
        this.mHeaderView = view;
    }

    public final void setMToplinkArea(android.view.View view) {
        this.mToplinkArea = view;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.luckymoney.ui.j7.class);
        set.add(com.tencent.mm.plugin.luckymoney.ui.ha.class);
        set.add(com.tencent.mm.plugin.luckymoney.ui.fa.class);
        set.add(com.tencent.mm.plugin.luckymoney.ui.d7.class);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "onScreenShot");
        int i17 = this.D2;
        if (i17 == 0 || i17 == 1) {
            java.util.LinkedList linkedList = new java.util.LinkedList(this.S1);
            int i18 = this.D2;
            if (i18 == 1) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_lucky_money_detail_group_page", linkedList, 0);
            } else if (i18 == 0) {
                ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_lucky_money_detail_normal_page", linkedList, 0);
            }
        }
    }
}
