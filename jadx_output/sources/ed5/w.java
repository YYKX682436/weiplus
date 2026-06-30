package ed5;

/* loaded from: classes10.dex */
public final class w extends eh5.y {

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.history.groups.g f251399s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView f251400t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.l f251401u;

    /* renamed from: v, reason: collision with root package name */
    public final int f251402v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.ui.chatting.history.groups.g defaultType, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView actionBarView, yz5.l onOptionSelectedListener) {
        super(actionBarView);
        kotlin.jvm.internal.o.g(defaultType, "defaultType");
        kotlin.jvm.internal.o.g(actionBarView, "actionBarView");
        kotlin.jvm.internal.o.g(onOptionSelectedListener, "onOptionSelectedListener");
        this.f251399s = defaultType;
        this.f251400t = actionBarView;
        this.f251401u = onOptionSelectedListener;
        this.f251402v = com.tencent.mm.R.color.f478489a;
    }

    public final int F(float f17) {
        return a06.d.b(getContext().getResources().getDisplayMetrics().density * f17);
    }
}
