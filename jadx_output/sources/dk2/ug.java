package dk2;

/* loaded from: classes14.dex */
public final class ug {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.ug f234218a = new dk2.ug();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f234219b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f234220c;

    static {
        java.lang.String wi6 = ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).wi(rh0.z.f395613g, "FaceMakeUpLevel");
        f234219b = !(wi6 == null || wi6.length() == 0) && com.tencent.mm.sdk.platformtools.t8.B1(wi6) == 1.0f;
        com.tencent.mars.xlog.Log.i("Finder.MakeupSuitDataManager", "#init cfgValue=" + wi6);
        f234220c = jz5.h.b(dk2.tg.f234135d);
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (lo0.h0 h0Var : ko0.l0.f309878a.b().f320063d.f320040f) {
            sb6.append(h0Var.f319997a + ':' + h0Var.f320006j);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f234220c).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(lo0.p0 r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.ug.c(lo0.p0):void");
    }

    public final void d(lo0.b bVar) {
        if (bVar.f319964e != null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_MAKEUP_");
        sb6.append(gm0.j1.b().h());
        sb6.append('_');
        java.lang.String str = bVar.f319960a;
        sb6.append(str);
        int i17 = b17.getInt(sb6.toString(), -1);
        if (i17 < 0) {
            bVar.f319964e = java.lang.Integer.valueOf(bVar.f319962c);
            java.lang.String str2 = bVar.f319963d;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            bVar.f319965f = str2;
            e(bVar);
            return;
        }
        bVar.f319964e = java.lang.Integer.valueOf(i17);
        java.lang.String string = b().getString("MMKV_LIVE_BEAUTY_BADGE_GROUP_MAKEUP_" + gm0.j1.b().h() + '_' + str, null);
        if (string == null) {
            string = "";
        }
        bVar.f319965f = string;
    }

    public final void e(lo0.b badge) {
        kotlin.jvm.internal.o.g(badge, "badge");
        java.lang.Integer num = badge.f319964e;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mm.sdk.platformtools.o4 b17 = b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_MAKEUP_");
            sb6.append(gm0.j1.b().h());
            sb6.append('_');
            java.lang.String str = badge.f319960a;
            sb6.append(str);
            b17.putInt(sb6.toString(), intValue);
            b().putString("MMKV_LIVE_BEAUTY_BADGE_GROUP_MAKEUP_" + gm0.j1.b().h() + '_' + str, badge.f319965f);
        }
    }

    public final void f(lo0.k0 makeupItem) {
        kotlin.jvm.internal.o.g(makeupItem, "makeupItem");
        if (makeupItem.f320036b) {
            for (lo0.h0 h0Var : makeupItem.f320040f) {
                dk2.ug ugVar = f234218a;
                double d17 = h0Var.f320006j;
                ugVar.b().putInt("MMKV_KEY_LIVE_MAKEUP_DETAIL_VALUE_" + gm0.j1.b().h() + '_' + makeupItem.f320035a + '_' + h0Var.f319997a, a06.d.a(d17 * 100.0d));
            }
        }
    }

    public final void g(java.lang.String str) {
        b().putString("MMKV_KEY_SUIT_ID_v2_" + gm0.j1.b().h(), str);
    }
}
