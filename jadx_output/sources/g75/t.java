package g75;

/* loaded from: classes10.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final g75.r f269401a;

    public t(g75.r pipeline) {
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
        this.f269401a = pipeline;
    }

    public final void a(j75.d action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f269401a.f269400o.B3(action);
    }

    public final void b(yz5.l observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        g75.r rVar = this.f269401a;
        rVar.f269400o.L2(rVar, observer);
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public final void f(yz5.l processor) {
        kotlin.jvm.internal.o.g(processor, "processor");
        g75.r rVar = this.f269401a;
        rVar.f269400o.z3(rVar, processor);
    }

    public final void g(yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        g75.r rVar = this.f269401a;
        rVar.getClass();
        if (rVar.f269396h) {
            d75.b.g(block);
        } else {
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) rVar.f269398m).getValue(), null, new g75.p(block, null), 1, null);
        }
    }

    public final g75.z h() {
        return (g75.z) this.f269401a.f269400o.f298076g;
    }
}
