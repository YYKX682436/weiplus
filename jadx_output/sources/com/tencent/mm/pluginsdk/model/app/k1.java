package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes.dex */
public class k1 implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f188969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f188970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j35.d f188971c;

    public k1(android.content.Context context, android.content.Intent intent, j35.d dVar) {
        this.f188969a = context;
        this.f188970b = intent;
        this.f188971c = dVar;
    }

    @Override // j35.g0
    public void a(int i17, int i18, android.content.Intent intent) {
        android.content.Intent intent2 = this.f188970b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationUtil", "onRequestPermissionsResult, resultCode = %d", java.lang.Integer.valueOf(i18));
        j35.d dVar = this.f188971c;
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApplicationUtil", "no get!!!");
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h9z, 1).show();
            if (dVar != null) {
                dVar.a(false);
                return;
            }
            return;
        }
        try {
            android.content.Context context = this.f188969a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil$1", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil$1", "onRequestPermissionsResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApplicationUtil", e17, "install app failed! %s", intent2);
        }
        if (dVar != null) {
            dVar.a(true);
        }
    }
}
