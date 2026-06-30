package el2;

/* loaded from: classes3.dex */
public final class q1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f253893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f253894c;

    public q1(el2.c2 c2Var, r45.y42 y42Var, yz5.l lVar) {
        this.f253892a = c2Var;
        this.f253893b = y42Var;
        this.f253894c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.String str = this.f253892a.f253763f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getJumpInfo] type = ");
        r45.y42 y42Var = this.f253893b;
        sb6.append(y42Var.getInteger(1));
        sb6.append(", jumpId:");
        java.lang.String string = y42Var.getString(4);
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        sb6.append(", errcode = ");
        sb6.append(fVar.f70616b);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int i17 = fVar.f70615a;
        yz5.l lVar = this.f253894c;
        if (i17 == 0 && fVar.f70616b == 0) {
            lVar.invoke(fVar.f70618d);
        } else {
            lVar.invoke(null);
        }
        return jz5.f0.f302826a;
    }
}
