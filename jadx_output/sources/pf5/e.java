package pf5;

/* loaded from: classes5.dex */
public class e extends androidx.lifecycle.c1 {
    private final kotlinx.coroutines.y0 lifecycleScope = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    private final kotlinx.coroutines.y0 mainScope = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.internal.b0.f310484a));

    public static /* synthetic */ kotlinx.coroutines.r2 launch$default(pf5.e eVar, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return eVar.launch(lVar, a1Var, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.r2 launchUI$default(pf5.e eVar, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchUI");
        }
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return eVar.launchUI(lVar, a1Var, pVar);
    }

    public kotlinx.coroutines.y0 getLifecycleScope() {
        return this.lifecycleScope;
    }

    public kotlinx.coroutines.y0 getMainScope() {
        return this.mainScope;
    }

    public final kotlinx.coroutines.r2 launch(oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(getLifecycleScope(), context, start, block);
    }

    public final kotlinx.coroutines.r2 launchUI(oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(getMainScope(), context, start, block);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        kotlinx.coroutines.z0.d(getLifecycleScope(), this + " onCleared.", null, 2, null);
        kotlinx.coroutines.z0.d(getMainScope(), this + " onCleared.", null, 2, null);
    }
}
