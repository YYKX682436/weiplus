package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class d7 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.c7 f160935d;

    /* renamed from: e, reason: collision with root package name */
    public int f160936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        k14.w wVar = new k14.w(appId, i17, true);
        this.f160936e = wVar.hashCode();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthDataUIC", "delUserAuth scene: %d, callbackId: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f160936e));
        gm0.j1.d().g(wVar);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(1127, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.d().q(1127, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.setting.ui.setting.c7 c7Var;
        com.tencent.mm.plugin.setting.ui.setting.c7 c7Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delUserAuth onSceneEnd errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", type: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        sb6.append(", callback: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthDataUIC", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            if ((m1Var != null && m1Var.getType() == 1127) && m1Var.hashCode() == this.f160936e && (c7Var2 = this.f160935d) != null) {
                c7Var2.onSuccess();
                return;
            }
            return;
        }
        if ((m1Var != null && m1Var.getType() == 1127) && m1Var.hashCode() == this.f160936e && (c7Var = this.f160935d) != null) {
            c7Var.a(i17, i18, str);
        }
    }
}
