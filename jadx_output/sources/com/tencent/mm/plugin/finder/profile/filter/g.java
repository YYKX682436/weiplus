package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class g implements com.tencent.mm.plugin.finder.profile.filter.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gk4 f123363a;

    public g(r45.gk4 collectionInfoList) {
        kotlin.jvm.internal.o.g(collectionInfoList, "collectionInfoList");
        this.f123363a = collectionInfoList;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public com.tencent.mm.protobuf.g a() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public int b() {
        return this.f123363a.f375316e;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public java.util.LinkedList d() {
        java.util.LinkedList collection_info = this.f123363a.f375315d;
        kotlin.jvm.internal.o.f(collection_info, "collection_info");
        return collection_info;
    }
}
