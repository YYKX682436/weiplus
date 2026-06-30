package zo1;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f474544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, po1.d dVar) {
        super(2);
        this.f474542d = u3Var;
        this.f474543e = createPackageUI;
        this.f474544f = dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        ((ku5.t0) ku5.t0.f312615d).B(new zo1.z0(this.f474542d, this.f474543e, this.f474544f, intValue, longValue));
        if (intValue == 0) {
            com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(longValue);
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CreatePackageUI", "Fail to get pkg by id=" + longValue);
            } else {
                qo1.j1.f365523a.g(k17);
            }
        }
        return jz5.f0.f302826a;
    }
}
