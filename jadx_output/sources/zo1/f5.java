package zo1;

/* loaded from: classes5.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f474613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f474614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI, int i17, long j17) {
        super(2);
        this.f474611d = u3Var;
        this.f474612e = selectPackageUI;
        this.f474613f = i17;
        this.f474614g = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.wechat.aff.affroam.g gVar = (com.tencent.wechat.aff.affroam.g) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Change option complete. error=");
        sb6.append(intValue);
        sb6.append(", newPkg=");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        pm0.v.X(new zo1.e5(this.f474611d, intValue, gVar, this.f474612e, this.f474613f, this.f474614g));
        return jz5.f0.f302826a;
    }
}
