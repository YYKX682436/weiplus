package tz2;

/* loaded from: classes14.dex */
public class a implements com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser f423258a;

    public a(tz2.e eVar, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f423258a = iYtSDKKitNetResponseParser;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser
    public void onNetworkResponseEvent(java.util.HashMap hashMap, java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "onNetworkRequestEvent  result:%s", hashMap);
        this.f423258a.onNetworkResponseEvent(hashMap, exc);
    }
}
