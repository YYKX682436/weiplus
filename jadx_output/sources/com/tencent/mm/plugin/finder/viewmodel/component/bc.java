package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f133865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar) {
        super(1);
        this.f133865d = ncVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed it = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = it.getFeedObject().getFeedObject();
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = com.tencent.mm.plugin.finder.viewmodel.component.nc.f135289z;
        return this.f133865d.b7(feedObject);
    }
}
