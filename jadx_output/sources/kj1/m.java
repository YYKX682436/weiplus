package kj1;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f308365a;

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^mp://\\w+");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        f308365a = compile;
    }

    public abstract kj1.v a();

    public abstract void b(android.content.Context context, com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams absWxaShortLinkLauncher$WxaShortLinkLaunchParams, yz5.l lVar);

    public void c(android.app.Activity ctx, java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(url, "url");
    }

    public abstract boolean d(android.app.Activity activity, boolean z17);

    public void e(android.app.Activity ctx, java.lang.String url) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(url, "url");
    }
}
