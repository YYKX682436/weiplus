package ho1;

/* loaded from: classes5.dex */
public final class c0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po1.d f282637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f282638c;

    public c0(yz5.l lVar, po1.d dVar, android.app.Activity activity) {
        this.f282636a = lVar;
        this.f282637b = dVar;
        this.f282638c = activity;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamFloatWindowHelper", "Remove float window");
        java.lang.ref.WeakReference weakReference = wo1.l1.f447987b;
        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).removeView(view);
            wo1.l1.f447987b = null;
        }
        if (i17 == -1) {
            if (!(intent == null)) {
                android.net.Uri data = intent.getData();
                kotlin.jvm.internal.o.d(data);
                com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "Selected uri = " + data);
                jz5.l e17 = to1.g.f420911a.e(data);
                yz5.l lVar = this.f282636a;
                if (e17 == null) {
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_path_not_support")));
                    return;
                }
                java.lang.String str = (java.lang.String) e17.f302833d;
                java.lang.String str2 = (java.lang.String) e17.f302834e;
                po1.d a17 = po1.d.a(this.f282637b, null, null, null, null, null, null, null, 127, null);
                kotlin.jvm.internal.o.g(str, "<set-?>");
                a17.f357300f = str;
                a17.d(str2);
                java.lang.String uri = data.toString();
                kotlin.jvm.internal.o.f(uri, "toString(...)");
                a17.f357301g = uri;
                java.lang.String string = ((com.tencent.mm.ui.MMFragmentActivity) this.f282638c).getString(com.tencent.mm.R.string.mvy);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                ((ku5.t0) ku5.t0.f312615d).q(new ho1.b0(data, a17, this.f282637b, com.tencent.mm.ui.widget.dialog.u3.f(this.f282638c, string, false, 3, null), this.f282636a));
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resultCode=");
        sb6.append(i17);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        this.f282636a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
    }
}
