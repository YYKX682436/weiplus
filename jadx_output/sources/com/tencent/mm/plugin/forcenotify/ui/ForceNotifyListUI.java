package com.tencent.mm.plugin.forcenotify.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ll75/q0;", "<init>", "()V", "k13/s", "k13/x", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ForceNotifyListUI extends com.tencent.mm.ui.MMActivity implements l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f137336e;

    /* renamed from: f, reason: collision with root package name */
    public k13.s f137337f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f137338g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f137339h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f137335d = "MicroMsg.ForceNotifyListUI";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f137340i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final int[] f137341m = new int[2];

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbg;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        j13.a.f297177d.add(this);
        setMMTitle(com.tencent.mm.R.string.feh);
        setBackBtn(new k13.y(this));
        this.f137338g = findViewById(com.tencent.mm.R.id.ilp);
        this.f137339h = findViewById(com.tencent.mm.R.id.dft);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.i38);
        this.f137336e = recyclerView;
        kotlin.jvm.internal.o.d(recyclerView);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        this.f137337f = new k13.s(this);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f137336e;
        kotlin.jvm.internal.o.d(recyclerView2);
        recyclerView2.setAdapter(this.f137337f);
        ((ku5.t0) ku5.t0.f312615d).g(new k13.a0(this));
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Bi("", 1, c01.id.c() / 1000);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j13.a.f297177d.remove(this);
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Bi("", 2, c01.id.c() / 1000);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i(this.f137335d, "[onNotifyChange] event:%s", str);
        ((ku5.t0) ku5.t0.f312615d).g(new k13.c0(this));
    }
}
