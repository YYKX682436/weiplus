package dk2;

/* loaded from: classes.dex */
public final class n2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233792a;

    public n2(yz5.p pVar) {
        this.f233792a = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.p pVar = this.f233792a;
        if (i17 == 0 && fVar.f70616b == 0) {
            if (pVar != null) {
                pVar.invoke(java.lang.Boolean.TRUE, fVar.f70618d);
                return f0Var;
            }
        } else if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, null);
            return f0Var;
        }
        return null;
    }
}
