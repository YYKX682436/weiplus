package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class u0 implements com.tencent.mm.ui.base.preference.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI f152221a;

    public u0(com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI nearbyPersonalInfoUI) {
        this.f152221a = nearbyPersonalInfoUI;
    }

    @Override // com.tencent.mm.ui.base.preference.q0
    public boolean a(com.tencent.mm.ui.base.preference.Preference preference, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        boolean equalsIgnoreCase = "male".equalsIgnoreCase(str);
        com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI nearbyPersonalInfoUI = this.f152221a;
        if (equalsIgnoreCase) {
            nearbyPersonalInfoUI.f152109e = 1;
            return false;
        }
        if (!"female".equalsIgnoreCase(str)) {
            return false;
        }
        nearbyPersonalInfoUI.f152109e = 2;
        return false;
    }
}
