package com.tencent.mm.plugin.magicbrush.core.event;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.magicbrush.core.event.d f147897d = new com.tencent.mm.plugin.magicbrush.core.event.d();

    public d() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String eventName = (java.lang.String) obj;
        java.lang.String data = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193059g, new com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand(eventName, data), com.tencent.mm.plugin.magicbrush.core.event.c.class, null);
        return jz5.f0.f302826a;
    }
}
