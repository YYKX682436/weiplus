package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class a implements com.tencent.mm.plugin.finder.profile.filter.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.wx0 f123353a;

    public a(r45.wx0 collectionInfoList) {
        kotlin.jvm.internal.o.g(collectionInfoList, "collectionInfoList");
        this.f123353a = collectionInfoList;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public com.tencent.mm.protobuf.g a() {
        return this.f123353a.getByteString(2);
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public int b() {
        return this.f123353a.getInteger(1);
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.p
    public java.util.LinkedList d() {
        java.util.LinkedList list = this.f123353a.getList(0);
        kotlin.jvm.internal.o.f(list, "getCollection_info(...)");
        return list;
    }
}
