package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public final class p2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.mz2 f173102d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f173103e;

    public p2(com.tencent.mm.plugin.teenmode.ui.w2 w2Var, r45.mz2 visibleTagInfo) {
        kotlin.jvm.internal.o.g(visibleTagInfo, "visibleTagInfo");
        this.f173102d = visibleTagInfo;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f173102d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
