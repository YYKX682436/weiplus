package dk2;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.d f233301a = new dk2.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f233302b = jz5.h.b(dk2.c.f233263d);

    public static final java.lang.String i(int i17, java.lang.String str) {
        return "MMKV_BEAUTY_VALUE_" + gm0.j1.b().h() + '_' + i17 + '_' + str;
    }

    public final java.lang.String a(lo0.j jVar, lo0.a0 a0Var) {
        return "MMKV_KEY_LIVE_BEAUTY_EX_GROUP_ACTIVE_ITEM_ID_" + gm0.j1.b().h() + '_' + a0Var.f319950a + '_' + jVar.f320015a;
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f233302b).getValue();
    }

    public final java.lang.String c(lo0.k kVar, lo0.a0 a0Var) {
        return "MMKV_KEY_LIVE_BEAUTY_ITEM_VALUE_" + gm0.j1.b().h() + '_' + a0Var.f319950a + '_' + kVar.f320018a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final java.lang.String d(lo0.k kVar, lo0.a0 a0Var) {
        int i17;
        java.lang.String str = a0Var.f319950a;
        switch (str.hashCode()) {
            case -1078030475:
                if (!str.equals(ya.b.MEDIUM)) {
                    return null;
                }
                int i18 = qs5.f.f366431a;
                i17 = 1;
                return "MMKV_BEAUTY_VALUE_" + gm0.j1.b().h() + '_' + i17 + '_' + kVar.f320018a;
            case 107348:
                if (!str.equals("low")) {
                    return null;
                }
                int i19 = qs5.f.f366431a;
                i17 = 0;
                return "MMKV_BEAUTY_VALUE_" + gm0.j1.b().h() + '_' + i17 + '_' + kVar.f320018a;
            case 109935:
                if (!str.equals("off")) {
                    return null;
                }
                int i27 = qs5.f.f366431a;
                i17 = -1;
                return "MMKV_BEAUTY_VALUE_" + gm0.j1.b().h() + '_' + i17 + '_' + kVar.f320018a;
            case 3202466:
                if (!str.equals("high")) {
                    return null;
                }
                int i28 = qs5.f.f366431a;
                i17 = 2;
                return "MMKV_BEAUTY_VALUE_" + gm0.j1.b().h() + '_' + i17 + '_' + kVar.f320018a;
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        if (r11 == Integer.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(lo0.t r15) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.d.e(lo0.t):void");
    }

    public final void f(lo0.b bVar) {
        if (bVar.f319964e != null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_BEAUTY_");
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
            g(bVar);
            return;
        }
        bVar.f319964e = java.lang.Integer.valueOf(i17);
        java.lang.String string = b().getString("MMKV_LIVE_BEAUTY_BADGE_GROUP_BEAUTY_" + gm0.j1.b().h() + '_' + str, null);
        if (string == null) {
            string = "";
        }
        bVar.f319965f = string;
    }

    public final void g(lo0.b badge) {
        kotlin.jvm.internal.o.g(badge, "badge");
        java.lang.Integer num = badge.f319964e;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mm.sdk.platformtools.o4 b17 = b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMKV_LIVE_BEAUTY_BADGE_VERSION_BEAUTY_");
            sb6.append(gm0.j1.b().h());
            sb6.append('_');
            java.lang.String str = badge.f319960a;
            sb6.append(str);
            b17.putInt(sb6.toString(), intValue);
            b().putString("MMKV_LIVE_BEAUTY_BADGE_GROUP_BEAUTY_" + gm0.j1.b().h() + '_' + str, badge.f319965f);
        }
    }

    public final void h(lo0.a0 suite) {
        dk2.d dVar;
        java.lang.String str;
        kotlin.jvm.internal.o.g(suite, "suite");
        if (suite.f319956g) {
            java.util.Iterator it = suite.f319954e.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                dVar = f233301a;
                if (!hasNext) {
                    break;
                }
                lo0.k kVar = (lo0.k) it.next();
                dVar.b().putInt(dVar.c(kVar, suite), a06.d.a(kVar.f320032o * 100.0d));
            }
            for (lo0.j jVar : suite.f319955f) {
                lo0.k kVar2 = jVar.f320016b;
                if (kVar2 != null && (str = kVar2.f320018a) != null) {
                    dVar.b().putString(dVar.a(jVar, suite), str);
                }
            }
        }
    }
}
