package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class wd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference f210889d;

    public wd(com.tencent.mm.ui.tools.ZoneSelectOtherCountryPreference zoneSelectOtherCountryPreference) {
        this.f210889d = zoneSelectOtherCountryPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ZoneSelectOtherCountryPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.xd xdVar = this.f210889d.M;
        if (xdVar != null) {
            com.tencent.mm.ui.tools.f7 f7Var = (com.tencent.mm.ui.tools.f7) xdVar;
            f7Var.getClass();
            com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = f7Var.f210417a;
            android.content.Intent intent = new android.content.Intent(multiStageCitySelectUI, (java.lang.Class<?>) com.tencent.mm.ui.tools.MultiStageCitySelectUI.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("GetAddress", multiStageCitySelectUI.f210103q);
            bundle.putBoolean("ShowSelectedLocation", multiStageCitySelectUI.f210105s);
            bundle.putBoolean("IsSelectNonChinaCountry", true);
            bundle.putBoolean("IsAutoPosition", false);
            bundle.putBoolean("IsNeedShowSearchBar", true);
            intent.putExtras(bundle);
            if (!multiStageCitySelectUI.C.isEmpty()) {
                intent.putStringArrayListExtra("BlockedCountries", multiStageCitySelectUI.C);
            }
            multiStageCitySelectUI.startActivityForResult(intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/ZoneSelectOtherCountryPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
