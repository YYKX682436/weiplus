package dn2;

/* loaded from: classes3.dex */
public final class o0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f241952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f241953b;

    public o0(v65.n nVar, dn2.s0 s0Var) {
        this.f241952a = nVar;
        this.f241953b = s0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        v65.n nVar = this.f241952a;
        if (i17 == 0 && fVar.f70616b == 0) {
            nVar.a(fVar.f70618d);
        } else {
            this.f241953b.getClass();
            com.tencent.mars.xlog.Log.e("ShoppingHotSaleNotificationItem", "get product detail failed, errcode = " + fVar.f70616b + ", errType = " + fVar.f70615a);
            nVar.a(null);
        }
        return jz5.f0.f302826a;
    }
}
