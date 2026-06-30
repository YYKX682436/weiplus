package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class b9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116210a;

    public b9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        this.f116210a = finderLiveProductRecordView;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView;
        mm2.i7 i7Var;
        if (!z17 || (i7Var = (finderLiveProductRecordView = this.f116210a).f116077h) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView.c(finderLiveProductRecordView, 107, i7Var, new com.tencent.mm.plugin.finder.live.view.a9(finderLiveProductRecordView, i7Var));
    }
}
