package yi4;

/* loaded from: classes11.dex */
public final class j implements xj4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yi4.l f462616a;

    public j(yi4.l lVar) {
        this.f462616a = lVar;
    }

    @Override // xj4.b
    public final void a(int i17, java.lang.String[] strArr, int[] grantResults) {
        kotlin.jvm.internal.o.g(strArr, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (i17 != 64) {
            return;
        }
        boolean z17 = ((grantResults.length == 0) ^ true) && grantResults[0] == 0;
        yi4.l lVar = this.f462616a;
        yi4.i iVar = lVar.f462620b;
        lVar.f462620b = null;
        lVar.c();
        if (iVar == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = lVar.f462619a;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity = activity instanceof com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity ? (com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity) activity : null;
        yz5.l lVar2 = iVar.f462615b;
        if (statusFlutterPublishActivity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StatusPublishPoiApiImpl", "onLocationPermissionResult: activity gone, resolve null");
            lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        } else if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPoiApiImpl", "onLocationPermissionResult: granted, continue to CheckInLifeUI");
            lVar.d(statusFlutterPublishActivity, iVar.f462614a, lVar2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusPublishPoiApiImpl", "onLocationPermissionResult: denied, resolve null");
            lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
    }
}
