package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gx extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f112739a;

    public gx(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f112739a = tyVar;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f112739a;
        tyVar.H.getLocationInWindow(iArr2);
        int i18 = iArr2[1];
        int max = java.lang.Math.max(0, (tyVar.f114499y0 + i18) - i17);
        outline.setRect(0, max, view.getWidth(), view.getHeight());
        com.tencent.mars.xlog.Log.i(tyVar.f114488q, "getOutline height:" + max + " yInWindow " + i17 + "  contentYInWindow " + i18);
    }
}
