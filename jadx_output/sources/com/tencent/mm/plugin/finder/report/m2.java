package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f125125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderFeedReportObject f125126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.x80 f125127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f125128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(boolean z17, com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, com.tencent.mm.plugin.finder.storage.x80 x80Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(0);
        this.f125125d = z17;
        this.f125126e = finderFeedReportObject;
        this.f125127f = x80Var;
        this.f125128g = finderItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f125126e;
        finderFeedReportObject.getEnterScene();
        finderFeedReportObject.getSourceEnterScene();
        pm0.v.u(this.f125127f.field_objectId);
        pm0.v.u(this.f125128g.getId());
        com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct finderPostStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostStruct();
        com.tencent.mm.plugin.finder.report.p2.f125237a.d(finderPostStruct, 3, this.f125125d ? 4 : 5, this.f125126e, this.f125128g, true);
        finderPostStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderPostStruct);
        return jz5.f0.f302826a;
    }
}
