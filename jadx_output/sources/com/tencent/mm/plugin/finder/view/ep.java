package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class ep implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f132050d;

    public ep(int i17) {
        this.f132050d = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof com.tencent.mm.plugin.finder.view.ep) {
            return this.f132050d == ((com.tencent.mm.plugin.finder.view.ep) obj).f132050d ? 0 : 1;
        }
        return 1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f132050d;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
