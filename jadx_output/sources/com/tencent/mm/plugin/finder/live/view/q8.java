package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f116606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(java.lang.String str, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView) {
        super(0);
        this.f116605d = str;
        this.f116606e = mMRoundCornerImageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f116605d;
        android.graphics.Bitmap K = com.tencent.mm.sdk.platformtools.x.K(str);
        if (K != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.view.p8(this.f116606e, K));
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveProductRecordPlayWidget", "decode bitmap failed: " + str);
        }
        return jz5.f0.f302826a;
    }
}
