package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class z80 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.x80 f128439a;

    public z80(com.tencent.mm.plugin.finder.storage.x80 x80Var) {
        this.f128439a = x80Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f128439a;
        Oj.z0(x80Var.field_objectId);
        long j17 = x80Var.field_localId;
        com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent = new com.tencent.mm.autogen.events.FinderDraftOpEvent();
        am.ab abVar = finderDraftOpEvent.f54270g;
        abVar.f6144a = 110;
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
