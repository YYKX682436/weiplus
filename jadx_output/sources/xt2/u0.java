package xt2;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer f457036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer finderLiveShopPromoteContainer) {
        super(0);
        this.f457036d = finderLiveShopPromoteContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View productRecordPlayView;
        productRecordPlayView = this.f457036d.getProductRecordPlayView();
        android.widget.TextView textView = (android.widget.TextView) productRecordPlayView.findViewById(com.tencent.mm.R.id.rep);
        textView.setTextSize(2, 10.0f);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        return textView;
    }
}
