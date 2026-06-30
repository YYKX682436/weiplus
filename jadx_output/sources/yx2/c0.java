package yx2;

/* loaded from: classes15.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview f467835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        super(3);
        this.f467835d = snsFinderVideoBackPreview;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        v94.k kVar;
        java.lang.String str;
        v94.i snsCoverReporter;
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview snsFinderVideoBackPreview = this.f467835d;
        thumbView = snsFinderVideoBackPreview.getThumbView();
        thumbView.setVisibility(8);
        kVar = snsFinderVideoBackPreview.snsCoverStatusProvider;
        if (kVar != null && (snsCoverReporter = kVar.getSnsCoverReporter()) != null) {
            ((ba4.a) snsCoverReporter).d();
        }
        str = snsFinderVideoBackPreview.TAG;
        com.tencent.mars.xlog.Log.i(str, "onFrameAvailable");
        return jz5.f0.f302826a;
    }
}
