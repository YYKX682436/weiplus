package h24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddNamecard f278314a;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddNamecard settingSwitchAddNamecard) {
        this.f278314a = settingSwitchAddNamecard;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddNamecard settingSwitchAddNamecard = this.f278314a;
        settingSwitchAddNamecard.getClass();
        settingSwitchAddNamecard.t7(settingSwitchAddNamecard.getActivity().getIntent());
        boolean z18 = !z17;
        settingSwitchAddNamecard.getClass();
        long j17 = c01.z1.j();
        settingSwitchAddNamecard.f161922i = j17;
        if (z18) {
            settingSwitchAddNamecard.f161922i = j17 | 4;
        } else {
            settingSwitchAddNamecard.f161922i = j17 & (~4);
        }
        settingSwitchAddNamecard.f161921h.put(40, java.lang.Integer.valueOf(z18 ? 1 : 2));
        settingSwitchAddNamecard.getClass();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(settingSwitchAddNamecard.f161922i));
        java.util.HashMap hashMap = settingSwitchAddNamecard.f161921h;
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
