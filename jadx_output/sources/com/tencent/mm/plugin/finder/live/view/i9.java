package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.i7 f116383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(mm2.i7 i7Var, com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        super(2);
        this.f116383d = i7Var;
        this.f116384e = finderLiveProductRecordView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.nw1 nw1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).longValue();
        if (booleanValue) {
            r45.hd5 hd5Var = new r45.hd5();
            hd5Var.set(2, java.lang.Integer.valueOf(c01.id.e()));
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            hd5Var.set(0, java.lang.Long.valueOf((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0)));
            mm2.i7 i7Var = this.f116383d;
            i7Var.a(hd5Var);
            mm2.h5 h5Var = (mm2.h5) efVar.i(mm2.h5.class);
            if (h5Var != null) {
                h5Var.N6(i7Var);
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.d(this.f116384e, i7Var, 1000);
        }
        return jz5.f0.f302826a;
    }
}
