package sl4;

/* loaded from: classes11.dex */
public final class b extends qp1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl4.g f409254a;

    public b(sl4.g gVar) {
        this.f409254a = gVar;
    }

    @Override // qp1.l0
    public void a() {
        sl4.g gVar = this.f409254a;
        com.tencent.mars.xlog.Log.i(gVar.f409259n, "permissionEvent.onDialogShow");
        gVar.r0();
    }

    @Override // qp1.k0
    public void b(qp1.j0 permissionCheckResult) {
        kotlin.jvm.internal.o.g(permissionCheckResult, "permissionCheckResult");
        sl4.g gVar = this.f409254a;
        com.tencent.mars.xlog.Log.i(gVar.f409259n, "permissionEvent.onCheckResult: " + permissionCheckResult);
        gVar.o0(permissionCheckResult);
    }

    @Override // qp1.l0
    public void c() {
        sl4.g gVar = this.f409254a;
        com.tencent.mars.xlog.Log.i(gVar.f409259n, "permissionEvent.onClickCancel");
        gVar.p0();
    }

    @Override // qp1.l0
    public void d() {
        sl4.g gVar = this.f409254a;
        com.tencent.mars.xlog.Log.i(gVar.f409259n, "permissionEvent.onClickSetting");
        gVar.q0();
    }
}
