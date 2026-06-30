package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f116802d = finderLiveProductRecordView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup root;
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116802d;
        root = finderLiveProductRecordView.getRoot();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.tnr);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.w8(finderLiveProductRecordView));
        return findViewById;
    }
}
