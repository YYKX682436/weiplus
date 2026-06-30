package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class f extends com.tencent.mm.plugin.record.ui.h0 {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.HashMap f155385y = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final o72.x3 f155386x;

    public f(android.content.Context context, com.tencent.mm.plugin.record.ui.f0 f0Var) {
        super(context, f0Var);
        this.f155386x = new com.tencent.mm.plugin.record.ui.e(this);
    }

    @Override // com.tencent.mm.plugin.record.ui.h0
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.record.ui.h0
    public void g(et3.b bVar) {
        long j17 = ((com.tencent.mm.plugin.record.ui.b) this.f155408q).f155350c.field_localId;
        bVar.f256595f = 1;
        bVar.f256594e = 1;
        bVar.f256596g = 15;
        bVar.f256591b = ((com.tencent.mm.plugin.record.ui.b) this.f155408q).f155350c;
    }

    @Override // com.tencent.mm.plugin.record.ui.h0
    public void h(com.tencent.mm.plugin.record.ui.a aVar) {
        com.tencent.mm.plugin.record.ui.b bVar = (com.tencent.mm.plugin.record.ui.b) aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavRecordAdapter", "updateData localId %s,status %s", java.lang.Long.valueOf(bVar.f155350c.field_localId), java.lang.Integer.valueOf(bVar.f155350c.field_itemStatus));
        this.f155408q = aVar;
        java.util.List list = this.f155407p;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).addAll(aVar.f155342a);
        notifyDataSetChanged();
    }
}
