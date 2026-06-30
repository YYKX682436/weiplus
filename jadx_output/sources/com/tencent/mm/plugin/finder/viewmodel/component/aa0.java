package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class aa0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f133761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(java.lang.String str, com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler) {
        super(1);
        this.f133760d = str;
        this.f133761e = finderVideoRecycler;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        cw2.wa f130607n = it.getF130607n();
        java.lang.String str = f130607n != null ? f130607n.f224096c : null;
        java.lang.String mediaId = this.f133760d;
        if (kotlin.jvm.internal.o.b(str, mediaId) && it.getIsViewFocused() && (it.getParentView() instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout)) {
            com.tencent.mars.xlog.Log.w("Finder.VideoRecycler", "[videoSourceChange] mediaId=" + mediaId + " isPlaying...");
            cw2.wa f130607n2 = it.getF130607n();
            com.tencent.mm.vfs.w6.h(f130607n2 != null ? f130607n2.f224095b : null);
            cu2.x xVar = cu2.x.f222449a;
            kotlin.jvm.internal.o.f(mediaId, "$mediaId");
            so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
            c17.reset();
            xVar.g(c17, "onlineVideoEventListener");
            this.f133761e.f133675h.post(new com.tencent.mm.plugin.finder.viewmodel.component.z90(it));
        }
        return java.lang.Boolean.FALSE;
    }
}
