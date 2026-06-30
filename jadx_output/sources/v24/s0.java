package v24;

/* loaded from: classes15.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.s0 f432949a = new v24.s0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f432950b = jz5.h.b(v24.q0.f432946d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f432951c = jz5.h.b(v24.r0.f432948d);

    public static final java.lang.String c() {
        try {
            v24.w0 w0Var = v24.w0.f432961a;
            m14.o c17 = w0Var.c();
            if (c17 != null) {
                if (w0Var.g(c17.j().j())) {
                    tn3.b bVar = tn3.c.f420823a;
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    boolean b17 = bVar.b(context);
                    return (b17 && bVar.c()) ? "" : !b17 ? w0Var.d(c17.n()) : f432949a.a(c17.k());
                }
                if (!w0Var.f(c17.j().j())) {
                    return w0Var.d(c17.n());
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SettingsPluginWxkbHelper", "getSettingPluginAdStr, fail, reason:" + e17.getMessage());
        }
        return "";
    }

    public final java.lang.String a(m14.b enableTipsData) {
        kotlin.jvm.internal.o.g(enableTipsData, "enableTipsData");
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.m2.m() ? enableTipsData.l() : com.tencent.mm.sdk.platformtools.m2.n() ? enableTipsData.n() : !com.tencent.mm.sdk.platformtools.m2.j() ? enableTipsData.k() : enableTipsData.l();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            byte[] bytes = l17.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.Object value = ((jz5.n) f432950b).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            sb6.append((java.lang.String) value);
            sb6.append('_');
            sb6.append(g17);
            java.lang.String sb7 = sb6.toString();
            if (!b().contains(sb7)) {
                b().putLong(sb7, c01.id.c());
                return l17;
            }
            int j17 = enableTipsData.j();
            long p17 = b().p(sb7);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginWxkbHelper", "getEnableTips: days:" + j17 + " lastTime:" + p17);
            if (!d(p17, j17)) {
                return l17;
            }
        }
        return "";
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        java.lang.Object value = ((jz5.n) f432951c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final boolean d(long j17, int i17) {
        long c17 = c01.id.c() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsPluginWxkbHelper", "isTimeExpired() called with: lastTime = " + j17 + ", n = " + i17 + ",elapsedTime:" + c17);
        return c17 > ((long) i17) * 86400000;
    }
}
