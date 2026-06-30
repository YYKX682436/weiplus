package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class e6 extends com.tencent.mm.ui.tools.n5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMGestureGallery f210375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery) {
        super(mMGestureGallery);
        this.f210375b = mMGestureGallery;
    }

    @Override // com.tencent.mm.ui.tools.n5
    public void a() {
        this.f210375b.L.post(new com.tencent.mm.ui.tools.d6(this));
    }
}
