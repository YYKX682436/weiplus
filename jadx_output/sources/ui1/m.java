package ui1;

/* loaded from: classes7.dex */
public class m implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.o f428063a;

    public m(ui1.o oVar) {
        this.f428063a = oVar;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList arrayList, int i18, boolean z17) {
        boolean z18;
        ui1.o oVar = this.f428063a;
        java.lang.String str = oVar.f428069f;
        r45.h24 h24Var = oVar.f428070g;
        int size = h24Var.f375774e.size();
        ui1.t tVar = oVar.f428080t;
        java.lang.String str2 = oVar.f428069f;
        java.lang.String str3 = oVar.f428072i;
        java.lang.String str4 = oVar.f428071h;
        if (size > 1) {
            str = (arrayList == null ? java.util.Collections.emptyList() : arrayList).size() > 0 ? (java.lang.String) arrayList.get(0) : str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "response.jsapi_scope %s, scopeAcc %s, appId %s, api %s", h24Var.f375782p, str, str4, str3);
            java.lang.String str5 = h24Var.f375782p;
            if (str5 == null) {
                ((ui1.f) tVar.f428083a).onCancel();
                return;
            }
            z18 = str5.equals(str);
        } else {
            z18 = true;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                ui1.t.b(oVar.f428080t, oVar.f428073m, str, 2, z18, z17, new ui1.l(this));
                ui1.t.f428082d.f(str4, str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user deny, appId %s, api %s", str4, str3);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                ui1.t.f428082d.f(str4, str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user cancel, appId %s, api %s", str4, str3);
                ((ui1.f) tVar.f428083a).onCancel();
                return;
            }
        }
        ui1.t.b(oVar.f428080t, oVar.f428073m, str, 1, z18, z17, new ui1.k(this, z18));
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth appId %s, api %s , target scope:%s, accept scope:%s, deny!", str4, str3, str2, str);
            tVar.f428083a.b(null);
            return;
        }
        if (str2.equals("scope.voip")) {
            com.tencent.mm.plugin.appbrand.y mComponent = oVar.f428068e;
            kotlin.jvm.internal.o.g(mComponent, "mComponent");
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            if (!L.getBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", false)) {
                fl1.g2 authorizeDialogContainer = mComponent.t3().getAuthorizeDialogContainer();
                android.content.Context context = mComponent.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((fl1.c0) authorizeDialogContainer).c(new ui1.e0(context));
                L.putBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", true);
            }
        }
        ui1.t.f428082d.e(str4, str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user confirm, appId %s, api %s", str4, str3);
    }
}
