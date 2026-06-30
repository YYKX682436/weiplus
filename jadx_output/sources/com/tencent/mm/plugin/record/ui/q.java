package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class q extends com.tencent.mm.plugin.record.ui.h0 implements zs3.t {

    /* renamed from: x, reason: collision with root package name */
    public final int f155468x;

    public q(android.content.Context context, com.tencent.mm.plugin.record.ui.f0 f0Var) {
        super(context, f0Var);
        this.f155468x = 3;
    }

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        this.f155401g.post(this.f155414w);
    }

    @Override // com.tencent.mm.plugin.record.ui.h0
    public int c() {
        return this.f155468x;
    }

    @Override // com.tencent.mm.plugin.record.ui.h0
    public void g(et3.b bVar) {
        bVar.f256594e = 3;
        bVar.f256595f = this.f155468x;
        bVar.f256596g = this.f155411t;
        com.tencent.mm.plugin.record.ui.a aVar = this.f155408q;
        bVar.f256592c = ((com.tencent.mm.plugin.record.ui.y) aVar).f155603c;
        bVar.f256599j = ((com.tencent.mm.plugin.record.ui.y) aVar).f155604d;
        bVar.f256593d = ((com.tencent.mm.plugin.record.ui.y) aVar).f155605e;
        if (((com.tencent.mm.plugin.record.ui.y) aVar).f155604d != null) {
            bVar.f256600k = ((com.tencent.mm.plugin.record.ui.y) aVar).f155604d.Q0();
        }
        if (android.text.TextUtils.isEmpty(bVar.f256600k)) {
            return;
        }
        bVar.f256600k = ((com.tencent.mm.plugin.record.ui.y) this.f155408q).f155606f;
    }

    @Override // com.tencent.mm.plugin.record.ui.h0
    public void h(com.tencent.mm.plugin.record.ui.a aVar) {
        if (aVar != null) {
            this.f155408q = aVar;
            java.util.List list = this.f155407p;
            ((java.util.LinkedList) list).clear();
            java.util.List list2 = aVar.f155342a;
            if (list2 != null) {
                ((java.util.LinkedList) list).addAll(list2);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.h0
    public com.tencent.mm.plugin.record.ui.viewWrappers.m j(com.tencent.mm.plugin.record.ui.viewWrappers.m mVar) {
        mVar.f155544h = this.f155468x;
        return mVar;
    }
}
