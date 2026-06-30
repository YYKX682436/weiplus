package il0;

/* loaded from: classes8.dex */
public class g extends ea5.k {
    public g(il0.h hVar) {
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackFailAsync(j17, i17, i18, str, str2, i19, rVar);
        com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotPredict", "download fail. projectId:%s, name:%s, version:%s, errNo:%d, errCode:%d", str, str2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackSuccessAsync(j17, str, str2, i17, rVar);
        com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotPredict", "download success. projectId:%s, name:%s, version:%s", str, str2, java.lang.Integer.valueOf(i17));
    }
}
