package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes11.dex */
public class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190643e;

    public s4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str) {
        this.f190643e = chatFooter;
        this.f190642d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$96", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String targetUsername = this.f190642d;
        boolean J4 = com.tencent.mm.storage.z3.J4(targetUsername);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190643e;
        if (J4) {
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            android.app.Activity g17 = chatFooter.f189955a3.a().g();
            com.tencent.mm.ui.MMFragment mMFragment = chatFooter.Y2;
            fr4.g0 g0Var = (fr4.g0) fVar;
            g0Var.getClass();
            kotlin.jvm.internal.o.g(targetUsername, "targetUsername");
            java.lang.String str = g0Var.f265825i.field_username;
            if (str == null) {
                str = "";
            }
            java.lang.String z07 = g0Var.Vi().z0(targetUsername);
            java.lang.String stringExtra = mMFragment != null ? mMFragment.getStringExtra("key_w1w_refer_scene") : null;
            if (stringExtra == null) {
                stringExtra = "0";
            }
            java.lang.String str2 = stringExtra;
            java.lang.String stringExtra2 = mMFragment != null ? mMFragment.getStringExtra("key_w1w_refer_scene_note") : null;
            java.lang.String str3 = stringExtra2 == null ? "" : stringExtra2;
            java.lang.String stringExtra3 = mMFragment != null ? mMFragment.getStringExtra("key_w1w_refer_session_id") : null;
            java.lang.String str4 = stringExtra3 != null ? stringExtra3 : "";
            boolean b17 = mMFragment != null ? kotlin.jvm.internal.o.b(mMFragment.getBooleanExtra("key_w1w_conv_is_hello", false), java.lang.Boolean.TRUE) : false;
            q80.d0 d0Var = new q80.d0();
            d0Var.f360649a = "wxalite2fd372f050eecd471a4392786dfae78c";
            d0Var.f360650b = "pages/midway-step/entry";
            d0Var.f360652d = java.lang.Boolean.TRUE;
            d0Var.f360657i = 0;
            d0Var.f360664p = com.tencent.mm.R.anim.f477886ea;
            d0Var.f360665q = com.tencent.mm.R.anim.f477889ed;
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.f144167d = new fr4.b0(sVar, g17, mMFragment, z07);
            d0Var.f360672x = sVar;
            java.lang.String b18 = mr4.a.b();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                java.lang.Integer h17 = r26.h0.h(str2);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, h17 != null ? h17.intValue() : 0);
                jSONObject.put("sceneNote", str3);
                jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str4);
                fr4.s[] sVarArr = fr4.s.f265860d;
                jSONObject.put("referrerPagePath", "w1w-personal-msg-chat");
                jSONObject.put("referrerClickId", b18);
                fr4.o[] oVarArr = fr4.o.f265850d;
                jSONObject.put("type", 6);
                jSONObject.put("fromUsername", str);
                jSONObject.put("toUsername", z07);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("W1w.W1wPersonalMsgService", "Failed to create query JSON for identity change", e17);
            }
            d0Var.f360651c = jSONObject.toString();
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(g17, d0Var, new fr4.c0(g0Var, str2, str3, mMFragment, b18, targetUsername, b17));
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            final android.app.Activity context = chatFooter.f189955a3.a().g();
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(targetUsername, "targetUsername");
            com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
            e3Var.g(android.view.View.inflate(context, com.tencent.mm.R.layout.due, null), new android.widget.FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, -2));
            e3Var.a();
            e3Var.c(true);
            android.view.View view2 = e3Var.f131959f;
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.obc);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            final android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.c9z);
            kotlin.jvm.internal.o.d(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            final com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) view2.findViewById(com.tencent.mm.R.id.lqa);
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
            wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderWxProfileApi$openIdHalf$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.finder.view.cn(new com.tencent.mm.plugin.finder.view.jn(textView2, context, arrayList2, wxRecyclerView));
                }
            }, arrayList2, false));
            int integer = g92.b.f269769e.k2().getInteger(4);
            com.tencent.mm.plugin.finder.view.ko.f132521b = integer;
            com.tencent.mm.plugin.finder.view.ko.f132522c = integer;
            for (r45.of1 of1Var : com.tencent.mm.plugin.finder.live.util.n2.f115640a.a()) {
                java.lang.String string = of1Var.getString(0);
                if (string == null) {
                    string = "";
                }
                int integer2 = of1Var.getInteger(2);
                java.lang.String string2 = of1Var.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                arrayList2.add(new com.tencent.mm.plugin.finder.view.dn(string, integer2, string2));
            }
            androidx.recyclerview.widget.f2 adapter = wxRecyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            textView2.setEnabled(false);
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.view.ln(context, e3Var, targetUsername));
            e3Var.i();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$96", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
