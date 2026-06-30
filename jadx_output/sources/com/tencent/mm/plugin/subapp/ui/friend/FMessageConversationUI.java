package com.tencent.mm.plugin.subapp.ui.friend;

/* loaded from: classes4.dex */
public class FMessageConversationUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f172172p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f172173d;

    /* renamed from: e, reason: collision with root package name */
    public eg4.t1 f172174e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f172175f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f172176g;

    /* renamed from: m, reason: collision with root package name */
    public long f172179m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f172180n;

    /* renamed from: h, reason: collision with root package name */
    public int f172177h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f172178i = 0;

    /* renamed from: o, reason: collision with root package name */
    public final db5.t4 f172181o = new eg4.b2(this);

    public final void T6() {
        if (this.f172174e.getCount() > 0) {
            android.view.View findViewById = this.f172175f.findViewById(com.tencent.mm.R.id.mfo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = this.f172176g.findViewById(com.tencent.mm.R.id.f482698lm);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById3 = this.f172175f.findViewById(com.tencent.mm.R.id.mfo);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = this.f172176g.findViewById(com.tencent.mm.R.id.f482698lm);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489103bb1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f172174e = new eg4.t1(getContext());
        r21.w.wi().add(this.f172174e);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f172174e);
        this.f172174e.f212611h = new eg4.u1(this);
        this.f172173d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.g_b);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489107bb5, (android.view.ViewGroup) null);
        this.f172175f = inflate;
        inflate.findViewById(com.tencent.mm.R.id.mfo).setOnClickListener(new eg4.v1(this));
        this.f172173d.addHeaderView(this.f172175f);
        android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489104bb2, (android.view.ViewGroup) null);
        this.f172176g = inflate2;
        inflate2.findViewById(com.tencent.mm.R.id.f482696lk).setOnClickListener(new eg4.w1(this));
        this.f172173d.addHeaderView(this.f172176g);
        this.f172173d.setAdapter((android.widget.ListAdapter) this.f172174e);
        T6();
        this.f172173d.setOnTouchListener(new eg4.x1(this));
        this.f172173d.setOnItemLongClickListener(new eg4.y1(this, new rl5.r(this)));
        this.f172173d.setOnItemClickListener(new eg4.g1(getContext(), this.f172174e, this.f172173d.getHeaderViewsCount() > 0));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.gum), new eg4.z1(this));
        setBackBtn(new eg4.a2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.fbf);
        hideActionbarLine();
        try {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).g();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FMessageConversationUI", e17, "try cancel notification fail", new java.lang.Object[0]);
        }
        if (!gm0.j1.a()) {
            finish();
            return;
        }
        initView();
        if (gm0.j1.a() && r61.q0.a() && !r61.q0.h()) {
            boolean z17 = (c01.z1.p() & 256) == 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageConversationUI", "mark addr book had update. %b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                x51.e.a(x51.e.f451990b);
            }
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FMessageConversationUI)).Rj(this, iy1.a.NewFriends);
        if (r21.w.wi().W0() > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.J("fmessage", 2);
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        com.tencent.mm.storage.m7 m7Var = (com.tencent.mm.storage.m7) this.f172174e.getItem(adapterContextMenuInfo.position);
        if (m7Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageConversationUI", "onItemLongClick, item is null, pos = " + adapterContextMenuInfo.position);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(m7Var.field_displayName)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = m7Var.field_displayName;
            ((ke0.e) xVar).getClass();
            contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
        }
        contextMenu.add(0, 0, 0, com.tencent.mm.R.string.f490367t0);
        this.f172179m = m7Var.field_fmsgSysRowId;
        this.f172180n = m7Var.field_talker;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f172174e != null) {
            r21.w.wi().remove(this.f172174e);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f172174e);
        }
        if (gm0.j1.b().m()) {
            r21.w.wi().y0();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageConversationUI", "account not init.");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (r21.w.wi().W0() > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.J("fmessage", 2);
        }
        c01.d9.b().p().w(143618, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (gm0.j1.a()) {
            return;
        }
        finish();
    }
}
