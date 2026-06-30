package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class cx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118030d;

    public cx(com.tencent.mm.plugin.finder.live.widget.rx rxVar) {
        this.f118030d = rxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.rx rxVar = this.f118030d;
        androidx.recyclerview.widget.RecyclerView recyclerView = rxVar.M;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("cardRv");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.width = ((java.lang.Number) ((jz5.n) rxVar.W).getValue()).intValue();
        layoutParams.height = (int) ((r3 - (i65.a.h(rxVar.f118183e, com.tencent.mm.R.dimen.f479672c9) * 2)) * 0.88f);
        recyclerView.setLayoutParams(layoutParams);
    }
}
