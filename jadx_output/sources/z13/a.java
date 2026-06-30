package z13;

/* loaded from: classes10.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final z13.f a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (z13.f) a17;
    }
}
