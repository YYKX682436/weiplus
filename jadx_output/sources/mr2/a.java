package mr2;

/* loaded from: classes.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f330846t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String orderId) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(orderId, "orderId");
        this.f330846t = "Finder.CgiFinderLiveEcCustomerGetOrderInfo";
        r45.kg0 kg0Var = new r45.kg0();
        kg0Var.set(1, orderId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = kg0Var;
        r45.lg0 lg0Var = new r45.lg0();
        lg0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) lg0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = lg0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/eccustomergetorderinfo";
        lVar.f70667d = 10063;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveEcCustomerGetOrderInfo", "init CgiFinderLiveEcCustomerGetOrderInfo");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.lg0 resp = (r45.lg0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f330846t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
