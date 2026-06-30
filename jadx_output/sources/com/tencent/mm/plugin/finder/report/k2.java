package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderFeedReportObject f125094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f125095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(0);
        this.f125094d = finderFeedReportObject;
        this.f125095e = finderItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f125094d;
        finderFeedReportObject.getVideoMusicId();
        finderFeedReportObject.getSoundTrackType();
        finderFeedReportObject.getLikeMusicFeedId();
        com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct finderPostStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct();
        com.tencent.mm.plugin.finder.report.p2.e(com.tencent.mm.plugin.finder.report.p2.f125237a, finderPostStruct, 2, 3, this.f125094d, this.f125095e, false, 32, null);
        finderPostStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPostStruct);
        return jz5.f0.f302826a;
    }
}
