package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes2.dex */
public final class e implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.eb1 f129658d;

    public e(r45.eb1 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f129658d = info;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.tencent.mm.plugin.finder.ui.promotion.e.class.getName().hashCode();
    }
}
