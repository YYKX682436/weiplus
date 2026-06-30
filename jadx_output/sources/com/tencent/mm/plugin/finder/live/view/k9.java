package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class k9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f116443d = finderLiveProductRecordView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup root;
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116443d;
        root = finderLiveProductRecordView.getRoot();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.fhg);
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.j9(finderLiveProductRecordView));
        return viewGroup;
    }
}
