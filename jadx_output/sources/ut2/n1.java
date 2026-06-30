package ut2;

/* loaded from: classes.dex */
public final class n1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f431012a;

    public n1(v65.n nVar) {
        this.f431012a = nVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = fVar != null && fVar.f70615a == 0;
        v65.n nVar = this.f431012a;
        if (z17 && fVar.f70616b == 0) {
            nVar.a(java.lang.Boolean.TRUE);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open price failed, errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errCode = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShoppingViewHolder", sb6.toString());
            nVar.a(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}
