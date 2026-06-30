package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v5 f114086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.plugin.finder.live.plugin.v5 v5Var) {
        super(1);
        this.f114086d = v5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String licenseUrl = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(licenseUrl, "licenseUrl");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", licenseUrl);
        com.tencent.mm.plugin.finder.live.plugin.v5 v5Var = this.f114086d;
        dk2.xf W0 = v5Var.W0();
        if (W0 != null) {
            android.content.Context context = v5Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((dk2.r4) W0).Y(context, intent, null);
        }
        return jz5.f0.f302826a;
    }
}
