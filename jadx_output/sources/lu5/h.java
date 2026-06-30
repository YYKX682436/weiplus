package lu5;

/* loaded from: classes14.dex */
public abstract class h extends kotlinx.coroutines.p0 {

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f321467e = lu5.c.f321459a;

    public h(kotlin.jvm.internal.i iVar) {
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.h(context, "context");
        kotlin.jvm.internal.o.h(block, "block");
        try {
            lu5.f fVar = (lu5.f) context.get(lu5.f.f321463e);
            execute(new lu5.g(block, fVar != null ? fVar.f321464d : true));
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            kotlinx.coroutines.v2.b(context, kotlinx.coroutines.e2.a("The task was rejected", e17));
            kotlinx.coroutines.p0 p0Var = this.f321467e;
            if (p0Var != null) {
                p0Var.D(context, block);
            }
        }
    }

    public abstract void execute(java.lang.Runnable runnable);
}
