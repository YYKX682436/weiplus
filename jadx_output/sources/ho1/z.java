package ho1;

/* loaded from: classes5.dex */
public final class z implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f282859b;

    public z(yz5.l lVar, android.app.Activity activity) {
        this.f282858a = lVar;
        this.f282859b = activity;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.Object obj;
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
                yz5.l lVar = this.f282858a;
                if (e17 == null) {
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_path_not_support")));
                    return;
                }
                java.lang.String str = (java.lang.String) e17.f302833d;
                java.lang.String str2 = (java.lang.String) e17.f302834e;
                java.util.Iterator it = ro1.v.f398014a.b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((po1.d) obj).f357300f, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                po1.d dVar = (po1.d) obj;
                if (dVar == null) {
                    this.f282858a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_path_not_support")));
                    return;
                }
                java.util.List e07 = r26.n0.e0(str2, new char[]{'/'}, false, 0, 6, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : e07) {
                    if (((java.lang.String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                int indexOf = arrayList.indexOf("ChatBackup");
                if (indexOf != -1 && indexOf != kz5.c0.h(arrayList)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "not allow embedded path, segments=" + arrayList);
                    this.f282858a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("error_path_not_support")));
                    return;
                } else {
                    dVar.d(ro1.v.f398014a.d(str2, new to1.d(data)));
                    android.app.Activity activity = this.f282859b;
                    ((ku5.t0) ku5.t0.f312615d).q(new ho1.y(data, dVar, com.tencent.mm.ui.widget.dialog.u3.f(activity, ((com.tencent.mm.ui.MMFragmentActivity) activity).getString(com.tencent.mm.R.string.mvy), false, 3, null), this.f282858a));
                    return;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resultCode=");
        sb6.append(i17);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        this.f282858a.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
    }
}
