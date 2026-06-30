package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class da0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f134097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(android.content.Context context) {
        super(1);
        this.f134097d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int r17 = it.getR();
        android.content.Context context = this.f134097d;
        if (r17 == (context != null ? context.hashCode() : -1)) {
            if (it.getIsViewFocused()) {
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = it instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) it : null;
                if ((finderThumbPlayerProxy == null || finderThumbPlayerProxy.getEnterSeekMode()) ? false : true) {
                    it.setIsShouldPlayResume(true);
                }
            }
            it.setVideoViewFocused(false);
            it.w();
        }
        return java.lang.Boolean.FALSE;
    }
}
