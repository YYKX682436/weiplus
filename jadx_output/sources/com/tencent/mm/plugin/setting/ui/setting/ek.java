package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class ek extends in5.r {
    public ek(com.tencent.mm.plugin.setting.ui.setting.hk hkVar) {
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bj7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.setting.ui.setting.ik data = (com.tencent.mm.plugin.setting.ui.setting.ik) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(data, "data");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.odf)).setText(data.f161160d);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.cut)).setText(data.f161161e);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.o7z)).setText(data.f161162f);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
