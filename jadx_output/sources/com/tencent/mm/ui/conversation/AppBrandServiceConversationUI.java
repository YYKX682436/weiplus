package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class AppBrandServiceConversationUI extends com.tencent.mm.ui.conversation.BaseConversationUI {
    private static final java.lang.String TAG = "MicroMsg.AppBrandServiceConversationUI";
    private android.view.View contentView;

    /* loaded from: classes11.dex */
    public static class AppBrandServiceConversationFmUI extends com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI implements db5.t4 {
        private static final int CONTEXT_MENU_LONGCLICK_ACCEPT_MSG = 1;
        private static final int CONTEXT_MENU_LONGCLICK_DELETE = 3;
        private static final int CONTEXT_MENU_LONGCLICK_DISMISS = 4;
        private static final int CONTEXT_MENU_LONGCLICK_REFUSE_MSG = 2;
        private static final java.lang.String TAG = "MicroMsg.AppBrandServiceConversationFmUI";
        private com.tencent.mm.ui.conversation.o2 adapter;
        private ab5.z appBrandServiceActionSheet;
        private android.widget.ListView appbrandMessageLV;
        private com.tencent.mm.ui.tools.s6 contextMenuHelper;
        private com.tencent.mm.storage.l4 conversation;
        private android.widget.TextView emptyTipTv;
        private int fromScene;
        private java.lang.String mAppId;
        private java.lang.String mSceneId;
        private java.lang.String superUsername;
        private java.lang.String talker = "";
        private com.tencent.mm.ui.widget.dialog.u3 tipDialog = null;
        private boolean isDeleteCancel = false;

        private void asyncDelMsg(java.lang.String str) {
            com.tencent.mars.xlog.Log.i(TAG, "async del msg talker:%s", str);
            com.tencent.mm.storage.f9 r66 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(str);
            r45.ac0 ac0Var = new r45.ac0();
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = str == null ? "" : str;
            du5Var.f372757e = true;
            ac0Var.f369912d = du5Var;
            ac0Var.f369914f = r66.I0();
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, ac0Var));
            this.isDeleteCancel = false;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(thisActivity(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.conversation.b(this));
            customerMsgOperateReport(5);
            c01.w9.h(str, new com.tencent.mm.ui.conversation.c(this, Q));
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.I(str, 15);
        }

        private void batchSyncForWxaContact() {
            java.util.List list;
            com.tencent.mm.ui.conversation.o2 o2Var = this.adapter;
            if (o2Var == null || o2Var.getCount() == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i(TAG, "batchSyncForWxaContact, size:%d", java.lang.Integer.valueOf(this.adapter.getCount()));
            com.tencent.mm.ui.conversation.o2 o2Var2 = this.adapter;
            if (!(o2Var2 instanceof com.tencent.mm.ui.conversation.k) || (list = ((com.tencent.mm.ui.conversation.k) o2Var2).N) == null || ((java.util.ArrayList) list).size() <= 0) {
                return;
            }
            ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).getClass();
            if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaAttrExportService", "batchSync list %s", com.tencent.mm.sdk.platformtools.t8.c1(list, ", "));
            com.tencent.mm.plugin.appbrand.config.q.c(list, k91.h1.WXA_CUSTOMER_SERVICE, null);
        }

        private void cleadAllServiceAppBrandUnreadCount() {
            new com.tencent.mm.autogen.events.AppBrandResetAllServiceUnreadCountEvent().e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void delConversationAndMsg(java.lang.String str) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e(TAG, "Delete Conversation and messages fail because username is null or nil.");
                return;
            }
            asyncDelMsg(str);
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(str);
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.conversation.a(this));
        }

        private void enterConversationReport() {
            java.lang.String str;
            int i17;
            if (this.adapter == null) {
                return;
            }
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p("appbrandcustomerservicemsg");
            int d17 = (p17 == null || com.tencent.mm.sdk.platformtools.t8.K0(p17.h1())) ? 0 : p17.d1();
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) this.adapter.getItem(0);
            str = "";
            if (l4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(l4Var.h1())) {
                java.lang.String j17 = l4Var.j();
                str = j17 != null ? j17 : "";
                k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(l4Var.h1());
                this.mAppId = Bi == null ? null : Bi.field_appId;
            }
            java.lang.String str2 = str;
            if (d17 > 0) {
                int count = this.adapter.getCount();
                i17 = 0;
                for (int i18 = 0; i18 < count; i18++) {
                    com.tencent.mm.storage.l4 l4Var2 = (com.tencent.mm.storage.l4) this.adapter.getItem(i18);
                    if (l4Var2.d1() + l4Var2.f1() > 0) {
                        i17++;
                    }
                }
            } else {
                i17 = 0;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13797, this.mSceneId, java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(i17), this.mAppId, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), 0, str2);
            g23.j.f267930a.a(1L);
        }

        private java.lang.String intToString(int i17) {
            return new java.math.BigInteger(java.lang.Integer.toBinaryString(i17), 2).toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShowView(int i17) {
            if (i17 <= 0) {
                this.emptyTipTv.setVisibility(0);
                this.appbrandMessageLV.setVisibility(8);
            } else {
                this.emptyTipTv.setVisibility(8);
                this.appbrandMessageLV.setVisibility(0);
            }
        }

        public void customerMsgOperateReport(int i17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13798, java.lang.Integer.valueOf(i17), this.mAppId, 0, this.mSceneId, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        }

        public void entryCustomerMsgDialogReport(java.lang.String str, int i17) {
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
            if (p17 == null) {
                com.tencent.mars.xlog.Log.e(TAG, "cvs:%s is null, error", str);
                return;
            }
            int d17 = p17.d1();
            java.lang.String str2 = this.mSceneId;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13799, this.mAppId, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d17), str2, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return com.tencent.mm.R.layout.d1c;
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI
        public java.lang.String getUserName() {
            return this.superUsername;
        }

        public void initView() {
            setMMTitle(getString(com.tencent.mm.R.string.f490088kk));
            this.appbrandMessageLV = (android.widget.ListView) findViewById(com.tencent.mm.R.id.odk);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
            this.emptyTipTv = textView;
            textView.setText(com.tencent.mm.R.string.l_);
            setBackBtn(new com.tencent.mm.ui.conversation.f(this));
            this.appBrandServiceActionSheet = new ab5.z(thisActivity());
            this.adapter = new com.tencent.mm.ui.conversation.k(thisActivity(), this.superUsername, new com.tencent.mm.ui.conversation.g(this));
            this.adapter.getClass();
            this.appbrandMessageLV.setAdapter((android.widget.ListAdapter) this.adapter);
            this.contextMenuHelper = new com.tencent.mm.ui.tools.s6(thisActivity());
            this.appbrandMessageLV.setOnItemClickListener(new com.tencent.mm.ui.conversation.h(this));
            this.appbrandMessageLV.setOnItemLongClickListener(new com.tencent.mm.ui.conversation.i(this));
            this.adapter.getClass();
            this.adapter.getClass();
            this.adapter.getClass();
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            com.tencent.mars.xlog.Log.i(TAG, "onActivityCreated");
            super.onActivityCreated(bundle);
            java.lang.String stringExtra = getStringExtra("Contact_User");
            this.superUsername = stringExtra;
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                this.superUsername = "appbrandcustomerservicemsg";
            }
            int intExtra = getIntExtra("app_brand_conversation_from_scene", 1);
            this.fromScene = intExtra;
            com.tencent.mars.xlog.Log.i(TAG, "fromScene:%d", java.lang.Integer.valueOf(intExtra));
            this.mSceneId = java.lang.System.currentTimeMillis() + intToString(c01.d9.b().C());
            initView();
            addIconOptionMenu(1, com.tencent.mm.R.string.f489813ch, com.tencent.mm.R.raw.icons_outlined_search, new com.tencent.mm.ui.conversation.d(this));
            addIconOptionMenu(2, com.tencent.mm.R.string.f489814ci, com.tencent.mm.R.raw.app_brand_setting, new com.tencent.mm.ui.conversation.e(this));
            ((l75.a1) c01.d9.b().r()).a(this.adapter);
            cleadAllServiceAppBrandUnreadCount();
            enterConversationReport();
            batchSyncForWxaContact();
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i17, int i18, android.content.Intent intent) {
            super.onActivityResult(i17, i18, intent);
            java.lang.String str = this.talker;
            if (str == null || str.isEmpty()) {
                return;
            }
            this.talker = "";
        }

        @Override // androidx.fragment.app.Fragment, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(this.talker);
            if (Bi != null && (Bi.field_appOpt & 2) > 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 0, com.tencent.mm.R.string.f490195nm);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 2, 0, com.tencent.mm.R.string.f490197no);
            }
            contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.tencent.mm.R.string.boo);
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this.adapter);
            }
            batchSyncForWxaContact();
            com.tencent.mm.ui.conversation.o2 o2Var = this.adapter;
            if (o2Var != null) {
                o2Var.E();
            }
            super.onDestroy();
        }

        @Override // db5.t4
        public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.talker, true);
            if (n17 == null || ((int) n17.E2) == 0) {
                com.tencent.mars.xlog.Log.e(TAG, "changed biz stick status failed, contact is null, talker = " + this.talker);
                return;
            }
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                ab5.z zVar = this.appBrandServiceActionSheet;
                zVar.f2989e = this.talker;
                zVar.f2992h = this.fromScene;
                zVar.f2991g = this.mSceneId;
                zVar.f2993i = true;
                zVar.e(3);
                return;
            }
            if (itemId != 2) {
                if (itemId != 3) {
                    return;
                }
                delConversationAndMsg(this.talker);
            } else {
                ab5.z zVar2 = this.appBrandServiceActionSheet;
                zVar2.f2989e = this.talker;
                zVar2.f2992h = this.fromScene;
                zVar2.f2991g = this.mSceneId;
                zVar2.f2993i = true;
                zVar2.e(4);
            }
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            com.tencent.mars.xlog.Log.i(TAG, "on pause");
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(this.superUsername);
            com.tencent.mm.ui.conversation.o2 o2Var = this.adapter;
            if (o2Var != null) {
                o2Var.F();
            }
            super.onPause();
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            com.tencent.mars.xlog.Log.i(TAG, "on resume");
            com.tencent.mm.ui.conversation.o2 o2Var = this.adapter;
            if (o2Var != null) {
                o2Var.G();
            }
            super.onResume();
        }
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI
    public com.tencent.mm.ui.chatting.ChattingUIFragment getChattingUIFragment() {
        return new com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI();
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488229nn, (android.view.ViewGroup) null);
        this.contentView = inflate;
        setContentView(inflate);
        this.conversationFm = new com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI();
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.jmc, this.conversationFm, null, 1);
        beginTransaction.d();
        o25.n1.d(this, this.contentView);
    }
}
