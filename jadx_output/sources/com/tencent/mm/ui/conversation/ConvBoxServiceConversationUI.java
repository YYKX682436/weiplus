package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class ConvBoxServiceConversationUI extends com.tencent.mm.ui.conversation.BaseConversationUI {
    static final java.lang.String TAG = "MicroMsg.ConvBoxServiceConversationUI";
    private android.view.View contentView;

    /* loaded from: classes11.dex */
    public static class ConvBoxServiceConversationFmUI extends com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI {
        public static final int CONTEXT_MENU_LONGCLICK_DELETE = 4;
        public static final int CONTEXT_MENU_LONGCLICK_DISMISS = 3;
        public static final int CONTEXT_MENU_LONGCLICK_MARK_READ = 2;
        public static final int CONTEXT_MENU_LONGCLICK_SET_UN_READ = 1;
        private static final java.lang.String TAG = "MicroMsg.ConvBoxServiceConversationFmUI";
        private com.tencent.mm.ui.conversation.o2 adapter;
        private android.widget.ListView appbrandMessageLV;
        private com.tencent.mm.storage.l4 conversation;
        private android.widget.TextView emptyTipTv;
        private java.lang.String mAppId;
        private java.lang.String superUsername;
        private int x_down;
        private int y_down;
        private java.lang.String talker = "";
        private com.tencent.mm.ui.conversation.b3 clickStatusController = new com.tencent.mm.ui.conversation.b3();
        boolean isFirstOnResume = true;
        private com.tencent.mm.ui.widget.dialog.u3 tipDialog = null;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isReaded(java.lang.String str) {
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
            return (p17 == null || p17.d1() > 0 || p17.d2(1048576)) ? false : true;
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
            setMMTitle(getString(com.tencent.mm.R.string.f491018bl4));
            this.appbrandMessageLV = (android.widget.ListView) findViewById(com.tencent.mm.R.id.odk);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
            this.emptyTipTv = textView;
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.emptyTipTv.getLayoutParams();
            layoutParams.topMargin = 200;
            this.emptyTipTv.setLayoutParams(layoutParams);
            this.emptyTipTv.setText(com.tencent.mm.R.string.f491017bl3);
            setBackBtn(new com.tencent.mm.ui.conversation.j0(this));
            this.adapter = new com.tencent.mm.ui.conversation.t0(thisActivity(), this.superUsername, new com.tencent.mm.ui.conversation.k0(this));
            this.adapter.getClass();
            this.appbrandMessageLV.setAdapter((android.widget.ListAdapter) this.adapter);
            com.tencent.mars.xlog.Log.i(TAG, "data count:" + this.adapter.getCount());
            this.appbrandMessageLV.setOnItemClickListener(new com.tencent.mm.ui.conversation.l0(this));
            this.appbrandMessageLV.setOnTouchListener(new com.tencent.mm.ui.conversation.m0(this));
            this.appbrandMessageLV.setOnItemLongClickListener(new com.tencent.mm.ui.conversation.q0(this));
            this.adapter.getClass();
            this.adapter.getClass();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getActivity().findViewById(com.tencent.mm.R.id.huh);
            boolean z17 = (com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.c0() || com.tencent.mm.ui.bk.y())) || com.tencent.mm.ui.bk.Z() || com.tencent.mm.ui.bk.w0();
            if (viewGroup == null || z17) {
                return;
            }
            viewGroup.setImportantForAccessibility(4);
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            com.tencent.mars.xlog.Log.i(TAG, "onActivityCreated");
            super.onActivityCreated(bundle);
            java.lang.String stringExtra = getStringExtra("Contact_User");
            this.superUsername = stringExtra;
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                this.superUsername = "conversationboxservice";
            }
            initView();
            ((l75.a1) c01.d9.b().r()).a(this.adapter);
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

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this.adapter);
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.adapter);
            com.tencent.mm.ui.conversation.o2 o2Var = this.adapter;
            if (o2Var != null) {
                o2Var.E();
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getActivity().findViewById(com.tencent.mm.R.id.huh);
            boolean z17 = (com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.c0() || com.tencent.mm.ui.bk.y())) || com.tencent.mm.ui.bk.Z() || com.tencent.mm.ui.bk.w0();
            if (viewGroup != null && !z17) {
                viewGroup.setImportantForAccessibility(1);
            }
            super.onDestroy();
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            com.tencent.mars.xlog.Log.i(TAG, "on pause");
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(this.superUsername);
            com.tencent.mm.ui.conversation.o2 o2Var = this.adapter;
            if (o2Var != null) {
                o2Var.F();
            }
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.J("@placeholder_foldgroup", 1);
            super.onPause();
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            com.tencent.mars.xlog.Log.i(TAG, "on resume");
            com.tencent.mm.ui.conversation.o2 o2Var = this.adapter;
            if (o2Var != null) {
                o2Var.G();
            }
            this.adapter.q();
            if (this.isFirstOnResume) {
                ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                com.tencent.mm.modelsimple.g1.J("@placeholder_foldgroup", 1);
                this.isFirstOnResume = false;
            }
            this.clickStatusController.b(0);
            super.onResume();
            setUnread(c01.h2.c(1), true);
        }
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        ((xf5.c) ((qy.j) i95.n0.c(qy.j.class))).aj(false);
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488229nn, (android.view.ViewGroup) null);
        this.contentView = inflate;
        setContentView(inflate);
        this.conversationFm = new com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI();
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.jmc, this.conversationFm, null, 1);
        beginTransaction.d();
        o25.n1.d(this, this.contentView);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ConvBoxServiceConversationUI);
    }
}
