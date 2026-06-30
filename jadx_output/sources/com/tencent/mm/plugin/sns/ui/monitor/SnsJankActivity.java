package com.tencent.mm.plugin.sns.ui.monitor;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity;", "Lcom/tencent/mm/plugin/secdata/ui/WxPresenterSecDataActivity;", "Lf4/g;", "Landroid/widget/AbsListView$OnScrollListener;", "Landroid/view/View;", "root", "Ljz5/f0;", "bindJankView", "<init>", "()V", "sd4/c", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public abstract class SnsJankActivity extends com.tencent.mm.plugin.secdata.ui.WxPresenterSecDataActivity implements f4.g, android.widget.AbsListView.OnScrollListener {

    /* renamed from: s, reason: collision with root package name */
    public static final sd4.c f169929s = new sd4.c(null);

    /* renamed from: t, reason: collision with root package name */
    public static f4.s f169930t;

    /* renamed from: u, reason: collision with root package name */
    public static int f169931u;

    /* renamed from: m, reason: collision with root package name */
    public f4.i f169937m;

    /* renamed from: p, reason: collision with root package name */
    public long f169940p;

    /* renamed from: q, reason: collision with root package name */
    public long f169941q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f169942r;

    /* renamed from: e, reason: collision with root package name */
    public final int f169932e = hashCode();

    /* renamed from: f, reason: collision with root package name */
    public long f169933f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f169934g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct f169935h = new com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct();

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f169936i = jz5.h.b(new sd4.d(this));

    /* renamed from: n, reason: collision with root package name */
    public final sd4.a f169938n = new sd4.a(0, 0, 0, 0, 0, 0, 0, 0, 255, null);

    /* renamed from: o, reason: collision with root package name */
    public final sd4.b f169939o = new sd4.b(0, null, 3, null);

    public final float T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f169936i).getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        return floatValue;
    }

    public final void bindJankView(android.view.View root) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindJankView", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        kotlin.jvm.internal.o.g(root, "root");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "bindJankView");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_jank_global_report, false)) {
            android.view.ViewParent parent = root.getParent();
            while (parent instanceof android.view.View) {
                root = parent;
                parent = root.getParent();
            }
            java.lang.Object tag = root.getTag(com.tencent.mm.R.id.jid);
            if (tag == null) {
                tag = new f4.s();
                root.setTag(com.tencent.mm.R.id.jid, tag);
            }
            f169930t = (f4.s) tag;
            android.view.Window window = getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            this.f169937m = new f4.i(window, kotlinx.coroutines.h2.a(kotlinx.coroutines.internal.b0.f310484a), this, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindJankView", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.tencent.mm.kiss.WxPresenterActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        id4.a.f290927a = kotlinx.coroutines.z0.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        this.f169933f = getIntent().getLongExtra("sns_jump_timestamp", -1L);
        int T6 = (int) T6();
        com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct = this.f169935h;
        sNSJankReportStruct.f60141m = T6;
        sNSJankReportStruct.f60143o = java.lang.System.currentTimeMillis();
        sNSJankReportStruct.f60150v = 2;
        sNSJankReportStruct.f60152x = sNSJankReportStruct.b("UniqueKey", com.tencent.mm.sdk.platformtools.y.a(com.tencent.mm.sdk.platformtools.z.f193105a, lp0.a.f320252f) + '|' + com.tencent.mm.sdk.platformtools.z.f193109e, true);
        od4.b bVar = od4.b.f344648a;
        int T62 = (int) T6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRefreshRate", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        od4.b.f344651d = T62;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRefreshRate", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        if (!ta4.u.f416837b) {
            ((com.tencent.mm.feature.performance.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(ta4.u.f416836a);
            ta4.u.f416837b = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onCreate clickJumpToPageTimeMs:" + this.f169933f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.tencent.mm.kiss.WxPresenterActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        if (ta4.u.f416837b) {
            ob0.x2 x2Var = (ob0.x2) i95.n0.c(ob0.x2.class);
            ta4.u uVar = ta4.u.f416836a;
            com.tencent.mm.feature.performance.q1 q1Var = (com.tencent.mm.feature.performance.q1) x2Var;
            kj.m mVar = q1Var.f67633d;
            if (mVar == null || !mVar.f308216d) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                kj.m mVar2 = q1Var.f67633d;
                objArr[0] = mVar2 == null ? "null" : java.lang.Boolean.valueOf(mVar2.f308216d);
                com.tencent.mars.xlog.Log.w("FrameTraceService", "unregister failed, frameTrace=%s", objArr);
            } else {
                q1Var.f67633d.l(uVar, false);
            }
            ta4.u.f416837b = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "onDestroy PageEnterCount:" + f169931u + " jank info:\n系统刷新率:" + T6() + '\n' + this.f169938n);
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        kotlinx.coroutines.y0 y0Var = id4.a.f290927a;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        id4.a.f290927a = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        this.f169937m = null;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_jank_global_report, false)) {
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct = this.f169935h;
            sNSJankReportStruct.f60146r = sNSJankReportStruct.b("SessionId", java.lang.String.valueOf(this.f169932e), true);
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct2 = this.f169935h;
            od4.b bVar = od4.b.f344648a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            java.lang.String str = od4.b.f344650c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
            sNSJankReportStruct2.f60149u = sNSJankReportStruct2.b("CpuInfo", str, true);
            this.f169935h.f60144p = java.lang.System.currentTimeMillis();
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct3 = this.f169935h;
            sd4.a aVar = this.f169938n;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j17 = aVar.f406683c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct3.f60134f = (int) j17;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct4 = this.f169935h;
            sd4.a aVar2 = this.f169938n;
            aVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j18 = aVar2.f406686f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct4.f60135g = (int) j18;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct5 = this.f169935h;
            sd4.a aVar3 = this.f169938n;
            aVar3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j19 = aVar3.f406684d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct5.f60136h = (int) j19;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct6 = this.f169935h;
            sd4.a aVar4 = this.f169938n;
            aVar4.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i17 = aVar4.f406682b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct6.f60137i = i17;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct7 = this.f169935h;
            sd4.a aVar5 = this.f169938n;
            aVar5.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i18 = aVar5.f406685e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct7.f60138j = i18;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct8 = this.f169935h;
            sd4.a aVar6 = this.f169938n;
            aVar6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i19 = aVar6.f406688h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct8.f60139k = i19;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct9 = this.f169935h;
            sd4.a aVar7 = this.f169938n;
            aVar7.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i27 = aVar7.f406687g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct9.f60140l = i27;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct10 = this.f169935h;
            sd4.a aVar8 = this.f169938n;
            aVar8.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j27 = aVar8.f406681a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            sNSJankReportStruct10.f60142n = (int) j27;
            com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct11 = this.f169935h;
            int i28 = f169931u;
            f169931u = i28 + 1;
            sNSJankReportStruct11.f60147s = i28;
            sNSJankReportStruct11.f60148t = ld4.a.f318105a.a() ? 1 : 2;
            this.f169935h.k();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.tencent.mm.kiss.WxPresenterActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onPause");
        super.onPause();
        f4.i iVar = this.f169937m;
        if (iVar != null) {
            iVar.a(false);
        }
        sd4.a aVar = this.f169938n;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long j17 = aVar.f406681a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long currentTimeMillis = j17 + (java.lang.System.currentTimeMillis() - this.f169940p);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        aVar.f406681a = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.tencent.mm.kiss.WxPresenterActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onResume");
        super.onResume();
        f4.i iVar = this.f169937m;
        if (iVar != null) {
            iVar.a(true);
        }
        this.f169940p = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        sd4.b bVar = this.f169939o;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollState", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        if (bVar.f406689a != i17) {
            sd4.c cVar = f169929s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            java.lang.String str2 = bVar.f406690b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            cVar.b(str2);
            if (i17 == 1) {
                str = "onScrollStateChanged";
                bVar.a("scroll");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (!this.f169942r) {
                    this.f169942r = true;
                    this.f169941q = java.lang.System.currentTimeMillis();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            } else if (i17 != 2) {
                bVar.a("idle");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (this.f169942r) {
                    this.f169942r = false;
                    sd4.a aVar = this.f169938n;
                    aVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    long j17 = aVar.f406683c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    str = "onScrollStateChanged";
                    long currentTimeMillis = j17 + (java.lang.System.currentTimeMillis() - this.f169941q);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                    aVar.f406683c = currentTimeMillis;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                } else {
                    str = "onScrollStateChanged";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            } else {
                str = "onScrollStateChanged";
                bVar.a("fling");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
                if (!this.f169942r) {
                    this.f169942r = true;
                    this.f169941q = java.lang.System.currentTimeMillis();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startScroll", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            java.lang.String str3 = bVar.f406690b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addState$default", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
            cVar.a(str3, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addState$default", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        } else {
            str = "onScrollStateChanged";
        }
        java.lang.String str4 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/monitor/SnsJankActivity", "android/widget/AbsListView$OnScrollListener", str4, "(Landroid/widget/AbsListView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        super.onWindowFocusChanged(z17);
        if (this.f169934g < 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f169934g = currentTimeMillis;
            long j17 = this.f169933f;
            if (j17 > 0) {
                int i17 = (int) (currentTimeMillis - j17);
                com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct = this.f169935h;
                sNSJankReportStruct.f60145q = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]enter page cost:" + sNSJankReportStruct.f60145q);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }

    @Override // f4.g
    public void q1(f4.d frameData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        kotlin.jvm.internal.o.g(frameData, "frameData");
        sd4.a aVar = this.f169938n;
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        int i17 = aVar.f406682b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        aVar.f406682b = i17 + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        if (this.f169942r) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i18 = aVar.f406688h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar.f406688h = i18 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        }
        if (frameData.f259381c) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_jank_frame_report, false);
            long j17 = frameData.f259380b;
            if (fj6) {
                com.tencent.mm.autogen.mmdata.rpt.SnsFrameJankReportStruct snsFrameJankReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFrameJankReportStruct();
                snsFrameJankReportStruct.f60583d = snsFrameJankReportStruct.b("SessionId", java.lang.String.valueOf(this.f169932e), true);
                od4.b bVar = od4.b.f344648a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
                java.lang.String str = od4.b.f344650c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
                snsFrameJankReportStruct.f60590k = snsFrameJankReportStruct.b("CpuInfo", str, true);
                snsFrameJankReportStruct.f60584e = frameData.f259379a;
                snsFrameJankReportStruct.f60585f = j17;
                snsFrameJankReportStruct.f60588i = snsFrameJankReportStruct.b("JankState", r26.i0.v(frameData.f259382d.toString(), ",", ";", false, 4, null), true);
                snsFrameJankReportStruct.f60589j = ld4.a.f318105a.a() ? 1 : 2;
                if (frameData instanceof f4.e) {
                    snsFrameJankReportStruct.f60586g = ((f4.e) frameData).f259383e;
                }
                if (frameData instanceof f4.f) {
                    snsFrameJankReportStruct.f60587h = ((f4.f) frameData).f259385g;
                }
                snsFrameJankReportStruct.k();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            int i19 = aVar.f406685e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar.f406685e = i19 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j18 = aVar.f406686f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            long j19 = j17 / 1000000;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            aVar.f406686f = j18 + j19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            if (this.f169942r) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                int i27 = aVar.f406687g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                aVar.f406687g = i27 + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                long j27 = aVar.f406684d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
                aVar.f406684d = j27 + j19;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "jank frame:" + frameData);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.frameClear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
    }
}
