package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class h9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mm2.i7 f116353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116354b;

    public h9(mm2.i7 i7Var, com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        this.f116353a = i7Var;
        this.f116354b = finderLiveProductRecordView;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            mm2.i7 i7Var = this.f116353a;
            r45.hd5 hd5Var = i7Var.f329148e;
            int integer = hd5Var != null ? hd5Var.getInteger(2) : 0;
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116354b;
            if (integer > 0) {
                long e17 = c01.id.e() - integer;
                int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.f116072s;
                if (e17 < 5) {
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ml2.j0.Qj((ml2.j0) c17, 7, 1, 0L, 0, 12, null);
                    com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.e(finderLiveProductRecordView, com.tencent.mm.R.string.e6v);
                    return;
                }
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.c(finderLiveProductRecordView, 106, i7Var, new com.tencent.mm.plugin.finder.live.view.g9(finderLiveProductRecordView, i7Var));
        }
    }
}
