package com.tencent.mm.plugin.fts.ui;

@gm0.a2
/* loaded from: classes12.dex */
public class FTSServiceNotifyUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137987p;

    /* renamed from: q, reason: collision with root package name */
    public int f137988q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f137989r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f137990s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f137991t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f137992u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f137993v = true;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.d3 f137994w;

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f137994w == null) {
            this.f137994w = new com.tencent.mm.plugin.fts.ui.d3(w0Var, this.f137987p, this.f137988q);
        }
        return this.f137994w;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void V6(java.lang.String str) {
        super.V6(str);
        if (this.f137993v && this.f137988q == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23903, 4, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, 0, this.f137990s);
        }
        this.f137993v = false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f137987p = getIntent().getStringExtra("detail_username");
        this.f137988q = getIntent().getIntExtra("Search_Scene", 0);
        this.f137989r = getIntent().getStringExtra("Search_Str");
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("service_notify_session_id");
        com.tencent.mm.plugin.fts.ui.e3.f138046a = stringExtra;
        this.f137990s = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "initSearchData conversation=%s", this.f137987p);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void Z6() {
        super.Z6();
        if (this.f137988q == 1) {
            android.view.View view = this.f137991t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void a7() {
        super.a7();
        android.view.View view = this.f137991t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void b7() {
        super.b7();
        android.view.View view = this.f137991t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void c7() {
        super.c7();
        android.view.View view = this.f137991t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        hideActionbarLine();
        this.f137991t = findViewById(com.tencent.mm.R.id.mfb);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mfn);
        this.f137992u = textView;
        textView.setTextSize(15.0f);
        if (this.f137988q == 1) {
            android.view.View view = this.f137991t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f137992u.setVisibility(0);
            this.f137992u.setText(com.tencent.mm.R.string.idu);
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.gs6);
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 2));
            recyclerView.N(new com.tencent.mm.plugin.fts.ui.f3(this));
            recyclerView.setAdapter(new com.tencent.mm.plugin.fts.ui.h3(this));
        } else {
            android.view.View view2 = this.f137991t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f137992u.setVisibility(8);
        }
        if (this.f137988q != 4 || com.tencent.mm.sdk.platformtools.t8.K0(this.f137989r)) {
            return;
        }
        java.lang.String p17 = o13.n.p(this.f137989r);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f137910n) && this.f137910n.equals(p17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "Same query %s %s", this.f137910n, p17);
            return;
        }
        java.lang.String str = this.f137989r;
        this.f137910n = str;
        this.f137907h.getFtsEditText().n(str, null);
        V6(p17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view instanceof android.widget.TextView)) {
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (intValue == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchMemberDetail");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("from_scene", 1);
            intent.putExtra("RoomInfo_Id", "notifymessage");
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, getResources().getString(com.tencent.mm.R.string.ic_));
            intent.putExtra("service_notify_session_id", this.f137990s);
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI", intent, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23903, 2, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, 0, this.f137990s);
        } else if (intValue == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchDateDetail");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("detail_username", "notifymessage");
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23903, 3, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, 0, this.f137990s);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        this.f137994w.g();
        t13.g bj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.tencent.mm.plugin.fts.n) bj6).g();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f137988q != 4) {
            this.f137991t.postDelayed(new com.tencent.mm.plugin.fts.ui.g3(this), 128L);
        }
    }
}
