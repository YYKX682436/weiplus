package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class a9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.i7 f116185e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView, mm2.i7 i7Var) {
        super(2);
        this.f116184d = finderLiveProductRecordView;
        this.f116185e = i7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.nt2 nt2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).longValue();
        if (booleanValue) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0 j0Var = (ml2.j0) c17;
            mm2.f6 f6Var = (mm2.f6) dk2.ef.f233372a.i(mm2.f6.class);
            ml2.j0.Qj(j0Var, 5, (f6Var == null || (nt2Var = f6Var.E) == null) ? 0 : nt2Var.getInteger(1), 0L, 0, 12, null);
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116184d;
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.d(finderLiveProductRecordView, this.f116185e, 4);
            db5.t7.i(finderLiveProductRecordView.getContext(), finderLiveProductRecordView.getContext().getString(com.tencent.mm.R.string.f491775e70), com.tencent.mm.R.raw.icons_filled_done);
        }
        return jz5.f0.f302826a;
    }
}
