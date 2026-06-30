package ko2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ko2.e f309926a = new ko2.e();

    public final void a(android.content.Context context, java.lang.String authorFinderUsername, long j17, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String string = context.getString(com.tencent.mm.R.string.mqm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.mqk);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        ko2.d dVar = new ko2.d(context, authorFinderUsername, j17, username);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.r(string, 17, i65.a.b(context, 14), null);
        k0Var.f211872n = new ko2.a(1, context, string2);
        k0Var.f211881s = new ko2.b(1, dVar);
        k0Var.v();
    }
}
