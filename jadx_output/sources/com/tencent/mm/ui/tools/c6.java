package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class c6 extends com.tencent.mm.ui.tools.n5 {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f210312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMGestureGallery f210313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery) {
        super(mMGestureGallery);
        this.f210313c = mMGestureGallery;
        this.f210312b = new float[9];
    }

    @Override // com.tencent.mm.ui.tools.n5
    public void a() {
        this.f210313c.L.post(new com.tencent.mm.ui.tools.b6(this));
    }
}
