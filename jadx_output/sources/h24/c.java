package h24;

/* loaded from: classes.dex */
public final class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddOthers f278315a;

    public c(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddOthers settingSwitchAddOthers) {
        this.f278315a = settingSwitchAddOthers;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchAddOthers settingSwitchAddOthers = this.f278315a;
        settingSwitchAddOthers.getClass();
        settingSwitchAddOthers.t7(settingSwitchAddOthers.getActivity().getIntent());
        boolean z18 = !z17;
        settingSwitchAddOthers.getClass();
        long j17 = c01.z1.j();
        settingSwitchAddOthers.f161924i = j17;
        if (z18) {
            settingSwitchAddOthers.f161924i = j17 | 140737488355328L;
        } else {
            settingSwitchAddOthers.f161924i = j17 & (-140737488355329L);
        }
        settingSwitchAddOthers.f161923h.put(105, java.lang.Integer.valueOf(z18 ? 1 : 2));
        settingSwitchAddOthers.getClass();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(settingSwitchAddOthers.f161924i));
        java.util.HashMap hashMap = settingSwitchAddOthers.f161923h;
        for (java.lang.Object obj : hashMap.entrySet()) {
            kotlin.jvm.internal.o.f(obj, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.o.d(key);
            int intValue = ((java.lang.Number) key).intValue();
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.o.d(value);
            int intValue2 = ((java.lang.Number) value).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }
}
