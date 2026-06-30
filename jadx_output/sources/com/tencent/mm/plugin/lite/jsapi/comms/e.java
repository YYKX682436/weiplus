package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.i f143556d;

    public e(com.tencent.mm.plugin.lite.jsapi.comms.i iVar) {
        this.f143556d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.lite.jsapi.comms.i iVar = this.f143556d;
        iVar.f143606a.setVisibility(4);
        if (iVar.f143606a.getParent() != null) {
            iVar.f143606a.h();
            android.view.ViewParent parent = iVar.f143606a.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(iVar.f143606a);
        }
    }
}
