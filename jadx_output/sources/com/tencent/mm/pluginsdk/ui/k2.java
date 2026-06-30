package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class k2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView f190884e;

    public k2(com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView, java.lang.String str) {
        this.f190884e = profileMobilePhoneView;
        this.f190883d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f190883d;
        com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView profileMobilePhoneView = this.f190884e;
        if (i17 != 0) {
            if (i17 == 1) {
                com.tencent.mm.sdk.platformtools.b0.d(profileMobilePhoneView.getContext(), null, str, null);
                dp.a.makeText(profileMobilePhoneView.getContext(), profileMobilePhoneView.getResources().getString(com.tencent.mm.R.string.f490361st), 0).show();
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        try {
            android.content.Context context = profileMobilePhoneView.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileMobilePhoneView", "ActivityNotFoundException!");
        }
    }
}
