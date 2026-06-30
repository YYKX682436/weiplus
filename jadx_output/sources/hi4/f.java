package hi4;

/* loaded from: classes4.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.j.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return ((java.lang.Number) ((jz5.n) ((hi4.j) a17).f281552e).getValue()).intValue();
    }
}
