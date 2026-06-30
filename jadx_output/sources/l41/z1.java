package l41;

/* loaded from: classes11.dex */
public final class z1 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f315978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j41.w f315979b;

    public z1(j41.h0 h0Var, j41.w wVar) {
        this.f315978a = h0Var;
        this.f315979b = wVar;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        java.lang.String str = null;
        j41.u uVar = i0Var != null ? i0Var.f297643d : null;
        java.lang.Object[] objArr = new java.lang.Object[3];
        j41.h0 h0Var = this.f315978a;
        objArr[0] = h0Var.f297633c;
        objArr[1] = h0Var.f297632b;
        if (uVar != null) {
            k41.g0 g0Var = (k41.g0) uVar;
            str = "username:" + g0Var.field_username + " nick:" + g0Var.field_nickname;
        }
        objArr[2] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuService", "fetchContact username: %s, url: %s, contact: %s", objArr);
        j41.w wVar = this.f315979b;
        if (wVar != null) {
            wVar.a(i0Var);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuService", "fetchContact onTryFetch: %s", str);
        j41.w wVar = this.f315979b;
        if (wVar != null) {
            wVar.b(str);
        }
    }
}
