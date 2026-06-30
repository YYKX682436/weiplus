package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lqi4/b;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/bc", "com/tencent/mm/plugin/textstatus/ui/cc", "com/tencent/mm/plugin/textstatus/ui/fc", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class TextStatusHalfScreenLikeListUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements qi4.b {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.ui.bc f173626i = new com.tencent.mm.plugin.textstatus.ui.bc(null);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f173627d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f173628e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.textstatus.ui.cc f173629f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f173630g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f173631h;

    @Override // qi4.b
    public void L3(java.lang.String event, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", "onObserver() called with: event = " + i17);
        U6();
    }

    public final void U6() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData: old size=");
        java.util.ArrayList arrayList = this.f173628e;
        sb6.append(arrayList.size());
        sb6.append(", scene=0");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", sb6.toString());
        arrayList.clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI$buildItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new oi4.e();
            }
        }, arrayList, false);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f173627d;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(wxRecyclerAdapter);
        }
        wxRecyclerAdapter.registerAdapterDataObserver(new com.tencent.mm.plugin.textstatus.ui.gc(this));
        android.content.Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("status_id")) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.tencent.mm.plugin.textstatus.ui.cc ccVar = this.f173629f;
        if (ccVar != null) {
            gm0.j1.d().q(6621, ((com.tencent.mm.plugin.textstatus.ui.fc) ccVar).f173877c);
        }
        com.tencent.mm.plugin.textstatus.ui.fc fcVar = new com.tencent.mm.plugin.textstatus.ui.fc(str2, wxRecyclerAdapter, null, 4, null);
        this.f173629f = fcVar;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loadNextPage: ");
        java.lang.String str3 = fcVar.f173875a;
        sb7.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHalfScreenLikeListUI", sb7.toString());
        gm0.j1.d().g(new ej4.g(str3, fcVar.f173878d));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        setResult(-1);
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.czi;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.r0.f314002d;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean isContentAtTop() {
        if (this.f173627d != null) {
            return !r0.canScrollVertically(-1);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.lqa);
        this.f173627d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        }
        this.f173630g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dft);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.imn);
        this.f173631h = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/ui/TextStatusHalfScreenLikeListUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        U6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.textstatus.ui.cc ccVar = this.f173629f;
        if (ccVar != null) {
            gm0.j1.d().q(6621, ((com.tencent.mm.plugin.textstatus.ui.fc) ccVar).f173877c);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ai4.m0.f5173a.p(this, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ai4.m0.f5173a.J(this, null);
    }
}
