package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameMessageUI extends com.tencent.mm.plugin.game.ui.GameCenterActivity implements android.widget.AdapterView.OnItemClickListener, com.tencent.mm.modelbase.u0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f140930w = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f140931h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.b5 f140932i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f140933m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f140934n;

    /* renamed from: o, reason: collision with root package name */
    public int f140935o;

    /* renamed from: s, reason: collision with root package name */
    public long f140939s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f140940t;

    /* renamed from: u, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f140941u;

    /* renamed from: p, reason: collision with root package name */
    public boolean f140936p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f140937q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f140938r = "";

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f140942v = new com.tencent.mm.plugin.game.ui.k5(this);

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public java.lang.String T6() {
        return null;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public java.lang.String U6() {
        return null;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int V6() {
        return 13;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int W6() {
        return this.f140935o;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int X6() {
        return 1300;
    }

    public final void Z6(int i17) {
        if (this.f140933m == null) {
            this.f140933m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gnn);
        }
        this.f140933m.setVisibility(i17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bh6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.fnq);
        setBackBtn(new com.tencent.mm.plugin.game.ui.f5(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.game.ui.i5(this));
        this.f140935o = getIntent().getIntExtra("game_report_from_scene", 0);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.gno);
        this.f140931h = listView;
        listView.setOnItemClickListener(this);
        if (this.f140937q > 20) {
            if (getSharedPreferences("game_center_pref", 0).getBoolean("show_message_tips", true)) {
                android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.bhc, null);
                this.f140934n = inflate;
                inflate.setOnClickListener(new com.tencent.mm.plugin.game.ui.l5(this));
                this.f140931h.addHeaderView(this.f140934n);
                android.view.View view = this.f140934n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_message_tips", false).apply();
            } else {
                android.view.View view2 = this.f140934n;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/game/ui/GameMessageUI", "enableTipsView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.tencent.mm.plugin.game.model.e1 e1Var = new com.tencent.mm.plugin.game.model.e1();
        e1Var.f140276b3 = true;
        com.tencent.mm.plugin.game.ui.b5 b5Var = new com.tencent.mm.plugin.game.ui.b5(this, e1Var, this.f140935o, this.f140939s);
        this.f140932i = b5Var;
        b5Var.r(true);
        Z6(8);
        this.f140932i.f212611h = new com.tencent.mm.plugin.game.ui.j5(this);
        this.f140931h.setOnScrollListener(this.f140942v);
        this.f140931h.setAdapter((android.widget.ListAdapter) this.f140932i);
        android.widget.ListView listView2 = this.f140931h;
        com.tencent.mm.plugin.game.ui.b5 b5Var2 = this.f140932i;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageAdapter", "init position:%d", java.lang.Integer.valueOf(b5Var2.f141057y));
        if (b5Var2.f141057y > b5Var2.getCount() - 1) {
            b5Var2.f141057y = b5Var2.getCount() - 1;
        }
        listView2.setSelection(b5Var2.f141057y);
        com.tencent.mm.game.report.l.d(getContext(), 13, 1300, 0, 1, 0, null, this.f140935o, 0, null, null, null);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterActivity, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(573, this);
        this.f140937q = getIntent().getIntExtra("game_unread_msg_count", 0);
        this.f140938r = getIntent().getStringExtra("game_manage_url");
        long longExtra = getIntent().getLongExtra("game_msg_ui_from_msgid", 0L);
        this.f140939s = longExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageUI", "init msgId:%d", java.lang.Long.valueOf(longExtra));
        initView();
        ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().e();
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.game.ui.b5 b5Var = this.f140932i;
        if (b5Var != null) {
            b5Var.c();
        }
        gm0.j1.d().q(573, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().execSQL("GameRawMessage", "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)")), "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)");
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().T1();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.game.model.e1 e1Var = (com.tencent.mm.plugin.game.model.e1) adapterView.getAdapter().getItem(i17);
        if (e1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageUI", "get message null: position:[%d]", java.lang.Integer.valueOf(i17));
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        e1Var.t0();
        java.lang.String a17 = com.tencent.mm.game.report.l.a(null, null, e1Var.U2, null);
        int i18 = e1Var.field_msgType;
        if (i18 == 100) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f140299x2)) {
                com.tencent.mm.plugin.game.model.r0 r0Var = (com.tencent.mm.plugin.game.model.r0) e1Var.f140282g2.get(e1Var.f140299x2);
                if (r0Var == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                } else {
                    int a18 = com.tencent.mm.plugin.game.model.g1.a(this, e1Var, r0Var, e1Var.field_appId, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
                    if (a18 != 0) {
                        com.tencent.mm.game.report.l.d(getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 4, a18, 0, e1Var.field_appId, this.f140935o, e1Var.S2, e1Var.field_gameMsgId, e1Var.T2, a17);
                    }
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i19 = e1Var.Z2;
        int i27 = 3;
        if (i19 == 0) {
            if (i18 == 2 || i18 == 5) {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = e1Var.field_appId;
                ((kt.c) i0Var).getClass();
                if (com.tencent.mm.pluginsdk.model.app.w.r(this, str)) {
                    com.tencent.mm.plugin.game.model.f.j(this, e1Var.field_appId);
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putCharSequence("game_app_id", e1Var.field_appId);
                    bundle.putInt("game_report_from_scene", com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
                    i27 = r53.f.o(this, e1Var.field_appId, null, bundle, 0);
                }
                com.tencent.mm.game.report.l.d(getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 4, i27, 0, e1Var.field_appId, this.f140935o, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, a17);
            } else if (i18 != 6) {
                if ((i18 == 10 || i18 == 11) && !com.tencent.mm.sdk.platformtools.t8.K0(e1Var.V1)) {
                    com.tencent.mm.game.report.l.d(getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 4, r53.f.v(this, e1Var.V1, null, null), 0, e1Var.field_appId, this.f140935o, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, a17);
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f140294s2)) {
                com.tencent.mm.game.report.l.d(getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 4, r53.f.v(this, e1Var.f140294s2, null, null), 0, e1Var.field_appId, this.f140935o, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, a17);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i19 != 1) {
            if (i19 == 2) {
                lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str2 = e1Var.field_appId;
                ((kt.c) i0Var2).getClass();
                if (com.tencent.mm.pluginsdk.model.app.w.r(this, str2)) {
                    com.tencent.mm.plugin.game.model.f.j(this, e1Var.field_appId);
                } else {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putCharSequence("game_app_id", e1Var.field_appId);
                    bundle2.putInt("game_report_from_scene", com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
                    i27 = r53.f.o(this, e1Var.field_appId, null, bundle2, 0);
                }
                com.tencent.mm.game.report.l.d(getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 4, i27, 0, e1Var.field_appId, this.f140935o, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, a17);
            } else if (i19 != 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageUI", "unknowed jumptype : " + e1Var.Z2);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f140274a3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageUI", "jumpurl is null");
            } else {
                com.tencent.mm.game.report.l.d(getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 4, r53.f.v(this, e1Var.f140274a3, null, null), 0, e1Var.field_appId, this.f140935o, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, a17);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(e1Var.field_appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameMessageUI", "appid is null");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putCharSequence("game_app_id", e1Var.field_appId);
            bundle3.putInt("game_report_from_scene", com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
            com.tencent.mm.game.report.l.d(getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX, 4, r53.f.o(this, e1Var.field_appId, null, bundle3, 0), 0, e1Var.field_appId, this.f140935o, e1Var.field_msgType, e1Var.field_gameMsgId, e1Var.T2, a17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().T1();
        finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.view.View view;
        super.onResume();
        this.f140932i.notifyDataSetChanged();
        if (!this.f140936p || (view = this.f140934n) == null) {
            return;
        }
        this.f140931h.removeHeaderView(view);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageUI", "onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.getType()));
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() == 573) {
                Z6(8);
                this.f140932i.onNotifyChange(null, null);
                return;
            }
            return;
        }
        if (this.f140932i.getCount() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageUI", "has local message, do not show error tips");
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return;
        }
        dp.a.makeText(this, getString(com.tencent.mm.R.string.fma, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }
}
