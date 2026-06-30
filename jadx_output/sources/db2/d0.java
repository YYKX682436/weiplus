package db2;

/* loaded from: classes.dex */
public final class d0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227940t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i17, java.lang.String contentId) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(contentId, "contentId");
        this.f227940t = "Finder.CgiFinderDeletePurchasedContent";
        r45.h11 h11Var = new r45.h11();
        h11Var.set(1, db2.t4.f228171a.b(6662, this.f16135n));
        h11Var.set(2, java.lang.Integer.valueOf(i17));
        h11Var.set(3, contentId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = h11Var;
        r45.i11 i11Var = new r45.i11();
        i11Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) i11Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = i11Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderdeletepurchasedcontent";
        lVar.f70667d = 9480;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderDeletePurchasedContent", "init " + h11Var.getInteger(2) + ',' + h11Var.getString(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.i11 resp = (r45.i11) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227940t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
