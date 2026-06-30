package j00;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ecs.EcsNativeRouterRequest f296714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j00.d0 f296715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.pigeon.ecs.EcsNativeRouterRequest ecsNativeRouterRequest, j00.d0 d0Var, yz5.l lVar) {
        super(1);
        this.f296714d = ecsNativeRouterRequest;
        this.f296715e = d0Var;
        this.f296716f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.n8 n8Var = (bw5.n8) obj;
        int i17 = 1 ^ ((n8Var == null || n8Var.f30539f != 0) ? 0 : 1);
        java.lang.Long type = this.f296714d.getType();
        i00.a[] aVarArr = i00.a.f286495d;
        if (type != null && type.longValue() == 7) {
            j00.d0 d0Var = this.f296715e;
            long j17 = i17;
            java.lang.String errMsg = n8Var != null ? n8Var.getErrMsg() : null;
            if (errMsg == null) {
                errMsg = "";
            }
            java.lang.String str = n8Var != null ? n8Var.f30544n[5] ? n8Var.f30541h : "" : null;
            d0Var.a(j17, errMsg, str == null ? "" : str, this.f296716f);
        }
        return jz5.f0.f302826a;
    }
}
