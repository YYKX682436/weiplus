package l41;

/* loaded from: classes4.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l41.y1 f315970a = new l41.y1();

    public final void a(android.content.Context context, java.lang.String kfUsername, boolean z17, yz5.l successCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(kfUsername, "kfUsername");
        kotlin.jvm.internal.o.g(successCallback, "successCallback");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        um3.b bVar = (um3.b) a17;
        v65.i.b(bVar.O6(), null, new l41.x1(bVar, kfUsername, z17, successCallback, null), 1, null);
    }
}
