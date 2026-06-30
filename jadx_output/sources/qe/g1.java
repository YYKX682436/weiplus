package qe;

/* loaded from: classes7.dex */
public final class g1 implements com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener f361954a;

    public g1(com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener iWcWssReportListener, com.tencent.mm.plugin.appbrand.jsruntime.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f361954a = iWcWssReportListener;
        lifecycleOwner.r(new qe.e1(this));
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener
    public int getNetworkType() {
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener iWcWssReportListener = this.f361954a;
        if (iWcWssReportListener != null) {
            return iWcWssReportListener.getNetworkType();
        }
        return 0;
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener
    public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener iWcWssReportListener = this.f361954a;
        if (iWcWssReportListener != null) {
            iWcWssReportListener.onIdKeyStat(iArr, iArr2, iArr3);
        }
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener
    public void onKvStat(int i17, java.lang.String str) {
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener iWcWssReportListener = this.f361954a;
        if (iWcWssReportListener != null) {
            iWcWssReportListener.onKvStat(i17, str);
        }
    }
}
