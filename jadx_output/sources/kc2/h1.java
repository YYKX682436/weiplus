package kc2;

/* loaded from: classes10.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kc2.h1 f306405a = new kc2.h1();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f306406b;

    static {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        f306406b = z18;
    }

    public final r45.us2 a(com.tencent.mm.storage.u3 key) {
        kotlin.jvm.internal.o.g(key, "key");
        r45.us2 us2Var = new r45.us2();
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(key, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            us2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
            com.tencent.mars.xlog.Log.i("FinderKaraInfoManager.Storage", key + " getTimeInfo exit=" + us2Var.getInteger(2) + ",expose=" + us2Var.getInteger(0) + ",reddot_click=" + us2Var.getInteger(1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderKaraInfoManager.Storage", e17, "", new java.lang.Object[0]);
        }
        return us2Var;
    }

    public final void b(com.tencent.mm.storage.u3 key, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(key, "key");
        r45.us2 us2Var = new r45.us2();
        us2Var.set(0, java.lang.Integer.valueOf(i18));
        us2Var.set(1, java.lang.Integer.valueOf(i19));
        us2Var.set(2, java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().x(key, com.tencent.mm.sdk.platformtools.t8.l(us2Var.toByteArray()));
        if (f306406b) {
            com.tencent.mars.xlog.Log.i("FinderKaraInfoManager.Storage", "saveTimeInfo " + key + " lastExitTime=" + i17 + " lastRedDotExposeTime=" + i18 + " lastRedDotClickTime=" + i19 + ' ');
        }
    }
}
