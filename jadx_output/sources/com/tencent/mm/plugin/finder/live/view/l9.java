package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class l9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView f116462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView) {
        super(0);
        this.f116462d = finderLiveProductRecordView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView finderLiveProductRecordView = this.f116462d;
        android.content.Context context = finderLiveProductRecordView.f116075f;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.axi, finderLiveProductRecordView);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.view.ViewGroup) inflate).findViewById(com.tencent.mm.R.id.fhi);
        kotlin.jvm.internal.o.d(viewGroup);
        viewGroup.post(new d92.b(new d92.c(viewGroup, true)));
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.s27)).setTextSize(1, 14.0f);
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.fhh)).setTextSize(1, 14.0f);
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.tns)).setTextSize(1, 14.0f);
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.fhe)).setTextSize(1, 14.0f);
        return viewGroup;
    }
}
