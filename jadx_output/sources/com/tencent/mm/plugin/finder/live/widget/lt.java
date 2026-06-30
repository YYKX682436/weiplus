package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class lt extends com.tencent.mm.plugin.finder.live.widget.ht {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f118976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(java.util.List options, yz5.l onOptionSelected) {
        super(options, onOptionSelected);
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(onOptionSelected, "onOptionSelected");
        this.f118976f = "";
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.jt holder = (com.tencent.mm.plugin.finder.live.widget.jt) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        dk2.ic icVar = (dk2.ic) this.f118598d.get(i17);
        java.lang.String str = icVar.f233623b;
        android.widget.CheckBox checkBox = holder.f118774d;
        checkBox.setText(str);
        checkBox.setChecked(kotlin.jvm.internal.o.b(this.f118976f, icVar.f233622a));
        checkBox.setClickable(!checkBox.isChecked());
        checkBox.setTag(icVar);
        checkBox.setOnCheckedChangeListener(new com.tencent.mm.plugin.finder.live.widget.kt(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.ht
    public java.util.Set x() {
        return this.f118976f.length() == 0 ? kz5.r0.f314002d : kz5.o1.c(this.f118976f);
    }
}
