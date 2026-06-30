package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class NetworkDiagnoseReportUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f175304i;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f175305d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f175306e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f175307f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f175308g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f175309h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c7k;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        this.f175307f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.lz9);
        this.f175308g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lzb);
        this.f175309h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lza);
        if (getIntent().getBooleanExtra("diagnose_result", false)) {
            this.f175307f.setImageResource(com.tencent.mm.R.drawable.bkk);
            this.f175308g.setText(getString(com.tencent.mm.R.string.k47));
            this.f175309h.setVisibility(0);
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.bpe), new com.tencent.mm.plugin.traceroute.ui.m(this));
            return;
        }
        setBackBtn(new com.tencent.mm.plugin.traceroute.ui.n(this));
        f175304i = getIntent().getStringExtra("diagnose_log_file_path");
        this.f175307f.setImageResource(com.tencent.mm.R.drawable.bkj);
        this.f175308g.setText(getString(com.tencent.mm.R.string.f493426k46));
        java.lang.String str = f175304i;
        if (str == null || com.tencent.mm.vfs.w6.k(str) <= 0) {
            return;
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.lz_)).setText(getString(com.tencent.mm.R.string.i1y, f175304i.replace("mnt/", "")));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lz_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.mlp);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.mly);
        this.f175305d = button;
        button.setVisibility(0);
        this.f175305d.setOnClickListener(new com.tencent.mm.plugin.traceroute.ui.o(this));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.p1l);
        this.f175306e = button2;
        button2.setVisibility(0);
        this.f175306e.setOnClickListener(new com.tencent.mm.plugin.traceroute.ui.p(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
