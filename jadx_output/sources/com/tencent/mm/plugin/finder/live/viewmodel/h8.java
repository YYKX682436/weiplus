package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class h8 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.z63 f117132d;

    public h8(r45.z63 switchInfo) {
        kotlin.jvm.internal.o.g(switchInfo, "switchInfo");
        this.f117132d = switchInfo;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f117132d.getString(0) != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return com.tencent.mm.plugin.finder.live.viewmodel.h8.class.hashCode();
    }
}
