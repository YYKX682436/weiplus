package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class GameTabWidget2 extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f141185p;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f141186d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.d1 f141187e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f141188f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f141189g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f141190h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem f141191i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f141192m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f141193n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f141194o;

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2$3, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SetGameTabEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1046892393;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.SetGameTabEvent setGameTabEvent) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(setGameTabEvent.f54765g.f8606a);
                if (jSONObject.has("isShowTab")) {
                    int optInt = jSONObject.optInt("isShowTab", -1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget2", "isShowTab:%d", java.lang.Integer.valueOf(optInt));
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.u0(this, optInt));
                }
                if (jSONObject.has("isSwitchEnable")) {
                    int optInt2 = jSONObject.optInt("isSwitchEnable", -1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget2", "isSwitchEnable:%d", java.lang.Integer.valueOf(optInt2));
                    if (optInt2 == 0) {
                        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.this.setTabSwitchEnable(false);
                    } else if (optInt2 == 1) {
                        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.this.setTabSwitchEnable(true);
                    }
                }
                if (jSONObject.has("setRedDot")) {
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray("setRedDot");
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                        java.lang.String optString = optJSONObject.optString("tabKey");
                        int optInt3 = optJSONObject.optInt("redDotNum");
                        if (optJSONObject.optBoolean("isShow")) {
                            com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.this.f141187e;
                            if (d1Var != null) {
                                d1Var.j(optString, optInt3, true);
                            }
                        } else {
                            com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var2 = com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.this.f141187e;
                            if (d1Var2 != null) {
                                d1Var2.j(optString, 0, false);
                            }
                        }
                    }
                }
                if (jSONObject.has("setTabConfigure")) {
                    com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.this.setGameTabStyle(jSONObject.optString("setTabConfigure"));
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameTabWidget2", e17.getMessage());
            }
            return false;
        }
    }

    @mk0.a
    /* loaded from: classes8.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
            if (iPCString != null) {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(iPCString.f68406d);
            }
        }
    }

    @mk0.a
    /* loaded from: classes4.dex */
    public static class b implements com.tencent.mm.ipcinvoker.j {
        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
            d43.b.f226411d.a(iPCString != null ? iPCString.f68406d : "");
        }
    }

    @mk0.a
    /* loaded from: classes4.dex */
    public static class c implements com.tencent.mm.ipcinvoker.j {
        private c() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            d43.b.f226411d.b();
        }
    }

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.tencent.mm.plugin.game.commlib.util.m.f139419a;
        sb6.append(com.tencent.mm.plugin.game.commlib.util.m.f139419a + "PERMANENT/");
        sb6.append("tabnav/");
        f141185p = sb6.toString();
    }

    public GameTabWidget2(android.content.Context context) {
        super(context);
        this.f141188f = true;
        this.f141189g = false;
        this.f141190h = true;
        this.f141192m = false;
        this.f141193n = new java.util.ArrayList();
        this.f141194o = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.AnonymousClass3(com.tencent.mm.app.a0.f53288d);
        c(context);
    }

    public static void a(com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2) {
        gameTabWidget2.removeAllViews();
        java.util.ArrayList arrayList = (java.util.ArrayList) gameTabWidget2.f141193n;
        arrayList.clear();
        int count = gameTabWidget2.f141187e.getCount();
        if (count == 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.B(gameTabWidget2.f141186d) / count, -1);
        for (int i17 = 0; i17 < count; i17++) {
            android.view.View view = gameTabWidget2.f141187e.getView(i17, null, gameTabWidget2);
            arrayList.add(view);
            view.setOnClickListener(new com.tencent.mm.plugin.game.ui.chat_tab.y0(gameTabWidget2));
            view.setLayoutParams(layoutParams);
            gameTabWidget2.addView(view);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget2", "bindLayout");
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = gameTabWidget2.f141187e;
        d1Var.h(d1Var.f141259i, d1Var.f141260m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.app.Activity r23, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 r24, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem r25, m53.e1 r26, java.util.HashMap r27, android.content.Intent r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.d(android.app.Activity, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem, m53.e1, java.util.HashMap, android.content.Intent, boolean):void");
    }

    private java.lang.String getTopChatRoomName() {
        java.lang.String stringExtra = this.f141186d.getIntent().getStringExtra("game_msg_top_chatroom_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return stringExtra == null ? "" : stringExtra;
    }

    private void setAdapter(com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var) {
        this.f141187e = d1Var;
        d1Var.registerDataSetObserver(new com.tencent.mm.plugin.game.ui.chat_tab.v0(this));
        d1Var.notifyDataSetChanged();
    }

    public void b(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2, java.lang.String str) {
        int i17;
        boolean z17;
        if (gameTabData2 == null) {
            return;
        }
        java.util.Iterator it = gameTabData2.f141151d.values().iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) it.next();
            if (tabItem.f141166q == 1 && tabItem.E) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(getTopChatRoomName()), com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.b.class, null);
        }
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = new com.tencent.mm.plugin.game.ui.chat_tab.d1(this, getContext());
        setAdapter(d1Var);
        java.lang.String stringExtra = this.f141186d.getIntent().getStringExtra("game_red_dot_tab_key");
        d1Var.f141255e = gameTabData2;
        d1Var.f141256f = str;
        d1Var.f141257g = stringExtra;
        d1Var.notifyDataSetChanged();
        int z18 = r53.f.z(gameTabData2.f141153f);
        int z19 = r53.f.z(gameTabData2.f141154g);
        if (com.tencent.mm.ui.bk.C()) {
            if (z19 != 0) {
                setBackgroundColor(z19);
            }
        } else if (z18 != 0) {
            setBackgroundColor(z18);
        }
        if (this.f141186d.getIntent().getBooleanExtra("game_tab_exposure", true)) {
            this.f141186d.getIntent().putExtra("game_tab_exposure", false);
            java.lang.String defaultTab = this.f141186d.getIntent().getStringExtra("game_tab_key");
            long intExtra = this.f141186d.getIntent().getIntExtra("game_report_from_scene", 0);
            kotlin.jvm.internal.o.g(defaultTab, "defaultTab");
            com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
            gameLifeSessionStruct.f58340d = 1L;
            gameLifeSessionStruct.f58341e = 101L;
            gameLifeSessionStruct.f58342f = 0L;
            gameLifeSessionStruct.f58343g = 1L;
            gameLifeSessionStruct.f58344h = intExtra;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("default_tab", defaultTab);
            gameLifeSessionStruct.p(java.net.URLEncoder.encode(jSONObject.toString()));
            gameLifeSessionStruct.k();
            java.util.Iterator it6 = gameTabData2.f141151d.entrySet().iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem2 = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) ((java.util.Map.Entry) it6.next()).getValue();
                if (tabItem2 != null) {
                    i17++;
                    if (tabItem2.f141156d.equals(gameTabData2.b())) {
                        this.f141191i = tabItem2;
                        this.f141192m = true;
                    } else {
                        com.tencent.mm.game.report.e.f68194a.h(i17, 0, tabItem2.f141156d, 0, intExtra);
                    }
                }
            }
        }
    }

    public final void c(android.content.Context context) {
        this.f141186d = (android.app.Activity) context;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        setBackgroundResource(com.tencent.mm.R.color.f479188sc);
        setOrientation(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = this.f141187e;
        if (d1Var != null) {
            d1Var.f141257g = str2;
            for (java.util.Map.Entry entry : ((java.util.HashMap) d1Var.f141258h).entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = (com.tencent.mm.plugin.game.ui.chat_tab.c1) entry.getValue();
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) d1Var.f141255e.f141151d.get(str3);
                if (c1Var != null && tabItem != null) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    d1Var.k(c1Var, tabItem, (str == null ? "" : str).equalsIgnoreCase(str3), d1Var.f141257g);
                }
            }
        }
    }

    public void f(int i17, boolean z17) {
        if (this.f141192m && this.f141191i != null) {
            this.f141192m = false;
            int intExtra = this.f141186d.getIntent().getIntExtra("game_report_from_scene", 0);
            com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = this.f141191i;
            dVar.h(tabItem.A, i17, tabItem.f141156d, 6, intExtra);
        }
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var = this.f141187e;
        if (d1Var != null) {
            d1Var.g(z17);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = this.f141191i;
        if (tabItem != null && tabItem.E) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(getTopChatRoomName()), com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.b.class, null);
        }
        this.f141194o.alive();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.c.class, null);
        this.f141194o.dead();
    }

    public void setChatMsgUnreadRedDot(boolean z17) {
        this.f141187e.g(z17);
    }

    public void setGameTabStyle(java.lang.String str) {
        com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("TabList");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null && (d1Var = this.f141187e) != null) {
                    com.tencent.mm.plugin.game.ui.chat_tab.d1.a(d1Var, optJSONObject);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameTabWidget2", e17.getMessage());
        }
    }

    public void setPageChanging(boolean z17) {
        this.f141189g = z17;
    }

    public void setTabSwitchEnable(boolean z17) {
        this.f141188f = z17;
    }

    public GameTabWidget2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f141188f = true;
        this.f141189g = false;
        this.f141190h = true;
        this.f141192m = false;
        this.f141193n = new java.util.ArrayList();
        this.f141194o = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.AnonymousClass3(com.tencent.mm.app.a0.f53288d);
        c(context);
    }

    public GameTabWidget2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f141188f = true;
        this.f141189g = false;
        this.f141190h = true;
        this.f141192m = false;
        this.f141193n = new java.util.ArrayList();
        this.f141194o = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.AnonymousClass3(com.tencent.mm.app.a0.f53288d);
        c(context);
    }
}
