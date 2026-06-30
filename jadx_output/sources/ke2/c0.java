package ke2;

/* loaded from: classes.dex */
public final class c0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306940t;

    public c0(com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        this.f306940t = "CgiFinderLivePurchaseContentList";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 10988;
        r45.s91 s91Var = new r45.s91();
        s91Var.set(3, gVar);
        s91Var.set(1, db2.t4.f228171a.a(10988));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s91Var.set(2, xy2.c.e(context));
        lVar.f70664a = s91Var;
        lVar.f70665b = new r45.t91();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetpurchasedcontentlist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLivePurchaseContentList", "last_buffer:" + s91Var.getByteString(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.t91 resp = (r45.t91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306940t, "purchased_count:" + resp.getInteger(4) + ",continueFlag:" + resp.getInteger(3));
    }
}
