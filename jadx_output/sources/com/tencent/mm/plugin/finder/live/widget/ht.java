package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public abstract class ht extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f118598d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f118599e;

    public ht(java.util.List options, yz5.l onOptionSelected) {
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(onOptionSelected, "onOptionSelected");
        this.f118598d = options;
        this.f118599e = onOptionSelected;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f118598d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ebl, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.jt(inflate);
    }

    public abstract java.util.Set x();
}
