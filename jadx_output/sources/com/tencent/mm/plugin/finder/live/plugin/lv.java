package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lv extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer f113438p;

    /* renamed from: q, reason: collision with root package name */
    public int f113439q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer container, qo0.c statusMonitor) {
        super(container, statusMonitor, null);
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113438p = container;
        container.addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.live.plugin.jv(this));
        if (x0()) {
            if (zl2.r4.f473950a.v1(container)) {
                container.setTranslationX(0.0f);
            } else {
                container.setTranslationX(r4.y0(this) - ((int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl)));
            }
        }
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        this.f113439q = micUserMap.size();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.kv(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }
}
