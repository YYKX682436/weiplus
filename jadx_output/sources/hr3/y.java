package hr3;

/* loaded from: classes4.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference f284190d;

    public y(com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference bizBindWxaInfoPreference) {
        this.f284190d = bizBindWxaInfoPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.service.k6 k6Var = (com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class);
        com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference bizBindWxaInfoPreference = this.f284190d;
        android.content.Context context = bizBindWxaInfoPreference.f197770d;
        qk.o oVar = bizBindWxaInfoPreference.P;
        java.lang.String str = oVar.field_username;
        java.lang.String str2 = oVar.field_appId;
        java.util.List list = bizBindWxaInfoPreference.N;
        ((com.tencent.mm.plugin.appbrand.app.t2) k6Var).getClass();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI.class);
        intent.putParcelableArrayListExtra("extra_wxa_entry_info_list", new java.util.ArrayList<>(list));
        intent.putExtra("extra_username", str);
        intent.putExtra("extra_appid", str2);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openBizWxaEntryInfoUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/app/ExportUILauncher", "openBizWxaEntryInfoUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
