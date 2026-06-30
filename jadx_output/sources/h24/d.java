package h24;

/* loaded from: classes.dex */
public final class d implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddQrcode f278316a;

    public d(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddQrcode settingSwitchAddQrcode) {
        this.f278316a = settingSwitchAddQrcode;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddQrcode settingSwitchAddQrcode = this.f278316a;
        settingSwitchAddQrcode.getClass();
        settingSwitchAddQrcode.t7(settingSwitchAddQrcode.getActivity().getIntent());
        boolean z18 = !z17;
        settingSwitchAddQrcode.getClass();
        long j17 = c01.z1.j();
        settingSwitchAddQrcode.f161926i = j17;
        if (z18) {
            settingSwitchAddQrcode.f161926i = j17 | 2;
        } else {
            settingSwitchAddQrcode.f161926i = j17 & (~2);
        }
        settingSwitchAddQrcode.f161925h.put(39, java.lang.Integer.valueOf(z18 ? 1 : 2));
        settingSwitchAddQrcode.getClass();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(settingSwitchAddQrcode.f161926i));
        java.util.HashMap hashMap = settingSwitchAddQrcode.f161925h;
        for (java.lang.Object obj : hashMap.entrySet()) {
            kotlin.jvm.internal.o.f(obj, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            if (num != null) {
                int intValue = num.intValue();
                java.lang.Integer num2 = (java.lang.Integer) entry.getValue();
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    r45.p53 p53Var = new r45.p53();
                    p53Var.f382761d = intValue;
                    p53Var.f382762e = intValue2;
                    ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
                }
            }
        }
        hashMap.clear();
    }
}
