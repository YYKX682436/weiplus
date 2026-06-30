package com.tencent.mm.plugin.finder.service;

/* loaded from: classes5.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.service.k3 f126107d = new com.tencent.mm.plugin.finder.service.k3();

    public k3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        if (systemService instanceof android.os.PowerManager) {
            return (android.os.PowerManager) systemService;
        }
        return null;
    }
}
