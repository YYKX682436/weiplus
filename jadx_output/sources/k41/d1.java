package k41;

/* loaded from: classes11.dex */
public final class d1 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.w f303982a;

    public d1(j41.w wVar) {
        this.f303982a = wVar;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        j41.u uVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getContact finish! contact: ");
        sb6.append((i0Var == null || (uVar = i0Var.f297643d) == null) ? null : ((k41.g0) uVar).field_username);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", sb6.toString());
        j41.w wVar = this.f303982a;
        if (wVar != null) {
            wVar.a(i0Var);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        j41.w wVar = this.f303982a;
        if (wVar != null) {
            wVar.b(str);
        }
    }
}
