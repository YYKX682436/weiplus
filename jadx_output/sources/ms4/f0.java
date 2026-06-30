package ms4;

/* loaded from: classes8.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ js4.o f331016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f331017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f331018c;

    public f0(js4.o oVar, ms4.j0 j0Var, android.content.Context context) {
        this.f331016a = oVar;
        this.f331017b = j0Var;
        this.f331018c = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "CgiGetMidasSdkInfoRequest errorType: " + fVar.f70615a + ", errorCode: " + fVar.f70616b + ", errorMsg: " + fVar.f70617c);
        boolean h17 = os4.h.h(fVar);
        js4.o oVar = this.f331016a;
        if (!h17) {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 != null) {
                r45.nl4 nl4Var = ((r45.pi3) fVar2).f383072d;
                if (nl4Var != null) {
                    os4.h.k("MicroMsg.WeCoinMidasInitializer", fVar2);
                    ms4.j0 j0Var = this.f331017b;
                    j0Var.f331047a = nl4Var;
                    j0Var.a(this.f331018c, nl4Var);
                    if (oVar != null) {
                        oVar.onSuccess(java.lang.Boolean.TRUE);
                    }
                }
            } else if (oVar != null) {
                oVar.a(3, -2, "");
            }
        } else if (oVar != null) {
            int i17 = fVar.f70615a;
            int i18 = fVar.f70616b;
            java.lang.String str = fVar.f70617c;
            oVar.a(i17, i18, str != null ? str : "");
        }
        return jz5.f0.f302826a;
    }
}
