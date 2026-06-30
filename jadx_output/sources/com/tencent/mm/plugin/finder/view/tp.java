package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class tp implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f133146d;

    public tp(int i17) {
        this.f133146d = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof com.tencent.mm.plugin.finder.view.tp) {
            return this.f133146d == ((com.tencent.mm.plugin.finder.view.tp) obj).f133146d ? 0 : 1;
        }
        return 1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f133146d;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
