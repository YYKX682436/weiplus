package com.tencent.mm.plugin.webview.ui.tools.browser;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/BrowserChooseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ljx4/a;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class BrowserChooseUI extends com.tencent.mm.ui.MMActivity implements jx4.a {

    /* renamed from: d, reason: collision with root package name */
    public final hx4.p f183999d = new hx4.p(this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f184000e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List<android.content.pm.ResolveInfo> b17;
        android.content.res.Resources resources;
        android.content.pm.ActivityInfo activityInfo;
        super.onCreate(bundle);
        hx4.p pVar = this.f183999d;
        pVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pVar.f285683b = currentTimeMillis;
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
        jx4.a aVar = pVar.f285682a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "onCreate uiModel: %s, sessionId: %s", aVar, valueOf);
        java.util.ArrayList arrayList = (java.util.ArrayList) pVar.f285684c;
        arrayList.clear();
        java.lang.String str = "";
        try {
            java.lang.Object l17 = gm0.j1.u().c().l(274528, "");
            if (l17 instanceof java.lang.String) {
                str = (java.lang.String) l17;
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI browserChooseUI = (com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI) aVar;
        androidx.appcompat.app.AppCompatActivity context = browserChooseUI.getContext();
        kotlin.jvm.internal.o.d(context);
        android.content.Intent intent = (android.content.Intent) browserChooseUI.getIntent().getParcelableExtra("targetintent");
        if (intent == null) {
            b17 = new java.util.ArrayList();
        } else {
            intent.addCategory("android.intent.category.BROWSABLE");
            hx4.r rVar = hx4.r.f285691a;
            android.content.Intent f17 = rVar.f(intent);
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager != null ? packageManager.queryIntentActivities(f17, 131072) : null;
            if (queryIntentActivities == null) {
                queryIntentActivities = new java.util.ArrayList<>();
            }
            b17 = rVar.b(queryIntentActivities);
        }
        int i17 = 0;
        for (android.content.pm.ResolveInfo resolveInfo : b17) {
            if (resolveInfo != null) {
                hx4.x xVar = new hx4.x(1);
                xVar.f285701b = resolveInfo;
                androidx.appcompat.app.AppCompatActivity context2 = browserChooseUI.getContext();
                kotlin.jvm.internal.o.d(context2);
                java.lang.String c17 = hx4.r.c(context2, xVar.f285701b);
                kotlin.jvm.internal.o.g(c17, "<set-?>");
                xVar.f285703d = c17;
                android.content.pm.ResolveInfo resolveInfo2 = xVar.f285701b;
                if (r26.i0.p(str, (resolveInfo2 == null || (activityInfo = resolveInfo2.activityInfo) == null) ? null : activityInfo.packageName, false)) {
                    pVar.f285686e = i17;
                }
                arrayList.add(xVar);
                i17++;
            }
        }
        pVar.f285685d = arrayList.size();
        b17.size();
        arrayList.size();
        if (arrayList.isEmpty()) {
            androidx.appcompat.app.AppCompatActivity context3 = browserChooseUI.getContext();
            androidx.appcompat.app.AppCompatActivity context4 = browserChooseUI.getContext();
            dp.a.makeText(context3, (context4 == null || (resources = context4.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.l5e), 0).show();
            pVar.b(1, null);
        }
        getController().G0(com.tencent.mm.ui.uk.a(getResources().getColor(com.tencent.mm.R.color.aaw), 0));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f184000e) {
            return;
        }
        this.f184000e = true;
        ku5.u0 u0Var = ku5.t0.f312615d;
        hx4.t tVar = new hx4.t(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(tVar, 50L, false);
    }
}
