package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vs extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f120086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120087e;

    public vs(com.tencent.mm.plugin.finder.live.widget.et etVar, android.content.Context context) {
        this.f120086d = etVar;
        this.f120087e = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList = this.f120086d.K;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0af3  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r49, int r50) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.vs.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f120087e).inflate(com.tencent.mm.R.layout.ebb, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.widget.rr(this.f120086d, inflate);
    }
}
