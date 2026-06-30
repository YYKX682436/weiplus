package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public abstract class m1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f113452d;

    public m1(java.util.ArrayList dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f113452d = dataList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f113452d.size();
    }
}
