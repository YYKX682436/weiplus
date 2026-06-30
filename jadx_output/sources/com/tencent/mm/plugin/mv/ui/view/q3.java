package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class q3 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.t3 f151927d;

    public q3(com.tencent.mm.plugin.mv.ui.view.t3 itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        this.f151927d = itemData;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f151927d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 3;
    }
}
