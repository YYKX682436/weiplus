package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class GameMsgCenterUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f141480d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f141482f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.TabItemView f141483g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.TabItemView f141484h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.CustomViewPager f141485i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.c f141486m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.r f141487n;

    /* renamed from: o, reason: collision with root package name */
    public int f141488o;

    /* renamed from: p, reason: collision with root package name */
    public int f141489p;

    /* renamed from: e, reason: collision with root package name */
    public int f141481e = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f141490q = 0;

    /* loaded from: classes8.dex */
    public static class GameMsgCenterFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

        /* renamed from: d, reason: collision with root package name */
        public android.view.View f141491d;

        @Override // androidx.fragment.app.Fragment
        public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            return this.f141491d;
        }
    }

    public void T6(int i17) {
        int i18 = i17 % 2;
        this.f141490q = i18;
        if (i18 == 0) {
            this.f141483g.setSelected(true);
            this.f141484h.setSelected(false);
            com.tencent.mm.plugin.game.ui.message.c cVar = this.f141486m;
            if (cVar != null) {
                cVar.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tab", "1");
                hashMap.put("newmsg", java.lang.String.valueOf(cVar.f141531g));
                com.tencent.mm.game.report.l.c(cVar.getContext(), 13, 1300, 0, 1, cVar.f141528d, com.tencent.mm.game.report.l.b(hashMap));
                cVar.f141531g = 0;
            }
        } else {
            this.f141483g.setSelected(false);
            this.f141484h.setSelected(true);
            com.tencent.mm.plugin.game.ui.message.r rVar = this.f141487n;
            if (rVar != null) {
                rVar.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("tab", "2");
                hashMap2.put("newnotice", java.lang.String.valueOf(rVar.f141622g));
                com.tencent.mm.game.report.l.c(rVar.getContext(), 13, 1300, 0, 1, rVar.f141619d, com.tencent.mm.game.report.l.b(hashMap2));
                rVar.f141622g = 0;
            }
        }
        this.f141485i.setCurrentItem(this.f141490q);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.jia;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bh7;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().o();
        vj5.a.a(getContentView(), getResources().getColor(com.tencent.mm.R.color.aaw), !com.tencent.mm.ui.uk.g(getResources().getColor(com.tencent.mm.R.color.aaw)));
        this.f141480d = getIntent().getIntExtra("game_report_from_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("game_msg_ui_from_msgid");
        int intExtra = getIntent().getIntExtra("game_msg_center_tab_type", 0);
        if (intExtra == 1) {
            this.f141481e = 1;
        } else if (intExtra == 2) {
            this.f141481e = 2;
        } else {
            com.tencent.mm.plugin.game.model.e1 b17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(stringExtra);
            if (b17 != null) {
                this.f141481e = b17.field_showType;
            }
        }
        if (this.f141481e == 0) {
            this.f141488o = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1);
            int u17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2);
            this.f141489p = u17;
            if (this.f141488o > 0) {
                this.f141481e = 1;
            } else if (u17 > 0) {
                this.f141481e = 2;
            } else {
                this.f141481e = 1;
            }
        }
        findViewById(com.tencent.mm.R.id.f482510gi).setOnClickListener(new com.tencent.mm.plugin.game.ui.message.d(this));
        findViewById(com.tencent.mm.R.id.f482537h3).setOnClickListener(new com.tencent.mm.plugin.game.ui.message.l(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482543h9);
        this.f141482f = textView;
        com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479575r);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482542h8);
        this.f141482f.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f141481e == 2) {
            this.f141482f.setText(com.tencent.mm.R.string.fny);
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().X1(2);
        } else {
            this.f141482f.setText(com.tencent.mm.R.string.fnx);
        }
        com.tencent.mm.plugin.game.ui.message.TabItemView tabItemView = (com.tencent.mm.plugin.game.ui.message.TabItemView) findViewById(com.tencent.mm.R.id.nvr);
        this.f141483g = tabItemView;
        tabItemView.setShowType(1);
        com.tencent.mm.plugin.game.ui.message.TabItemView tabItemView2 = (com.tencent.mm.plugin.game.ui.message.TabItemView) findViewById(com.tencent.mm.R.id.nvs);
        this.f141484h = tabItemView2;
        tabItemView2.setShowType(2);
        this.f141485i = (com.tencent.mm.ui.base.CustomViewPager) findViewById(com.tencent.mm.R.id.jia);
        com.tencent.mm.plugin.game.ui.message.p pVar = new com.tencent.mm.plugin.game.ui.message.p(getSupportFragmentManager());
        com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI.GameMsgCenterFragment gameMsgCenterFragment = new com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI.GameMsgCenterFragment();
        com.tencent.mm.plugin.game.ui.message.c cVar = new com.tencent.mm.plugin.game.ui.message.c(this, this.f141480d, this.f141481e == 1);
        this.f141486m = cVar;
        cVar.setNewMessageCount(this.f141488o);
        gameMsgCenterFragment.f141491d = this.f141486m;
        java.util.List list = pVar.f141614i;
        ((java.util.ArrayList) list).add(gameMsgCenterFragment);
        com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI.GameMsgCenterFragment gameMsgCenterFragment2 = new com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI.GameMsgCenterFragment();
        com.tencent.mm.plugin.game.ui.message.r rVar = new com.tencent.mm.plugin.game.ui.message.r(this, this.f141480d, this.f141481e == 2);
        this.f141487n = rVar;
        rVar.setNewMessageCount(this.f141489p);
        gameMsgCenterFragment2.f141491d = this.f141487n;
        ((java.util.ArrayList) list).add(gameMsgCenterFragment2);
        this.f141485i.setCanSlide(false);
        this.f141485i.setAdapter(pVar);
        this.f141483g.setOnClickListener(new com.tencent.mm.plugin.game.ui.message.m(this));
        this.f141484h.setOnClickListener(new com.tencent.mm.plugin.game.ui.message.n(this));
        this.f141485i.setOnPageChangeListener(new com.tencent.mm.plugin.game.ui.message.o(this));
        if (this.f141481e == 2) {
            this.f141483g.setUnreadCount(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1));
            T6(1);
        } else {
            this.f141484h.setUnreadCount(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2));
            T6(0);
        }
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.game.ui.message.c1 c1Var;
        android.database.Cursor cursor;
        com.tencent.mm.plugin.game.ui.message.t0 t0Var;
        android.database.Cursor cursor2;
        super.onDestroy();
        com.tencent.mm.plugin.game.ui.message.c cVar = this.f141486m;
        if (cVar != null && (t0Var = cVar.f141529e) != null && (cursor2 = t0Var.f141641d2.f141587d) != null) {
            cursor2.close();
        }
        com.tencent.mm.plugin.game.ui.message.r rVar = this.f141487n;
        if (rVar != null && (c1Var = rVar.f141620e) != null && (cursor = c1Var.f141536d2.f141587d) != null) {
            cursor.close();
        }
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().execSQL("GameRawMessage", "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)")), "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)");
    }
}
