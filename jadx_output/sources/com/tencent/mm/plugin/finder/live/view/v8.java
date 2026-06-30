package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class v8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.i7 f116747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView, mm2.i7 i7Var) {
        super(2);
        this.f116746d = finderLiveProductRecordView;
        this.f116747e = i7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).longValue();
        if (booleanValue) {
            mm2.h5 h5Var = (mm2.h5) dk2.ef.f233372a.i(mm2.h5.class);
            if (h5Var != null) {
                h5Var.N6(null);
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.d(this.f116746d, this.f116747e, 0);
        }
        return jz5.f0.f302826a;
    }
}
