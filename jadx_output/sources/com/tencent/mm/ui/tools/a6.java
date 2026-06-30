package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class a6 extends com.tencent.mm.ui.tools.n5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMGestureGallery f210272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery) {
        super(mMGestureGallery);
        this.f210272b = mMGestureGallery;
    }

    @Override // com.tencent.mm.ui.tools.n5
    public void a() {
        this.f210272b.L.post(new com.tencent.mm.ui.tools.z5(this));
    }
}
