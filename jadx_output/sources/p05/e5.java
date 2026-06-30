package p05;

/* loaded from: classes10.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f350510a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f350511b = new java.util.HashSet();

    public static final void a() {
        if (f350510a) {
            return;
        }
        f350510a = true;
        com.tencent.mm.xeffect.XEffectLog.f214803a = new p05.d5();
        try {
            tq5.k.a("xeffect_xlog");
            com.tencent.mm.xeffect.WeEffectRender.nSetNativeLog(com.tencent.mm.xeffect.XEffectLog.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.xeffect.XEffectLog.f214803a.e("XEffectLog", "init xlog error %s", th6.getMessage());
        }
    }
}
