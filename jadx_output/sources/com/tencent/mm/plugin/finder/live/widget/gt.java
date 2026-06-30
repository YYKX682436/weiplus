package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class gt extends com.tencent.mm.plugin.finder.live.widget.ht {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f118477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(java.util.List options, yz5.l onOptionSelected) {
        super(options, onOptionSelected);
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(onOptionSelected, "onOptionSelected");
        this.f118477f = new java.util.HashSet();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.jt holder = (com.tencent.mm.plugin.finder.live.widget.jt) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        dk2.ic icVar = (dk2.ic) this.f118598d.get(i17);
        java.lang.String str = icVar.f233623b;
        android.widget.CheckBox checkBox = holder.f118774d;
        checkBox.setText(str);
        checkBox.setChecked(((java.util.HashSet) this.f118477f).contains(icVar.f233622a));
        checkBox.setTag(icVar);
        checkBox.setOnCheckedChangeListener(new com.tencent.mm.plugin.finder.live.widget.ft(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.ht
    public java.util.Set x() {
        return this.f118477f;
    }
}
