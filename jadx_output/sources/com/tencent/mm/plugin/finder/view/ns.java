package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ns extends com.tencent.mm.plugin.finder.view.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f132751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SimpleTouchableLayout f132752e;

    public ns(com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout) {
        this.f132752e = simpleTouchableLayout;
        this.f132751d = new java.lang.ref.WeakReference(simpleTouchableLayout);
    }

    @Override // com.tencent.mm.plugin.finder.view.x0
    public void onLongPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.Object obj = this.f132751d.get();
        com.tencent.mm.plugin.finder.view.is onSimultaneouslyLongPressListener = this.f132752e.getOnSimultaneouslyLongPressListener();
        if (obj == null || onSimultaneouslyLongPressListener == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) obj;
        simpleTouchableLayout.f131581h = true;
        onSimultaneouslyLongPressListener.b(simpleTouchableLayout, e17);
    }
}
