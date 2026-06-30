package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class ChatFooterCustom extends android.widget.LinearLayout implements android.view.View.OnClickListener, c01.zc {
    public static final /* synthetic */ int G = 0;
    public final java.util.List A;
    public final java.util.HashSet B;
    public r01.g0 C;
    public java.lang.String D;
    public int E;
    public final java.lang.Object F;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f198167d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f198168e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f198169f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f198170g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.n2 f198171h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.e5 f198172i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.biz.j0 f198173m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f198174n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f198175o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f198176p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f198177q;

    /* renamed from: r, reason: collision with root package name */
    public int f198178r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f198179s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f198180t;

    /* renamed from: u, reason: collision with root package name */
    public qk.o f198181u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChatFooterCustom.GetLocationListener f198182v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChatFooterCustom.GetScanCodeListener f198183w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragment f198184x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f198185y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f198186z;

    /* loaded from: classes11.dex */
    public class GetLocationListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PublishLocationEvent> {
        public GetLocationListener() {
            super(com.tencent.mm.app.a0.f53288d);
            this.__eventId = 82634054;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.PublishLocationEvent publishLocationEvent) {
            com.tencent.mm.autogen.events.PublishLocationEvent publishLocationEvent2 = publishLocationEvent;
            int i17 = publishLocationEvent2.f54630g.f8388a;
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = com.tencent.mm.ui.chatting.ChatFooterCustom.this;
            if (i17 == 0) {
                chatFooterCustom.f(1005, publishLocationEvent2);
                return false;
            }
            if (i17 != 1) {
                return false;
            }
            chatFooterCustom.f(1006, publishLocationEvent2);
            return false;
        }
    }

    /* loaded from: classes11.dex */
    public class GetScanCodeListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PublishScanCodeResultEvent> {
        public GetScanCodeListener() {
            super(com.tencent.mm.app.a0.f53288d);
            this.__eventId = 1233251508;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.PublishScanCodeResultEvent publishScanCodeResultEvent) {
            com.tencent.mm.autogen.events.PublishScanCodeResultEvent publishScanCodeResultEvent2 = publishScanCodeResultEvent;
            int i17 = publishScanCodeResultEvent2.f54631g.f8470a;
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = com.tencent.mm.ui.chatting.ChatFooterCustom.this;
            if (i17 == 0) {
                chatFooterCustom.f(1003, publishScanCodeResultEvent2);
                return false;
            }
            if (i17 != 1) {
                return false;
            }
            chatFooterCustom.f(1004, publishScanCodeResultEvent2);
            return false;
        }
    }

    public ChatFooterCustom(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private java.lang.String getSender() {
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "getSender true " + c01.z1.r());
        return c01.z1.r();
    }

    @Override // c01.zc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "SysCmdMsgExtension:" + g17);
        try {
            org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            org.xmlpull.v1.XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new java.io.StringReader(g17));
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 0 || eventType == 2) {
                    java.lang.String name = newPullParser.getName();
                    if ("sysmsg".equals(name)) {
                        if ("type".equals(newPullParser.getAttributeName(0))) {
                            newPullParser.getAttributeValue(0);
                        }
                    } else if (dm.i4.COL_USERNAME.equals(name)) {
                        newPullParser.nextText();
                    } else if (com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA.equals(name)) {
                        newPullParser.nextText();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChatCustomFooter", e17, "", new java.lang.Object[0]);
        }
    }

    public void a(r01.g0 g0Var) {
        java.lang.String str = "" + g0Var.f368073a + g0Var.f368076d;
        synchronized (this.F) {
            ((java.util.LinkedList) this.A).add(str);
        }
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "addToMenuClickCmdList %s %d", str, java.lang.Integer.valueOf(((java.util.LinkedList) this.A).size()));
    }

    public void b() {
        com.tencent.mm.storage.z3 z3Var = this.f198180t;
        if (z3Var != null && z3Var.f236586x1 == 1) {
            com.tencent.mm.storage.l8 r17 = c01.d9.b().r();
            java.lang.String d17 = this.f198180t.d1();
            com.tencent.mm.storage.m4 m4Var = (com.tencent.mm.storage.m4) r17;
            m4Var.getClass();
            if (d17 == null || d17.length() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConversationStorage", "setMoveUp conversation failed");
            } else {
                m4Var.R(m4Var.p(d17));
            }
        }
    }

    public final void c(r01.g0 g0Var) {
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", g0Var.b());
        c01.d9.e().g(new r01.g3(this.f198179s, 1, g0Var.b(), null, getContext() instanceof android.app.Activity ? ((android.app.Activity) getContext()).getIntent().getStringExtra("uinserve_search_click_id") : ""));
    }

    public final boolean d(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.autogen.events.PublishLocationEvent)) {
            com.tencent.mars.xlog.Log.e("ChatCustomFooter", "send current location data type error!");
            return true;
        }
        am.xo xoVar = ((com.tencent.mm.autogen.events.PublishLocationEvent) obj).f54630g;
        double d17 = xoVar.f8389b;
        double d18 = xoVar.f8390c;
        int i17 = xoVar.f8391d;
        java.lang.String str = xoVar.f8392e;
        java.lang.String str2 = xoVar.f8393f;
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "lat:%f , lng:%f , scale: %d , label:%s , poiname:%s", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18), java.lang.Integer.valueOf(i17), str, str2);
        r01.g0 g0Var = this.C;
        if (g0Var == null || g0Var.f368081i != 105) {
            com.tencent.mars.xlog.Log.e("ChatCustomFooter", "cache lost or location type is not correct");
            return true;
        }
        g0Var.f368080h = "menu_action_success";
        g0Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("x", java.lang.String.valueOf(d17));
            jSONObject.put("y", java.lang.String.valueOf(d18));
            jSONObject.put("scale", i17);
            jSONObject.put("label", str);
            jSONObject.put("poiname", str2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(ya.b.LOCATION, jSONObject);
            g0Var.f368082j = jSONObject2.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizMenuItem", e17.toString());
        }
        if (p(this.C)) {
            c(this.C);
            k(this.C);
        }
        return true;
    }

    public final boolean e(java.lang.Object obj) {
        int i17;
        if (obj != null && (obj instanceof com.tencent.mm.autogen.events.PublishScanCodeResultEvent)) {
            am.yo yoVar = ((com.tencent.mm.autogen.events.PublishScanCodeResultEvent) obj).f54631g;
            java.lang.String str = yoVar.f8471b;
            java.lang.String str2 = yoVar.f8472c;
            if (!com.tencent.mm.plugin.scanner.j1.c(str)) {
                str2 = str + "," + str2;
            }
            r01.g0 g0Var = this.C;
            if (g0Var != null && ((i17 = g0Var.f368081i) == 100 || i17 == 101)) {
                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "scan type: %s , scan result:%s", str, str2);
                r01.g0 g0Var2 = this.C;
                g0Var2.f368080h = "menu_action_success";
                java.lang.String str3 = com.tencent.mm.plugin.scanner.j1.c(str) ? "qrcode" : "barcode";
                g0Var2.getClass();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("scan_type", str3);
                    jSONObject.put("scan_result", str2);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("scan_code", jSONObject);
                    g0Var2.f368082j = jSONObject2.toString();
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BizMenuItem", e17.toString());
                }
                if (!p(this.C)) {
                    return true;
                }
                c(this.C);
                k(this.C);
                return true;
            }
            com.tencent.mars.xlog.Log.e("ChatCustomFooter", "null pointer in cache or type error");
        }
        return false;
    }

    public boolean f(int i17, java.lang.Object obj) {
        int i18;
        int i19;
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("ChatCustomFooter", "returned data is null, maybe serve for UI");
            return true;
        }
        if (i17 == 201 || i17 == 203) {
            i17 = 1001;
        } else if (i17 == 217) {
            i17 = 1002;
        }
        switch (i17) {
            case 1001:
                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "return from camera");
                if (!(obj instanceof android.content.Intent)) {
                    com.tencent.mars.xlog.Log.e("ChatCustomFooter", "type error");
                    return true;
                }
                java.lang.String stringExtra = ((android.content.Intent) obj).getStringExtra("CropImage_OutputPath");
                if (stringExtra == null) {
                    com.tencent.mars.xlog.Log.e("ChatCustomFooter", "return null path");
                    return true;
                }
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(stringExtra));
                if (r6Var.m() && r6Var.A()) {
                    com.tencent.mars.xlog.Log.i("ChatCustomFooter", "%s retrieved!", stringExtra);
                    java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
                    com.tencent.mars.xlog.Log.i("ChatCustomFooter", "MD5 is %s", p17);
                    r01.g0 g0Var = this.C;
                    if (g0Var == null || !((i18 = g0Var.f368081i) == 102 || i18 == 103)) {
                        com.tencent.mars.xlog.Log.e("ChatCustomFooter", "camera photo cache lost or temp type error! cannot pass info!");
                        return true;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(p17);
                    r01.g0 g0Var2 = this.C;
                    g0Var2.f368080h = "menu_action_success";
                    g0Var2.a(arrayList);
                    if (p(this.C)) {
                        c(this.C);
                        k(this.C);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", stringExtra);
                }
                return true;
            case 1002:
                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "return from albumn");
                if (!(obj instanceof android.content.Intent)) {
                    com.tencent.mars.xlog.Log.e("ChatCustomFooter", "type error");
                    return true;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra = ((android.content.Intent) obj).getStringArrayListExtra("CropImage_OutputPath_List");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (stringArrayListExtra != null && stringArrayListExtra.size() != 0) {
                    java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "retrieving bitmap path %s", next);
                        if (next != null) {
                            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(next));
                            if (r6Var2.m() && r6Var2.A()) {
                                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "%s retrieved!", next);
                                java.lang.String p18 = com.tencent.mm.vfs.w6.p(r6Var2.u());
                                arrayList2.add(p18);
                                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "MD5 is %s", p18);
                            } else {
                                com.tencent.mars.xlog.Log.e("ChatCustomFooter", "%s cannot be retrieved as file or is directory!!", next);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("ChatCustomFooter", "no file contained!");
                        }
                    }
                    r01.g0 g0Var3 = this.C;
                    if (g0Var3 == null || !((i19 = g0Var3.f368081i) == 104 || i19 == 103 || i19 == 102)) {
                        com.tencent.mars.xlog.Log.e("ChatCustomFooter", "albumn photo cache lost or temp type error! cannot pass info!");
                    } else {
                        g0Var3.f368080h = "menu_action_success";
                        g0Var3.a(arrayList2);
                        if (p(this.C)) {
                            c(this.C);
                            k(this.C);
                        }
                    }
                }
                return true;
            case 1003:
                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "send qrcode wait msg");
                if (!e(obj)) {
                    return true;
                }
                ((com.tencent.mm.ui.chatting.component.biz.a0) this.f198173m).a();
                return true;
            case 1004:
                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "send qrcode direct");
                e(obj);
                return true;
            case 1005:
                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "send current");
                d(obj);
                return true;
            case 1006:
                com.tencent.mars.xlog.Log.i("ChatCustomFooter", "send selected");
                d(obj);
                return true;
            default:
                return true;
        }
    }

    public void g(android.view.ViewGroup viewGroup, java.lang.String str, int i17) {
        this.D = str;
        this.E = i17;
        this.f198175o = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChatfooterFixBigFont()) == 1;
        this.f198167d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bll);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.blq);
        this.f198170g = linearLayout;
        linearLayout.setVisibility(0);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.blp);
        this.f198169f = imageView;
        imageView.setVisibility(0);
        this.f198169f.setOnClickListener(new com.tencent.mm.ui.chatting.f2(this));
        if (this.f198175o) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f198169f.getLayoutParams();
            layoutParams.width = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams.width));
            layoutParams.height = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams.height));
            layoutParams.leftMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams.leftMargin));
            layoutParams.rightMargin = java.lang.Math.round(com.tencent.mm.ui.gk.a(layoutParams.rightMargin));
            this.f198169f.setLayoutParams(layoutParams);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.blk);
        this.f198168e = imageView2;
        imageView2.setOnClickListener(new com.tencent.mm.ui.chatting.g2(this));
        com.tencent.mm.ui.chatting.n2 n2Var = new com.tencent.mm.ui.chatting.n2(getContext(), viewGroup);
        this.f198171h = n2Var;
        n2Var.f201994d = new com.tencent.mm.ui.chatting.h2(this);
    }

    @Override // c01.zc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }

    public com.tencent.mm.storage.z3 getTalker() {
        return this.f198180t;
    }

    public java.lang.String getTalkerUserName() {
        com.tencent.mm.storage.z3 z3Var = this.f198180t;
        if (z3Var == null) {
            return null;
        }
        return z3Var.d1();
    }

    public final void h(r01.g0 g0Var) {
        java.lang.String str = g0Var.f368077e;
        com.tencent.mm.storage.z3 z3Var = this.f198180t;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : "";
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "bizMenu jumpToSearch username: %s, suggestData: %s", d17, str);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("ftsbizscene", 75);
        a17.putExtra("ftsType", 2);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(75, false, 2);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put("userName", d17);
        if (!x51.t1.b(str)) {
            hashMap.put("thirdExtParam", str);
        }
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsbizusername", d17);
        a17.addFlags(67108864);
        j45.l.z(getContext(), a17, null);
    }

    public final void i(r01.g0 g0Var, java.lang.String str) {
        q(this.f198179s, g0Var.f368073a + "", g0Var.f368076d, "menu_click", 0, 0, 0, g0Var.f368075c, "", str);
    }

    public final void j(r01.g0 g0Var) {
        q(this.f198179s, g0Var.f368073a + "", g0Var.f368076d, "menu_action_start", 0, 0, 0, g0Var.f368075c, "", g0Var.f368077e);
    }

    public final void k(r01.g0 g0Var) {
        q(this.f198179s, g0Var.f368073a + "", g0Var.f368076d, "menu_action_success", 0, 0, 0, g0Var.f368075c, "", g0Var.f368077e);
    }

    public void l(com.tencent.mm.ui.MMFragment mMFragment, qk.o oVar, java.lang.String str) {
        qk.h c17;
        java.util.List list;
        r01.g0 g0Var;
        android.widget.ImageView imageView;
        qk.h hVar;
        int i17;
        int i18;
        int i19;
        java.util.List list2;
        java.util.Map map;
        java.util.List<r01.g0> list3;
        bw5.x7 x7Var;
        bw5.x7 x7Var2;
        int i27 = 0;
        qk.h c18 = oVar.D0(false).c();
        if (c18 == null || c18.f364140b == null || str == null) {
            throw new java.lang.IllegalArgumentException(" menuInfo or username is null ! ");
        }
        int i28 = 1;
        this.f198174n = java.lang.Boolean.valueOf(str.equals("gh_f0a92aa7146c") || str.equals("gh_3dfda90e39d6"));
        this.f198178r = java.lang.Math.min(c18.f364140b.size(), 6);
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "setMenus, count:" + this.f198178r);
        int i29 = this.f198178r;
        if (i29 < 1) {
            throw new java.lang.IllegalArgumentException(" mTabCount is invalid ! ");
        }
        int i37 = 3;
        int i38 = 8;
        if (i29 > 3) {
            this.f198168e.setVisibility(0);
        } else {
            this.f198168e.setVisibility(8);
        }
        this.f198167d.setWeightSum(java.lang.Math.min(this.f198178r, 3));
        int i39 = 0;
        for (int i47 = 6; i39 < i47; i47 = 6) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f198167d.getChildAt(i39);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.bln);
            textView.setTextSize(i28, java.lang.Math.min(1.125f, i65.a.q(getContext())) * 17.0f);
            if (this.f198174n.booleanValue()) {
                imageView = (android.widget.ImageView) frameLayout.findViewById(com.tencent.mm.R.id.rf6);
                android.view.View findViewById = frameLayout.findViewById(com.tencent.mm.R.id.blm);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i38));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChatFooterCustom", "setMenus", "(Lcom/tencent/mm/api/BizInfo$ExtInfo$BizMenuInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(i27)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChatFooterCustom", "setMenus", "(Lcom/tencent/mm/api/BizInfo$ExtInfo$BizMenuInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                imageView = (android.widget.ImageView) frameLayout.findViewById(com.tencent.mm.R.id.blm);
                android.view.View findViewById2 = frameLayout.findViewById(com.tencent.mm.R.id.rf6);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i38));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChatFooterCustom", "setMenus", "(Lcom/tencent/mm/api/BizInfo$ExtInfo$BizMenuInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(i27)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/ChatFooterCustom", "setMenus", "(Lcom/tencent/mm/api/BizInfo$ExtInfo$BizMenuInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            imageView.setVisibility(i38);
            int i48 = this.f198178r;
            if (i39 < i48) {
                r01.g0 g0Var2 = (r01.g0) c18.f364140b.get(i39);
                frameLayout.setTag(g0Var2);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = getContext();
                java.lang.String str2 = g0Var2.f368075c;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
                if (g0Var2.f368074b == 0) {
                    int textSize = (((int) textView.getTextSize()) * 2) / i37;
                    android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.height = textSize;
                    layoutParams.width = textSize;
                    imageView.setLayoutParams(layoutParams);
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.biz_menu_regular, getContext().getResources().getColor(com.tencent.mm.R.color.FG_2)));
                    imageView.setVisibility(i27);
                } else if (g0Var2.f368083k != 0 && !this.f198174n.booleanValue()) {
                    int i49 = g0Var2.f368083k;
                    switch (i49) {
                        case 1:
                            i19 = com.tencent.mm.R.raw.biz_link_regular;
                            break;
                        case 2:
                            i19 = com.tencent.mm.R.raw.biz_mini_program_circle_regular;
                            break;
                        case 3:
                            i19 = com.tencent.mm.R.raw.biz_subscriptions_regular;
                            break;
                        case 4:
                            i19 = com.tencent.mm.R.raw.biz_bubble_circle_regular;
                            break;
                        case 5:
                            i19 = com.tencent.mm.R.raw.biz_scan_regular;
                            break;
                        case 6:
                        case 7:
                            i19 = com.tencent.mm.R.raw.ecs_regular;
                            break;
                        case 8:
                        default:
                            i19 = i27;
                            break;
                        case 9:
                            i19 = com.tencent.mm.R.raw.actionbar_particular_icon;
                            break;
                    }
                    if (i19 != 0) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), i19, getContext().getResources().getColor(com.tencent.mm.R.color.FG_2)));
                        imageView.setVisibility(i27);
                    } else {
                        com.tencent.mars.xlog.Log.e("ChatCustomFooter", "get empty res id, username: %s, icon show type: %d", str, java.lang.Integer.valueOf(i49));
                    }
                }
                if (!this.f198186z) {
                    int i57 = g0Var2.f368074b;
                    if (i57 == 5 || !(i57 != 7 || (x7Var2 = g0Var2.f368084l) == null || x7Var2.f() == null)) {
                        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.V);
                        this.f198186z = true;
                    } else if (g0Var2.f368074b == 0 && (list3 = g0Var2.f368079g) != null) {
                        for (r01.g0 g0Var3 : list3) {
                            int i58 = g0Var3.f368074b;
                            if (i58 == 5 || (i58 == 7 && (x7Var = g0Var3.f368084l) != null && x7Var.f() != null)) {
                                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.V);
                                this.f198186z = true;
                            }
                        }
                    }
                }
                frameLayout.setOnClickListener(this);
                frameLayout.setVisibility(0);
                if (str.equals("gh_3dfda90e39d6") && !x51.t1.b(g0Var2.f368076d) && !x51.t1.b(g0Var2.f368075c)) {
                    java.util.HashSet hashSet = this.B;
                    if (!hashSet.contains(g0Var2.f368075c)) {
                        hashSet.add(g0Var2.f368075c);
                        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                        android.util.Pair c19 = rn3.i.Di().c(new vn3.c(g0Var2.f368076d));
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27779, 2, g0Var2.f368075c, java.lang.Integer.valueOf((c19.first != com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT || c19.second == null) ? 0 : 1), 0);
                    }
                }
                if (this.f198174n.booleanValue()) {
                    com.tencent.mars.xlog.Log.i("ChatCustomFooter", "needShowRedDot：register RedDotComponent");
                    com.tencent.mars.xlog.Log.i("ChatCustomFooter", "registerRedDotComponentForMenu key：%s，name：%s", g0Var2.f368076d, g0Var2.f368075c);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f198176p;
                    if (!concurrentHashMap.containsKey(g0Var2.f368076d)) {
                        com.tencent.mm.ui.chatting.qd qdVar = new com.tencent.mm.ui.chatting.qd(getContext(), g0Var2.f368076d, new com.tencent.mm.ui.chatting.j2(this, textView, g0Var2));
                        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                        rn3.i.Di().k(qdVar);
                        concurrentHashMap.put(g0Var2.f368076d, qdVar);
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f198177q;
                        arrayList3.add(qdVar);
                        concurrentHashMap.size();
                        arrayList3.size();
                    }
                    com.tencent.mm.ui.chatting.n2 n2Var = this.f198171h;
                    n2Var.getClass();
                    g0Var2.f368079g.size();
                    n2Var.f201995e = java.lang.Boolean.TRUE;
                    int i59 = 0;
                    while (true) {
                        int size = g0Var2.f368079g.size();
                        list2 = n2Var.f201999i;
                        map = n2Var.f201998h;
                        if (i59 < size) {
                            r01.g0 g0Var4 = (r01.g0) g0Var2.f368079g.get(i59);
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) map;
                            if (!concurrentHashMap2.containsKey(g0Var4.f368076d)) {
                                com.tencent.mm.ui.chatting.qd qdVar2 = new com.tencent.mm.ui.chatting.qd(n2Var.f202000m, g0Var4.f368076d, new com.tencent.mm.ui.chatting.k2(n2Var));
                                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                                rn3.i.Di().k(qdVar2);
                                concurrentHashMap2.put(g0Var4.f368076d, qdVar2);
                                ((java.util.ArrayList) list2).add(qdVar2);
                                i59++;
                                g0Var2 = g0Var2;
                                c18 = c18;
                            }
                        }
                    }
                    hVar = c18;
                    ((java.util.concurrent.ConcurrentHashMap) map).size();
                    ((java.util.ArrayList) list2).size();
                } else {
                    hVar = c18;
                }
                i17 = 3;
                i18 = 8;
            } else {
                hVar = c18;
                i17 = i37;
                if (i39 < i17 || i48 <= i17) {
                    i18 = 8;
                    frameLayout.setVisibility(8);
                } else {
                    frameLayout.setTag(null);
                    textView.setText("");
                    i18 = 8;
                    imageView.setVisibility(8);
                    frameLayout.setOnClickListener(null);
                    frameLayout.setVisibility(0);
                }
            }
            i39++;
            i37 = i17;
            i38 = i18;
            c18 = hVar;
            i27 = 0;
            i28 = 1;
        }
        this.f198184x = mMFragment;
        this.f198179s = str;
        this.f198181u = oVar;
        com.tencent.mm.ui.chatting.ChatFooterCustom.GetLocationListener getLocationListener = this.f198182v;
        if (getLocationListener != null) {
            getLocationListener.dead();
        }
        com.tencent.mm.ui.chatting.ChatFooterCustom.GetScanCodeListener getScanCodeListener = this.f198183w;
        if (getScanCodeListener != null) {
            getScanCodeListener.dead();
        }
        this.f198182v = new com.tencent.mm.ui.chatting.ChatFooterCustom.GetLocationListener();
        this.f198183w = new com.tencent.mm.ui.chatting.ChatFooterCustom.GetScanCodeListener();
        this.f198182v.alive();
        this.f198183w.alive();
        if (this.f198185y) {
            return;
        }
        android.content.Intent intent = this.f198184x.getIntent();
        int intExtra = intent.getIntExtra("extras_key_parent_index", -1);
        int intExtra2 = intent.getIntExtra("extras_key_sub_index", -1);
        if (intExtra == -1 || (c17 = this.f198181u.D0(false).c()) == null || (list = c17.f364140b) == null) {
            return;
        }
        if (intExtra2 == -1) {
            g0Var = (r01.g0) list.get(intExtra);
        } else {
            r01.g0 g0Var5 = (r01.g0) list.get(intExtra);
            g0Var = g0Var5 != null ? (r01.g0) g0Var5.f368079g.get(intExtra2) : null;
        }
        if (g0Var != null) {
            this.f198185y = true;
            b();
            c(g0Var);
            com.tencent.mm.ui.chatting.component.biz.j0 j0Var = this.f198173m;
            if (j0Var != null) {
                ((com.tencent.mm.ui.chatting.component.biz.a0) j0Var).a();
            }
        }
    }

    public final void m() {
        if (this.f198184x == null || this.f198180t == null || x51.t1.b(this.f198179s)) {
            return;
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.tencent.mm.ui.MMFragment mMFragment = this.f198184x;
        java.lang.String str = this.f198179s;
        java.lang.String d17 = this.f198180t.d1();
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.g(mMFragment, 217, 9, 9, 3, str, d17, null);
    }

    public final void n() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(lp0.b.m());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (!(m18.a() ? m18.f213266a.r(m18.f213267b) : false)) {
                android.widget.Toast.makeText((android.app.Activity) getContext(), getContext().getString(com.tencent.mm.R.string.b69), 1).show();
                return;
            }
        }
        if (this.f198184x != null) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            if (((ub0.r) oVar).Ai(this.f198184x, lp0.b.m(), "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, 201)) {
                return;
            }
            android.widget.Toast.makeText((android.app.Activity) getContext(), getContext().getString(com.tencent.mm.R.string.igw), 1).show();
        }
    }

    public final void o() {
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", " releaseRedDotResource()");
        com.tencent.mm.ui.chatting.n2 n2Var = this.f198171h;
        if (n2Var != null) {
            n2Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooterCustomSubmenu", "releaseRedDotResource()");
            n2Var.f201996f = "";
            n2Var.f201997g = false;
            java.util.Map map = n2Var.f201998h;
            if (map != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
                if (concurrentHashMap.size() > 0) {
                    concurrentHashMap.clear();
                }
            }
            java.util.List list = n2Var.f201999i;
            if (list != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 0) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.ui.chatting.qd qdVar = (com.tencent.mm.ui.chatting.qd) it.next();
                        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                        rn3.i.Di().r(qdVar);
                    }
                    arrayList.clear();
                }
            }
        }
        java.util.Map map2 = this.f198176p;
        if (map2 != null && ((java.util.concurrent.ConcurrentHashMap) map2).size() > 0) {
            ((java.util.concurrent.ConcurrentHashMap) map2).clear();
        }
        java.util.List list2 = this.f198177q;
        if (list2 == null || ((java.util.ArrayList) list2).size() <= 0) {
            return;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.ui.chatting.qd qdVar2 = (com.tencent.mm.ui.chatting.qd) it6.next();
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(qdVar2);
        }
        ((java.util.ArrayList) list2).clear();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0120. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x056a A[Catch: all -> 0x05bb, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x0029, B:11:0x0038, B:13:0x004a, B:15:0x0054, B:17:0x005c, B:19:0x0064, B:21:0x0085, B:24:0x008c, B:27:0x00bc, B:28:0x0106, B:30:0x010e, B:31:0x0116, B:32:0x0120, B:34:0x0562, B:36:0x056a, B:39:0x0570, B:40:0x05ae, B:43:0x0125, B:45:0x0145, B:46:0x0147, B:48:0x014d, B:49:0x0156, B:50:0x0179, B:52:0x0184, B:54:0x0191, B:56:0x019d, B:57:0x01a6, B:59:0x01b6, B:61:0x01be, B:62:0x01d1, B:65:0x01fe, B:66:0x01fc, B:68:0x0207, B:69:0x0221, B:70:0x022a, B:71:0x024a, B:74:0x028b, B:77:0x0298, B:79:0x02ae, B:80:0x02c5, B:83:0x02e8, B:86:0x0319, B:88:0x0316, B:89:0x02e6, B:94:0x0323, B:95:0x0266, B:96:0x032e, B:97:0x034b, B:99:0x0350, B:100:0x036e, B:101:0x038c, B:102:0x0391, B:103:0x0396, B:104:0x039b, B:105:0x03a0, B:107:0x03c8, B:109:0x03d2, B:111:0x03dc, B:112:0x03e9, B:114:0x040c, B:116:0x0416, B:118:0x0420, B:119:0x042d, B:121:0x0446, B:122:0x0450, B:123:0x045e, B:125:0x048e, B:127:0x049e, B:128:0x04fb, B:130:0x0527, B:131:0x052b, B:134:0x00ce, B:136:0x00d6), top: B:3:0x0005, inners: #0 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onClick(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.ChatFooterCustom.onClick(android.view.View):void");
    }

    public boolean p(r01.g0 g0Var) {
        if (g0Var == null) {
            return false;
        }
        java.lang.String str = "" + g0Var.f368073a + g0Var.f368076d;
        synchronized (this.F) {
            int i17 = 0;
            while (true) {
                if (i17 >= ((java.util.LinkedList) this.A).size()) {
                    i17 = -1;
                    break;
                }
                if (((java.lang.String) ((java.util.LinkedList) this.A).get(i17)).equals(str)) {
                    break;
                }
                i17++;
            }
            if (i17 < 0) {
                com.tencent.mars.xlog.Log.e("ChatCustomFooter", "removeOneFromMenuClickCmdList fail %s %d", str, java.lang.Integer.valueOf(((java.util.LinkedList) this.A).size()));
                return false;
            }
            ((java.util.LinkedList) this.A).remove(i17);
            com.tencent.mars.xlog.Log.e("ChatCustomFooter", "removeOneFromMenuClickCmdList success %s %d", str, java.lang.Integer.valueOf(((java.util.LinkedList) this.A).size()));
            return true;
        }
    }

    public void q(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10809, str, str2, str3, str4, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str5, str6, str7);
    }

    public final void r(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 0);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("map_sender_name", getSender());
        intent.putExtra("map_talker_name", getTalkerUserName());
        if (z17) {
            intent.putExtra("view_type_key", 1);
            intent.putExtra("key_get_location_type", 1);
        } else {
            intent.putExtra("view_type_key", 0);
            intent.putExtra("key_get_location_type", 0);
        }
        j45.l.j(getContext(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }

    public final void s() {
        if (!c01.d9.b().E()) {
            db5.t7.l(getContext());
        } else {
            db5.e1.e(getContext(), null, new java.lang.String[]{getContext().getString(com.tencent.mm.R.string.b1h), getContext().getString(com.tencent.mm.R.string.b1g)}, null, new com.tencent.mm.ui.chatting.e2(this));
        }
    }

    public void setOnFooterSwitchListener(com.tencent.mm.pluginsdk.ui.chat.e5 e5Var) {
        this.f198172i = e5Var;
    }

    public void setOnProcessClickListener(com.tencent.mm.ui.chatting.component.biz.j0 j0Var) {
        this.f198173m = j0Var;
    }

    public void setTalker(com.tencent.mm.storage.z3 z3Var) {
        this.f198180t = z3Var;
    }

    public ChatFooterCustom(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f198167d = null;
        this.f198168e = null;
        this.f198169f = null;
        this.f198170g = null;
        this.f198171h = null;
        this.f198172i = null;
        this.f198173m = null;
        this.f198174n = java.lang.Boolean.FALSE;
        this.f198175o = false;
        this.f198176p = new java.util.concurrent.ConcurrentHashMap();
        this.f198177q = new java.util.ArrayList();
        this.f198178r = 0;
        this.f198185y = false;
        this.f198186z = false;
        this.A = new java.util.LinkedList();
        this.B = new java.util.HashSet();
        this.D = "";
        this.F = new java.lang.Object();
    }
}
