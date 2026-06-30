package h24;

/* loaded from: classes.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddChatroom f278313a;

    public a(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddChatroom settingSwitchAddChatroom) {
        this.f278313a = settingSwitchAddChatroom;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddChatroom settingSwitchAddChatroom = this.f278313a;
        settingSwitchAddChatroom.getClass();
        settingSwitchAddChatroom.t7(settingSwitchAddChatroom.getActivity().getIntent());
        boolean z18 = !z17;
        settingSwitchAddChatroom.getClass();
        long j17 = c01.z1.j();
        settingSwitchAddChatroom.f161919i = j17;
        if (z18) {
            settingSwitchAddChatroom.f161919i = j17 | 1;
        } else {
            settingSwitchAddChatroom.f161919i = j17 & (~1);
        }
        settingSwitchAddChatroom.f161918h.put(38, java.lang.Integer.valueOf(z18 ? 1 : 2));
        settingSwitchAddChatroom.getClass();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(settingSwitchAddChatroom.f161919i));
        java.util.HashMap hashMap = settingSwitchAddChatroom.f161918h;
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
