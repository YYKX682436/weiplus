package k02;

/* loaded from: classes.dex */
public class b implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f303065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k02.j f303066c;

    public b(android.content.Context context, android.content.Intent intent, k02.j jVar) {
        this.f303064a = context;
        this.f303065b = intent;
        this.f303066c = jVar;
    }

    @Override // j35.g0
    public void a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAppUtil", "onRequestPermissionsResult, resultCode = %d", java.lang.Integer.valueOf(i18));
        android.content.Intent intent2 = this.f303065b;
        k02.j jVar = this.f303066c;
        if (i18 == -1) {
            try {
                android.content.Context context = this.f303064a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DownloadAppUtil", e17, "install app failed! %s", intent2);
            }
            if (jVar != null) {
                jVar.b(true);
                jVar.a(true);
                return;
            }
            return;
        }
        android.content.Context context2 = this.f303064a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/downloader/util/DownloadAppUtil$2", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadAppUtil", "no get!!!");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h9z, 1).show();
        if (jVar != null) {
            jVar.b(false);
            jVar.a(false);
        }
    }
}
