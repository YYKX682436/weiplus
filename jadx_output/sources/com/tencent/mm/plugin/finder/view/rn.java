package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class rn implements com.tencent.mm.plugin.finder.view.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.IListener f132979b;

    public rn(yz5.a aVar, com.tencent.mm.sdk.event.IListener iListener) {
        this.f132978a = aVar;
        this.f132979b = iListener;
    }

    @Override // com.tencent.mm.plugin.finder.view.d3
    public final void onDismiss() {
        this.f132978a.invoke();
        this.f132979b.dead();
    }
}
