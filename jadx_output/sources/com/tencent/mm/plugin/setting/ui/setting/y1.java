package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public final class y1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f161771d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.z1 f161772e;

    public y1(java.util.ArrayList compositionList, com.tencent.mm.plugin.setting.ui.setting.z1 iRingtoneChooseCallback) {
        kotlin.jvm.internal.o.g(compositionList, "compositionList");
        kotlin.jvm.internal.o.g(iRingtoneChooseCallback, "iRingtoneChooseCallback");
        this.f161771d = compositionList;
        this.f161772e = iRingtoneChooseCallback;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f161771d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.setting.ui.setting.a2 viewHolderLongClick = (com.tencent.mm.plugin.setting.ui.setting.a2) k3Var;
        kotlin.jvm.internal.o.g(viewHolderLongClick, "viewHolderLongClick");
        java.lang.Object obj = this.f161771d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        ip.k kVar = (ip.k) obj;
        viewHolderLongClick.f160795g = kVar;
        viewHolderLongClick.f160793e.setText(kVar.f293572b);
        viewHolderLongClick.f160794f.setVisibility(viewHolderLongClick.f160792d.T5(kVar) ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.view.View inflate = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cln, viewGroup, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.setting.ui.setting.a2(inflate, this.f161772e);
    }
}
