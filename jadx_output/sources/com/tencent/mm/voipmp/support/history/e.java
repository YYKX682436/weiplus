package com.tencent.mm.voipmp.support.history;

/* loaded from: classes8.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.voipmp.support.history.g f213764d;

    public e(com.tencent.mm.voipmp.support.history.g gVar) {
        this.f213764d = gVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        if (i17 >= 0 && i17 < wxRecyclerAdapter.getItemCount() - wxRecyclerAdapter.Z()) {
            this.f213764d.O6(i17, (com.tencent.mm.voipmp.support.history.a) wxRecyclerAdapter.getData().get(i17));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPHistoryData", "invalid position:" + i17);
        }
    }
}
