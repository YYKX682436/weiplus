package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class dw {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f168212a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f168213b;

    public dw(android.view.View itemView) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f168212a = itemView.findViewById(com.tencent.mm.R.id.ng_);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) itemView.findViewById(com.tencent.mm.R.id.n08);
        this.f168213b = recyclerView;
        recyclerView.N(new sb4.b());
    }

    public final android.view.View a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentView", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentView", "com.tencent.mm.plugin.sns.ui.StarSlotViewHolder");
        return this.f168212a;
    }
}
