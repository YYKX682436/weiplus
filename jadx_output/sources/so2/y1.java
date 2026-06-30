package so2;

/* loaded from: classes.dex */
public final class y1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f410723a;

    public y1(yz5.l lVar) {
        this.f410723a = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.l lVar = this.f410723a;
        if (i17 == 0 && fVar.f70616b == 0) {
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
                return f0Var;
            }
        } else if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
            return f0Var;
        }
        return null;
    }
}
