package kp4;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView f311118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.c1 f311119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView, kp4.c1 c1Var) {
        super(2);
        this.f311118d = editFrameListView;
        this.f311119e = c1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTrackInfo: ");
        sb6.append(longValue);
        sb6.append(", ");
        com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView = this.f311118d;
        rm5.k kVar = editFrameListView.f175996v;
        int i17 = 0;
        sb6.append(kVar != null ? kVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditFrameListView", sb6.toString());
        for (java.lang.Object obj3 : this.f311119e.f311077g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((kp4.m) obj3).f311124a == longValue && i17 >= 0) {
                java.util.LinkedList linkedList = editFrameListView.f175983f;
                if (i17 < linkedList.size()) {
                    linkedList.set(i17, bitmap);
                    editFrameListView.postInvalidate();
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
