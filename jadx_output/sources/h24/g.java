package h24;

/* loaded from: classes.dex */
public final class g implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindQQ f278319a;

    public g(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindQQ settingSwitchFindQQ) {
        this.f278319a = settingSwitchFindQQ;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindQQ settingSwitchFindQQ = this.f278319a;
        settingSwitchFindQQ.getClass();
        settingSwitchFindQQ.t7(settingSwitchFindQQ.getActivity().getIntent());
        settingSwitchFindQQ.f161934i = c01.z1.p();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindQQ.A7(settingSwitchFindQQ, !z17, 8, 2);
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindQQ.A7(settingSwitchFindQQ, !z17, 16, 3);
        settingSwitchFindQQ.getClass();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(settingSwitchFindQQ.f161934i));
        java.util.HashMap hashMap = settingSwitchFindQQ.f161933h;
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
