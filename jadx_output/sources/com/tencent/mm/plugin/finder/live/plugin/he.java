package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class he extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(1);
        this.f112802d = mgVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View chatButton = (android.view.View) obj;
        kotlin.jvm.internal.o.g(chatButton, "chatButton");
        if (chatButton.getVisibility() == 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            bundle.putInt("PARAM_FINDER_LIVE_INPUT_SOURCE", 3);
            this.f112802d.f113503p.statusChange(qo0.b.W, bundle);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.vk((ml2.r0) c17, 2, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
