package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class po extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tn f113925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(com.tencent.mm.plugin.finder.live.plugin.ap apVar, com.tencent.mm.plugin.finder.live.plugin.tn tnVar) {
        super(0);
        this.f113924d = apVar;
        this.f113925e = tnVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113924d.B).get(this.f113925e.f114434a);
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        return jz5.f0.f302826a;
    }
}
