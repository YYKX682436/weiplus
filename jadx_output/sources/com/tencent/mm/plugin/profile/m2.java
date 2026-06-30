package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class m2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f153531e;

    public m2(java.lang.String str, android.content.Context context) {
        this.f153530d = str;
        this.f153531e = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f153530d;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.content.Context context = this.f153531e;
            com.tencent.mm.sdk.platformtools.b0.d(context, null, str, null);
            dp.a.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f490361st), 0).show();
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        try {
            android.content.Context context2 = this.f153531e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt$showBottomSheetCall$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/profile/ProfileUtilsKt$showBottomSheetCall$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileMobilePhoneView", "ActivityNotFoundException!");
        }
    }
}
