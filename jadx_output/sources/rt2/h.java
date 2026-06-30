package rt2;

/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f399506a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.shell.FinderShellInit$listener$1 f399507b;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.shell.FinderShellInit$listener$1] */
    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f399507b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShellExecEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.shell.FinderShellInit$listener$1
            {
                this.__eventId = -2024436119;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ShellExecEvent shellExecEvent) {
                java.lang.String str;
                com.tencent.mm.autogen.events.ShellExecEvent event = shellExecEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!z65.c.a()) {
                    return true;
                }
                am.lu luVar = event.f54777g;
                if (!kotlin.jvm.internal.o.b(luVar.f7274b, "wechat.shell.FINDER_SHELL")) {
                    return true;
                }
                java.lang.String stringExtra = luVar.f7273a.getStringExtra("cmd");
                com.tencent.mars.xlog.Log.i("Finder.Shell", "get cmd " + stringExtra);
                java.util.HashMap hashMap = rt2.h.f399506a;
                if (stringExtra != null) {
                    java.util.Locale locale = java.util.Locale.getDefault();
                    kotlin.jvm.internal.o.f(locale, "getDefault(...)");
                    str = stringExtra.toLowerCase(locale);
                    kotlin.jvm.internal.o.f(str, "toLowerCase(...)");
                } else {
                    str = null;
                }
                yz5.l lVar = (yz5.l) hashMap.get(str);
                if (lVar == null) {
                    return true;
                }
                android.content.Intent intent = luVar.f7273a;
                kotlin.jvm.internal.o.f(intent, "intent");
                lVar.invoke(intent);
                return true;
            }
        };
    }
}
