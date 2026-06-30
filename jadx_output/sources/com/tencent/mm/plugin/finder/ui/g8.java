package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class g8 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f129290d;

    public g8(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f129290d = dataList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f129290d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.ui.h8 holder = (com.tencent.mm.plugin.finder.ui.h8) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cyf, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.ui.h8(inflate);
    }
}
