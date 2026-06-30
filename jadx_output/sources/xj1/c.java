package xj1;

/* loaded from: classes7.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454782d;

    public c(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList) {
        this.f454782d = appBrandCollectionDisplayVerticalList;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f454782d;
        if (appBrandCollectionDisplayVerticalList.getActivity() == null) {
            return true;
        }
        int i17 = com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionSortUI.f89648d;
        androidx.fragment.app.FragmentActivity activity = appBrandCollectionDisplayVerticalList.getActivity();
        kotlin.jvm.internal.o.d(activity);
        xj1.b0 b0Var = appBrandCollectionDisplayVerticalList.f89640i;
        kotlin.jvm.internal.o.d(b0Var);
        int intValue = ((java.lang.Number) ((jz5.n) appBrandCollectionDisplayVerticalList.f89644p).getValue()).intValue();
        java.lang.String operateReportSceneId = (java.lang.String) ((jz5.n) appBrandCollectionDisplayVerticalList.f89645q).getValue();
        java.util.ArrayList dataList = b0Var.f454780d;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(operateReportSceneId, "operateReportSceneId");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionSortUI.class);
        intent.putExtra("KEY_SORT_DATA_LIST", dataList);
        intent.putExtra("KEY_OPERATE_REPORT_SCENE", intValue);
        intent.putExtra("KEY_OPERATE_REPORT_SCENE_ID", operateReportSceneId);
        intent.addFlags(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI$Companion", "startSortList", "(Landroid/content/Context;Ljava/util/ArrayList;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI$Companion", "startSortList", "(Landroid/content/Context;Ljava/util/ArrayList;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.overridePendingTransition(com.tencent.mm.R.anim.f477723k, com.tencent.mm.R.anim.f477728p);
        appBrandCollectionDisplayVerticalList.f89641m = true;
        return true;
    }
}
