package gx0;

/* loaded from: classes4.dex */
public final class x implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.p81 f277144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f277145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f277146c;

    public x(int i17, r45.p81 p81Var, com.tencent.mm.modelbase.i iVar, yz5.l lVar) {
        this.f277144a = p81Var;
        this.f277145b = iVar;
        this.f277146c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.util.Objects.toString(fVar);
        if (fVar.f70618d == null) {
            fVar.f70618d = this.f277144a;
        }
        this.f277145b.dead();
        if (fVar.b() && fVar.f70615a == 0 && fVar.f70616b == 0 && ((r45.p81) fVar.f70618d).getBoolean(1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiaoJianUtils", "getMiaojianCgi success");
            r45.p81 p81Var = (r45.p81) fVar.f70618d;
            if (p81Var != null) {
                str = p81Var.getString(2);
                this.f277146c.invoke(str);
                return jz5.f0.f302826a;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiaoJianUtils", "getMiaojianCgi failed, errType:" + fVar.f70615a + ", errCode:" + fVar.f70616b + ", exist:" + ((r45.p81) fVar.f70618d).getBoolean(1));
        }
        str = null;
        this.f277146c.invoke(str);
        return jz5.f0.f302826a;
    }
}
