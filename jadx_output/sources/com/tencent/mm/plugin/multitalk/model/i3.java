package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f150002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.a0 f150003e;

    public i3(android.widget.ImageView imageView, com.tencent.mm.plugin.multitalk.model.a0 a0Var) {
        this.f150002d = imageView;
        this.f150003e = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        com.tencent.mm.plugin.multitalk.model.a0 a0Var = this.f150003e;
        ((com.tencent.mm.feature.avatar.w) zVar).Di(this.f150002d, a0Var.getF150344m());
        a0Var.b();
    }
}
