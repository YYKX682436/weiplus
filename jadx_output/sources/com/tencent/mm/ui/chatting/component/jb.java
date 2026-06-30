package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.s0.class)
/* loaded from: classes5.dex */
public class jb extends com.tencent.mm.ui.chatting.component.a implements sb5.s0, l75.z0, l75.q0 {
    public static java.util.ArrayList C;
    public static long D;
    public boolean A;
    public long B;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ChatFooter f199263e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.h4 f199264f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChatFooterCustom f199265g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.f7 f199267i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.t6 f199268m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.j7 f199269n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.animation.AnimationSet f199270o;

    /* renamed from: q, reason: collision with root package name */
    public int f199272q;

    /* renamed from: r, reason: collision with root package name */
    public int f199273r;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199278w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199279x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199280y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.e5 f199281z;

    /* renamed from: h, reason: collision with root package name */
    public int f199266h = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f199271p = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199274s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f199275t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f199276u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f199277v = true;

    public jb() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f199278w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeNativeMsgEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.FootComponent$1
            {
                this.__eventId = 690552614;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
                am.ds dsVar;
                com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent2 = revokeNativeMsgEvent;
                if (!(revokeNativeMsgEvent2 instanceof com.tencent.mm.autogen.events.RevokeNativeMsgEvent) || (chatFooter = com.tencent.mm.ui.chatting.component.jb.this.f199263e) == null || (dsVar = revokeNativeMsgEvent2.f54714g) == null) {
                    return false;
                }
                chatFooter.h1(true, dsVar.f6496a, dsVar.f6498c, com.tencent.mm.R.string.gzd);
                return false;
            }
        };
        this.f199279x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DeleteMsgEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.FootComponent$2
            {
                this.__eventId = 1188678804;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DeleteMsgEvent deleteMsgEvent) {
                am.y3 y3Var;
                com.tencent.mm.autogen.events.DeleteMsgEvent deleteMsgEvent2 = deleteMsgEvent;
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = com.tencent.mm.ui.chatting.component.jb.this.f199263e;
                if (chatFooter == null || (y3Var = deleteMsgEvent2.f54086g) == null) {
                    return false;
                }
                chatFooter.h1(false, y3Var.f8425a, y3Var.f8427c, com.tencent.mm.R.string.gzj);
                return false;
            }
        };
        this.f199280y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeMsgEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.FootComponent$3
            {
                this.__eventId = 675629679;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
                am.cs csVar;
                com.tencent.mm.storage.f9 f9Var;
                com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent2 = revokeMsgEvent;
                if (!(revokeMsgEvent2 instanceof com.tencent.mm.autogen.events.RevokeMsgEvent) || (chatFooter = com.tencent.mm.ui.chatting.component.jb.this.f199263e) == null || (csVar = revokeMsgEvent2.f54713g) == null || (f9Var = csVar.f6396c) == null) {
                    return false;
                }
                chatFooter.h1(false, csVar.f6394a, f9Var.Q0(), com.tencent.mm.R.string.gzd);
                return false;
            }
        };
        this.f199281z = new com.tencent.mm.ui.chatting.component.tb(this);
        this.A = false;
        this.B = 0L;
    }

    public static void s0() {
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config1, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config2, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config3, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config4, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config5, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config6, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config7, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config8, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config9, "", true));
        u0(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_app_panel_dynamic_config10, "", true));
    }

    public static void u0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("wxapp");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(jSONArray.getString(i17));
                com.tencent.mm.pluginsdk.ui.chat.x xVar = new com.tencent.mm.pluginsdk.ui.chat.x();
                xVar.f190713g2 = jSONObject.optString("enter_id");
                xVar.f190714h2 = jSONObject.optInt("red_dot");
                xVar.f190715i2 = jSONObject.optInt("jump_type");
                xVar.f190716j2 = jSONObject.optString("wa_un");
                xVar.f190718l2 = jSONObject.optInt("wa_ver");
                xVar.f190719m2 = jSONObject.optString("wa_path");
                xVar.f190720n2 = jSONObject.optString("wa_dgmode");
                xVar.f190721o2 = jSONObject.optString("h5_url");
                xVar.f190726t2 = jSONObject.optString("icon_url");
                xVar.f190727u2 = jSONObject.optString("icon_url_dark");
                if (com.tencent.mm.sdk.platformtools.t8.K0(xVar.f190726t2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "unCertainEnter.iconUrl is null");
                } else {
                    xVar.f190730x2 = jSONObject.optLong("busi_type");
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("desc");
                    if (optJSONObject == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "titleJson is null");
                    } else {
                        xVar.f190722p2.f190754a = optJSONObject.optString("zh_cn");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(xVar.f190722p2.f190754a)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "unCertainEnter.simpleChWord.title is null");
                        } else {
                            xVar.f190724r2.f190754a = com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject.optString("zh_tw")) ? xVar.f190722p2.f190754a : optJSONObject.optString("zh_tw");
                            xVar.f190723q2.f190754a = com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject.optString("zh_hk")) ? xVar.f190722p2.f190754a : optJSONObject.optString("zh_hk");
                            xVar.f190725s2.f190754a = com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject.optString("en")) ? xVar.f190722p2.f190754a : optJSONObject.optString("en");
                            if (optJSONObject2 != null) {
                                xVar.f190722p2.f190755b = optJSONObject2.optString("zh_cn");
                                xVar.f190724r2.f190755b = com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject2.optString("zh_tw")) ? xVar.f190722p2.f190755b : optJSONObject2.optString("zh_tw");
                                xVar.f190723q2.f190755b = com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject2.optString("zh_hk")) ? xVar.f190722p2.f190755b : optJSONObject2.optString("zh_hk");
                                xVar.f190725s2.f190755b = com.tencent.mm.sdk.platformtools.t8.K0(optJSONObject2.optString("en")) ? xVar.f190722p2.f190755b : optJSONObject2.optString("en");
                            }
                            C.add(xVar);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "handleAppPanelUnCertainEnterConfig() Exception:%s", e17.getMessage());
        }
    }

    public final void A0() {
        if (this.f199263e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "initToolbarView, footer is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "initToolbarView()");
        final com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter.L2 != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatFooter", "initToolbar, toolbarVisibilityListener has already been initialized.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "initToolbar");
        chatFooter.L2 = new sb5.v() { // from class: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$g
            @Override // sb5.v
            public final void a(boolean z17) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.this;
                chatFooter2.f190077v = z17;
                chatFooter2.M1();
            }
        };
        sb5.w wVar = (sb5.w) chatFooter.f189955a3.a().f460708c.a(sb5.w.class);
        sb5.v vVar = chatFooter.L2;
        com.tencent.mm.ui.chatting.component.x3 x3Var = (com.tencent.mm.ui.chatting.component.x3) wVar;
        if (vVar == null) {
            x3Var.getClass();
            return;
        }
        if (x3Var.f200202h == null) {
            x3Var.f200202h = new java.util.HashSet();
        }
        ((java.util.HashSet) x3Var.f200202h).add(vVar);
    }

    public final void B0() {
        if (this.f199263e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "initTranslateView footer == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "initTranslateView()");
        sb5.o2 o2Var = (sb5.o2) this.f198580d.f460708c.a(sb5.o2.class);
        sb5.n2 callback = this.f199263e.getIOnTranslateResCallback();
        com.tencent.mm.ui.chatting.component.ho hoVar = (com.tencent.mm.ui.chatting.component.ho) o2Var;
        hoVar.getClass();
        kotlin.jvm.internal.o.g(callback, "callback");
        hoVar.f199178e = callback;
        this.f199263e.setIOnTranslateViewController(new com.tencent.mm.ui.chatting.component.kb(this));
    }

    public final void C0() {
        yb5.d dVar = this.f198580d;
        if (dVar.f460717l.isCurrentActivity) {
            return;
        }
        ((com.tencent.mm.ui.chatting.ChattingUIFragment) dVar.f460719n).B.setTopViewVisible(true);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter != null) {
            chatFooter.O1();
            chatFooter.T3 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoice60minAutoSend()) == 1;
            chatFooter.f190034o2 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChatfooterLongPressSuppressMenu()) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "resetView() isNewTrans2Txt:%s, mLongPressSuppressMenuEnabled:%s", java.lang.Boolean.valueOf(chatFooter.S3), java.lang.Boolean.valueOf(chatFooter.f190034o2));
            android.view.View findViewById = chatFooter.findViewById(com.tencent.mm.R.id.bpf);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            chatFooter.setSwitchButtonMode(0);
            chatFooter.T2.removeMessages(1002);
            android.widget.ImageButton imageButton = chatFooter.f190103z;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            android.widget.ImageView imageView = chatFooter.A;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = chatFooter.C;
            if (weImageButton != null) {
                weImageButton.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout = chatFooter.G;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            com.tencent.mm.view.MaxHeightScrollView maxHeightScrollView = chatFooter.D;
            if (maxHeightScrollView != null) {
                maxHeightScrollView.setVisibility(8);
            }
            if (chatFooter.L != null) {
                chatFooter.setMsgQuoteRlVisibility(8);
            }
            chatFooter.f190027n.setVisibility(8);
            android.view.View view = chatFooter.N1;
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup viewGroup = chatFooter.f190049q3;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            android.view.View view2 = chatFooter.Q1;
            if (view2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = chatFooter.S1;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.pluginsdk.ui.chat.ib ibVar = chatFooter.f189987g;
            if (ibVar != null) {
                ibVar.setVisibility(8);
                chatFooter.Z1 = false;
                chatFooter.f189987g.f();
            }
            android.view.ViewGroup viewGroup2 = chatFooter.M1;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            android.view.View view4 = chatFooter.R1;
            if (view4 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            db5.d5 d5Var = chatFooter.L1;
            if (d5Var != null) {
                d5Var.update();
            }
            android.widget.TextView textView = chatFooter.f190033o;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom chatFooterBottom = chatFooter.f190089x;
            if (chatFooterBottom != null) {
                chatFooterBottom.setVisibility(4);
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.f189981f;
                if (chatFooterPanel != null) {
                    chatFooterPanel.setVisibility(8);
                }
            }
            android.view.View view5 = chatFooter.f190059s;
            if (view5 != null) {
                android.view.View findViewById2 = view5.findViewById(com.tencent.mm.R.id.qhk);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById3 = chatFooter.f190059s.findViewById(com.tencent.mm.R.id.qhl);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = (com.tencent.mm.pluginsdk.ui.chat.AppPanel) chatFooter.findViewById(com.tencent.mm.R.id.bhm);
            chatFooter.f189993h = appPanel;
            if (appPanel != null) {
                appPanel.setChattingContext(chatFooter.f189955a3);
                chatFooter.setAppPanelVisible(8);
                com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel2 = chatFooter.f189993h;
                com.tencent.mm.ui.base.MMFlipper mMFlipper = appPanel2.f189940r;
                if (mMFlipper != null) {
                    mMFlipper.setToScreen(0);
                }
                appPanel2.A = 0;
            }
            chatFooter.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Reset);
            chatFooter.E(0, false, -1);
            chatFooter.f190104z1 = false;
            if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputIlink()) == 1) {
                chatFooter.f190046p6 = ((i70.g) ((e70.b0) i95.n0.c(e70.b0.class))).wi(true);
            }
            chatFooter.V3 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTransAndRead()) == 1;
            this.f199263e.f1();
            this.f199263e.b1();
            this.f199263e.f190041p1.f190739a = null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        v0();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var == null || y4Var.a() == null || !chatFooter.f189955a3.a().f460710e.M()) {
            return;
        }
        android.view.View view = new android.view.View(chatFooter.f189955a3.a().g());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(18, com.tencent.mm.R.id.bl8);
        layoutParams.addRule(19, com.tencent.mm.R.id.bl8);
        layoutParams.addRule(5, com.tencent.mm.R.id.bl8);
        layoutParams.addRule(8, com.tencent.mm.R.id.bl8);
        chatFooter.f190053r.addView(view, layoutParams);
        view.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.c2(chatFooter));
    }

    public void E0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "setChatMode to: %d", java.lang.Integer.valueOf(i17));
        this.f199266h = i17;
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f198580d.x());
        if (p17 != null && p17.v0() != i17) {
            p17.k1(i17);
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(p17, this.f198580d.x());
        }
        this.f199263e.l1(i17, false);
    }

    public void F0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "triggerFooter, originChatFooterVisibility:%s", java.lang.Integer.valueOf(this.f199272q));
        if (this.f199263e == null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = (com.tencent.mm.pluginsdk.ui.chat.ChatFooter) this.f198580d.c(com.tencent.mm.R.id.f486092k52);
            this.f199263e = chatFooter;
            chatFooter.w(new com.tencent.mm.ui.chatting.component.ub(this));
            sb5.r0 r0Var = (sb5.r0) this.f198580d.f460708c.a(sb5.r0.class);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = this.f199263e;
            com.tencent.mm.ui.chatting.component.ib ibVar = (com.tencent.mm.ui.chatting.component.ib) r0Var;
            ibVar.f199218f = chatFooter2;
            if (chatFooter2 != null) {
                chatFooter2.setOnFooterPanelSwitchListener(ibVar);
            }
            y0();
            A0();
            B0();
            x0();
        }
        boolean z17 = ((com.tencent.mm.ui.chatting.component.b5) ((sb5.d0) this.f198580d.f460708c.a(sb5.d0.class))).f198696g;
        boolean z18 = ((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) this.f198580d.f460708c.a(sb5.p1.class))).f198977e;
        if (z17 || z18 || com.tencent.mm.ui.widget.snackbar.j.f212477a) {
            if (!this.f199274s) {
                this.f199272q = this.f199263e.getVisibility();
            }
            this.f199263e.w0(true);
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f199265g;
            if (chatFooterCustom == null) {
                this.f199273r = -1;
            } else if (!this.f199274s) {
                this.f199273r = chatFooterCustom.getVisibility();
            }
            r0();
            this.f199274s = true;
            return;
        }
        this.f199274s = false;
        int i17 = this.f199272q;
        if (i17 == 8 && this.f199273r == 8) {
            r0();
        } else if (i17 == 0) {
            I0();
        } else {
            H0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G0() {
        /*
            r7 = this;
            yb5.d r0 = r7.f198580d
            java.lang.String r0 = r0.x()
            boolean r1 = com.tencent.mm.storage.z3.f4(r0)
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L82
            boolean r1 = com.tencent.mm.storage.z3.G4(r0)
            if (r1 == 0) goto L15
            goto L82
        L15:
            boolean r0 = com.tencent.mm.storage.z3.I4(r0)
            if (r0 == 0) goto L1d
            r0 = r2
            goto L83
        L1d:
            yb5.d r0 = r7.f198580d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f460717l
            java.lang.String r1 = "Chat_Mode"
            int r0 = r0.getIntExtra(r1, r3)
            int r1 = r7.f199266h
            if (r1 == 0) goto L2c
            r0 = r1
        L2c:
            java.lang.Class<c25.e> r1 = c25.e.class
            lm0.a r4 = gm0.j1.s(r1)
            c25.e r4 = (c25.e) r4
            com.tencent.mm.plugin.zero.a r4 = (com.tencent.mm.plugin.zero.a) r4
            ip.j r4 = r4.b()
            java.lang.String r5 = "DefaultMsgType"
            java.lang.String r4 = r4.d(r5)
            int r6 = r7.f199266h
            if (r6 != 0) goto L5a
            if (r4 == 0) goto L5a
            lm0.a r0 = gm0.j1.s(r1)
            c25.e r0 = (c25.e) r0
            com.tencent.mm.plugin.zero.a r0 = (com.tencent.mm.plugin.zero.a) r0
            ip.j r0 = r0.b()
            java.lang.String r0 = r0.d(r5)
            int r0 = com.tencent.mm.sdk.platformtools.t8.P(r0, r3)
        L5a:
            if (r0 != 0) goto L80
            yb5.d r1 = r7.f198580d
            com.tencent.mm.storage.z3 r1 = r1.u()
            boolean r1 = r1.r2()
            if (r1 == 0) goto L80
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.n3 r0 = r0.p()
            r1 = 18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.l(r1, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L80:
            if (r0 != 0) goto L83
        L82:
            r0 = 1
        L83:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "MicroMsg.ChattingUI.FootComponent"
            java.lang.String r5 = "updateChatMode:%d"
            com.tencent.mars.xlog.Log.i(r4, r5, r1)
            if (r0 != r2) goto L9a
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f199263e
            r1.l1(r0, r3)
            goto L9f
        L9a:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r7.f199263e
            r1.l1(r0, r3)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.jb.G0():void");
    }

    public void H0() {
        this.f198580d.y();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "visibleCustomFooter customFooter is %s", this.f199265g);
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f199265g;
        if (chatFooterCustom == null) {
            return;
        }
        chatFooterCustom.setVisibility(0);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter != null) {
            chatFooter.w0(false);
            this.f199263e.setVisibility(8);
        }
        this.f199277v = false;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
        com.tencent.mm.pluginsdk.ui.chat.g8 g8Var;
        com.tencent.mm.ui.chatting.n2 n2Var;
        super.I();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = this.f199263e;
        if (chatFooter2 != null) {
            chatFooter2.setFooterEventListener(null);
            com.tencent.mm.ui.chatting.h4 h4Var = this.f199264f;
            h4Var.getClass();
            java.lang.String l17 = com.tencent.mm.app.w.l();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "getCurrentActivity: %s", l17);
            if (l17 == null || !l17.contains("MMRecordUI")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "clear video generate callback");
                ut3.f.f431176c.f431177a = null;
            }
            if (h4Var.f201637b.d() != null) {
                ((com.tencent.mm.modelbase.g1) h4Var.f201637b.b()).h(null);
                ((com.tencent.mm.modelbase.g1) h4Var.f201637b.b()).b(null);
            }
            this.f199264f = null;
            this.f199263e.setSmileyPanelCallback(null);
            this.f199263e.setSmileyPanelCallback2(null);
        }
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f199265g;
        if (chatFooterCustom != null) {
            chatFooterCustom.B.clear();
            com.tencent.mm.ui.chatting.ChatFooterCustom.GetLocationListener getLocationListener = chatFooterCustom.f198182v;
            if (getLocationListener != null) {
                getLocationListener.dead();
            }
            com.tencent.mm.ui.chatting.ChatFooterCustom.GetScanCodeListener getScanCodeListener = chatFooterCustom.f198183w;
            if (getScanCodeListener != null) {
                getScanCodeListener.dead();
            }
            chatFooterCustom.o();
            chatFooterCustom.f198185y = false;
            this.f199265g = null;
        }
        C0();
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom2 = this.f199265g;
        if (chatFooterCustom2 != null && (n2Var = chatFooterCustom2.f198171h) != null) {
            n2Var.a();
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Bi();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter3 = this.f199263e;
        if (chatFooter3 != null && (g8Var = chatFooter3.W) != null) {
            com.tencent.mm.pluginsdk.ui.chat.ra raVar = (com.tencent.mm.pluginsdk.ui.chat.ra) g8Var;
            raVar.f190619j = false;
            raVar.d();
        }
        if (this.f198580d.f460717l.isCurrentActivity && (chatFooter = this.f199263e) != null) {
            chatFooter.G();
        }
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        ((i41.l) i95.n0.c(i41.l.class)).Ui().remove(this);
        this.f199280y.dead();
    }

    public void I0() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter == null) {
            return;
        }
        chatFooter.setVisibility(0);
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f199265g;
        if (chatFooterCustom != null) {
            chatFooterCustom.setVisibility(8);
        }
        this.f199277v = true;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        android.view.View findViewById;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f199263e.getChatFooterPanel();
        u35.b.f424429a = "";
        u35.b.f424430b = 0;
        u35.b.f424431c = 0L;
        u35.b.f424432d = 0L;
        u35.b.f424433e = false;
        if (chatFooterPanel != null) {
            chatFooterPanel.k();
        }
        if (this.f199268m == null || !com.tencent.mm.storage.z3.r4(this.f198580d.x())) {
            return;
        }
        com.tencent.mm.ui.chatting.t6 t6Var = this.f199268m;
        t6Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQAssistantFooterHandler", "resetFooter");
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = t6Var.f202703a;
        if (chatFooterCustom != null && (findViewById = chatFooterCustom.findViewById(com.tencent.mm.R.id.ukd)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler", "resetFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler", "resetFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQAssistantFooterHandler", "remove QQ logo");
        }
        this.f199268m = null;
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom;
        if (1111 == i17 && -1 == i18) {
            this.f199263e.x1();
        }
        if (i18 != -1) {
            if (i17 == 200 || i17 == 201 || i17 == 203) {
                this.f199263e.clearFocus();
                return;
            }
            return;
        }
        if (i17 != 217 && (chatFooterCustom = this.f199265g) != null) {
            chatFooterCustom.f(i17, intent);
        }
        if (i17 != 202) {
            return;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
            return;
        }
        int intExtra = intent.getIntExtra("Chat_Mode", 1);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter != null) {
            chatFooter.setMode(intExtra);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f199275t = this.f198580d.f460717l.getBooleanExtra("show_footer_for_search_chat_result", false).booleanValue();
        this.f199276u = this.f198580d.f460717l.getBooleanExtra("enter_room_from_uri_jump", false).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        if (r6 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010b A[RETURN] */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d0(int r6, android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.jb.d0(int, android.view.KeyEvent):boolean");
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj != null) {
            obj.equals("");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "onNotifyChange obj %s talker %s", obj, this.f198580d.x());
        if (obj.equals(this.f198580d.x())) {
            w0(this.f198580d.x());
            G0();
        }
    }

    @Override // yn.d
    public void h0(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length < 1) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(iArr == null ? -1 : iArr.length);
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = strArr;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[3] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.FootComponent", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            return;
        }
        int i18 = com.tencent.mm.R.string.hhn;
        if (i17 == 25) {
            if (iArr[0] != 0) {
                if ("android.permission.CAMERA".equals(strArr[0])) {
                    i18 = com.tencent.mm.R.string.hh8;
                }
                if (iArr[0] == 0) {
                    return;
                }
                db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(i18), this.f198580d.s().getString(com.tencent.mm.R.string.hht), this.f198580d.s().getString(com.tencent.mm.R.string.g6z), this.f198580d.s().getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.chatting.component.mb(this), new com.tencent.mm.ui.chatting.component.nb(this));
                return;
            }
            com.tencent.mm.ui.chatting.h4 h4Var = this.f199264f;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doFooterLiveRequest,footerEventImpl[%s], stack[%s]", h4Var, new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mm.ui.chatting.h4 h4Var2 = this.f199264f;
            if (h4Var2 != null) {
                ((com.tencent.mm.ui.chatting.s4) h4Var2.f201657v).h(0, 0L);
                return;
            }
            return;
        }
        if (i17 == 145) {
            if (iArr[0] != 0) {
                db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.hhp), this.f198580d.s().getString(com.tencent.mm.R.string.hht), this.f198580d.s().getString(com.tencent.mm.R.string.g6z), this.f198580d.s().getString(com.tencent.mm.R.string.fic), false, new com.tencent.mm.ui.chatting.component.sb(this), null);
                return;
            }
            com.tencent.mm.ui.chatting.h4 h4Var3 = this.f199264f;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "doSendFileRequest, footerEventImpl[%s], stack[%s].", h4Var3, new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mm.ui.chatting.h4 h4Var4 = this.f199264f;
            if (h4Var4 != null) {
                h4Var4.D();
                return;
            }
            return;
        }
        int i19 = com.tencent.mm.R.string.gv_;
        switch (i17) {
            case 18:
                if (iArr[0] != 0) {
                    if ("android.permission.CAMERA".equals(strArr[0])) {
                        i18 = com.tencent.mm.R.string.hh8;
                    }
                    if (iArr[0] == 0) {
                        return;
                    }
                    db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(i18), this.f198580d.s().getString(com.tencent.mm.R.string.hht), this.f198580d.s().getString(com.tencent.mm.R.string.g6z), this.f198580d.s().getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.chatting.component.ob(this), new com.tencent.mm.ui.chatting.component.pb(this));
                    return;
                }
                com.tencent.mm.ui.chatting.h4 h4Var5 = this.f199264f;
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doFooterSightRequest,footerEventImpl[%s], stack[%s]", h4Var5, new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mm.ui.chatting.h4 h4Var6 = this.f199264f;
                if (h4Var6 != null) {
                    h4Var6.E(this.f199263e.f189993h.C.f190161s.f190766a ? 0 : 2);
                    return;
                }
                return;
            case 19:
            case 21:
            case 22:
                if (iArr[0] != 0) {
                    if ("android.permission.CAMERA".equals(strArr[0])) {
                        i18 = com.tencent.mm.R.string.hh8;
                    }
                    if ("android.permission.CAMERA".equals(strArr[0])) {
                        i19 = com.tencent.mm.R.string.f490774aq2;
                    }
                    db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(i18), this.f198580d.s().getString(i19), this.f198580d.s().getString(com.tencent.mm.R.string.kct), this.f198580d.s().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.chatting.component.jb$$a
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i27) {
                            com.tencent.mm.ui.chatting.component.jb jbVar = com.tencent.mm.ui.chatting.component.jb.this;
                            jbVar.getClass();
                            dialogInterface.dismiss();
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            android.app.Activity g17 = jbVar.f198580d.g();
                            ((sb0.f) jVar).getClass();
                            j35.u.g(g17);
                        }
                    }, new com.tencent.mm.ui.chatting.component.jb$$b());
                    return;
                }
                if (i17 == 19) {
                    com.tencent.mm.ui.chatting.h4 h4Var7 = this.f199264f;
                    boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doVoipMenuVideoSelected,footerEventImpl[%s], stack[%s]", h4Var7, new com.tencent.mm.sdk.platformtools.z3());
                    com.tencent.mm.ui.chatting.h4 h4Var8 = this.f199264f;
                    if (h4Var8 != null) {
                        h4Var8.G();
                        return;
                    }
                    return;
                }
                if (i17 == 21) {
                    com.tencent.mm.ui.chatting.h4 h4Var9 = this.f199264f;
                    boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doOnVoipRequest,footerEventImpl[%s], stack[%s]", h4Var9, new com.tencent.mm.sdk.platformtools.z3());
                    com.tencent.mm.ui.chatting.h4 h4Var10 = this.f199264f;
                    if (h4Var10 != null) {
                        h4Var10.C();
                        return;
                    }
                    return;
                }
                com.tencent.mm.ui.chatting.h4 h4Var11 = this.f199264f;
                boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doOnEnterMultiTalk,footerEventImpl[%s], stack[%s]", h4Var11, new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mm.ui.chatting.h4 h4Var12 = this.f199264f;
                if (h4Var12 != null) {
                    h4Var12.A();
                    return;
                }
                return;
            case 20:
                if (iArr[0] != 0) {
                    db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.hh8), this.f198580d.s().getString(com.tencent.mm.R.string.hht), this.f198580d.s().getString(com.tencent.mm.R.string.g6z), this.f198580d.s().getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.chatting.component.qb(this), null);
                    return;
                }
                com.tencent.mm.ui.chatting.h4 h4Var13 = this.f199264f;
                boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doImageSelectTakePhotoRequest,footerEventImpl[%s], stack[%s]", h4Var13, new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mm.ui.chatting.h4 h4Var14 = this.f199264f;
                if (h4Var14 != null) {
                    h4Var14.z();
                    return;
                }
                return;
            default:
                switch (i17) {
                    case 81:
                        if (iArr[0] != 0) {
                            db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.hhm), this.f198580d.s().getString(com.tencent.mm.R.string.hht), this.f198580d.s().getString(com.tencent.mm.R.string.g6z), this.f198580d.s().getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.chatting.component.rb(this), null);
                            return;
                        }
                        com.tencent.mm.ui.chatting.h4 h4Var15 = this.f199264f;
                        boolean z39 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doTalkRoomRequest,footerEventImpl[%s], stack[%s]", h4Var15, new com.tencent.mm.sdk.platformtools.z3());
                        com.tencent.mm.ui.chatting.h4 h4Var16 = this.f199264f;
                        if (h4Var16 != null) {
                            ((com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) h4Var16.f201645j.f460708c.a(sb5.j2.class))).o0(false);
                            h4Var16.f201636a.setBottomPanelVisibility(8);
                            return;
                        }
                        return;
                    case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                    case 83:
                        if (iArr[0] != 0) {
                            db5.e1.C(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.hhn), this.f198580d.s().getString(com.tencent.mm.R.string.gv_), this.f198580d.s().getString(com.tencent.mm.R.string.kct), this.f198580d.s().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.chatting.component.jb$$c
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(android.content.DialogInterface dialogInterface, int i27) {
                                    com.tencent.mm.ui.chatting.component.jb jbVar = com.tencent.mm.ui.chatting.component.jb.this;
                                    jbVar.getClass();
                                    dialogInterface.dismiss();
                                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                                    android.app.Activity g17 = jbVar.f198580d.g();
                                    ((sb0.f) jVar).getClass();
                                    j35.u.g(g17);
                                }
                            }, new com.tencent.mm.ui.chatting.component.jb$$d());
                            return;
                        }
                        if (i17 == 82) {
                            com.tencent.mm.ui.chatting.h4 h4Var17 = this.f199264f;
                            boolean z47 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doVoipMenuAudioSelected,footerEventImpl[%s], stack[%s]", h4Var17, new com.tencent.mm.sdk.platformtools.z3());
                            com.tencent.mm.ui.chatting.h4 h4Var18 = this.f199264f;
                            if (h4Var18 != null) {
                                h4Var18.F();
                                return;
                            }
                            return;
                        }
                        com.tencent.mm.ui.chatting.h4 h4Var19 = this.f199264f;
                        boolean z48 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "summerper doOnVoipAudioRequest,footerEventImpl[%s], stack[%s]", h4Var19, new com.tencent.mm.sdk.platformtools.z3());
                        com.tencent.mm.ui.chatting.h4 h4Var20 = this.f199264f;
                        if (h4Var20 != null) {
                            h4Var20.B();
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    public void m0() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter != null) {
            if (chatFooter.f189997h5 != null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "addTextChangedListener");
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = this.f199263e;
            com.tencent.mm.ui.chatting.component.bc bcVar = new com.tencent.mm.ui.chatting.component.bc(this, null);
            chatFooter2.getClass();
            com.tencent.mm.pluginsdk.ui.chat.g5 g5Var = new com.tencent.mm.pluginsdk.ui.chat.g5(chatFooter2, bcVar);
            chatFooter2.f189997h5 = g5Var;
            chatFooter2.f190021m.addTextChangedListener(g5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x035f, code lost:
    
        if (r30.f199276u != false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(com.tencent.mm.storage.z3 r31) {
        /*
            Method dump skipped, instructions count: 2199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.jb.n0(com.tencent.mm.storage.z3):boolean");
    }

    public boolean o0(com.tencent.mm.storage.f9 f9Var, r15.g gVar) {
        if (this.f199263e == null) {
            return true;
        }
        ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
        ((ti3.q) k0Var).Di(ty.p0.f422743o, ty.r0.f422754f, f9Var, gVar, this.f198580d.x());
        this.f199263e.F(f9Var, gVar);
        return true;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (str != null) {
            str.equals("");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "onNotifyChange event %s talker %s", str, this.f198580d.x());
        if (com.tencent.mm.storage.z3.q4(this.f198580d.x()) || com.tencent.mm.storage.z3.p4(this.f198580d.x())) {
            w0(this.f198580d.x());
            G0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p0(int r17, com.tencent.mm.storage.f9 r18) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.jb.p0(int, com.tencent.mm.storage.f9):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0718 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x097a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04ea  */
    /* JADX WARN: Type inference failed for: r1v211 */
    /* JADX WARN: Type inference failed for: r1v212 */
    /* JADX WARN: Type inference failed for: r1v214 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v362 */
    /* JADX WARN: Type inference failed for: r1v363 */
    /* JADX WARN: Type inference failed for: r1v384 */
    /* JADX WARN: Type inference failed for: r1v394 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v83 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(java.lang.String r19, com.tencent.mm.storage.z3 r20) {
        /*
            Method dump skipped, instructions count: 2950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.jb.q0(java.lang.String, com.tencent.mm.storage.z3):void");
    }

    public void r0() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "[goneFooter] %s", new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter != null) {
            chatFooter.w0(false);
            this.f199263e.setVisibility(8);
        }
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f199265g;
        if (chatFooterCustom != null) {
            chatFooterCustom.setVisibility(8);
        }
        this.f199263e.U0(false);
        this.f198580d.y();
    }

    public final void t0(java.lang.String str, com.tencent.mm.storage.z3 z3Var, java.util.ArrayList arrayList) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Long.valueOf(z3Var == null ? 0L : z3Var.L1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "ChatroomBusinessType user %s %s", objArr);
        if (this.f198580d.C() && z3Var != null && z3Var.L1 != 0) {
            if (C == null) {
                C = new java.util.ArrayList();
                s0();
                D = c01.id.a();
            } else {
                long a17 = c01.id.a();
                if (a17 - D > ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_app_panel_dynamic_update_time, 1800)) {
                    D = a17;
                    C.clear();
                    s0();
                }
            }
            java.util.ArrayList arrayList2 = C;
            if (arrayList2 != null && arrayList2.size() > 0) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.pluginsdk.ui.chat.x xVar = (com.tencent.mm.pluginsdk.ui.chat.x) it.next();
                    if ((xVar.f190730x2 & z3Var.L1) != 0) {
                        xVar.f190731y2 = z3Var.d1();
                        arrayList.add(xVar);
                    }
                }
            }
        }
        this.f199263e.setAppPanelUnCertainEnterArrayList(arrayList);
    }

    public void v0() {
        if (n0(this.f198580d.u())) {
            ((com.tencent.mm.ui.chatting.component.n9) ((sb5.g2) this.f198580d.f460708c.a(sb5.g2.class))).m0();
        }
    }

    public final void w0(java.lang.String str) {
        com.tencent.mm.storage.a3 z07;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "initFooterPanelMenu %s", str);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            try {
                this.f199263e.D1(true);
                q0(str, n17);
            } finally {
                this.f199263e.D1(false);
            }
        } else {
            q0(str, n17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        t0(str, n17, arrayList);
        com.tencent.mm.ui.chatting.component.zb zbVar = new com.tencent.mm.ui.chatting.component.zb(this, str, n17);
        if (arrayList.size() == 0 && n17 != null && n17.L1 == 0) {
            if (com.tencent.mm.storage.z3.R4(this.f198580d.x())) {
                com.tencent.mm.storage.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f198580d.x());
                if (z08 == null || (z08.field_chatroomStatus & 32768) == 0) {
                    return;
                }
                long j17 = z08.field_chatroomfamilystatusmodifytime;
                if (j17 == 0 || j17 - c01.id.c() >= 86400000) {
                    z08.field_chatroomfamilystatusmodifytime = c01.id.c();
                    ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().update(z08, new java.lang.String[0]);
                    gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.lb(this, this.f198580d.x(), zbVar));
                    return;
                }
                return;
            }
            if (!com.tencent.mm.storage.z3.q4(this.f198580d.x()) || (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f198580d.x())) == null || (z07.F0().f330241f & 4) == 0) {
                return;
            }
            long j18 = z07.field_chatroomfamilystatusmodifytime;
            if (j18 == 0 || j18 - c01.id.c() >= 86400000) {
                z07.field_chatroomfamilystatusmodifytime = c01.id.c();
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().update(z07, new java.lang.String[0]);
                gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.lb(this, this.f198580d.x(), zbVar));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0334, code lost:
    
        if (c01.v1.D(r14.f198580d.x()) == false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.jb.x():void");
    }

    public final void x0() {
        if (this.f199263e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "initShortcutCommandTagView, footer is null");
            return;
        }
        sb5.b2 b2Var = (sb5.b2) this.f198580d.f460708c.a(sb5.b2.class);
        if (b2Var == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.bl) b2Var).f198836g = this.f199263e.getTagVisibilityCallback();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199263e;
        if (chatFooter != null) {
            com.tencent.mm.pluginsdk.ui.chat.g5 g5Var = chatFooter.f189997h5;
            if (g5Var != null) {
                chatFooter.f190021m.removeTextChangedListener(g5Var);
                chatFooter.f189997h5 = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "removeTextChangeListener");
            this.f199263e.Q0();
            this.f199279x.dead();
            this.f199278w.dead();
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.FootComponent", "account not ready");
                return;
            }
            c01.d9.b().p().w(18, java.lang.Integer.valueOf(this.f199263e.getMode()));
            this.f199263e.getMode();
            if (this.f199266h != this.f199263e.getMode()) {
                this.f199266h = this.f199263e.getMode();
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f198580d.x());
                if (p17 != null && this.f198580d.x().equals(p17.h1())) {
                    p17.k1(this.f199266h);
                    ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(p17, this.f198580d.x());
                }
            }
            this.f199263e.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Pause);
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f199265g;
            if (chatFooterCustom != null) {
                chatFooterCustom.o();
            }
        }
    }

    public final void y0() {
        if (this.f199263e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.FootComponent", "initTodoView footer == null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "initTodoView()");
        ((com.tencent.mm.ui.chatting.component.qc) ((sb5.w0) this.f198580d.f460708c.a(sb5.w0.class))).f199771p = this.f199263e.getIOnToDoBarCallback();
        this.f199263e.setIOnTodoViewCallback(new com.tencent.mm.ui.chatting.component.ac(this));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        android.view.View childAt;
        this.A = false;
        this.B = 0L;
        u35.b.f424429a = "";
        u35.b.f424430b = 0;
        u35.b.f424431c = 0L;
        u35.b.f424432d = 0L;
        u35.b.f424433e = false;
        u35.b.f424429a = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        u35.a.f424428b = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f198580d.x());
        if (p17 != null) {
            this.f199266h = p17.v0();
        }
        java.lang.String x17 = this.f198580d.x();
        if (this.f199263e == null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = (com.tencent.mm.pluginsdk.ui.chat.ChatFooter) this.f198580d.c(com.tencent.mm.R.id.f486092k52);
            this.f199263e = chatFooter;
            chatFooter.w(new com.tencent.mm.ui.chatting.component.vb(this));
            sb5.r0 r0Var = (sb5.r0) this.f198580d.f460708c.a(sb5.r0.class);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = this.f199263e;
            com.tencent.mm.ui.chatting.component.ib ibVar = (com.tencent.mm.ui.chatting.component.ib) r0Var;
            ibVar.f199218f = chatFooter2;
            if (chatFooter2 != null) {
                chatFooter2.setOnFooterPanelSwitchListener(ibVar);
            }
            y0();
            A0();
            B0();
            x0();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "resetFooter customFooter is %s", this.f199265g);
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f199265g;
        if (chatFooterCustom != null) {
            chatFooterCustom.B.clear();
            com.tencent.mm.ui.chatting.ChatFooterCustom.GetLocationListener getLocationListener = chatFooterCustom.f198182v;
            if (getLocationListener != null) {
                getLocationListener.dead();
            }
            com.tencent.mm.ui.chatting.ChatFooterCustom.GetScanCodeListener getScanCodeListener = chatFooterCustom.f198183w;
            if (getScanCodeListener != null) {
                getScanCodeListener.dead();
            }
            chatFooterCustom.o();
            chatFooterCustom.f198185y = false;
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom2 = this.f199265g;
            if (chatFooterCustom2.f198167d == null) {
                chatFooterCustom2.f198167d = (android.widget.LinearLayout) chatFooterCustom2.findViewById(com.tencent.mm.R.id.bll);
            }
            android.widget.LinearLayout linearLayout = chatFooterCustom2.f198167d;
            if (linearLayout != null && linearLayout.getChildCount() > 0 && (childAt = chatFooterCustom2.f198167d.getChildAt(0)) != null) {
                childAt.setBackgroundDrawable(childAt.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481306q2));
                android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.bln);
                if (findViewById instanceof android.widget.TextView) {
                    android.widget.TextView textView = (android.widget.TextView) findViewById;
                    textView.setTextColor(childAt.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
                    textView.setTextSize(0, childAt.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479897ia));
                }
            }
            this.f199265g.setOnFooterSwitchListener(null);
            this.f199265g.setOnProcessClickListener(null);
            this.f199263e.setOnFooterSwitchListener(null);
            com.tencent.mm.ui.chatting.n2 n2Var = this.f199265g.f198171h;
            if (n2Var != null) {
                n2Var.a();
            }
        }
        r0();
        com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = this.f199263e.f190047q;
        if (weImageButton != null) {
            weImageButton.setVisibility(0);
        }
        boolean z17 = ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class))).f199295f;
        boolean z18 = ((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) this.f198580d.f460708c.a(sb5.p1.class))).f198977e;
        boolean z19 = this.f199275t;
        com.tencent.mm.pluginsdk.ui.chat.e5 e5Var = this.f199281z;
        if (!z19 && (z17 || z18)) {
            r0();
        } else if (this.f198580d.H()) {
            r0();
        } else if (com.tencent.mm.storage.z3.t4(x17)) {
            r0();
            com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.f486091k51);
            boolean z27 = this.f199265g == null;
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom3 = (com.tencent.mm.ui.chatting.ChatFooterCustom) this.f198580d.c(com.tencent.mm.R.id.f486093k53);
            this.f199265g = chatFooterCustom3;
            if (z27) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f198580d.c(com.tencent.mm.R.id.bki);
                yb5.d dVar = this.f198580d;
                chatFooterCustom3.g(viewGroup, dVar.f460722q, dVar.k());
            }
            com.tencent.mm.ui.chatting.f7 f7Var = new com.tencent.mm.ui.chatting.f7(this.f199265g);
            this.f199267i = f7Var;
            boolean z28 = com.tencent.mm.sdk.platformtools.a0.f192439b == 1;
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom4 = f7Var.f200490c;
            android.view.View findViewById2 = chatFooterCustom4.findViewById(com.tencent.mm.R.id.blq);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f7Var.f200491d = (android.widget.LinearLayout) chatFooterCustom4.findViewById(com.tencent.mm.R.id.bll);
            android.view.View findViewById3 = chatFooterCustom4.findViewById(com.tencent.mm.R.id.blk);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f7Var.f200491d.setWeightSum(z28 ? 1.0f : 2.0f);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) f7Var.f200491d.getChildAt(0);
            f7Var.f200492e = frameLayout;
            frameLayout.setVisibility(0);
            f7Var.f200492e.setOnClickListener(f7Var.f200505r);
            ((android.widget.TextView) f7Var.f200492e.findViewById(com.tencent.mm.R.id.bln)).setText(com.tencent.mm.R.string.azb);
            android.view.View findViewById4 = f7Var.f200492e.findViewById(com.tencent.mm.R.id.blm);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z28) {
                for (int i17 = 1; i17 < 6; i17++) {
                    android.view.View childAt2 = f7Var.f200491d.getChildAt(i17);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(childAt2, arrayList4.toArray(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(childAt2, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) f7Var.f200491d.getChildAt(1);
                f7Var.f200493f = frameLayout2;
                frameLayout2.setVisibility(0);
                f7Var.f200493f.setOnClickListener(f7Var.f200506s);
                f7Var.f200494g = (android.widget.TextView) f7Var.f200493f.findViewById(com.tencent.mm.R.id.bln);
                android.widget.ImageView imageView = (android.widget.ImageView) f7Var.f200493f.findViewById(com.tencent.mm.R.id.blm);
                f7Var.f200495h = imageView;
                imageView.setVisibility(0);
                if (f7Var.f200496i == com.tencent.mm.ui.chatting.e7.INSTALLED) {
                    f7Var.f200495h.setImageResource(com.tencent.mm.R.raw.promo_icon_qqmail);
                } else {
                    f7Var.f200495h.setImageResource(com.tencent.mm.R.raw.promo_icon_qqmail_uninstall);
                }
                int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_QQMAIL_UNREAD_COUNT_INT, -1)).intValue();
                f7Var.f200497j = intValue;
                if (intValue >= 0) {
                    f7Var.c();
                } else {
                    f7Var.f200494g.setText(com.tencent.mm.R.string.azq);
                }
                for (int i18 = 2; i18 < 6; i18++) {
                    android.view.View childAt3 = f7Var.f200491d.getChildAt(i18);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(childAt3, arrayList5.toArray(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(childAt3, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.lang.String b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
                f7Var.f200504q = b17;
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    f7Var.f200504q = "qqmail://folderlist?app=weixin&action=list&uin=$uin$";
                }
                f7Var.f200504q = f7Var.f200504q.replace("$uin$", new kk.v(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(9, null))).toString());
                f7Var.f200499l = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppRedirectUrAndroid");
                f7Var.f200498k = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 7, 5);
            }
            H0();
        } else {
            this.f199267i = null;
            if (com.tencent.mm.storage.z3.D4(x17)) {
                r0();
                com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.f486091k51);
                boolean z29 = this.f199265g == null;
                com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom5 = (com.tencent.mm.ui.chatting.ChatFooterCustom) this.f198580d.c(com.tencent.mm.R.id.f486093k53);
                this.f199265g = chatFooterCustom5;
                if (z29) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f198580d.c(com.tencent.mm.R.id.bki);
                    yb5.d dVar2 = this.f198580d;
                    chatFooterCustom5.g(viewGroup2, dVar2.f460722q, dVar2.k());
                }
                new com.tencent.mm.ui.chatting.k8(this.f199265g).a();
                H0();
            } else if (com.tencent.mm.storage.z3.A4(x17)) {
                r0();
                com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.f486091k51);
                boolean z37 = this.f199265g == null;
                com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom6 = (com.tencent.mm.ui.chatting.ChatFooterCustom) this.f198580d.c(com.tencent.mm.R.id.f486093k53);
                this.f199265g = chatFooterCustom6;
                if (z37) {
                    android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.f198580d.c(com.tencent.mm.R.id.bki);
                    yb5.d dVar3 = this.f198580d;
                    chatFooterCustom6.g(viewGroup3, dVar3.f460722q, dVar3.k());
                }
                com.tencent.mm.ui.chatting.j7 j7Var = new com.tencent.mm.ui.chatting.j7(this.f199265g);
                this.f199269n = j7Var;
                j7Var.a(e5Var);
                H0();
            } else {
                this.f199269n = null;
                if (com.tencent.mm.storage.z3.R4(x17) && (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).c(x17) || ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).d(x17) || (c01.v1.D(x17) && !this.f199276u))) {
                    r0();
                    com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.f486091k51);
                    boolean z38 = this.f199265g == null;
                    com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom7 = (com.tencent.mm.ui.chatting.ChatFooterCustom) this.f198580d.c(com.tencent.mm.R.id.f486093k53);
                    this.f199265g = chatFooterCustom7;
                    if (z38) {
                        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) this.f198580d.c(com.tencent.mm.R.id.bki);
                        yb5.d dVar4 = this.f198580d;
                        chatFooterCustom7.g(viewGroup4, dVar4.f460722q, dVar4.k());
                    }
                    new com.tencent.mm.ui.chatting.d3(this.f199265g, x17).a();
                    H0();
                } else if (c01.e2.K(x17)) {
                    r0();
                    com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.f486091k51);
                    boolean z39 = this.f199265g == null;
                    com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom8 = (com.tencent.mm.ui.chatting.ChatFooterCustom) this.f198580d.c(com.tencent.mm.R.id.f486093k53);
                    this.f199265g = chatFooterCustom8;
                    if (z39) {
                        android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) this.f198580d.c(com.tencent.mm.R.id.bki);
                        yb5.d dVar5 = this.f198580d;
                        chatFooterCustom8.g(viewGroup5, dVar5.f460722q, dVar5.k());
                    }
                    new com.tencent.mm.ui.chatting.g3(this.f199265g).a();
                    H0();
                } else if (com.tencent.mm.storage.z3.Y3(x17) || com.tencent.mm.storage.z3.D4(x17) || com.tencent.mm.storage.z3.t4(x17) || c01.e2.K(x17) || com.tencent.mm.storage.z3.j4(x17) || c01.e2.L(x17) || com.tencent.mm.storage.z3.B3(x17) || com.tencent.mm.storage.z3.F4(x17) || (com.tencent.mm.storage.z3.R4(x17) && ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).c(x17))) {
                    r0();
                } else {
                    I0();
                    n0(this.f198580d.u());
                    this.f199263e.setUserName(x17);
                    this.f199263e.p1(this.f198580d.t(), this.f198580d.x());
                    w0(x17);
                    sb5.d0 d0Var = (sb5.d0) this.f198580d.f460708c.a(sb5.d0.class);
                    sb5.u1 u1Var = (sb5.u1) this.f198580d.f460708c.a(sb5.u1.class);
                    com.tencent.mm.ui.chatting.component.b5 b5Var = (com.tencent.mm.ui.chatting.component.b5) d0Var;
                    if (b5Var.f198696g) {
                        com.tencent.mm.ui.chatting.component.jk jkVar = (com.tencent.mm.ui.chatting.component.jk) u1Var;
                        if (jkVar.f199306t) {
                            jkVar.p0();
                            b5Var.q0();
                        } else {
                            b5Var.o0();
                        }
                    }
                }
            }
        }
        C0();
        yb5.d dVar6 = this.f198580d;
        com.tencent.mm.ui.chatting.h4 h4Var = new com.tencent.mm.ui.chatting.h4(dVar6, this.f199263e, dVar6.x());
        this.f199264f = h4Var;
        h4Var.f201644i = this.f198580d.f460717l.getBooleanExtra("key_need_send_video", true).booleanValue();
        this.f199263e.setFooterEventListener(this.f199264f);
        yb5.d dVar7 = this.f198580d;
        com.tencent.mm.ui.chatting.i8 i8Var = new com.tencent.mm.ui.chatting.i8(dVar7, dVar7.u(), this.f198580d.x());
        this.f199263e.setSmileyPanelCallback(i8Var);
        this.f199263e.setSmileyPanelCallback2(i8Var);
        G0();
        this.f199263e.l0();
        int intExtra = this.f198580d.f460717l.getIntExtra("key_temp_session_show_type", 0);
        com.tencent.mm.ui.chatting.component.ah ahVar = (com.tencent.mm.ui.chatting.component.ah) ((sb5.e1) this.f198580d.f460708c.a(sb5.e1.class));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.FootComponent", "isTempSession : %s, showType : %d.", java.lang.Boolean.valueOf(ahVar.f198626h), java.lang.Integer.valueOf(intExtra));
        if (ahVar.f198626h) {
            if (intExtra == 1) {
                ((com.tencent.mm.ui.chatting.component.tb) e5Var).a(true);
            } else {
                ((com.tencent.mm.ui.chatting.component.tb) e5Var).a(false);
            }
        }
        n0(this.f198580d.u());
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        ((i41.l) i95.n0.c(i41.l.class)).Ui().add(this);
        if (this.f199268m == null || !com.tencent.mm.storage.z3.r4(this.f198580d.x())) {
            return;
        }
        this.f199268m.getClass();
        er3.c.f256022f.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingQQAssistantFooterHandler", "checkToken");
    }
}
