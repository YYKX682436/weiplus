package n44;

/* loaded from: classes8.dex */
public final class i extends n44.f1 {

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f334949q;

    /* renamed from: r, reason: collision with root package name */
    public final k54.a f334950r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.z1 f334951s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f334952t;

    public i(android.view.View view, i64.z zVar) {
        super(view, zVar);
        this.f334949q = jz5.h.b(new n44.f(view));
        this.f334950r = new k54.a(j());
        this.f334952t = jz5.h.b(new n44.g(view));
    }

    @Override // n44.f1
    public void a(y54.b contentSizeAttr, android.content.Intent intent) {
        android.content.Context context;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (g() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        contentSizeAttr.f459526g = (int) java.lang.Math.ceil((contentSizeAttr.d() - contentSizeAttr.g()) + contentSizeAttr.b());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInitVisibleHalfScreenHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeLoadingLayoutParams", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        android.widget.ProgressBar j17 = j();
        if (j17 != null) {
            j17.setVisibility(0);
        }
        android.widget.ProgressBar j18 = j();
        android.view.ViewGroup.LayoutParams layoutParams = j18 != null ? j18.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int c17 = contentSizeAttr.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoadingSize", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            int intValue = ((java.lang.Number) ((jz5.n) this.f334952t).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoadingSize", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            marginLayoutParams.topMargin = (c17 - intValue) / 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeLoadingLayoutParams", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        int a17 = contentSizeAttr.a(g().a());
        android.widget.FrameLayout c18 = c();
        android.view.ViewGroup.LayoutParams layoutParams2 = c18 != null ? c18.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = a17;
        }
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = 0;
        }
        android.widget.FrameLayout e17 = e();
        android.view.ViewGroup.LayoutParams layoutParams3 = e17 != null ? e17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.height = a17;
        }
        android.view.View h17 = h();
        if (h17 != null && (context = h17.getContext()) != null && (f17 = f()) != null) {
            f17.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478603ae0));
        }
        super.a(contentSizeAttr, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if ((r5.b() == 5) != false) goto L24;
     */
    @Override // n44.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Intent r35) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n44.i.b(android.content.Intent):void");
    }

    @Override // n44.f1
    public int i(y54.b contentSizeAttr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        if (g() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
            return 0;
        }
        int d17 = contentSizeAttr.d();
        i64.z g17 = g();
        g17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHalfScreenMinHeightPercent", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int i17 = g17.f289378p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHalfScreenMinHeightPercent", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        int i18 = (d17 * (100 - i17)) / 100;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopContainerMaxHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        return i18;
    }

    public final android.widget.ProgressBar j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoading", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) this.f334949q.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoading", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenH5Helper");
        return progressBar;
    }
}
