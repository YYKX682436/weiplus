package y53;

/* loaded from: classes8.dex */
public final class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u53.w f459510a;

    public w(u53.w wVar) {
        this.f459510a = wVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        u53.w wVar = this.f459510a;
        if (i17 != 0 || fVar.f70615a != 0) {
            com.tencent.mars.xlog.Log.e("GameLife.ContactService", "setBlackListAssociateWithWAGame errCode:%d,errType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70615a));
            if (wVar != null) {
                wVar.a(false);
                return f0Var;
            }
        } else if (wVar != null) {
            wVar.a(true);
            return f0Var;
        }
        return null;
    }
}
