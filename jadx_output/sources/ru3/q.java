package ru3;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout f399769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout) {
        super(0);
        this.f399769d = wxCropOperationLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf((int) (this.f399769d.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv) * 1.2f));
    }
}
