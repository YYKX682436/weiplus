package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f143699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.util.List list) {
        super(1);
        this.f143699d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!(str == null || str.length() == 0)) {
            this.f143699d.add(str);
        }
        return jz5.f0.f302826a;
    }
}
