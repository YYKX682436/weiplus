package vr2;

@j95.b
/* loaded from: classes2.dex */
public final class f extends i95.w implements zy2.eb {
    public boolean Ai() {
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() && ((((c01.z1.j() & 34359738368L) > 0L ? 1 : ((c01.z1.j() & 34359738368L) == 0L ? 0 : -1)) != 0) ^ true) && !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
    }

    public void Bi(long j17, java.lang.String str, int i17, r45.qt2 qt2Var, android.content.Context context, boolean z17, java.lang.String str2) {
        r45.qt2 qt2Var2;
        java.lang.String str3;
        int i18;
        if (!wi() || !Ai()) {
            i95.m c17 = i95.n0.c(zy2.a7.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.a7.sg((zy2.a7) c17, j17, str == null ? "" : str, i17, 1, 0, 16, null);
            return;
        }
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(as2.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        as2.k kVar = (as2.k) a17;
        bu2.j jVar = bu2.j.f24534a;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = jVar.h(j17);
        if (qt2Var != null || context == null) {
            qt2Var2 = qt2Var;
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            qt2Var2 = nyVar != null ? nyVar.V6() : null;
        }
        if (h17 == null || h17.getTimestamps() <= 0 || c01.id.c() < h17.getTimestamps() + (h17.getFeedObject().getUrlValidDuration() * 1000) || !kVar.P6() || kVar.N6(j17, i17, 6)) {
            str3 = "";
            i18 = 6;
        } else {
            kVar.f13481e.put(kVar.O6(j17, i17, 6), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            jVar.l(j17);
            str3 = "";
            i18 = 6;
            kVar.Q6(j17, str == null ? "" : str, i17, qt2Var2, z17, str2, null, 6);
        }
        if (h17 == null && kVar.P6() && !kVar.N6(j17, i17, i18)) {
            kVar.f13481e.put(kVar.O6(j17, i17, i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            jVar.l(j17);
            kVar.Q6(j17, str == null ? str3 : str, i17, qt2Var2, z17, str2, null, 6);
        }
    }

    public boolean wi() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127860o9).getValue()).r()).intValue() == 1;
    }
}
