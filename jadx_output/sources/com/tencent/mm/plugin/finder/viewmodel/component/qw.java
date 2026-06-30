package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class qw implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135741d;

    public qw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f135741d = sxVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what != 7) {
            return true;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135741d;
        x91.h hVar = sxVar.f135941w;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Stopped;
        }
        if (hVar != null) {
            hVar.h();
        }
        x91.h hVar2 = sxVar.f135941w;
        if (hVar2 != null) {
            hVar2.i();
        }
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 == null) {
            return true;
        }
        hVar3.f452654h = null;
        return true;
    }
}
