package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class zi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f130107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f130108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(fc2.a aVar, com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f130107d = aVar;
        this.f130108e = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean bool;
        ec2.f fVar = (ec2.f) this.f130107d;
        int i17 = fVar.f250959d;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f130108e;
        if (i17 == 17) {
            finderShareFeedRelUI.N1.put(java.lang.Long.valueOf(fVar.f250965j), java.lang.Boolean.TRUE);
        } else if (i17 == 4) {
            finderShareFeedRelUI.N1.put(java.lang.Long.valueOf(fVar.f250965j), java.lang.Boolean.FALSE);
        } else if (i17 == 6 && (bool = (java.lang.Boolean) finderShareFeedRelUI.N1.remove(java.lang.Long.valueOf(fVar.f250965j))) != null) {
            com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
            if (w8Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var.getRecyclerView();
            finderShareFeedRelUI.N7(fVar.f250965j, bool.booleanValue());
        }
        return jz5.f0.f302826a;
    }
}
