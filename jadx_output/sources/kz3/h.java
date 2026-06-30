package kz3;

/* loaded from: classes15.dex */
public final class h implements uy3.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kz3.l f313878a;

    public h(kz3.l lVar) {
        this.f313878a = lVar;
    }

    @Override // uy3.v
    public void a(android.content.DialogInterface dialogInterface, int i17) {
        kz3.l lVar = this.f313878a;
        sy3.e eVar = lVar.f313891i;
        if (eVar != null) {
            eVar.b(dialogInterface);
        }
        kz3.m mVar = lVar.f313892j;
        if (mVar != null) {
            kz3.n nVar = (kz3.n) mVar;
            if (!nVar.f313903b) {
                int i18 = i17 != 2 ? i17 != 4 ? i17 != 5 ? -1 : 4 : 3 : 5;
                if (i18 != -1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f313902a), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(nVar.f313904c));
                }
            }
        }
        lVar.g();
    }

    @Override // uy3.v
    public void onCancel(android.content.DialogInterface dialogInterface) {
        kz3.l lVar = this.f313878a;
        sy3.e eVar = lVar.f313891i;
        if (eVar != null) {
            eVar.a(dialogInterface);
        }
        kz3.m mVar = lVar.f313892j;
        lVar.g();
    }

    @Override // uy3.v
    public void onShow(android.content.DialogInterface dialogInterface) {
        kz3.l lVar = this.f313878a;
        sy3.e eVar = lVar.f313891i;
        if (eVar != null) {
            eVar.d(dialogInterface);
        }
        kz3.m mVar = lVar.f313892j;
        if (mVar != null) {
            kz3.n nVar = (kz3.n) mVar;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f313902a), 2, java.lang.Integer.valueOf(nVar.f313904c));
        }
    }
}
