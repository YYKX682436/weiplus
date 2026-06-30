package vv4;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI f440480d;

    public n0(com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI) {
        this.f440480d = webSearchImageLoadingUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI webSearchImageLoadingUI = this.f440480d;
        ((com.tencent.mm.plugin.gif.MMAnimateView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.im6)).setVisibility(8);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.iml)).setVisibility(8);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dhe)).setVisibility(8);
        ((android.widget.TextView) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dkg)).setVisibility(0);
        ((android.widget.Button) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dkd)).setVisibility(0);
        ((android.widget.Button) webSearchImageLoadingUI.findViewById(com.tencent.mm.R.id.dkd)).setOnClickListener(new vv4.m0(webSearchImageLoadingUI));
    }
}
