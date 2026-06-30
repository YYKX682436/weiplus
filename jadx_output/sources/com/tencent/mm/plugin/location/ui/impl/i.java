package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes10.dex */
public final class i implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mapsdk.raster.model.IndoorLevel f144828d;

    public i(com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker, com.tencent.mapsdk.raster.model.IndoorLevel level) {
        kotlin.jvm.internal.o.g(level, "level");
        this.f144828d = level;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
