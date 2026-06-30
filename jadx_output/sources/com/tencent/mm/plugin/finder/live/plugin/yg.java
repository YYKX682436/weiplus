package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yg extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ah f115194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(com.tencent.mm.plugin.finder.live.plugin.ah ahVar) {
        super(3);
        this.f115194d = ahVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.content.Context context = (android.content.Context) obj;
        android.content.Intent intent = (android.content.Intent) obj2;
        java.lang.Integer num = (java.lang.Integer) obj3;
        kotlin.jvm.internal.o.g(context, "context");
        dk2.xf W0 = this.f115194d.W0();
        if (W0 != null) {
            ((dk2.r4) W0).Y(context, intent, num);
        }
        return jz5.f0.f302826a;
    }
}
