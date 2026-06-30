package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class h implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.FavRecordDetailUI f155397d;

    public h(com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI) {
        this.f155397d = favRecordDetailUI;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        r45.bq0 bq0Var;
        if (w0Var == null || (obj = w0Var.f316976d) == null) {
            return;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        if (longValue < 0) {
            return;
        }
        long j17 = this.f155397d.f155258v;
        if (j17 == longValue) {
            o72.r2 a17 = bt3.z0.a(j17);
            com.tencent.mm.plugin.record.ui.b bVar = new com.tencent.mm.plugin.record.ui.b();
            bVar.f155350c = a17;
            if (a17 == null || (bq0Var = a17.field_favProto) == null) {
                return;
            }
            bVar.f155342a = bq0Var.f370964f;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.record.ui.g(this, bVar));
        }
    }
}
