package ju3;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout f301859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout appBrandRecordPluginLayout) {
        super(0);
        this.f301859d = appBrandRecordPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout appBrandRecordPluginLayout = this.f301859d;
        com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView mMSightTopCountdownCoverView = (com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView) appBrandRecordPluginLayout.findViewById(com.tencent.mm.R.id.ofi);
        if (com.tencent.mm.ui.bk.u(appBrandRecordPluginLayout.getContext(), false)) {
            android.view.ViewGroup.LayoutParams layoutParams = mMSightTopCountdownCoverView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = com.tencent.mm.ui.bk.p(appBrandRecordPluginLayout.getContext()) + appBrandRecordPluginLayout.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480569a62);
            mMSightTopCountdownCoverView.setLayoutParams(layoutParams2);
        }
        return mMSightTopCountdownCoverView;
    }
}
