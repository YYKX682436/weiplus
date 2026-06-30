package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public class f implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.IEvent f192378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.d f192379e;

    public f(com.tencent.mm.sdk.event.d dVar, com.tencent.mm.sdk.event.IEvent iEvent) {
        this.f192379e = dVar;
        this.f192378d = iEvent;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f192378d.getClass().getName();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f192379e.d(this.f192378d, false);
    }
}
