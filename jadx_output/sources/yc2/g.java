package yc2;

/* loaded from: classes2.dex */
public final class g extends xc2.o {
    @Override // xc2.o
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        android.content.Context context = holder.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return;
        }
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new yc2.i(activity);
        infoEx.R = sVar;
        int i17 = infoEx.f453256r;
        int i18 = i17 != 1 ? i17 != 6 ? 0 : 3 : 2;
        if (i18 > 0) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (str = nyVar.f135382p) == null) {
                str = "";
            }
            java.lang.String str2 = str + '_' + java.lang.System.currentTimeMillis();
            infoEx.S = str2;
            r45.k74 lite_app_info = infoEx.f453234a.getLite_app_info();
            if (lite_app_info != null) {
                lite_app_info.set(2, xc2.r0.a(lite_app_info.getString(2), kz5.c1.k(new jz5.l("from_scene", java.lang.Integer.valueOf(i18)), new jz5.l("jumper_click_sessionid", str2))));
            }
        }
        super.v(holder, jumpView, infoEx);
    }
}
