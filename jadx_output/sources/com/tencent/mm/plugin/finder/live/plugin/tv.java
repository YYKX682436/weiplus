package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f114478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(com.tencent.mm.plugin.finder.live.plugin.ow owVar, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f114478d = owVar;
        this.f114479e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f114478d;
        java.lang.String str = owVar.f113787p;
        android.widget.FrameLayout A1 = owVar.A1();
        kotlin.jvm.internal.h0 h0Var = this.f114479e;
        A1.removeView((android.view.View) h0Var.f310123d);
        ((android.widget.ImageView) h0Var.f310123d).setImageBitmap(null);
        return java.lang.Boolean.valueOf(owVar.Z.offer(h0Var.f310123d));
    }
}
