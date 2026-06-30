package db2;

/* loaded from: classes2.dex */
public final class i4 extends com.tencent.mm.modelbase.i {
    public i4(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, int i17, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2) {
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.i61 i61Var = new r45.i61();
        i61Var.set(2, feedObject.field_username);
        i61Var.set(3, java.lang.Integer.valueOf(i17));
        i61Var.set(4, gVar);
        i61Var.set(5, java.lang.Long.valueOf(feedObject.field_id));
        i61Var.set(6, feedObject.getObjectNonceId());
        i61Var.set(7, gVar2);
        i61Var.set(1, db2.t4.f228171a.a(3593));
        lVar.f70664a = i61Var;
        r45.j61 j61Var = new r45.j61();
        j61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = j61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfeedlikedlist";
        lVar.f70667d = 3593;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiGetFinderFeedLikedList init finderUsername=");
        sb6.append(feedObject.field_username);
        sb6.append(" scene=");
        sb6.append(i17);
        sb6.append(" lastBuffer=");
        sb6.append(gVar != null);
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderFeedLikedList", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderFeedLikedList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + ((r45.j61) fVar) + " thread=" + java.lang.Thread.currentThread());
    }
}
