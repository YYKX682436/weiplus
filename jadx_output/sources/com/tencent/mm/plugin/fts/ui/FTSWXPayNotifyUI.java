package com.tencent.mm.plugin.fts.ui;

@gm0.a2
/* loaded from: classes12.dex */
public class FTSWXPayNotifyUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f137999v = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f138000p;

    /* renamed from: q, reason: collision with root package name */
    public int f138001q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f138002r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f138003s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f138004t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.r3 f138005u;

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f138005u == null) {
            this.f138005u = new com.tencent.mm.plugin.fts.ui.r3(w0Var, this.f138000p, this.f138001q);
        }
        return this.f138005u;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void V6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "notify ui do search");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f138000p = getIntent().getStringExtra("detail_username");
        this.f138001q = getIntent().getIntExtra("Search_Scene", 5);
        this.f138002r = getIntent().getStringExtra("Search_Str");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "initSearchData conversation=%s", this.f138000p);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void Z6() {
        super.Z6();
        if (this.f138001q == 5) {
            android.view.View view = this.f138003s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void a7() {
        super.a7();
        android.view.View view = this.f138003s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void b7() {
        super.b7();
        android.view.View view = this.f138003s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void c7() {
        super.c7();
        android.view.View view = this.f138003s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        hideActionbarLine();
        this.f138003s = findViewById(com.tencent.mm.R.id.mfr);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mfq);
        this.f138004t = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (this.f138001q != 5) {
            android.view.View view = this.f138003s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f138003s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f138004t.setOnClickListener(new com.tencent.mm.plugin.fts.ui.p3(this));
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        t13.g bj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.tencent.mm.plugin.fts.n) bj6).f137769c = true;
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f138005u.g();
        t13.g bj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.tencent.mm.plugin.fts.n) bj6).g();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f138003s.postDelayed(new com.tencent.mm.plugin.fts.ui.q3(this), 128L);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "on scene end, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof h23.a) {
            r45.q75 q75Var = ((h23.a) m1Var).f278312f;
            if (q75Var != null) {
                com.tencent.mm.plugin.fts.ui.r3 r3Var = this.f138005u;
                java.util.LinkedList linkedList = q75Var.f383746f;
                r3Var.f138168s = true;
                r3Var.f138172w = linkedList;
                if (linkedList.size() > 0) {
                    if (r3Var.getCount() > 5) {
                        r3Var.f138171v = r3Var.getCount();
                        r3Var.n(6);
                        r3Var.f138170u = true;
                    } else {
                        r3Var.f138170u = false;
                        r3Var.n(r3Var.getCount() + 1);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "add related");
                }
                if (r3Var.f138169t && r3Var.f138168s) {
                    r3Var.c();
                    r3Var.notifyDataSetChanged();
                    r3Var.l(r3Var.getCount(), true);
                }
            }
            gm0.j1.n().f273288b.q(7701, this);
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.n
    public void x0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "on tap search key");
        this.f138002r = this.f137907h.getFtsEditText().getInEditTextQuery();
        com.tencent.mm.plugin.fts.ui.r3 r3Var = this.f138005u;
        r3Var.f138169t = false;
        r3Var.f138168s = false;
        r3Var.f138171v = 0;
        r3Var.f138172w = new java.util.LinkedList();
        r3Var.c();
        super.V6(this.f138002r);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_brand_search_related_function, false)) {
            h23.a aVar = new h23.a(this.f138002r);
            gm0.j1.n().f273288b.a(7701, this);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(aVar);
        }
    }
}
