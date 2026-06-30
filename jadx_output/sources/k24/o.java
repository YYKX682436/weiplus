package k24;

/* loaded from: classes.dex */
public final class o implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwtichAllowOtherHearRingtone f303766a;

    public o(com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwtichAllowOtherHearRingtone settingSwtichAllowOtherHearRingtone) {
        this.f303766a = settingSwtichAllowOtherHearRingtone;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwtichAllowOtherHearRingtone settingSwtichAllowOtherHearRingtone = this.f303766a;
        settingSwtichAllowOtherHearRingtone.getClass();
        settingSwtichAllowOtherHearRingtone.t7(settingSwtichAllowOtherHearRingtone.getActivity().getIntent());
        ip.l.j(z17);
        if (z17) {
            settingSwtichAllowOtherHearRingtone.f161958h |= (int) 1073741824;
        } else {
            settingSwtichAllowOtherHearRingtone.f161958h &= (int) (-1073741825);
        }
        settingSwtichAllowOtherHearRingtone.f161959i.put(71, java.lang.Integer.valueOf(z17 ? 1 : 2));
        settingSwtichAllowOtherHearRingtone.getClass();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(settingSwtichAllowOtherHearRingtone.f161958h));
        java.util.HashMap hashMap = settingSwtichAllowOtherHearRingtone.f161959i;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
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
