package dk2;

/* loaded from: classes.dex */
public final class p3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233896b;

    public p3(dk2.r4 r4Var, yz5.p pVar) {
        this.f233895a = r4Var;
        this.f233896b = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i(this.f233895a.f234009d, "errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        yz5.p pVar = this.f233896b;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(java.lang.Boolean.valueOf(fVar.f70616b == 0), fVar.f70617c);
        return jz5.f0.f302826a;
    }
}
