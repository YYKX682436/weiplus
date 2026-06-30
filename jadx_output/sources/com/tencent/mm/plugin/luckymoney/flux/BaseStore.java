package com.tencent.mm.plugin.luckymoney.flux;

/* loaded from: classes13.dex */
public abstract class BaseStore extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.enjoylife.flux.events.FluxActionDispatchEvent> {
    public BaseStore() {
        super(com.tencent.mm.app.a0.f53288d);
        vb3.a.f434791b.f434792a.getAndIncrement();
        this.__eventId = 775538386;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.enjoylife.flux.events.FluxActionDispatchEvent fluxActionDispatchEvent) {
        com.tencent.mm.enjoylife.flux.events.FluxActionDispatchEvent fluxActionDispatchEvent2 = fluxActionDispatchEvent;
        if (!(fluxActionDispatchEvent2 instanceof com.tencent.mm.enjoylife.flux.events.FluxActionDispatchEvent)) {
            return false;
        }
        fluxActionDispatchEvent2.f64957g.getClass();
        return false;
    }
}
