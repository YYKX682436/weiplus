package j75;

/* loaded from: classes10.dex */
public final class r extends androidx.lifecycle.c1 implements j75.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.coroutines.LifecycleScope f298086d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f298087e;

    /* renamed from: f, reason: collision with root package name */
    public j75.a f298088f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.statecenter.RootProcessor f298089g;

    /* renamed from: h, reason: collision with root package name */
    public final j75.o f298090h;

    public r(j75.a initState, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope) {
        kotlin.jvm.internal.o.g(initState, "initState");
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        this.f298086d = lifecycleScope;
        java.lang.String str = "MicroMsg.State.StateCenter" + hashCode();
        this.f298087e = str;
        com.tencent.mars.xlog.Log.i(str, "init state center");
        this.f298088f = initState;
        this.f298089g = new com.tencent.mm.sdk.statecenter.RootProcessor();
        this.f298090h = new j75.o(this);
    }

    @Override // j75.f
    public void B3(j75.d action) {
        kotlin.jvm.internal.o.g(action, "action");
        action.toString();
        v65.i.b(this.f298086d, null, new j75.n(this, action, null), 1, null);
    }

    @Override // j75.f
    public void L2(androidx.lifecycle.y owner, final yz5.l observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f298090h.observe(owner, e75.g.MainThread, new e75.a(observer) { // from class: j75.p

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f298084d;

            {
                kotlin.jvm.internal.o.g(observer, "function");
                this.f298084d = observer;
            }

            @Override // e75.a
            public final /* synthetic */ void onChanged(java.lang.Object obj) {
                this.f298084d.invoke(obj);
            }
        });
    }

    @Override // j75.f
    public j75.a getState() {
        return this.f298088f;
    }

    @Override // j75.f
    public void m3(androidx.lifecycle.y owner, e75.a observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f298090h.observe(owner, e75.g.MainThread, observer);
    }

    @Override // j75.f
    public void x(androidx.lifecycle.y owner, j75.c processor) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f298089g.b(owner, processor);
    }

    @Override // j75.f
    public void z3(androidx.lifecycle.y owner, final yz5.l processor) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f298089g.b(owner, new j75.c(processor) { // from class: j75.q

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f298085d;

            {
                kotlin.jvm.internal.o.g(processor, "function");
                this.f298085d = processor;
            }

            @Override // j75.c
            public final /* synthetic */ void a(j75.a aVar) {
                this.f298085d.invoke(aVar);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(j75.a initState, androidx.lifecycle.y lifecycleOwner) {
        this(initState, new com.tencent.mm.sdk.coroutines.LifecycleScope("UIStateCenter.LifecycleScope", lifecycleOwner, 0, 4, null));
        kotlin.jvm.internal.o.g(initState, "initState");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
    }
}
