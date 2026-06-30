package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class r7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f202643e;

    public r7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f202643e = chattingSendDataToDeviceUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ckd;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo item = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.h6y);
        boolean z18 = item.f66594o;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f202643e;
        if (z18) {
            imageView.setColorFilter(chattingSendDataToDeviceUI.P1, android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            imageView.setColorFilter((android.graphics.ColorFilter) null);
        }
        if (item.f66594o && kotlin.jvm.internal.o.b(item.f66586d, chattingSendDataToDeviceUI.Q1)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.c1n);
        } else {
            n11.a.b().h(item.f66589g, imageView, chattingSendDataToDeviceUI.f198245x1);
        }
        holder.p(com.tencent.mm.R.id.f485298h75).setOnClickListener(new com.tencent.mm.ui.chatting.q7(item, chattingSendDataToDeviceUI));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.k3s)).setText(item.f66588f);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
