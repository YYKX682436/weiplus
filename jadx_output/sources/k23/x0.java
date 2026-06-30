package k23;

/* loaded from: classes11.dex */
public final class x0 {
    public x0(kotlin.jvm.internal.i iVar) {
    }

    public final k23.c1 a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(k23.c1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (k23.c1) a17;
    }
}
