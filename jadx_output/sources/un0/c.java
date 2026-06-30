package un0;

/* loaded from: classes3.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Intent intent, java.lang.Class cls, int i17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        jz2.x0 x0Var = jz2.x0.f302754a;
        intent.putExtra("NOTICE_LAUNCH_KEY", kotlin.jvm.internal.o.b(cls, (java.lang.Class) ((jz5.n) jz2.x0.f302759f).getValue()) ? 2 : kotlin.jvm.internal.o.b(cls, (java.lang.Class) ((jz5.n) jz2.x0.f302758e).getValue()) ? 1 : 0);
        intent.putExtra("START_SERVICE_FROM_KEY", i17);
    }
}
