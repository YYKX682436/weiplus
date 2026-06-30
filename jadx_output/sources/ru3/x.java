package ru3;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout f399780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout) {
        super(0);
        this.f399780d = wxCropOperationLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout = this.f399780d;
        return new android.view.GestureDetector(wxCropOperationLayout.getContext(), wxCropOperationLayout);
    }
}
