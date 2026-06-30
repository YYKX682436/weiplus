package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f112173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(ce2.i iVar) {
        super(0);
        this.f112173d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.pl plVar;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (plVar = (df2.pl) liveRoomControllerStore.controller(df2.pl.class)) != null) {
            plVar.f7(this.f112173d);
        }
        return jz5.f0.f302826a;
    }
}
