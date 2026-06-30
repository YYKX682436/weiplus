package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class h1 implements db5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152143a;

    public h1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152143a = nearbySayHiListUI;
    }

    @Override // db5.e6
    public void a(java.lang.Object obj) {
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SayHiListUI", "onItemDel object null");
            return;
        }
        gm0.j1.b().c();
        ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).y0(obj.toString());
        this.f152143a.f152111e.f();
    }
}
