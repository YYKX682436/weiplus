package qp2;

/* loaded from: classes.dex */
public final class z extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f365827g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f365828h;

    public /* synthetic */ z(r45.qt2 qt2Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, kotlin.jvm.internal.i iVar) {
        this(qt2Var, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? "" : str, (i18 & 8) != 0 ? "" : str2, (i18 & 16) != 0 ? "" : str3, (i18 & 32) != 0 ? "" : str4);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f365827g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f365827g = u0Var;
        return dispatch(sVar, this.f365828h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4210;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(r45.qt2 qt2Var, int i17, java.lang.String byPass, java.lang.String title, java.lang.String encrypted_object_id, java.lang.String object_nonce_id) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(byPass, "byPass");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(encrypted_object_id, "encrypted_object_id");
        kotlin.jvm.internal.o.g(object_nonce_id, "object_nonce_id");
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g81 g81Var = new r45.g81();
        g81Var.set(1, db2.t4.f228171a.b(4210, qt2Var));
        g81Var.set(2, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        g81Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        g81Var.set(4, java.lang.Integer.valueOf(i17));
        g81Var.set(5, byPass);
        g81Var.set(7, encrypted_object_id);
        g81Var.set(8, object_nonce_id);
        g81Var.set(6, title);
        lVar.f70664a = g81Var;
        lVar.f70665b = new r45.h81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlivetabs";
        lVar.f70667d = 4210;
        this.f365828h = lVar.a();
    }
}
