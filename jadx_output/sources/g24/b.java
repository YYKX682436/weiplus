package g24;

/* loaded from: classes.dex */
public final class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingSwitchRecommendFriend f267963a;

    public b(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingSwitchRecommendFriend settingSwitchRecommendFriend) {
        this.f267963a = settingSwitchRecommendFriend;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingSwitchRecommendFriend settingSwitchRecommendFriend = this.f267963a;
        settingSwitchRecommendFriend.f161916m = z17;
        settingSwitchRecommendFriend.t7(settingSwitchRecommendFriend.getActivity().getIntent());
        boolean z18 = !z17;
        settingSwitchRecommendFriend.getClass();
        int p17 = c01.z1.p();
        settingSwitchRecommendFriend.f161915i = p17;
        if (z18) {
            settingSwitchRecommendFriend.f161915i = p17 | 256;
        } else {
            settingSwitchRecommendFriend.f161915i = p17 & (-257);
        }
        settingSwitchRecommendFriend.f161914h.put(7, java.lang.Integer.valueOf(z18 ? 1 : 2));
        settingSwitchRecommendFriend.getClass();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(settingSwitchRecommendFriend.f161915i));
        java.util.HashMap hashMap = settingSwitchRecommendFriend.f161914h;
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
