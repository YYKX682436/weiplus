package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class y8 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f116831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f116832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f116833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f116834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116835h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116836i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(kotlinx.coroutines.r2 r2Var, kotlin.jvm.internal.h0 h0Var, yz5.p pVar, long j17, com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView, int i17) {
        super(3);
        this.f116831d = r2Var;
        this.f116832e = h0Var;
        this.f116833f = pVar;
        this.f116834g = j17;
        this.f116835h = finderLiveProductRecordView;
        this.f116836i = i17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g((r45.o12) obj3, "<anonymous parameter 2>");
        kotlinx.coroutines.p2.a(this.f116831d, null, 1, null);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f116832e.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f116833f.invoke(java.lang.Boolean.valueOf(booleanValue), java.lang.Long.valueOf(this.f116834g));
        if (!booleanValue) {
            if (!(errMsg.length() > 0)) {
                errMsg = null;
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116835h;
            if (errMsg == null) {
                int i17 = this.f116836i;
                switch (i17) {
                    case 105:
                        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.e(finderLiveProductRecordView, com.tencent.mm.R.string.e6t);
                        break;
                    case 106:
                        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.e(finderLiveProductRecordView, com.tencent.mm.R.string.e6u);
                        break;
                    case 107:
                        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.e(finderLiveProductRecordView, com.tencent.mm.R.string.e6r);
                        break;
                    default:
                        db5.t7.makeText(finderLiveProductRecordView.getContext(), "cmdId:" + i17 + " failed", 0);
                        break;
                }
            } else {
                int i18 = com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.f116072s;
                android.widget.Toast makeText = db5.t7.makeText(finderLiveProductRecordView.getContext(), errMsg, 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        }
        return jz5.f0.f302826a;
    }
}
