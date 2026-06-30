package mc;

/* loaded from: classes14.dex */
public final /* synthetic */ class c$$a implements jc.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.cloud.huiyan.callback.HuiYanSdkCallBack f325513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325514b;

    public /* synthetic */ c$$a(com.tencent.cloud.huiyan.callback.HuiYanSdkCallBack huiYanSdkCallBack, java.lang.String str) {
        this.f325513a = huiYanSdkCallBack;
        this.f325514b = str;
    }

    public final void a(boolean z17, java.lang.String str) {
        com.tencent.cloud.huiyan.callback.HuiYanSdkCallBack huiYanSdkCallBack = this.f325513a;
        if (huiYanSdkCallBack != null) {
            huiYanSdkCallBack.onCompareSuccess(this.f325514b, str);
        } else {
            mc.p.f325531a.e("AuthStateManager", "sdk result cb is null.");
        }
    }
}
