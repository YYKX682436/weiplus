package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes.dex */
public final class a2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public long f158339d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f158340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158339d = c01.z1.i();
        this.f158340e = new java.util.HashMap();
    }

    public final void O6() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f158339d));
        java.util.HashMap hashMap = this.f158340e;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    public final void P6(boolean z17, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePrivacyUIC", "switchChange isOpen:" + z17 + ", itemValue:" + j17 + ", functionId:" + i17);
        this.f158339d = z17 ? (~j17) & this.f158339d : j17 | this.f158339d;
        this.f158340e.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }
}
