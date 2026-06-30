package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes10.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker f144822e;

    public h(com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker) {
        this.f144822e = customIndoorPicker;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.a3f;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.location.ui.impl.i indoorLevelItem = (com.tencent.mm.plugin.location.ui.impl.i) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(indoorLevelItem, "indoorLevelItem");
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button = (android.widget.Button) view;
        com.tencent.mapsdk.raster.model.IndoorLevel indoorLevel = indoorLevelItem.f144828d;
        button.setText(indoorLevel.getName());
        com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
        if (indoorLevel.getName().equals(this.f144822e.f144698o2)) {
            button.setBackgroundResource(com.tencent.mm.R.drawable.f481337qu);
            button.setTextColor(button.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
        } else {
            button.setBackground(null);
            button.setTextColor(button.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
