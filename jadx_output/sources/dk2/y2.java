package dk2;

/* loaded from: classes.dex */
public final class y2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234366a;

    public y2(dk2.r4 r4Var) {
        this.f234366a = r4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        dk2.r4 r4Var = this.f234366a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "post fastComment succ, errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
        } else {
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "post fastComment fail, errType = " + fVar.f70615a + ", errCode = " + fVar.f70616b + ", errMsg = " + fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
