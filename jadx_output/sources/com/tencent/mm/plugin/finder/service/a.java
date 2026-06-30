package com.tencent.mm.plugin.finder.service;

/* loaded from: classes8.dex */
public final class a implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.b f125995d;

    public a(com.tencent.mm.plugin.finder.service.b bVar) {
        this.f125995d = bVar;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.finder.service.b bVar = this.f125995d;
        bVar.f126003a = f17;
        bVar.f126004b = f18;
        return false;
    }
}
