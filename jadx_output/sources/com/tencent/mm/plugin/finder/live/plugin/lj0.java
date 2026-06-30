package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lj0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f113404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.xj0 f113405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var) {
        super(0);
        this.f113404d = bitmap;
        this.f113405e = xj0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.xj0 xj0Var = this.f113405e;
        android.graphics.Bitmap bitmap = this.f113404d;
        if (bitmap != null) {
            xj0Var.f115092q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(xj0Var.f365323d.getContext().getResources(), bitmap));
            ((mm2.c1) xj0Var.P0(mm2.c1.class)).I4 = bitmap;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        xj0Var.K0(0);
        return jz5.f0.f302826a;
    }
}
