package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class y80 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.x80 f128351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f128352b;

    public y80(com.tencent.mm.plugin.finder.storage.x80 x80Var, long j17) {
        this.f128351a = x80Var;
        this.f128352b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        ((c61.l7) i95.n0.c(c61.l7.class)).Oj().z0(this.f128351a.field_objectId);
        com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent = new com.tencent.mm.autogen.events.FinderDraftOpEvent();
        am.ab abVar = finderDraftOpEvent.f54270g;
        abVar.f6144a = 110;
        long j17 = this.f128352b;
        abVar.f6145b = j17;
        finderDraftOpEvent.e();
        com.tencent.mm.autogen.events.FinderDraftModifyEvent finderDraftModifyEvent = new com.tencent.mm.autogen.events.FinderDraftModifyEvent();
        am.za zaVar = finderDraftModifyEvent.f54269g;
        zaVar.f8549a = j17;
        zaVar.f8550b = 2;
        finderDraftModifyEvent.e();
        return jz5.f0.f302826a;
    }
}
