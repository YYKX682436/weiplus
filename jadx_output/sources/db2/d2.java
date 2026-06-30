package db2;

/* loaded from: classes.dex */
public final class d2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f227941u;

    /* renamed from: v, reason: collision with root package name */
    public final db2.c2 f227942v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(long j17, long j18, java.lang.String anchorUsername, java.lang.String str, com.tencent.mm.protobuf.g gVar, java.util.LinkedList stockIds, db2.c2 callback, java.lang.String noticeId) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(stockIds, "stockIds");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        this.f227941u = "Finder.CgiFinderLiveReceiveCoupon";
        this.f227942v = callback;
        r45.p62 p62Var = new r45.p62();
        p62Var.set(1, db2.t4.f228171a.a(6219));
        p62Var.set(3, java.lang.Long.valueOf(j17));
        p62Var.set(2, java.lang.Long.valueOf(j18));
        p62Var.set(5, anchorUsername);
        p62Var.set(8, str);
        p62Var.set(6, gVar);
        p62Var.set(4, stockIds);
        p62Var.set(7, java.util.UUID.randomUUID().toString());
        p62Var.set(10, noticeId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = p62Var;
        r45.q62 q62Var = new r45.q62();
        q62Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) q62Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = q62Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivereceivecoupon";
        lVar.f70667d = 6219;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveReceiveCoupon", "init " + p62Var.getLong(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.q62 resp = (r45.q62) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227941u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        this.f227942v.a(i17, i18, str, resp);
    }
}
