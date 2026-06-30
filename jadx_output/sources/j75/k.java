package j75;

/* loaded from: classes10.dex */
public final class k implements j75.f {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f298073d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f298074e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.SequenceLifecycleScope f298075f;

    /* renamed from: g, reason: collision with root package name */
    public j75.a f298076g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.statecenter.RootProcessor f298077h;

    /* renamed from: i, reason: collision with root package name */
    public final j75.h f298078i;

    public k(j75.a initState, androidx.lifecycle.y lifecycleOwner, java.lang.String logTag, com.tencent.mm.sdk.coroutines.SequenceLifecycleScope lifecycleScope) {
        kotlin.jvm.internal.o.g(initState, "initState");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(logTag, "logTag");
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        this.f298073d = lifecycleOwner;
        this.f298074e = logTag;
        this.f298075f = lifecycleScope;
        this.f298076g = initState;
        this.f298077h = new com.tencent.mm.sdk.statecenter.RootProcessor();
        this.f298078i = new j75.h(this);
    }

    @Override // j75.f
    public void B3(j75.d action) {
        kotlin.jvm.internal.o.g(action, "action");
        action.toString();
        v65.i.b(this.f298075f, null, new j75.g(this, action, null), 1, null);
    }

    @Override // j75.f
    public void L2(androidx.lifecycle.y owner, final yz5.l observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f298078i.observe(owner, new e75.a(observer) { // from class: j75.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f298071d;

            {
                kotlin.jvm.internal.o.g(observer, "function");
                this.f298071d = observer;
            }

            @Override // e75.a
            public final /* synthetic */ void onChanged(java.lang.Object obj) {
                this.f298071d.invoke(obj);
            }
        });
    }

    @Override // j75.f
    public j75.a getState() {
        return this.f298076g;
    }

    @Override // j75.f
    public void m3(androidx.lifecycle.y owner, e75.a observer) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f298078i.observe(owner, observer);
    }

    @Override // j75.f
    public void x(androidx.lifecycle.y owner, j75.c processor) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f298077h.b(owner, processor);
    }

    @Override // j75.f
    public void z3(androidx.lifecycle.y owner, final yz5.l processor) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f298077h.b(owner, new j75.c(processor) { // from class: j75.j

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.l f298072d;

            {
                kotlin.jvm.internal.o.g(processor, "function");
                this.f298072d = processor;
            }

            @Override // j75.c
            public final /* synthetic */ void a(j75.a aVar) {
                this.f298072d.invoke(aVar);
            }
        });
    }

    public /* synthetic */ k(j75.a aVar, androidx.lifecycle.y yVar, java.lang.String str, com.tencent.mm.sdk.coroutines.SequenceLifecycleScope sequenceLifecycleScope, int i17, kotlin.jvm.internal.i iVar) {
        this(aVar, yVar, (i17 & 4) != 0 ? "MicroMsg.State.StateCenter" : str, (i17 & 8) != 0 ? new com.tencent.mm.sdk.coroutines.SequenceLifecycleScope("ServiceStateCenter.LifecycleScope", yVar) : sequenceLifecycleScope);
    }
}
