package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class w5 extends com.tencent.mm.ui.tools.n5 {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f210874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMGestureGallery f210875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery) {
        super(mMGestureGallery);
        this.f210875c = mMGestureGallery;
        this.f210874b = new float[9];
    }

    @Override // com.tencent.mm.ui.tools.n5
    public void a() {
        this.f210875c.L.post(new com.tencent.mm.ui.tools.v5(this));
    }
}
