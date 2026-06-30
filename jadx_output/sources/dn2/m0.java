package dn2;

/* loaded from: classes3.dex */
public final class m0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f241943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f241944b;

    public m0(dn2.s0 s0Var, boolean z17) {
        this.f241943a = s0Var;
        this.f241944b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = fVar != null && fVar.f70615a == 0;
        boolean z18 = this.f241944b;
        dn2.s0 s0Var = this.f241943a;
        if (z17 && fVar.f70616b == 0) {
            s0Var.getClass();
            com.tencent.mars.xlog.Log.i("ShoppingHotSaleNotificationItem", "cgi report click = " + z18 + ", success");
        } else {
            s0Var.getClass();
            com.tencent.mars.xlog.Log.i("ShoppingHotSaleNotificationItem", "cgi report click = " + z18 + ", failed, errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
