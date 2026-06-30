package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes5.dex */
public final class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.shake.s f150962d;

    /* renamed from: e, reason: collision with root package name */
    public final int f150963e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f150964f;

    /* renamed from: g, reason: collision with root package name */
    public int f150965g;

    public t(com.tencent.mm.plugin.mv.ui.shake.s itemClickListener, int i17) {
        kotlin.jvm.internal.o.g(itemClickListener, "itemClickListener");
        this.f150962d = itemClickListener;
        this.f150963e = i17;
        this.f150964f = new java.util.ArrayList();
        this.f150965g = -1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f150964f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.mv.ui.shake.r holder = (com.tencent.mm.plugin.mv.ui.shake.r) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f150964f;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(i17);
        android.widget.TextView textView = holder.f150961d;
        textView.setText(charSequence);
        textView.setContentDescription((java.lang.CharSequence) arrayList.get(i17));
        if (i17 == this.f150965g && this.f150963e == 1) {
            textView.setTextColor(-16777216);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (this.f150963e == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cmr, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new com.tencent.mm.plugin.mv.ui.shake.r(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cmq, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new com.tencent.mm.plugin.mv.ui.shake.r(this, inflate2);
    }
}
