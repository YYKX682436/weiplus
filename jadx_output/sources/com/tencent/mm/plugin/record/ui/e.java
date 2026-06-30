package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class e implements o72.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.f f155379d;

    public e(com.tencent.mm.plugin.record.ui.f fVar) {
        this.f155379d = fVar;
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        com.tencent.mm.plugin.record.ui.f fVar = this.f155379d;
        com.tencent.mm.plugin.record.ui.b bVar = (com.tencent.mm.plugin.record.ui.b) fVar.f155408q;
        long j17 = e2Var.field_favLocalId;
        if (j17 != bVar.f155350c.field_localId) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavRecordAdapter", "not equal Id %d %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(bVar.f155350c.field_localId));
            return;
        }
        if (4 == e2Var.field_status) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.record.ui.f.f155385y;
            java.lang.String str = e2Var.field_dataId;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "null";
            }
            hashMap.put(str, java.lang.Boolean.TRUE);
        }
        boolean w07 = e2Var.w0();
        com.tencent.mm.sdk.platformtools.n3 n3Var = fVar.f155401g;
        if (w07) {
            n3Var.post(new com.tencent.mm.plugin.record.ui.d(this, e2Var));
        }
        n3Var.post(fVar.f155414w);
    }
}
