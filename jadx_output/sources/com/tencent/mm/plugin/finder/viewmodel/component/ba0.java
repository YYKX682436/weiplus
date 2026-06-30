package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ba0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(yz5.l lVar) {
        super(1);
        this.f133862d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (((java.lang.Boolean) this.f133862d.invoke(it)).booleanValue()) {
            boolean z17 = it.getParentView() instanceof cw2.v9;
            boolean isPlaying = it.isPlaying();
            it.setVideoViewFocused(false);
            if (z17) {
                android.view.ViewParent parentView = it.getParentView();
                kotlin.jvm.internal.o.e(parentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.IFinderMediaViewLayout");
                cw2.v9.j((cw2.v9) parentView, false, 1, null);
            }
            if (isPlaying) {
                it.pause();
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
