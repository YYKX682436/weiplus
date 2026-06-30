package com.tencent.mm.sdk.statecenter;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tencent/mm/sdk/statecenter/RootProcessor;", "Lj75/a;", "State", "Lj75/c;", "Landroidx/lifecycle/x;", "<init>", "()V", "LifecycleBoundProcessor", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class RootProcessor<State extends j75.a> implements j75.c, androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f193143d = new java.util.concurrent.ConcurrentHashMap();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\n"}, d2 = {"Lcom/tencent/mm/sdk/statecenter/RootProcessor$LifecycleBoundProcessor;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onLifecycleDestroy", "Landroidx/lifecycle/y;", "owner", "Lj75/c;", "processor", "<init>", "(Lcom/tencent/mm/sdk/statecenter/RootProcessor;Landroidx/lifecycle/y;Lj75/c;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public class LifecycleBoundProcessor implements androidx.lifecycle.x {

        /* renamed from: d, reason: collision with root package name */
        public final androidx.lifecycle.y f193144d;

        /* renamed from: e, reason: collision with root package name */
        public final j75.c f193145e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.sdk.statecenter.RootProcessor f193146f;

        public LifecycleBoundProcessor(com.tencent.mm.sdk.statecenter.RootProcessor rootProcessor, androidx.lifecycle.y owner, j75.c processor) {
            kotlin.jvm.internal.o.g(owner, "owner");
            kotlin.jvm.internal.o.g(processor, "processor");
            this.f193146f = rootProcessor;
            this.f193144d = owner;
            this.f193145e = processor;
        }

        public final void a(j75.a state) {
            kotlin.jvm.internal.o.g(state, "state");
            if (this.f193144d.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED) {
                this.f193145e.a(state);
            }
        }

        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
        public void onLifecycleDestroy() {
            this.f193144d.hashCode();
            j75.c cVar = this.f193145e;
            cVar.hashCode();
            com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor lifecycleBoundProcessor = (com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor) this.f193146f.f193143d.remove(java.lang.Integer.valueOf(cVar.hashCode()));
            if (lifecycleBoundProcessor != null) {
                lifecycleBoundProcessor.f193144d.mo133getLifecycle().c(lifecycleBoundProcessor);
            }
        }
    }

    @Override // j75.c
    public void a(j75.a state) {
        kotlin.jvm.internal.o.g(state, "state");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f193143d;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor) ((java.util.Map.Entry) it.next()).getValue());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor) it6.next()).a(state);
        }
    }

    public final void b(androidx.lifecycle.y lifecycleOwner, j75.c processor) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(processor, "processor");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f193143d;
        com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor lifecycleBoundProcessor = (com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor) concurrentHashMap.get(java.lang.Integer.valueOf(processor.hashCode()));
        if (lifecycleBoundProcessor != null) {
            androidx.lifecycle.y yVar = lifecycleBoundProcessor.f193144d;
            if (!(!kotlin.jvm.internal.o.b(yVar, lifecycleOwner))) {
                yVar = null;
            }
            if (yVar != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mvvm.RootProcessor", "Cannot add the same processor with different lifecycles");
                return;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(processor.hashCode());
        com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor lifecycleBoundProcessor2 = new com.tencent.mm.sdk.statecenter.RootProcessor.LifecycleBoundProcessor(this, lifecycleOwner, processor);
        androidx.lifecycle.y yVar2 = lifecycleBoundProcessor2.f193144d;
        if (yVar2.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED) {
            yVar2.mo133getLifecycle().a(lifecycleBoundProcessor2);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mvvm.RootProcessor", "attachObserver fail, lifecycle is destroyed owner:" + yVar2.hashCode() + " observer:" + lifecycleBoundProcessor2.f193145e.hashCode());
        }
        concurrentHashMap.put(valueOf, lifecycleBoundProcessor2);
    }
}
