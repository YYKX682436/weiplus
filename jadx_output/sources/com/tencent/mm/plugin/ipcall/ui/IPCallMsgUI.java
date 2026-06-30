package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class IPCallMsgUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f142632d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.q2 f142633e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f142634f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f142635g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f142636h = new com.tencent.mm.plugin.ipcall.ui.o2(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489185bm1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.g5f);
        this.f142635g = findViewById(com.tencent.mm.R.id.hgq);
        this.f142632d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.hgr);
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.byg, (android.view.ViewGroup) null);
        this.f142634f = inflate;
        this.f142632d.addFooterView(inflate);
        this.f142633e = new com.tencent.mm.plugin.ipcall.ui.q2(this, this, new s83.g());
        com.tencent.mm.plugin.ipcall.ui.q2 q2Var = this.f142633e;
        q2Var.f212611h = new com.tencent.mm.plugin.ipcall.ui.j2(this);
        this.f142632d.setAdapter((android.widget.ListAdapter) q2Var);
        this.f142632d.setOnItemClickListener(new com.tencent.mm.plugin.ipcall.ui.k2(this));
        this.f142632d.setOnScrollListener(new com.tencent.mm.plugin.ipcall.ui.l2(this));
        if (this.f142633e.getCount() == 0) {
            this.f142632d.setVisibility(8);
            android.view.View view = this.f142635g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(false);
        } else {
            this.f142632d.setVisibility(0);
            android.view.View view2 = this.f142635g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(true);
        }
        com.tencent.mm.plugin.ipcall.ui.q2 q2Var2 = this.f142633e;
        if (q2Var2.f142986o >= q2Var2.f142987p) {
            this.f142632d.removeFooterView(this.f142634f);
        }
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.m2(this));
        com.tencent.mm.plugin.ipcall.ui.q2 q2Var3 = this.f142633e;
        if (q2Var3.f142986o >= q2Var3.f142987p) {
            this.f142632d.removeFooterView(this.f142634f);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.ipcall.model.r.Ri().add(this.f142636h);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.ipcall.model.r.Ri().remove(this.f142636h);
        this.f142633e.c();
        s83.h Ri = com.tencent.mm.plugin.ipcall.model.r.Ri();
        Ri.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("isRead", (java.lang.Short) 1);
        Ri.f404880d.p(Ri.getTableName(), contentValues, "isRead!=? ", new java.lang.String[]{"1"});
        super.onDestroy();
    }
}
