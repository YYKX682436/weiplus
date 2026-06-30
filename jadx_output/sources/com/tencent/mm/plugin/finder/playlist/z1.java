package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class z1 extends com.tencent.mm.plugin.finder.model.BaseFinderFeed {

    /* renamed from: d, reason: collision with root package name */
    public boolean f122508d;

    /* renamed from: e, reason: collision with root package name */
    public long f122509e;

    /* renamed from: f, reason: collision with root package name */
    public long f122510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.finder.storage.FinderItem feedObject) {
        super(feedObject);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public int h() {
        return com.tencent.mm.plugin.finder.playlist.z1.class.getName().hashCode();
    }
}
