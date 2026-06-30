package rt2;

/* loaded from: classes10.dex */
public final class g {
    public g() {
        a("execSql", rt2.a.f399500d);
        a("sendGifts", rt2.b.f399501d);
        a("redDot", new rt2.c(this));
        a("dropFrameTest", new rt2.d(this));
        a("audioChange", new rt2.e(this));
        a("disableGuide", new rt2.f(this));
    }

    public final void a(java.lang.String cmd, yz5.l shell) {
        java.util.HashMap hashMap = rt2.h.f399506a;
        kotlin.jvm.internal.o.g(cmd, "cmd");
        kotlin.jvm.internal.o.g(shell, "shell");
        java.util.HashMap hashMap2 = rt2.h.f399506a;
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = cmd.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        hashMap2.put(lowerCase, shell);
    }
}
