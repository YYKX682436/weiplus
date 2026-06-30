package xp5;

/* loaded from: classes13.dex */
public final /* synthetic */ class a$$a implements yz5.a {
    @Override // yz5.a
    public final java.lang.Object invoke() {
        android.content.Context context = defpackage.j.f296172a;
        kotlin.jvm.internal.o.d(context);
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (android.net.ConnectivityManager) systemService;
    }
}
