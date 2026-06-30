package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class m1 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.p1 f151898d;

    public m1(com.tencent.mm.plugin.mv.ui.view.p1 commentItemData) {
        kotlin.jvm.internal.o.g(commentItemData, "commentItemData");
        this.f151898d = commentItemData;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f151898d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 2;
    }
}
