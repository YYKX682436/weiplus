package zo1;

/* loaded from: classes5.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f474627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.wechat.aff.affroam.g gVar, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        super(1);
        this.f474627d = gVar;
        this.f474628e = selectPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.wechat.aff.affroam.g gVar = this.f474627d;
        if (intValue != gVar.f215835m) {
            long j17 = gVar.f215829d;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", "Try to change option from " + gVar.f215835m + " to " + intValue);
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474628e;
            java.lang.String string = selectPackageUI.getString(com.tencent.mm.R.string.mvy);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            zo1.f5 f5Var = new zo1.f5(com.tencent.mm.ui.widget.dialog.u3.f(selectPackageUI, string, false, 3, null), this.f474628e, intValue, j17);
            com.tencent.wechat.aff.affroam.g gVar2 = new com.tencent.wechat.aff.affroam.g();
            gVar2.parseFrom(gVar.getData());
            gVar2.f215835m = intValue;
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.s(gVar2, f5Var);
        }
        return jz5.f0.f302826a;
    }
}
