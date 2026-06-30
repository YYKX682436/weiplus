package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class co extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.co f112181d = new com.tencent.mm.plugin.finder.live.plugin.co();

    public co() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(((com.tencent.mm.plugin.finder.live.plugin.tn) it.getValue()).f114437d.get() && ((com.tencent.mm.plugin.finder.live.plugin.tn) it.getValue()).f114439f.get());
    }
}
