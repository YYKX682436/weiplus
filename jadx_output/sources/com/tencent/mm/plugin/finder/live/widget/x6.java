package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d7 f120299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.finder.live.widget.d7 d7Var) {
        super(1);
        this.f120299d = d7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Number) obj).intValue() > 0) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f120299d.f118084y0;
            androidx.recyclerview.widget.f2 adapter = wxRecyclerView != null ? wxRecyclerView.getAdapter() : null;
            bm2.m mVar = adapter instanceof bm2.m ? (bm2.m) adapter : null;
            if (mVar != null) {
                mVar.b(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
