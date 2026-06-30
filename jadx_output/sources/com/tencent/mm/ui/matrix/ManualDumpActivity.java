package com.tencent.mm.ui.matrix;

/* loaded from: classes12.dex */
public class ManualDumpActivity extends com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI implements android.view.View.OnLongClickListener {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f209102s = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f209103g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f209104h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f209105i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f209106m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f209107n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f209108o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f209109p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f209110q;

    /* renamed from: r, reason: collision with root package name */
    public nh5.g f209111r = nh5.g.f337147d;

    public int getLayoutId() {
        return com.tencent.mm.R.layout.bwx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mute(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.matrix.resource.x xVar = (com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class);
        if (xVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.matrix.resource.watcher.f fVar = xVar.f53001i;
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!(fVar.f52987l instanceof cj.f)) {
            yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        oh5.o oVar = oh5.o.f345511d;
        java.lang.String activityName = getIntent().getStringExtra(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        oVar.getClass();
        kotlin.jvm.internal.o.g(activityName, "activityName");
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixResPluginManualDu", "mute " + activityName + " for 1d");
        oh5.o.f345512e.B(activityName, -java.lang.System.currentTimeMillis());
        dp.a.makeText((android.content.Context) this, (java.lang.CharSequence) "当前 Activity 在 1 天内不再提醒", 0).show();
        if (this.f209111r == nh5.g.f337147d) {
            this.f209111r = nh5.g.f337149f;
        }
        yj0.a.h(this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        setMMTitle(z65.c.a() ? "Activity Leak(coolassist)" : "Activity Leak");
        this.f209106m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hzq);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hzo);
        this.f209108o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485278h53);
        this.f209107n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hzp);
        this.f209109p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hzr);
        textView.setOnLongClickListener(this);
        this.f209108o.setOnLongClickListener(this);
        this.f209107n.setOnLongClickListener(this);
        this.f209110q = (android.widget.Button) findViewById(com.tencent.mm.R.id.hzn);
        this.f209104h = getIntent().getStringExtra(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f209103g = getIntent().getStringExtra("ref_key");
        this.f209105i = getIntent().getStringExtra("leak_process");
        textView.setText(this.f209104h);
        if (((com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class)) != null) {
            this.f209109p.setText("反馈提供【截图】【Reference 文本】【uin/微信号】\n\nbuild=" + com.tencent.mm.sdk.platformtools.z.f193105a + "\nrev=" + com.tencent.mm.sdk.platformtools.z.f193109e);
        }
        if (getIntent().getBooleanExtra("issue_tapd", false)) {
            this.f209106m.setVisibility(0);
            this.f209110q.setVisibility(0);
            this.f209110q.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: nh5.a$$a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    int i17 = com.tencent.mm.ui.matrix.ManualDumpActivity.f209102s;
                    com.tencent.mm.ui.matrix.ManualDumpActivity manualDumpActivity = com.tencent.mm.ui.matrix.ManualDumpActivity.this;
                    manualDumpActivity.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", manualDumpActivity, array);
                    manualDumpActivity.mute(view);
                    yj0.a.i(false, manualDumpActivity, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return false;
                }
            });
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ManualDumpActivity", "onCreate:mLeakedActivity:%s, mRefString:%s, mLeakProcess:%s", this.f209104h, this.f209103g, this.f209105i);
        java.lang.String stringExtra = getIntent().getStringExtra("hprof_path");
        java.lang.String stringExtra2 = getIntent().getStringExtra("leak_detail");
        com.tencent.matrix.resource.x xVar = (com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class);
        if (xVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualDumpActivity", "plugin == null");
            dp.a.makeText((android.content.Context) this, (java.lang.CharSequence) "plugin == null", 0).show();
            return;
        }
        if (xVar.f53001i == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualDumpActivity", "watcher == null");
            dp.a.makeText((android.content.Context) this, (java.lang.CharSequence) "watcher == null", 0).show();
            return;
        }
        wi.b bVar = xVar.f53000h.f446126b;
        if (bVar != wi.b.MANUAL_DUMP && bVar != wi.b.MANUAL_DUMP_LAZY_ANALYSE) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualDumpActivity", "current dump mode [%s] is not MANUAL_DUMP", bVar.name());
            dp.a.makeText((android.content.Context) this, (java.lang.CharSequence) ("current dump mode [" + bVar.name() + "] is not MANUAL_DUMP, pls confirm that you are in the debug/coolassist env."), 1).show();
            return;
        }
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualDumpActivity", "analyze failed");
            dp.a.makeText((android.content.Context) this, (java.lang.CharSequence) "analyze failed", 0).show();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ManualDumpActivity", "dump success! leak process = %s, leak activity = %s, leak instance = %s", this.f209105i, this.f209104h, this.f209103g);
        com.tencent.mars.xlog.Log.i("MicroMsg.ManualDumpActivity", "dump success! hprof = %s", stringExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.ManualDumpActivity", "dump success! refChain = %s", stringExtra2);
        this.f209108o.setText(stringExtra);
        this.f209107n.setText(stringExtra2 == null ? "reference is null, pls pull hprof." : stringExtra2.replace(";", ";\n"));
    }

    public void onDestroy() {
        super.onDestroy();
        nh5.g gVar = this.f209111r;
        jx3.f.INSTANCE.d(18573, gVar.h(), java.lang.String.valueOf(gVar.i()), "0", 18, 0, com.tencent.mm.sdk.platformtools.z.f193105a, com.tencent.mm.sdk.platformtools.z.f193109e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view instanceof android.widget.TextView) {
            com.tencent.mm.sdk.platformtools.b0.e(((android.widget.TextView) view).getText().toString());
            db5.e1.T(this, getString(com.tencent.mm.R.string.f490361st));
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/matrix/ManualDumpActivity", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        super/*com.tencent.mm.ui.vas.VASActivity*/.onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void share(android.view.View view) {
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(this, "compressing...", false, 0, null);
        ((ku5.t0) ku5.t0.f312615d).r(new nh5.c(this, f17), "MicroMsg.ManualDumpActivity");
        if (this.f209111r == nh5.g.f337147d) {
            this.f209111r = nh5.g.f337148e;
        }
    }
}
