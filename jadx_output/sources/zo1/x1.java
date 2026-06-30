package zo1;

/* loaded from: classes5.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f474820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.util.List list, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        super(1);
        this.f474820d = list;
        this.f474821e = createPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list;
        java.lang.Object obj2;
        boolean z17;
        java.util.List deviceList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(deviceList, "deviceList");
        java.util.Iterator it = deviceList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.f474820d;
            if (!hasNext) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            po1.d dVar = (po1.d) obj2;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    if (kotlin.jvm.internal.o.b(dVar.f357300f, ((po1.d) it6.next()).f357300f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                break;
            }
        }
        po1.d dVar2 = (po1.d) obj2;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474821e;
        if (dVar2 == null) {
            po1.d a17 = po1.d.a((po1.d) kz5.n0.i0(list), null, null, null, null, "/", null, null, 111, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "bound device is null, try first device=" + a17);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(createPackageUI);
            u1Var.g(createPackageUI.getString(com.tencent.mm.R.string.mx9));
            u1Var.a(true);
            u1Var.b(new zo1.v1(createPackageUI, a17));
            u1Var.q(false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "find a bound device = " + dVar2);
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(createPackageUI);
            u1Var2.g(createPackageUI.getString(com.tencent.mm.R.string.mx9));
            u1Var2.a(true);
            u1Var2.b(new zo1.w1(createPackageUI, dVar2));
            u1Var2.q(false);
        }
        return jz5.f0.f302826a;
    }
}
