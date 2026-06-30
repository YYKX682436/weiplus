package yn1;

/* loaded from: classes11.dex */
public final class c0 implements kotlinx.coroutines.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f463620d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f463621e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f463622f;

    public c0(kotlinx.coroutines.p0 poolDispatcher, kotlinx.coroutines.p0 mainDispatcher, java.lang.String tag, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 2) != 0) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            mainDispatcher = kotlinx.coroutines.internal.b0.f310484a;
        }
        tag = (i17 & 4) != 0 ? "MM.Mig.MigrationScope" : tag;
        kotlin.jvm.internal.o.g(poolDispatcher, "poolDispatcher");
        kotlin.jvm.internal.o.g(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f463620d = poolDispatcher;
        this.f463621e = mainDispatcher;
        this.f463622f = tag;
    }

    public final kotlinx.coroutines.r2 a(yz5.p block) {
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.d(this, this.f463620d, null, block, 2, null);
    }

    @Override // kotlinx.coroutines.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF11582e() {
        oz5.l plus = ((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(this.f463620d);
        int i17 = kotlinx.coroutines.r0.N0;
        return plus.plus(new yn1.b0(kotlinx.coroutines.q0.f310567d, this));
    }
}
