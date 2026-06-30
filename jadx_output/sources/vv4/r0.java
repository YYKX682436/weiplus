package vv4;

/* loaded from: classes3.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI) {
        super(0);
        this.f440494d = webSearchImageLoadingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440494d;
        ((com.tencent.mm.plugin.gif.MMAnimateView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.im6)).setVisibility(8);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.iml)).setVisibility(8);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dhn)).setVisibility(0);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dhe)).setVisibility(0);
        return jz5.f0.f302826a;
    }
}
