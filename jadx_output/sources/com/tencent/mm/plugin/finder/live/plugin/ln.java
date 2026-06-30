package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ln implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113417d;

    public ln(com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        this.f113417d = apVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object obj = it.obj;
        android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) this.f113417d.C).get(viewGroup);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preciousGiftBulletOutHandler: container:");
        sb6.append(viewGroup);
        sb6.append(", animator.isRunning:");
        sb6.append(valueAnimator != null ? java.lang.Boolean.valueOf(valueAnimator.isRunning()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return true;
        }
        valueAnimator.start();
        return true;
    }
}
