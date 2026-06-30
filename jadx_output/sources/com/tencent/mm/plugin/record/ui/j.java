package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.n f155420d;

    public j(com.tencent.mm.plugin.record.ui.n nVar) {
        this.f155420d = nVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.record.ui.n nVar = this.f155420d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavRecordDetailUI", "favItemInfo: id %d, status %d", java.lang.Integer.valueOf(nVar.f155455d.f155260x.field_id), java.lang.Integer.valueOf(nVar.f155455d.f155260x.field_itemStatus));
        o72.r2 r2Var = nVar.f155455d.f155260x;
        if (r2Var.field_id > 0 && !r2Var.Q0() && !nVar.f155455d.f155260x.P0()) {
            com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI = nVar.f155455d;
            if (favRecordDetailUI.f155261y) {
                g4Var.f(0, favRecordDetailUI.getString(com.tencent.mm.R.string.ccw));
            }
        }
        g4Var.f(5, nVar.f155455d.getString(com.tencent.mm.R.string.ccl));
        g4Var.f(3, nVar.f155455d.getString(com.tencent.mm.R.string.f491195ca4));
        g4Var.f(2, nVar.f155455d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
