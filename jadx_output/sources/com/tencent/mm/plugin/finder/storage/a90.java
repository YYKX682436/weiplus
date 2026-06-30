package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class a90 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.a90 f126393a = new com.tencent.mm.plugin.finder.storage.a90();

    public final com.tencent.mm.plugin.finder.storage.x80 a(long j17) {
        com.tencent.mm.plugin.finder.storage.x80 b17 = b(j17);
        if (b17 != null && b17.field_objectId != 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderDraftLogic", "deleteRemoteDraft localId:" + j17 + ", objectId:" + b17.field_objectId);
            new db2.c0(b17.field_objectId, b17.t0().getUserName()).l().K(new com.tencent.mm.plugin.finder.storage.y80(b17, j17));
        }
        return b17;
    }

    public final com.tencent.mm.plugin.finder.storage.x80 b(long j17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderDraftLogic", "deleteLocalDraft localId:" + j17);
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        com.tencent.mm.plugin.finder.storage.x80 x80Var = null;
        android.database.Cursor f17 = Oj.f222428i.f("SELECT * FROM FinderDraftItem  WHERE " + Oj.f222423d + ".localId=" + j17, null, 2);
        if (f17.moveToFirst()) {
            x80Var = new com.tencent.mm.plugin.finder.storage.x80();
            x80Var.convertFrom(f17);
            f17.close();
        } else {
            f17.close();
        }
        cu2.n.y0(((c61.l7) i95.n0.c(c61.l7.class)).Oj(), j17, false, 2, null);
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
        return x80Var;
    }
}
