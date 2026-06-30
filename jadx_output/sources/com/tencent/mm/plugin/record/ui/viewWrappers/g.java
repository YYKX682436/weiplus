package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.i f155511d;

    public g(com.tencent.mm.plugin.record.ui.viewWrappers.i iVar) {
        this.f155511d = iVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.record.ui.viewWrappers.i iVar = this.f155511d;
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Ksnsupload_type", 0);
            intent.putExtra("sns_kemdia_path", iVar.f155517h);
            java.lang.String a17 = c01.n2.a("fav_");
            c01.n2.d().c(a17, true).i("prePublishId", "fav_");
            intent.putExtra("reportSessionId", a17);
            j45.l.j(iVar.f155513d, "sns", ".ui.SnsUploadUI", intent, null);
            return;
        }
        if (itemId == 2) {
            o72.x1.J0(iVar.f155517h, iVar.f155513d, iVar.f155514e.f256590a.f375431q2);
        } else {
            if (itemId != 3) {
                return;
            }
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(iVar.f155513d, iVar.f155517h, new com.tencent.mm.plugin.record.ui.viewWrappers.f(this));
        }
    }
}
