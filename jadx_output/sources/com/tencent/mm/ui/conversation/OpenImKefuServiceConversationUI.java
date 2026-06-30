package com.tencent.mm.ui.conversation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI;", "<init>", "()V", "com/tencent/mm/ui/conversation/u8", "OpenImKefuChattingUIFragment", "OpenImKefuServiceConversationFmUI", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes11.dex */
public final class OpenImKefuServiceConversationUI extends com.tencent.mm.ui.conversation.BaseConversationUI {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.u8 f207392n = new com.tencent.mm.ui.conversation.u8(null);

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f207393e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f207394f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f207395g = jz5.h.b(new com.tencent.mm.ui.conversation.t9(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f207396h = jz5.h.b(new com.tencent.mm.ui.conversation.s9(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f207397i = jz5.h.b(new com.tencent.mm.ui.conversation.p9(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f207398m = jz5.h.b(new com.tencent.mm.ui.conversation.q9(this));

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI;", "Lcom/tencent/mm/ui/conversation/BaseConversationUI$BaseConversationFmUI;", "Ll75/z0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class OpenImKefuServiceConversationFmUI extends com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI implements l75.z0 {

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f207399d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.TextView f207400e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.ListView f207401f;

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.mm.ui.conversation.h8 f207402g;

        /* renamed from: i, reason: collision with root package name */
        public com.tencent.mm.storage.l4 f207404i;

        /* renamed from: m, reason: collision with root package name */
        public boolean f207405m;

        /* renamed from: n, reason: collision with root package name */
        public rl5.r f207406n;

        /* renamed from: o, reason: collision with root package name */
        public int f207407o;

        /* renamed from: p, reason: collision with root package name */
        public int f207408p;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f207403h = "";

        /* renamed from: q, reason: collision with root package name */
        public boolean f207409q = true;

        /* renamed from: r, reason: collision with root package name */
        public final java.lang.String f207410r = java.lang.String.valueOf(java.lang.System.currentTimeMillis());

        /* renamed from: s, reason: collision with root package name */
        public final db5.t4 f207411s = new com.tencent.mm.ui.conversation.o9(this);

        @Override // l75.z0
        public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return com.tencent.mm.R.layout.bok;
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI
        /* renamed from: getUserName, reason: from getter */
        public java.lang.String getF207399d() {
            return this.f207399d;
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            android.content.Intent intent;
            super.onActivityCreated(bundle);
            androidx.fragment.app.FragmentActivity thisActivity = thisActivity();
            this.f207399d = (thisActivity == null || (intent = thisActivity.getIntent()) == null) ? null : intent.getStringExtra("Contact_User");
            setMMTitle(getString(com.tencent.mm.R.string.her));
            this.f207401f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f483945cj2);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
            this.f207400e = textView;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.hes);
            }
            setBackBtn(new com.tencent.mm.ui.conversation.m9(this));
            addIconOptionMenu(1, com.tencent.mm.R.string.f489813ch, com.tencent.mm.R.raw.icons_outlined_search, new com.tencent.mm.ui.conversation.n9(this));
            com.tencent.mm.ui.conversation.h8 h8Var = new com.tencent.mm.ui.conversation.h8(this.f207399d, thisActivity(), new com.tencent.mm.ui.conversation.g9(this));
            this.f207402g = h8Var;
            android.widget.ListView listView = this.f207401f;
            if (listView != null) {
                listView.setAdapter((android.widget.ListAdapter) h8Var);
            }
            android.widget.ListView listView2 = this.f207401f;
            if (listView2 != null) {
                listView2.setOnItemClickListener(new com.tencent.mm.ui.conversation.j9(this));
            }
            android.widget.ListView listView3 = this.f207401f;
            if (listView3 != null) {
                listView3.setOnTouchListener(new com.tencent.mm.ui.conversation.k9(this));
            }
            this.f207406n = new rl5.r(thisActivity());
            android.widget.ListView listView4 = this.f207401f;
            if (listView4 != null) {
                listView4.setOnItemLongClickListener(new com.tencent.mm.ui.conversation.l9(this));
            }
            g23.j.f267930a.a(2L);
        }

        @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "onCreate");
            super.onCreate(bundle);
            b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
            java.lang.String str = this.f207410r;
            a0Var.f16636d = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "setKfListPageSessionId:" + str);
        }

        @Override // androidx.fragment.app.Fragment, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            kotlin.jvm.internal.o.g(menu, "menu");
            kotlin.jvm.internal.o.g(v17, "v");
            super.onCreateContextMenu(menu, v17, contextMenuInfo);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f207403h, true);
            if (n17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "onCreateContextMenu, contact is null, talker = " + this.f207403h);
            } else {
                kotlin.jvm.internal.o.e(contextMenuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
                android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
                if (n17.E2 >= 0) {
                    menu.add(adapterContextMenuInfo.position, 1, 0, com.tencent.mm.R.string.heq);
                }
                menu.add(adapterContextMenuInfo.position, 2, 0, com.tencent.mm.R.string.gqi);
            }
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "onDestroy");
            b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "clearKfListPageSessionId, old:" + a0Var.f16636d);
            a0Var.f16636d = null;
            super.onDestroy();
            com.tencent.mm.ui.conversation.h8 h8Var = this.f207402g;
            if (h8Var != null) {
                h8Var.E();
            }
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            super.onPause();
            com.tencent.mm.ui.conversation.h8 h8Var = this.f207402g;
            if (h8Var != null) {
                h8Var.F();
            }
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.ui.conversation.b9(this));
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            com.tencent.mm.ui.conversation.h8 h8Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "onResume chattingClosed: %s", java.lang.Boolean.valueOf(this.f207287ui.mChattingClosed));
            super.onResume();
            if (this.f207287ui.mChattingClosed && (h8Var = this.f207402g) != null) {
                h8Var.G();
            }
            if (this.f207409q) {
                this.f207409q = false;
                android.widget.ListView listView = this.f207401f;
                if (listView != null) {
                    listView.requestFocus();
                }
            }
        }
    }

    public final int W6() {
        return ((java.lang.Number) ((jz5.n) this.f207398m).getValue()).intValue();
    }

    public final com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest X6() {
        return (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) ((jz5.n) this.f207395g).getValue();
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI
    public com.tencent.mm.ui.chatting.ChattingUIFragment getChattingUIFragment() {
        return new com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z17 = false;
        if (((java.lang.Boolean) ((jz5.n) this.f207397i).getValue()).booleanValue()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI", "handleBack", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI", "handleBack", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
            finish();
            z17 = true;
        }
        if (z17) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        o25.n1.d(this, this.f207393e);
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488229nn, (android.view.ViewGroup) null);
        this.f207393e = inflate;
        setContentView(inflate);
        updateContentViewMargin(this.f207393e);
        this.conversationFm = new com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI();
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.h(com.tencent.mm.R.id.jmc, this.conversationFm, null, 1);
        beginTransaction.d();
        o25.n1.d(this, this.f207393e);
        this.f207394f = false;
        q41.f.d(2);
        if (W6() == 1) {
            q41.f.d(1);
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.OpenImKefuServiceConversationUI)).Rj(this, iy1.a.KFSession);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p("opencustomerservicemsg");
        if (p17 != null) {
            int d17 = p17.d1();
            boolean z17 = d17 > 0;
            java.lang.String y07 = p17.y0();
            if (y07 == null) {
                y07 = "";
            }
            b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
            a0Var.bj("ecs_kf_main_session_holder", "view_clk", a0Var.Bi(y07, d17, z17, p17.z0()));
        }
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.String stringExtra;
        r45.s4 s4Var;
        super.onResume();
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest X6 = X6();
        com.tencent.mm.ui.conversation.u8 u8Var = f207392n;
        if (X6 != null) {
            if (this.f207394f) {
                return;
            }
            this.f207394f = true;
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest X62 = X6();
            kotlin.jvm.internal.o.d(X62);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "handleJump from startConversationRequest getContactScene: %s, hasJumped: %b, isConfirmPageShown: %s", java.lang.Integer.valueOf(X62.f72274f), java.lang.Boolean.valueOf(this.f207394f), java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) this.f207396h).getValue()).booleanValue()));
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest X63 = X6();
            java.lang.String str = (X63 == null || (s4Var = X63.f72277i) == null) ? null : s4Var.f385490h;
            java.lang.String str2 = str == null ? "" : str;
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest X64 = X6();
            kotlin.jvm.internal.o.d(X64);
            u8Var.a(this, str2, X64.f72284s, false, new com.tencent.mm.ui.conversation.r9(this));
            return;
        }
        android.content.Intent intent = getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("open_im_kefu_jump_chatting", false) : false;
        if (!booleanExtra || this.f207394f) {
            return;
        }
        this.f207394f = true;
        android.content.Intent intent2 = getIntent();
        java.lang.String str3 = (intent2 == null || (stringExtra = intent2.getStringExtra("open_im_kefu_chatting_username")) == null) ? "" : stringExtra;
        boolean z17 = W6() != 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "handleJump fromScene: %s, needJump: %b, hasJumped: %b, neeChattingAnim: %b", java.lang.Integer.valueOf(W6()), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(this.f207394f), java.lang.Boolean.valueOf(z17));
        u8Var.a(this, str3, z17, false, com.tencent.mm.ui.conversation.r8.f208049d);
        if (W6() == 2) {
            q41.f.a(str3, 25, 0);
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).hj(26, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuChattingUIFragment;", "Lcom/tencent/mm/ui/chatting/ChattingUIFragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes9.dex */
    public static final class OpenImKefuChattingUIFragment extends com.tencent.mm.ui.chatting.ChattingUIFragment {
        public static final /* synthetic */ int V = 0;
        public final java.lang.String N;
        public ab5.i0 P;
        public final r45.g15 Q;
        public byte[] R;
        public final jz5.g S;
        public sb5.v T;
        public final jz5.g U;

        public OpenImKefuChattingUIFragment() {
            this.N = "MicroMsg.OpenImKefuChattingUIFragment";
            this.Q = new r45.g15();
            this.S = jz5.h.b(new com.tencent.mm.ui.conversation.y8(this));
            this.U = jz5.h.b(new com.tencent.mm.ui.conversation.x8(this));
        }

        @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
        public void M0() {
            super.M0();
            com.tencent.mars.xlog.Log.i(this.N, "[onEnterEnd]: UI: %s#0x%x Fg: %s#0x%x", thisActivity().getClass().getSimpleName(), java.lang.Integer.valueOf(thisActivity().hashCode()), com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment.class.getSimpleName(), java.lang.Integer.valueOf(hashCode()));
            ((jz5.n) this.U).getValue();
        }

        @Override // com.tencent.mm.ui.MMFragment, android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View v17) {
            java.lang.Object m521constructorimpl;
            org.json.JSONObject jSONObject;
            org.json.JSONObject optJSONObject;
            org.json.JSONObject optJSONObject2;
            kotlin.jvm.internal.o.g(v17, "v");
            super.onViewAttachedToWindow(v17);
            r45.g15 g15Var = this.Q;
            if (g15Var.f374804d) {
                java.lang.String str = g15Var.f374820w;
                java.lang.String str2 = g15Var.f374821x;
                if (str2 != null) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(new org.json.JSONObject(str2));
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                        m521constructorimpl = null;
                    }
                    jSONObject = (org.json.JSONObject) m521constructorimpl;
                } else {
                    jSONObject = null;
                }
                boolean z17 = true;
                java.lang.String str3 = jSONObject != null && jSONObject.optBoolean("isProductMsg") ? "1" : jSONObject != null && jSONObject.optBoolean("isOrderMsg") ? "2" : "default";
                java.lang.String optString = (jSONObject == null || (optJSONObject2 = jSONObject.optJSONObject("orderParam")) == null) ? null : optJSONObject2.optString("orderID");
                java.lang.String optString2 = (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("productParam")) == null) ? null : optJSONObject.optString("productID");
                com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = (com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest) ((jz5.n) this.S).getValue();
                int i17 = openIMKefuStartConversationRequest != null ? openIMKefuStartConversationRequest.f72274f : 0;
                ab5.i0 i0Var = this.P;
                yb5.d dVar = this.f198152f;
                if (i0Var == null) {
                    com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e;
                    ab5.i0 i0Var2 = new ab5.i0(getActivity(), chatFooter, chatFooter);
                    this.P = i0Var2;
                    i0Var2.f2960p = false;
                }
                com.tencent.mars.xlog.Log.i(this.N, "appBrandServiceImageBubble %s, %s", g15Var.f374809i, g15Var.f374807g);
                java.lang.String str4 = g15Var.f374820w;
                if (!(str4 == null || str4.length() == 0)) {
                    ab5.i0 i0Var3 = this.P;
                    kotlin.jvm.internal.o.d(i0Var3);
                    i0Var3.f2954g.setText(g15Var.f374820w);
                }
                java.lang.String str5 = g15Var.f374809i;
                if (str5 == null || str5.length() == 0) {
                    java.lang.String str6 = g15Var.f374807g;
                    if (str6 != null && str6.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        l01.b bVar = l01.d0.f314761a;
                        ab5.i0 i0Var4 = this.P;
                        kotlin.jvm.internal.o.d(i0Var4);
                        bVar.n(i0Var4, g15Var.f374807g, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(i65.a.b(getContext(), 75), i65.a.b(getContext(), 60)));
                    }
                } else {
                    l01.b bVar2 = l01.d0.f314761a;
                    ab5.i0 i0Var5 = this.P;
                    kotlin.jvm.internal.o.d(i0Var5);
                    bVar2.n(i0Var5, "file://" + g15Var.f374809i, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(i65.a.b(getContext(), 75), i65.a.b(getContext(), 60)));
                }
                ab5.i0 i0Var6 = this.P;
                kotlin.jvm.internal.o.d(i0Var6);
                i0Var6.f2961q = new com.tencent.mm.ui.conversation.v8(str3, str, optString2, optString, i17, this, jSONObject);
                ab5.i0 i0Var7 = this.P;
                kotlin.jvm.internal.o.d(i0Var7);
                gm0.j1.e().j(new ab5.g0(i0Var7));
                b00.a0 a0Var = (b00.a0) ((c00.u3) i95.n0.c(c00.u3.class));
                a0Var.getClass();
                a0Var.bj("ecs_kf_quick_send_card", "view_exp", a0Var.Ui(str3, str, optString2, optString, i17));
                this.T = new com.tencent.mm.ui.conversation.w8(this);
                sb5.w wVar = (sb5.w) dVar.f460708c.a(sb5.w.class);
                sb5.v vVar = this.T;
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
        }

        @Override // com.tencent.mm.ui.MMFragment, android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View v17) {
            kotlin.jvm.internal.o.g(v17, "v");
            super.onViewDetachedFromWindow(v17);
            sb5.w wVar = (sb5.w) this.f198152f.f460708c.a(sb5.w.class);
            sb5.v vVar = this.T;
            com.tencent.mm.ui.chatting.component.x3 x3Var = (com.tencent.mm.ui.chatting.component.x3) wVar;
            if (vVar == null) {
                x3Var.getClass();
            } else {
                ((java.util.HashSet) x3Var.f200202h).remove(vVar);
            }
        }

        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        public void r0(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            super.r0(context);
            a12.s sVar = (a12.s) ((a12.k) i95.n0.c(a12.k.class));
            if (sVar.f528i == 0) {
                sVar.Ai();
            }
            sVar.f528i++;
        }

        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        public void s0() {
            byte[] bArr;
            java.lang.String str = this.N;
            super.s0();
            try {
                byte[] byteArrayExtra = getByteArrayExtra("key_appbrand_chat_info");
                if (byteArrayExtra != null) {
                    this.Q.parseFrom(byteArrayExtra);
                }
                try {
                    android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m(1, 1, android.graphics.Bitmap.Config.ARGB_8888, false);
                    new android.graphics.Canvas(m17).drawColor(-1);
                    bArr = com.tencent.mm.sdk.platformtools.x.a(m17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "obtainMessageDefaultImg fail", new java.lang.Object[0]);
                    bArr = new byte[0];
                }
                this.R = bArr;
                ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfReportService", "onEnterKFRoom, sessionId:".concat(b00.k0.f16702a));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "parse OpenIMStartChattingExtraInfo exception", new java.lang.Object[0]);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (((com.tencent.mm.ui.chatting.component.w9) r1).f200162f == true) goto L12;
         */
        @Override // com.tencent.mm.ui.chatting.ChattingUIFragment, com.tencent.mm.ui.chatting.BaseChattingUIFragment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void u0() {
            /*
                r4 = this;
                super.u0()
                java.lang.Class<a12.k> r0 = a12.k.class
                i95.m r0 = i95.n0.c(r0)
                a12.k r0 = (a12.k) r0
                a12.s r0 = (a12.s) r0
                int r1 = r0.f528i
                int r1 = r1 + (-1)
                r0.f528i = r1
                if (r1 != 0) goto L7a
                java.lang.String r1 = "deactiveBiz"
                java.lang.String r2 = "MicroMsg.MagicEcsKFDynamicCardService"
                com.tencent.mars.xlog.Log.i(r2, r1)
                java.lang.ref.WeakReference r1 = r0.f525f
                if (r1 == 0) goto L30
                java.lang.Object r1 = r1.get()
                a12.j r1 = (a12.j) r1
                if (r1 == 0) goto L30
                com.tencent.mm.ui.chatting.component.w9 r1 = (com.tencent.mm.ui.chatting.component.w9) r1
                boolean r1 = r1.f200162f
                r3 = 1
                if (r1 != r3) goto L30
                goto L31
            L30:
                r3 = 0
            L31:
                if (r3 == 0) goto L39
                java.lang.String r0 = "destroyBiz, ignore, isInChattingRoom"
                com.tencent.mars.xlog.Log.w(r2, r0)
                goto L7a
            L39:
                iq0.c r1 = r0.Bi()
                if (r1 == 0) goto L4c
                java.lang.Class<gq0.t> r2 = gq0.t.class
                i95.m r2 = i95.n0.c(r2)
                gq0.t r2 = (gq0.t) r2
                nq0.p r2 = (nq0.p) r2
                r2.Di(r1)
            L4c:
                r0.Ni()
                java.lang.ref.WeakReference r1 = r0.f525f
                if (r1 == 0) goto L60
                java.lang.Object r1 = r1.get()
                a12.j r1 = (a12.j) r1
                if (r1 == 0) goto L60
                com.tencent.mm.ui.chatting.component.w9 r1 = (com.tencent.mm.ui.chatting.component.w9) r1
                r1.n0()
            L60:
                java.lang.ref.WeakReference r0 = r0.f525f
                if (r0 == 0) goto L7a
                java.lang.Object r0 = r0.get()
                a12.j r0 = (a12.j) r0
                if (r0 == 0) goto L7a
                com.tencent.mm.ui.chatting.component.w9 r0 = (com.tencent.mm.ui.chatting.component.w9) r0
                java.lang.String r1 = "MicroMsg.EcsKFComponent"
                java.lang.String r2 = "onDestroyBiz"
                com.tencent.mars.xlog.Log.i(r1, r2)
                java.util.HashMap r0 = r0.f200161e
                r0.clear()
            L7a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuChattingUIFragment.u0():void");
        }

        public OpenImKefuChattingUIFragment(boolean z17) {
            super(z17);
            this.N = "MicroMsg.OpenImKefuChattingUIFragment";
            this.Q = new r45.g15();
            this.S = jz5.h.b(new com.tencent.mm.ui.conversation.y8(this));
            this.U = jz5.h.b(new com.tencent.mm.ui.conversation.x8(this));
        }
    }
}
