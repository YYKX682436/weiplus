package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wr implements iy2.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114991a;

    public wr(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f114991a = etVar;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "[onVoiceStart] start=" + z17);
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114991a;
        if (z17) {
            etVar.f112465z1 = true;
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(2, 12, null);
        }
        float f17 = z17 ? 0.3f : 1.0f;
        android.view.View view = etVar.f112458x;
        kotlin.jvm.internal.o.f(view, "access$getInputParent$p(...)");
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(view, new com.tencent.mm.plugin.finder.live.plugin.vr(etVar, f17));
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = etVar.N;
        android.view.ViewGroup viewGroup = mgVar != null ? mgVar.f365323d : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setAlpha(f17);
    }
}
