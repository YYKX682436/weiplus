package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class e9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f116277d = finderLiveProductRecordView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup root;
        root = this.f116277d.getRoot();
        return root.findViewById(com.tencent.mm.R.id.fhf);
    }
}
