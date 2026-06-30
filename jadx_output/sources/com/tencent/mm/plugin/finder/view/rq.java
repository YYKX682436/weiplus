package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class rq extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f132981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(boolean z17) {
        super(2);
        this.f132981d = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Boolean) obj2).booleanValue();
        if (booleanValue) {
            java.lang.String string = this.f132981d ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7p) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7n);
            kotlin.jvm.internal.o.d(string);
            db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, string);
        } else {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ecp);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, string2);
        }
        return jz5.f0.f302826a;
    }
}
