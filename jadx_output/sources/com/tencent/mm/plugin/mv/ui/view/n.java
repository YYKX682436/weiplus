package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.FrameListView2 f151904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.a f151905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2, kp4.a aVar) {
        super(2);
        this.f151904d = frameListView2;
        this.f151905e = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2 = this.f151904d;
        java.lang.String str = frameListView2.f151597d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTrackInfo: ");
        sb6.append(longValue);
        sb6.append(", ");
        rm5.k kVar = frameListView2.f151610t;
        int i17 = 0;
        sb6.append(kVar != null ? kVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        for (java.lang.Object obj3 : this.f151905e.f311077g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((kp4.m) obj3).f311124a == longValue && i17 >= 0) {
                java.util.LinkedList linkedList = frameListView2.f151600g;
                if (i17 < linkedList.size()) {
                    linkedList.set(i17, bitmap);
                    frameListView2.postInvalidate();
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
