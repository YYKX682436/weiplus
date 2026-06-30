package vy3;

/* loaded from: classes.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f441464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441465e;

    public b(nw4.k kVar, java.lang.String str) {
        this.f441464d = kVar;
        this.f441465e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        vy3.c cVar = vy3.c.f441466e;
        java.lang.String str = this.f441465e;
        nw4.k kVar = this.f441464d;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            vy3.c.e(cVar, kVar.f340860a, str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10114, "1");
            return;
        }
        if (!cVar.f()) {
            vy3.c.e(cVar, kVar.f340860a, str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10114, "1");
            return;
        }
        android.content.Context context = kVar.f340860a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", str);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenDialPad", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10113, "1");
    }
}
