package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class yu extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dv f120473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(com.tencent.mm.plugin.finder.live.widget.dv dvVar) {
        super(1);
        this.f120473d = dvVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.widget.dv dvVar = this.f120473d;
        androidx.recyclerview.widget.f2 adapter = dvVar.f118152e.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSongRvWidget", "firstVisiblePosition " + intValue + " datalist size " + itemCount + " reverse continue flag " + dvVar.f118161n + " loadingHistory " + dvVar.f118159l);
            if (dvVar.f118161n > 0 && itemCount != 0 && intValue <= 0 && !dvVar.f118159l && (y0Var = dvVar.f118150c) != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.zu(dvVar, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
