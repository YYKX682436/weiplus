package vx5;

/* loaded from: classes13.dex */
public class h0 extends com.tencent.xweb.pinus.sdk.WebView {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx5.i0 f441352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vx5.i0 i0Var, android.content.Context context) {
        super(context);
        this.f441352d = i0Var;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.tencent.xweb.WebView webView = this.f441352d.f441353d;
        if (webView != null) {
            webView.A0(i17, i18, i19, i27);
        }
    }
}
