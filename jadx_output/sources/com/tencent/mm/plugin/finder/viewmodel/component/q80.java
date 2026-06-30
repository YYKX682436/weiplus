package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q80 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f135674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy) {
        super(1);
        this.f135674d = finderThumbPlayerProxy;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da view = (cw2.da) obj;
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View videoView = view.getVideoView();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f135674d;
        return java.lang.Boolean.valueOf(finderThumbPlayerProxy == null || !kotlin.jvm.internal.o.b(videoView, finderThumbPlayerProxy));
    }
}
