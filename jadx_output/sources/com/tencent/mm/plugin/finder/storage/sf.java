package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sf f127546d = new com.tencent.mm.plugin.finder.storage.sf();

    public sf() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("wifi");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return jz5.f0.f302826a;
    }
}
