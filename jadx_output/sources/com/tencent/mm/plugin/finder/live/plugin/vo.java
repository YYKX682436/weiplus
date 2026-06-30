package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f114807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        super(0);
        this.f114807d = apVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f114807d;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) apVar.B).entrySet().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it.next()).getValue()).cancel();
        }
        java.util.Iterator it6 = ((java.util.concurrent.ConcurrentHashMap) apVar.C).entrySet().iterator();
        while (it6.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it6.next()).getValue()).cancel();
        }
        return jz5.f0.f302826a;
    }
}
