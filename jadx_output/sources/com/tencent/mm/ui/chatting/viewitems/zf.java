package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zf extends com.tencent.mm.ui.chatting.viewitems.a0 {
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;

    /* renamed from: x, reason: collision with root package name */
    public static int f206131x;

    /* renamed from: y, reason: collision with root package name */
    public static int f206132y;

    /* renamed from: z, reason: collision with root package name */
    public static int f206133z;

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f206134s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f206135t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f206136u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f206137v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f206138w = false;

    public static java.lang.String k0(com.tencent.mm.storage.f9 f9Var, android.content.Context context, int i17) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: context is null");
            return null;
        }
        if (f9Var != null) {
            return ot0.g0.i(context, i17, f9Var.j(), f9Var.Q0(), f9Var.getMsgId());
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: msg is null");
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view == null || view.getTag() == null) {
            view = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488464u1);
            com.tencent.mm.ui.chatting.viewitems.qf qfVar = new com.tencent.mm.ui.chatting.viewitems.qf();
            qfVar.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
            qfVar.historyMsgTip = view.findViewById(com.tencent.mm.R.id.bm7);
            qfVar.f205351b = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.bkn);
            qfVar.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            qfVar.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
            qfVar.f205354e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bix);
            view.setTag(qfVar);
        }
        w0(layoutInflater.getContext());
        return view;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean O(android.view.MenuItem r11, final yb5.d r12, final com.tencent.mm.ui.chatting.viewitems.er r13) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.zf.O(android.view.MenuItem, yb5.d, com.tencent.mm.ui.chatting.viewitems.er):boolean");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        this.f206136u = erVar.B;
        int d17 = erVar.d();
        ot0.m0 Di = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j());
        this.f206138w = false;
        int i17 = this.f206136u;
        if (i17 >= 0) {
            java.util.LinkedList linkedList = Di.f348581i;
            if (i17 < linkedList.size() && k01.o.a(((ot0.s0) linkedList.get(this.f206136u)).f348775r)) {
                this.f206138w = true;
            }
        }
        if (!this.f206134s.F() && !com.tencent.mm.ui.chatting.n3.l(f9Var)) {
            g4Var.c(d17, 111, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        boolean z17 = 19 == erVar.E;
        j45.l.g("favorite");
        if (!this.f206138w && !z17) {
            g4Var.c(d17, 126, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        }
        g4Var.c(d17, 100, 0, this.f206134s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    public final void d0(com.tencent.mm.ui.chatting.viewitems.er erVar, ot0.s0 s0Var, com.tencent.mm.storage.f9 f9Var) {
        int i17;
        android.os.Bundle bundle = new android.os.Bundle();
        int a17 = c01.h2.a(A(this.f206134s, f9Var), this.f206134s.x());
        if (a17 != 1) {
            i17 = 2;
            if (a17 != 2) {
                i17 = (a17 == 6 || a17 == 7) ? 5 : 0;
            }
        } else {
            i17 = 3;
        }
        bundle.putString("share_report_pre_msg_url", s0Var.f348762e);
        bundle.putString("share_report_pre_msg_title", s0Var.f348761d);
        bundle.putString("share_report_pre_msg_desc", s0Var.f348769n);
        bundle.putString("share_report_pre_msg_icon_url", ot0.g0.j(s0Var));
        bundle.putString("share_report_pre_msg_appid", "");
        bundle.putInt("share_report_from_scene", i17);
        if (i17 == 5) {
            bundle.putString("share_report_biz_username", this.f206134s.x());
        }
        erVar.D = bundle;
    }

    public final void e0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        boolean z17 = this.f206138w;
        if (!z17) {
            java.lang.String k07 = k0(f9Var, dVar.g(), this.f206136u);
            if (com.tencent.mm.sdk.platformtools.t8.K0(k07)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", k07);
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.f206136u);
            intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_MsgFromScene", 1);
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String a17 = c01.n2.a("" + f9Var.I0());
            intent.putExtra("reportSessionId", a17);
            intent.putExtra("scene_from", 17);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "msg_" + f9Var.I0());
            c17.i("preUsername", Q0);
            c17.i("preChatName", Q0);
            c17.i("preMsgIndex", java.lang.Integer.valueOf(this.f206136u));
            c17.i("sendAppMsgScene", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "doRestransmit", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "doRestransmit", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemBizFrom", "transmitAppBrandMsg not AppBrandMsg!");
            return;
        }
        int i17 = this.f206136u;
        android.app.Activity g17 = dVar.g();
        java.lang.String j17 = f9Var.j();
        java.lang.String Q02 = f9Var.Q0();
        long msgId = f9Var.getMsgId();
        long I0 = f9Var.I0();
        java.util.Map map = com.tencent.mm.ui.chatting.w5.f206212a;
        ot0.m0 Di = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(msgId, j17);
        if (i17 >= 0) {
            java.util.LinkedList linkedList = Di.f348581i;
            if (i17 < linkedList.size()) {
                ot0.s0 s0Var = (ot0.s0) linkedList.get(i17);
                java.lang.String u17 = ot0.q.u(com.tencent.mm.ui.chatting.a4.a(Q02, s0Var), null, null);
                if (com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                    return;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("desc", s0Var.f348769n);
                hashMap.put("type", 2);
                hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, s0Var.f348761d);
                hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, s0Var.f348779v);
                hashMap.put("pkg_type", java.lang.Integer.valueOf(s0Var.f348778u));
                hashMap.put("pkg_version", java.lang.Integer.valueOf(s0Var.f348777t));
                hashMap.put("img_url", s0Var.f348780w);
                hashMap.put("is_dynamic", java.lang.Boolean.FALSE);
                hashMap.put("cache_key", "");
                hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, s0Var.f348776s);
                android.content.Intent intent2 = new android.content.Intent(g17, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent2.putExtra("appbrand_params", hashMap);
                intent2.putExtra("Retr_Msg_content", u17);
                intent2.putExtra("Retr_Msg_Type", 2);
                intent2.putExtra("Retr_Biz_Msg_Selected_Msg_Index", i17);
                intent2.putExtra("Retr_Msg_Id", msgId);
                intent2.putExtra("Retr_MsgTalker", Q02);
                intent2.putExtra("Retr_MsgFromScene", 3);
                java.lang.String a18 = c01.n2.a("" + I0);
                intent2.putExtra("reportSessionId", a18);
                intent2.putExtra("scene_from", 17);
                c01.l2 c18 = c01.n2.d().c(a18, true);
                c18.i("prePublishId", "msg_" + I0);
                c18.i("preUsername", Q02);
                c18.i("preChatName", Q02);
                c18.i("preMsgIndex", java.lang.Integer.valueOf(i17));
                c18.i("sendAppMsgScene", 1);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "transmitAppBrandMsg", "(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                g17.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(g17, "com/tencent/mm/ui/chatting/ChattingItemHelper", "transmitAppBrandMsg", "(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public final void f0(com.tencent.mm.ui.chatting.viewitems.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.tencent.mm.ui.chatting.adapter.q qVar, ot0.r0 r0Var) {
        eq1.h hVar = eq1.h.f255812a;
        ot0.q0 e17 = hVar.e(s0Var.M, 0);
        if (!((com.tencent.mm.sdk.platformtools.t8.K0(s0Var.D) || com.tencent.mm.sdk.platformtools.t8.K0(s0Var.N)) ? false : true)) {
            android.view.View view = qfVar.f205361l.f205425d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.chatting.viewitems.rf rfVar = qfVar.f205361l;
            android.view.View view2 = rfVar.f205433l;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rfVar.f205428g.setText(e17.f348744m);
            android.widget.TextView textView = rfVar.f205428g;
            android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
            rfVar.f205429h.setText(e17.f348738d);
            rfVar.f205430i.setText("");
            hVar.j(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(e17.f348741g), rfVar.f205431j, rfVar.f205432k);
            rfVar.f205263a.setTag(com.tencent.mm.R.id.bph, e17.f348741g);
            hVar.f(e17.f348740f, e17.f348741g, new com.tencent.mm.ui.chatting.viewitems.bg(this, e17, qfVar));
            fq1.e.f265507a.g(rfVar.f205263a, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6), true, r0Var.f348581i.size() <= 1);
            hVar.h(rfVar.f205427f, rfVar.f205426e, e17.f348750s, null);
            o0(qfVar, s0Var, dVar, qVar, r0Var, rfVar.f205263a);
            rfVar.f205263a.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.cg(this, i17, e17, r0Var));
            return;
        }
        android.view.View view3 = qfVar.f205361l.f205425d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.chatting.viewitems.rf rfVar2 = qfVar.f205361l;
        android.view.View view4 = rfVar2.f205433l;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 1) {
            android.view.View view5 = rfVar2.f205439r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = rfVar2.f205436o;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rfVar2.f205440s.setText(s0Var.f348761d);
            rfVar2.f205441t.setVisibility(8);
            android.widget.TextView textView2 = rfVar2.f205437p;
            android.text.TextPaint paint3 = textView2 != null ? textView2.getPaint() : null;
            if (paint3 != null) {
                paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint4 = textView2 != null ? textView2.getPaint() : null;
            if (paint4 != null) {
                paint4.setStrokeWidth(0.8f);
            }
            fq1.e.f265507a.g(rfVar2.f205439r, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4), false, true);
        } else {
            android.view.View view7 = rfVar2.f205439r;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = rfVar2.f205436o;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rfVar2.f205437p.setText(s0Var.f348761d);
            rfVar2.f205438q.setVisibility(8);
        }
        hVar.l(rfVar2.f205435n, s0Var.N, null);
        p0(rfVar2.f205434m, E);
        fq1.e.f265507a.g(rfVar2.f205263a, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4), true, false);
        o0(qfVar, s0Var, dVar, qVar, r0Var, rfVar2.f205263a);
        hVar.j(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(e17.f348741g), rfVar2.f205442u, rfVar2.f205443v);
        rfVar2.f205263a.setTag(com.tencent.mm.R.id.bph, e17.f348741g);
        hVar.f(e17.f348740f, e17.f348741g, new com.tencent.mm.ui.chatting.viewitems.ng(this, e17, qfVar, i17));
        rfVar2.f205263a.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.ag(this, i17, e17, r0Var));
    }

    public final void g0(com.tencent.mm.ui.chatting.viewitems.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.tencent.mm.ui.chatting.adapter.q qVar, ot0.r0 r0Var) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348761d)) {
            qfVar.f205359j.f205264b.setVisibility(8);
        } else {
            qfVar.f205359j.f205264b.setVisibility(0);
            android.widget.TextView textView = qfVar.f205359j.f205264b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = this.f206134s.g();
            java.lang.String str = s0Var.f348761d;
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, str));
        }
        if (i17 > 1) {
            qfVar.f205359j.f205263a.setBackgroundResource(com.tencent.mm.R.drawable.f481224np);
        } else {
            qfVar.f205359j.f205263a.setBackgroundResource(com.tencent.mm.R.drawable.bc9);
        }
        if (android.text.TextUtils.isEmpty(s0Var.A)) {
            qfVar.f205359j.f205519d.setVisibility(8);
        } else {
            qfVar.f205359j.f205519d.setVisibility(0);
            qfVar.f205359j.f205519d.setText(s0Var.A);
        }
        if (s0Var.B == 2) {
            qfVar.f205359j.f205522g.setImageResource(com.tencent.mm.R.raw.chatting_item_biz_kugou_music_watermark);
        } else {
            qfVar.f205359j.f205522g.setImageResource(com.tencent.mm.R.raw.chatting_item_biz_qq_music_watermark);
        }
        s0(this.f206134s, qfVar.f205359j.f205521f, f9Var, 0, s0Var.f348766i);
        com.tencent.mm.ui.chatting.viewitems.sf sfVar = qfVar.f205359j;
        o0(qfVar, s0Var, dVar, qVar, r0Var, sfVar.f205263a);
        if (com.tencent.mm.plugin.brandservice.ui.timeline.j3.a(f9Var.getMsgId(), 0).equals(te5.t.c(null))) {
            sfVar.f205521f.setImageResource(com.tencent.mm.R.raw.chatting_item_biz_music_pause_loading_icon);
        } else {
            sfVar.f205521f.setImageResource(com.tencent.mm.R.raw.chatting_item_biz_music_play_loading_icon);
        }
        sfVar.f205265c.setVisibility(8);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(qfVar);
        java.lang.String str2 = s0Var.f348766i;
        android.widget.ImageView imageView = sfVar.f205520e;
        int type = f9Var.getType();
        int i18 = B;
        l0(str2, imageView, type, i18, i18, "@S", new com.tencent.mm.ui.chatting.viewitems.kg(this, weakReference, f9Var));
    }

    public final void h0(com.tencent.mm.ui.chatting.viewitems.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.tencent.mm.ui.chatting.adapter.q qVar, ot0.r0 r0Var) {
        com.tencent.mm.ui.chatting.viewitems.uf ufVar;
        boolean z17;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        qfVar.f205352c.f205684h.setVisibility(i17 > 1 ? 8 : 0);
        com.tencent.mm.ui.chatting.viewitems.uf ufVar2 = qfVar.f205352c;
        ufVar2.f205685i.setVisibility((i17 > 1 || com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348769n)) ? 8 : 0);
        ufVar2.f205683g.setVisibility(i17 > 1 ? 0 : 8);
        ufVar2.f205687k.setVisibility(8);
        if (i17 == 1) {
            ufVar2.f205686j.setBackgroundResource(com.tencent.mm.R.drawable.f481238o4);
            android.view.View view = ufVar2.f205682f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = ufVar2.f205682f;
            int i18 = com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348766i) ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ufVar2.f205686j.setBackgroundResource(com.tencent.mm.R.drawable.f481239o5);
            ufVar2.f205683g.setTextColor(this.f206134s.g().getResources().getColor(com.tencent.mm.R.color.f479304vk));
            ufVar2.f205683g.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
            ufVar2.f205683g.getPaint().setFakeBoldText(true);
        }
        p0(ufVar2.f205681e, C);
        p0(ufVar2.f205686j, C);
        if (com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348766i)) {
            ufVar = ufVar2;
            z17 = false;
            ufVar.f205685i.setMaxLines(100);
            android.view.View view3 = ufVar.f205681e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ufVar.f205684h.setVisibility(0);
            ufVar.f205685i.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348769n) ? 8 : 0);
            if (i17 == 1) {
                ufVar.f205682f.setBackgroundResource(com.tencent.mm.R.drawable.bc9);
            } else {
                ufVar.f205682f.setBackgroundResource(com.tencent.mm.R.drawable.f481224np);
            }
            android.view.View view4 = ufVar.f205682f;
            int i19 = f206133z;
            view4.setPadding(i19, i19, i19, i19);
            ufVar.f205686j.setVisibility(8);
        } else {
            android.view.View view5 = ufVar2.f205681e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ufVar = ufVar2;
            z17 = false;
            n0(s0Var.f348766i, ufVar2.f205680d, f9Var.getType(), true, false, false, 0, C, new com.tencent.mm.ui.chatting.viewitems.ig(this, i17, qfVar));
            ufVar.f205682f.setBackgroundResource(com.tencent.mm.R.drawable.f481216nh);
            android.view.View view6 = ufVar.f205682f;
            int i27 = f206133z;
            view6.setPadding(i27, f206132y, i27, i27);
            ufVar.f205686j.setVisibility(0);
            ufVar.f205685i.setMaxLines(30);
        }
        ufVar.f205685i.setText(s0Var.f348769n);
        lr1.f fVar = lr1.f.f320657a;
        fVar.g(s0Var.f348761d, ufVar.f205684h, s0Var, 2);
        fVar.g(s0Var.f348761d, ufVar.f205683g, s0Var, 21);
        int i28 = s0Var.f348771p;
        if (i28 != 0 && i28 != 1) {
            ufVar.f205683g.setVisibility(4);
        }
        o0(qfVar, s0Var, dVar, qVar, r0Var, ufVar.f205263a);
        if (com.tencent.mm.storage.z3.P4(f9Var.Q0())) {
            if ((f9Var.F & 16384) != 0 ? true : z17) {
                return;
            }
            java.lang.String str = s0Var.f348762e;
            com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct weGamePluginReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WeGamePluginReportStruct();
            weGamePluginReportStruct.f62911d = 1L;
            weGamePluginReportStruct.f62912e = 2L;
            weGamePluginReportStruct.f62913f = weGamePluginReportStruct.b("BizContent", str, true);
            weGamePluginReportStruct.k();
        }
    }

    public final void i0(com.tencent.mm.ui.chatting.viewitems.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.tencent.mm.ui.chatting.adapter.q qVar, ot0.r0 r0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348761d)) {
            qfVar.f205360k.f205851e.setVisibility(8);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(s0Var.T)) {
                qfVar.f205360k.f205850d.setVisibility(8);
                qfVar.f205360k.f205851e.setMinHeight(i65.a.b(this.f206134s.g(), 90));
            } else {
                qfVar.f205360k.f205850d.setVisibility(0);
                com.tencent.mm.ui.chatting.viewitems.vf vfVar = qfVar.f205360k;
                vfVar.f205850d.b(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).nj(this.f206134s.g(), s0Var.T, (int) vfVar.f205850d.getTextSize()));
                vfVar.f205850d.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                vfVar.f205850d.getPaint().setStrokeWidth(0.8f);
                vfVar.f205851e.setMinHeight(0);
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = qfVar.f205360k.f205851e;
            mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(this.f206134s.g())));
            com.tencent.mm.ui.chatting.viewitems.vf vfVar2 = qfVar.f205360k;
            vfVar2.f205851e.setVisibility(0);
            vfVar2.f205851e.b(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).nj(this.f206134s.g(), s0Var.f348761d, (int) vfVar2.f205851e.getTextSize()));
            int e17 = fq1.e.f265507a.e(this.f206134s.g()) - ((int) (i65.a.g(this.f206134s.g()) * 80.0f));
            ks5.a i18 = vfVar2.f205851e.i(e17, Integer.MAX_VALUE);
            ks5.a i19 = vfVar2.f205850d.i(e17, Integer.MAX_VALUE);
            int i27 = i18 != null ? ((com.tencent.neattextview.textview.layout.NeatLayout) i18).L + 0 : 0;
            int min = i19 != null ? java.lang.Math.min(((com.tencent.neattextview.textview.layout.NeatLayout) i19).L, 2) + 0 : 0;
            int i28 = i27 + min;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) vfVar2.f205851e.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) vfVar2.f205850d.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) vfVar2.f205853g.getLayoutParams();
            if (i28 <= 5) {
                vfVar2.f205852f.setVisibility(8);
                layoutParams3.gravity = 16;
                vfVar2.f205853g.setLayoutParams(layoutParams3);
            } else {
                vfVar2.f205851e.setMaxLines(5 - min);
                vfVar2.f205852f.setVisibility(0);
                layoutParams3.gravity = 48;
                vfVar2.f205853g.setLayoutParams(layoutParams3);
                vfVar2.f205852f.setText(com.tencent.mm.R.string.m79);
                vfVar2.f205852f.setClickable(false);
            }
            if (i28 <= 2) {
                vfVar2.f205851e.setTextGravity(17);
                vfVar2.f205850d.setTextGravity(17);
                layoutParams.gravity = 17;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.T)) {
                    layoutParams2.gravity = 17;
                }
            } else {
                vfVar2.f205851e.setTextGravity(8388627);
                vfVar2.f205850d.setTextGravity(8388627);
                layoutParams.gravity = 8388627;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.T)) {
                    layoutParams2.gravity = 8388627;
                }
            }
            vfVar2.f205851e.setLayoutParams(layoutParams);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.T)) {
                vfVar2.f205850d.setLayoutParams(layoutParams2);
            }
        }
        if (i17 > 1) {
            qfVar.f205360k.f205263a.setBackgroundResource(com.tencent.mm.R.drawable.f481224np);
        } else {
            qfVar.f205360k.f205263a.setBackgroundResource(com.tencent.mm.R.drawable.bc9);
        }
        o0(qfVar, s0Var, dVar, qVar, r0Var, qfVar.f205360k.f205263a);
    }

    public final com.tencent.mm.sdk.platformtools.n3 j0() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0de1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0dfe  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0d83  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0e7e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0f18 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0c05  */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 r50, yb5.d r51, rd5.d r52, java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 3865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.zf.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }

    public final void l0(java.lang.String str, android.widget.ImageView imageView, int i17, int i18, int i19, java.lang.String str2, r35.l0 l0Var) {
        java.lang.String b17 = qk.c.b(str, 3, true);
        n11.a b18 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f342101y = j0();
        fVar.f342093q = com.tencent.mm.R.color.f478816i1;
        fVar.f342078b = true;
        fVar.f342086j = i18;
        fVar.f342087k = i19;
        fVar.A = new r35.n0(2);
        fVar.B = new r35.w(2);
        fVar.f342082f = tv.a.b(b17);
        b18.k(b17, imageView, fVar.a(), null, new r35.m0(2, 0, 0, null, l0Var));
    }

    public final void m0(java.lang.String str, android.widget.ImageView imageView, int i17, int i18) {
        n11.a b17 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f342101y = j0();
        fVar.f342077a = true;
        fVar.f342091o = com.tencent.mm.R.color.f478816i1;
        fVar.f342086j = i17;
        fVar.f342087k = i18;
        fVar.f342085i = 4;
        b17.k(str, imageView, fVar.a(), null, new r35.m0(0, 0, null, null));
    }

    public final void n0(java.lang.String str, android.widget.ImageView imageView, int i17, boolean z17, boolean z18, boolean z19, int i18, int i19, r35.l0 l0Var) {
        java.lang.String b17 = qk.c.b(str, 3, true);
        int i27 = z17 ? com.tencent.mm.R.drawable.bww : com.tencent.mm.R.drawable.bwv;
        if (z18) {
            i27 = com.tencent.mm.R.drawable.cig;
        } else if (z19) {
            i27 = com.tencent.mm.R.drawable.cih;
        }
        boolean z27 = !z17;
        int i28 = z17 ? com.tencent.mm.R.drawable.f480974gs : com.tencent.mm.R.drawable.f480973gr;
        float dimensionPixelSize = this.f206134s.g().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480233s4);
        if (z18 || z19) {
            dimensionPixelSize = this.f206134s.g().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.akv);
        }
        float f17 = dimensionPixelSize;
        int e17 = fq1.e.f265507a.e(imageView.getContext()) - ((int) (i65.a.g(imageView.getContext()) * (((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f206134s.f460708c.a(sb5.z.class))).T ? 72 : 32)));
        if (i18 > 0) {
            e17 = i18;
        }
        n11.a b18 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f342093q = i28;
        fVar.f342078b = true;
        fVar.D = i27 + "";
        fVar.f342086j = e17;
        fVar.f342087k = i19;
        fVar.f342101y = j0();
        fVar.A = new r35.n0(2);
        fVar.B = new r35.w(2);
        fVar.f342082f = tv.a.b(b17);
        b18.k(b17, imageView, fVar.a(), null, new r35.m0(2, e17, i19, true, z27, f17, l0Var, j0(), z18, z19));
    }

    public final void o0(com.tencent.mm.ui.chatting.viewitems.qf qfVar, ot0.s0 s0Var, rd5.d dVar, com.tencent.mm.ui.chatting.adapter.q qVar, ot0.r0 r0Var, android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        android.view.View view2;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        java.lang.String y07 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f206134s.f460708c.a(sb5.f.class))).y0(s0Var.f348762e);
        if (android.text.TextUtils.isEmpty(y07)) {
            erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar, false, qVar, s0Var.f348762e, false, this.f206134s.w(), r0Var.f348578f, r0Var.f348579g, s0Var.f348761d);
            d0(erVar, s0Var, f9Var);
            view.setOnClickListener(B(this.f206134s));
        } else {
            erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar, false, qVar, s0Var.f348762e, false, this.f206134s.w(), r0Var.f348578f, r0Var.f348579g, s0Var.f348761d, y07, (java.lang.String) null, false, false);
            view.setOnClickListener(s(this.f206134s));
        }
        erVar.A = f9Var.I0();
        erVar.B = 0;
        erVar.E = s0Var.f348770o;
        erVar.F = s0Var.f348761d;
        erVar.G = ot0.g0.j(s0Var);
        view.setTag(erVar);
        if (k01.o.a(s0Var.f348775r)) {
            java.lang.String x17 = this.f206134s.x();
            java.util.Map map = com.tencent.mm.ui.chatting.w5.f206212a;
            view.setOnClickListener(new com.tencent.mm.ui.chatting.s5(s0Var, x17));
        }
        long msgId = f9Var.getMsgId();
        java.lang.String Q0 = f9Var.Q0();
        long I0 = f9Var.I0();
        if (5 == s0Var.f348770o) {
            view2 = view;
            view2.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.eg(this, s0Var, 0, msgId, Q0, I0));
        } else {
            view2 = view;
        }
        view2.setOnLongClickListener(u(this.f206134s));
        view2.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f206134s.f460708c.a(sb5.z.class))).B1);
    }

    public final void p0(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
    }

    public final void q0(com.tencent.mm.ui.chatting.viewitems.of ofVar, int i17, int i18, int i19, java.util.List list) {
        int i27;
        if (i19 != 1 || (i17 != 5 && i17 != 8 && i17 != 0)) {
            android.view.View view = ofVar.f205189b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i19 > 1) {
                ot0.s0 s0Var = (ot0.s0) list.get(i19 - 1);
                ot0.s0 s0Var2 = (ot0.s0) list.get(i19);
                int i28 = s0Var.f348770o;
                if ((i28 == 7 || i28 == 5 || i28 == 6 || !com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348766i)) && ((i27 = s0Var2.f348770o) == 7 || i27 == 5 || i27 == 6 || !com.tencent.mm.sdk.platformtools.t8.K0(s0Var2.f348766i))) {
                    t0(ofVar.f205189b, A);
                } else {
                    t0(ofVar.f205189b, f206133z);
                }
            } else {
                t0(ofVar.f205189b, f206133z);
            }
        } else if (i17 == 0 && com.tencent.mm.sdk.platformtools.t8.K0(((ot0.s0) list.get(0)).f348766i)) {
            android.view.View view2 = ofVar.f205189b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t0(ofVar.f205189b, f206133z);
        } else {
            android.view.View view3 = ofVar.f205189b;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i19 == 1) {
            if (i19 != i18 - 1) {
                ofVar.f205190c.setPadding(0, f206133z, 0, f206131x);
                return;
            }
            android.view.View view4 = ofVar.f205190c;
            int i29 = f206133z;
            view4.setPadding(0, i29, 0, i29);
            return;
        }
        if (i19 == i18 - 1) {
            ofVar.f205190c.setPadding(0, f206131x, 0, f206133z);
            return;
        }
        android.view.View view5 = ofVar.f205190c;
        int i37 = f206131x;
        view5.setPadding(0, i37, 0, i37);
    }

    public final void r0(com.tencent.mm.ui.chatting.viewitems.qf qfVar, com.tencent.mm.ui.chatting.viewitems.of ofVar, ot0.s0 s0Var, com.tencent.mm.storage.f9 f9Var, int i17, boolean z17) {
        android.view.View view = ofVar.f205197j;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i18 = s0Var.f348770o;
        if (i18 == 5) {
            ofVar.f205195h.setVisibility(0);
            if (z17) {
                ofVar.f205195h.setImageResource(com.tencent.mm.R.drawable.f481006i1);
            } else {
                ofVar.f205195h.setImageResource(com.tencent.mm.R.drawable.f481006i1);
            }
            ofVar.f205195h.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.dg(this, ofVar));
        } else if (i18 == 6) {
            ofVar.f205195h.setVisibility(0);
            if (z17) {
                if (com.tencent.mm.plugin.brandservice.ui.timeline.j3.a(f9Var.getMsgId(), i17).equals(te5.t.c(null))) {
                    ofVar.f205195h.setImageResource(com.tencent.mm.R.drawable.f481205n4);
                } else {
                    ofVar.f205195h.setImageResource(com.tencent.mm.R.drawable.f481206n5);
                }
            } else if (com.tencent.mm.plugin.brandservice.ui.timeline.j3.a(f9Var.getMsgId(), i17).equals(te5.t.c(null))) {
                ofVar.f205195h.setImageResource(com.tencent.mm.R.raw.chatting_item_biz_music_pause_loading_icon);
            } else {
                ofVar.f205195h.setImageResource(com.tencent.mm.R.raw.chatting_item_biz_music_play_loading_icon);
            }
            s0(this.f206134s, ofVar.f205195h, f9Var, i17, s0Var.f348766i);
        } else if (i18 == 7) {
            ofVar.f205195h.setVisibility(8);
            android.view.View view2 = ofVar.f205197j;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.graphics.drawable.Drawable drawable = ofVar.f205196i.getDrawable();
            if (drawable instanceof android.graphics.drawable.AnimationDrawable) {
                android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
            }
            if (com.tencent.mm.plugin.brandservice.ui.timeline.j3.a(f9Var.getMsgId(), i17).equals(te5.t.c(null))) {
                ofVar.f205196i.setImageResource(com.tencent.mm.R.drawable.f481008i3);
                if (ofVar.f205196i.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) {
                    ((android.graphics.drawable.AnimationDrawable) ofVar.f205196i.getDrawable()).start();
                }
            } else {
                ofVar.f205196i.setImageResource(com.tencent.mm.R.drawable.f481007i2);
            }
            s0(this.f206134s, ofVar.f205196i, f9Var, i17, s0Var.f348766i);
        } else {
            ofVar.f205195h.setVisibility(8);
        }
        int b17 = i65.a.b(this.f206134s.g(), 26);
        int i19 = s0Var.f348770o;
        if (i19 == 7) {
            b17 = i65.a.b(this.f206134s.g(), 32);
        } else if (i19 == 5) {
            b17 = i65.a.b(this.f206134s.g(), 24);
        }
        android.widget.ImageView imageView = ofVar.f205195h;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = b17;
        layoutParams.height = b17;
        imageView.setLayoutParams(layoutParams);
    }

    public final void s0(yb5.d dVar, android.widget.ImageView imageView, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.d3 d3Var = new com.tencent.mm.ui.chatting.viewitems.d3();
        d3Var.f203758a = f9Var.getMsgId();
        d3Var.f203759b = f9Var.I0();
        d3Var.f203765h = i17;
        d3Var.f203764g = f9Var.j();
        d3Var.f203760c = com.tencent.mm.plugin.brandservice.ui.timeline.j3.a(d3Var.f203758a, d3Var.f203765h);
        d3Var.f203763f = il4.l.d(A(dVar, f9Var));
        d3Var.f203768k = true;
        d3Var.f203769l = 2;
        d3Var.f203766i = A(dVar, f9Var);
        imageView.setTag(d3Var);
        imageView.setOnClickListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f206134s.f460708c.a(sb5.z.class))).H1);
    }

    public final void t0(android.view.View view, int i17) {
        if (view.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.rightMargin = i17;
            view.setLayoutParams(layoutParams);
        } else if (view.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.rightMargin = i17;
            view.setLayoutParams(layoutParams2);
        }
    }

    public final void u0(android.view.View view, com.tencent.mm.ui.chatting.viewitems.pf pfVar, boolean z17) {
        if (!z17) {
            android.view.View view2 = pfVar.f205263a;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (pfVar.f205263a == null) {
            pfVar.a(view);
        }
        android.view.View view3 = pfVar.f205263a;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void v0(com.tencent.mm.ui.chatting.viewitems.qf qfVar, int i17, int i18, ot0.s0 s0Var) {
        boolean z17 = false;
        boolean z18 = i17 == 5;
        u0(qfVar.f205351b, qfVar.f205355f, z18);
        boolean z19 = i17 == 8 && s0Var.f348773p1 == 1 && s0Var.C >= 3;
        u0(qfVar.f205351b, qfVar.f205357h, z19);
        if (z19) {
            z18 = true;
        }
        boolean z27 = i17 == 8 && !z19;
        u0(qfVar.f205351b, qfVar.f205356g, z27);
        if (z27) {
            z18 = true;
        }
        boolean z28 = i17 == 7;
        u0(qfVar.f205351b, qfVar.f205358i, z28);
        if (z28) {
            z18 = true;
        }
        boolean z29 = i17 == 6;
        u0(qfVar.f205351b, qfVar.f205359j, z29);
        if (z29) {
            z18 = true;
        }
        boolean z37 = i17 == 10;
        u0(qfVar.f205351b, qfVar.f205360k, z37);
        if (z37) {
            z18 = true;
        }
        boolean z38 = i17 == 19 && eq1.h.f255812a.b(s0Var.M, 0);
        u0(qfVar.f205351b, qfVar.f205361l, z38);
        if (z38) {
            z18 = true;
        }
        android.widget.LinearLayout linearLayout = qfVar.f205351b;
        if (!z18 && i18 > 0) {
            z17 = true;
        }
        u0(linearLayout, qfVar.f205352c, z17);
    }

    public void w0(android.content.Context context) {
        if (f206131x == 0 || com.tencent.mm.ui.bk.Q()) {
            f206131x = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3);
            f206132y = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx);
            f206133z = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
            B = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480230s1);
            A = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480228rz);
            com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
            int i17 = a17.f197135a;
            int i18 = a17.f197136b;
            int g17 = (i17 < i18 ? i17 : i18) - ((int) (i65.a.g(context) * 32.0f));
            C = (int) (g17 / 2.35d);
            int i19 = (int) (g17 / 1.7777778f);
            D = i19;
            E = i19;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizFrom", "updatePadding w:%d h:%d coverWidth:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(g17));
        }
    }
}
