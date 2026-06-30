package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.n f155449d;

    public m(com.tencent.mm.plugin.record.ui.n nVar) {
        this.f155449d = nVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.record.ui.n nVar = this.f155449d;
        if (itemId != 0) {
            if (itemId == 2) {
                db5.e1.u(nVar.f155455d.getContext(), nVar.f155455d.getString(com.tencent.mm.R.string.f490369t2), "", new com.tencent.mm.plugin.record.ui.l(this), null);
                com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI = nVar.f155455d;
                int i19 = com.tencent.mm.plugin.record.ui.FavRecordDetailUI.C;
                favRecordDetailUI.U6(6);
                return;
            }
            if (itemId == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_fav_scene", 2);
                intent.putExtra("key_fav_item_id", nVar.f155455d.f155258v);
                o72.x1.L0(nVar.f155455d.getContext(), ".ui.FavTagEditUI", intent, null);
                nVar.f155455d.U6(7);
                return;
            }
            if (itemId == 4) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_fav_scene", 1);
                intent2.putExtra("key_fav_item_id", nVar.f155455d.f155260x.field_localId);
                o72.x1.L0(nVar.f155455d.getContext(), ".ui.FavTagEditUI", intent2, null);
                return;
            }
            if (itemId != 5) {
                return;
            }
            com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI2 = nVar.f155455d;
            com.tencent.mm.plugin.fav.ui.b4.b(favRecordDetailUI2, favRecordDetailUI2.f155258v, favRecordDetailUI2.f100600g);
            nVar.f155455d.U6(5);
            return;
        }
        long i27 = ip.c.i();
        if (nVar.f155455d.f155260x.field_type == 18) {
            i27 = ip.c.h();
            i18 = com.tencent.mm.R.string.c_t;
        } else {
            i18 = com.tencent.mm.R.string.c_u;
        }
        com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI3 = nVar.f155455d;
        long j17 = favRecordDetailUI3.f155260x.field_localId;
        favRecordDetailUI3.getClass();
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        long j18 = F != null ? F.field_datatotalsize : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavRecordDetailUI", "checkIfOverTotalSizeLimit, totalSize:%s", java.lang.Long.valueOf(j18));
        if (j18 > i27) {
            db5.e1.T(nVar.f155455d.getContext(), nVar.f155455d.getString(i18, com.tencent.mm.sdk.platformtools.t8.f0(i27)));
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        co.a a17 = com.tencent.mm.plugin.fav.ui.i3.f101160a.a(nVar.f155455d.f155260x);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI4 = nVar.f155455d;
        n13.r a18 = n13.r.a(4097);
        a18.f334120d.f334139a = 6;
        ((dk5.b0) b0Var).Bi(favRecordDetailUI4, a17, a18);
        com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI5 = nVar.f155455d;
        favRecordDetailUI5.X6(favRecordDetailUI5.f155260x.field_localId, 1, 0);
        nVar.f155455d.U6(3);
    }
}
