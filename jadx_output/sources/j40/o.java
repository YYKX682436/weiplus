package j40;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final j40.o f297604a = new j40.o();

    public final boolean a() {
        boolean z17;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            return true;
        }
        kb2.b bVar = kb2.b.f306225a;
        return false;
    }

    public final java.lang.String b() {
        if (!a()) {
            return "";
        }
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.z3.b(true);
        kotlin.jvm.internal.o.f(b17, "toString(...)");
        return b17;
    }
}
