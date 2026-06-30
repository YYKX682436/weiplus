package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class b7 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.a7 f160861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthDataUIC", "getAuthData nextPageData: %s", bArr);
        gm0.j1.d().g(new k14.c0(bArr, true));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(1146, this);
        O6(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.d().q(1146, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.setting.ui.setting.a7 a7Var;
        boolean z17;
        boolean z18;
        int i19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUserAuthList onSceneEnd errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", type: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthDataUIC", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            if (!(m1Var != null && m1Var.getType() == 1146) || (a7Var = this.f160861d) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsAuthUI", "getAuthData onFailed errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
            com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = ((com.tencent.mm.plugin.setting.ui.setting.u7) a7Var).f161600a;
            settingsAuthUI.f160343v = false;
            settingsAuthUI.Z6(false);
            com.tencent.mm.plugin.setting.ui.setting.l7 l7Var = settingsAuthUI.f160335n;
            if (l7Var != null && l7Var.x()) {
                settingsAuthUI.Y6(true);
                settingsAuthUI.a7(false, "");
                return;
            }
            android.view.View view = settingsAuthUI.f160344w;
            kotlin.jvm.internal.o.d(view);
            ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ime)).setVisibility(0);
            android.view.View view2 = settingsAuthUI.f160344w;
            kotlin.jvm.internal.o.d(view2);
            ((android.widget.ProgressBar) view2.findViewById(com.tencent.mm.R.id.imd)).setVisibility(8);
            return;
        }
        if (m1Var != null && m1Var.getType() == 1146) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.model.NetSceneGetUserAuthList");
            k14.c0 c0Var = (k14.c0) m1Var;
            c0Var.H();
            com.tencent.mm.plugin.setting.ui.setting.a7 a7Var2 = this.f160861d;
            if (a7Var2 != null) {
                boolean z19 = c0Var.f303314f != null;
                r45.cq3 cq3Var = c0Var.f303313e;
                java.util.List emptyList = cq3Var != null ? cq3Var.f371788e : java.util.Collections.emptyList();
                byte[] H = c0Var.H();
                com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI2 = ((com.tencent.mm.plugin.setting.ui.setting.u7) a7Var2).f161600a;
                settingsAuthUI2.f160343v = false;
                settingsAuthUI2.f160336o = H;
                com.tencent.mm.plugin.setting.ui.setting.l7 l7Var2 = settingsAuthUI2.f160335n;
                if (l7Var2 != null) {
                    java.util.List list = l7Var2.f161276f;
                    if (z19) {
                        z18 = false;
                    } else {
                        l7Var2.f161277g = false;
                        ((java.util.ArrayList) list).clear();
                        z18 = true;
                    }
                    if (emptyList == null || emptyList.isEmpty()) {
                        i19 = 0;
                    } else {
                        i19 = !l7Var2.f161278h ? ((java.util.ArrayList) list).size() : 0;
                        l7Var2.f161279i += emptyList.size();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(emptyList, 10));
                        java.util.Iterator it = emptyList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.tencent.mm.plugin.setting.ui.setting.h7(1, (r45.ov6) it.next()));
                        }
                        ((java.util.ArrayList) list).addAll(arrayList);
                    }
                    com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = l7Var2.f161275e;
                    if (H == null) {
                        if (!l7Var2.f161277g) {
                            l7Var2.f161277g = true;
                            ((java.util.ArrayList) list).add(new com.tencent.mm.plugin.setting.ui.setting.h7(2, null));
                        }
                        loadMoreRecyclerView.m1(false);
                    } else {
                        loadMoreRecyclerView.m1(true);
                    }
                    if (z18) {
                        l7Var2.notifyDataSetChanged();
                    } else {
                        l7Var2.notifyItemRangeInserted(i19, ((java.util.ArrayList) list).size() - i19);
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateAuthData loadFirst: ");
                    sb7.append(l7Var2.f161278h);
                    sb7.append(", loadFinished: ");
                    sb7.append(l7Var2.f161277g);
                    sb7.append(", requestNextPage: ");
                    sb7.append(z19);
                    sb7.append(", getDataSize: ");
                    sb7.append(emptyList != null ? java.lang.Integer.valueOf(emptyList.size()) : null);
                    sb7.append(", currentDataSize: ");
                    sb7.append(l7Var2.f161279i);
                    sb7.append(", insertPosition: ");
                    sb7.append(i19);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthUI", sb7.toString());
                    z17 = false;
                    l7Var2.f161278h = false;
                } else {
                    z17 = false;
                }
                settingsAuthUI2.Z6(z17);
                settingsAuthUI2.W6();
            }
        }
    }
}
