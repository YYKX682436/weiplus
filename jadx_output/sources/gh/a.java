package gh;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final gh.c a(com.tencent.magicbrush.MBRuntime runtime, ch.g jsThreadHandler, gh.b strategy) {
        gh.c dVar;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(jsThreadHandler, "jsThreadHandler");
        kotlin.jvm.internal.o.g(strategy, "strategy");
        int ordinal = strategy.ordinal();
        if (ordinal == 0) {
            dVar = new gh.d(runtime, jsThreadHandler);
        } else if (ordinal == 1) {
            dVar = new gh.g(runtime, jsThreadHandler);
        } else if (ordinal == 2) {
            dVar = new gh.h(runtime, jsThreadHandler);
        } else if (ordinal == 3) {
            dVar = new gh.n0(runtime, jsThreadHandler);
        } else {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            dVar = new gh.l0(runtime, jsThreadHandler);
        }
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[" + dVar.b().name() + "] create " + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
        dVar.d();
        return dVar;
    }
}
