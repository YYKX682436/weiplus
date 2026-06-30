package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public class c3 extends y9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f131747a;

    public c3(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f131747a = e3Var;
    }

    @Override // y9.c
    public void a(android.view.View view, float f17) {
    }

    @Override // y9.c
    public void b(android.view.View view, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged ");
        sb6.append(i17);
        sb6.append(", isShowing:");
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f131747a;
        sb6.append(e3Var.f131957d.isShowing());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderBottomSheet", sb6.toString());
        if (i17 == 4 && e3Var.d() && e3Var.f131957d.isShowing()) {
            e3Var.h();
        }
    }
}
