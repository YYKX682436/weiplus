package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class ShakeItemListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.shake.ui.y f162095f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f162096g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f162097h;

    /* renamed from: i, reason: collision with root package name */
    public int f162098i;

    /* renamed from: n, reason: collision with root package name */
    public int f162100n;

    /* renamed from: d, reason: collision with root package name */
    public long f162093d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f162094e = false;

    /* renamed from: m, reason: collision with root package name */
    public n11.a f162099m = null;

    /* renamed from: o, reason: collision with root package name */
    public final db5.t4 f162101o = new com.tencent.mm.plugin.shake.ui.u(this);

    public int T6(int i17) {
        return (i17 == -12 || i17 == 11) ? com.tencent.mm.R.string.j2g : i17 != 100 ? i17 != -6 ? (i17 == -5 || i17 == 4) ? com.tencent.mm.R.string.f493115j30 : i17 != 5 ? com.tencent.mm.R.string.j2_ : com.tencent.mm.R.string.j3k : com.tencent.mm.R.string.j3k : com.tencent.mm.R.string.j2d;
    }

    public final void U6(c34.r rVar) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        y24.a aVar = new y24.a(null, 103);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
        r45.gh4 gh4Var = new r45.gh4();
        try {
            gh4Var.parseFrom(rVar.field_lvbuffer);
            java.util.LinkedList linkedList = gh4Var.f375251i;
            if (linkedList != null && linkedList.size() == 1) {
                r45.eh4 eh4Var = (r45.eh4) gh4Var.f375251i.get(0);
                b21.r a17 = h34.v.a(eh4Var);
                android.content.Intent intent = new android.content.Intent();
                if (eh4Var.f373491q != null) {
                    intent.putExtra("key_copyright", true);
                }
                intent.putExtra("key_music_wrapper", a17);
                intent.putExtra("key_offset", a17.f17347f);
                intent.putExtra("key_pure", eh4Var.f373499y);
                intent.putExtra("key_byuser", eh4Var.f373481d);
                intent.putExtra("key_history", true);
                j45.l.j(getContext(), "mv", ".ui.shake.MusicMainUINew", intent, null);
                return;
            }
            java.util.LinkedList linkedList2 = gh4Var.f375251i;
            if (linkedList2 == null || linkedList2.size() <= 1) {
                return;
            }
            r45.eh4 eh4Var2 = (r45.eh4) gh4Var.f375251i.get(0);
            b21.r a18 = h34.v.a(eh4Var2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 1; i17 < gh4Var.f375251i.size(); i17++) {
                b21.r a19 = h34.v.a((r45.eh4) gh4Var.f375251i.get(i17));
                if (a18 != null) {
                    arrayList.add(a19);
                }
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_music_wrapper", a18);
            intent2.putExtra("key_offset", a18.f17347f);
            intent2.putExtra("key_pure", eh4Var2.f373499y);
            intent2.putExtra("key_recommend_list", arrayList);
            intent2.putExtra("key_byuser", eh4Var2.f373481d);
            intent2.putExtra("key_history", true);
            j45.l.j(getContext(), "mv", ".ui.shake.MusicMainUINew", intent2, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShakeItemListUI", e17, "catch Exception in NewShake History", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cmj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f162099m = new n11.a(this);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) c01.d9.b().p().l(12290, null), 0);
        this.f162098i = getIntent().getIntExtra("_key_show_type_", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("_key_title_");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            setMMTitle(stringExtra);
        }
        this.f162094e = getIntent().getBooleanExtra("_key_show_from_shake_", false);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490353sl), new com.tencent.mm.plugin.shake.ui.n(this));
        this.f162096g = (android.widget.ListView) findViewById(com.tencent.mm.R.id.k5q);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.cml, (android.view.ViewGroup) null);
        this.f162097h = inflate;
        inflate.findViewById(com.tencent.mm.R.id.mqo).setOnClickListener(new com.tencent.mm.plugin.shake.ui.o(this));
        this.f162096g.addFooterView(this.f162097h);
        if (this.f162098i == -1) {
            android.view.View findViewById = this.f162097h.findViewById(com.tencent.mm.R.id.mqo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f162097h.findViewById(com.tencent.mm.R.id.mqo);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.shake.ui.y yVar = new com.tencent.mm.plugin.shake.ui.y(this, this);
        this.f162095f = yVar;
        yVar.f162352o = this.f162098i;
        yVar.o();
        if (this.f162095f.getCount() <= 0) {
            this.f162096g.setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k5s);
            textView.setText(T6(this.f162098i));
            textView.setVisibility(0);
            enableOptionMenu(false);
        } else {
            this.f162096g.setAdapter((android.widget.ListAdapter) this.f162095f);
            this.f162096g.setOnItemClickListener(new com.tencent.mm.plugin.shake.ui.p(this, j17));
            this.f162096g.setOnItemLongClickListener(new com.tencent.mm.plugin.shake.ui.q(this, new com.tencent.mm.ui.tools.s6(this)));
        }
        setBackBtn(new com.tencent.mm.plugin.shake.ui.r(this));
        setToTop(new com.tencent.mm.plugin.shake.ui.s(this));
        this.f162096g.setOnTouchListener(new com.tencent.mm.plugin.shake.ui.t(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        c34.h0.Ni().add(this.f162095f);
        this.f162095f.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeItemListUI", "onResume");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f162100n = ((c34.r) this.f162095f.getItem(adapterContextMenuInfo.position)).field_shakeItemID;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.tencent.mm.R.string.f490367t0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f162095f.c();
        com.tencent.mm.plugin.shake.ui.y yVar = this.f162095f;
        bb5.g gVar = yVar.f162354q;
        if (gVar != null) {
            gVar.a();
            yVar.f162354q = null;
        }
        c34.h0.Ni().remove(this.f162095f);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeItemListUI", "onPause");
        n11.a aVar = this.f162099m;
        if (aVar != null) {
            aVar.c();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
