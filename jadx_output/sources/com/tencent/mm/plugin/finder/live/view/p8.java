package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class p8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f116585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f116586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f116585d = mMRoundCornerImageView;
        this.f116586e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f116585d.setImageBitmap(this.f116586e);
        return jz5.f0.f302826a;
    }
}
