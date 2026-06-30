package il0;

/* loaded from: classes7.dex */
public class d extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_6d2cb220";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackFailAsync(j17, i17, i18, str, str2, i19, rVar);
        com.tencent.mars.xlog.Log.e("Kara.DiscoveryReddotEnv.UDRResource", "download fail. projectId:%s, name:%s, version:%s, type:%s, errNo:%d, errCode:%d", str, str2, java.lang.Integer.valueOf(i19), rVar.name(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackSuccessAsync(long j17, java.lang.String str, java.lang.String str2, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super.onCallBackSuccessAsync(j17, str, str2, i17, rVar);
        com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotEnv.UDRResource", "download success. projectId:%s, name:%s, version:%s, type:%s", str, str2, java.lang.Integer.valueOf(i17), rVar.name());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x xVar) {
        super.postProcessAsync(j17, xVar);
        com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotEnv.UDRResource", "project_id:%s, name:%s, size:%s", xVar.d(), xVar.getName(), java.lang.String.valueOf(xVar.f217593h));
        il0.e.f292009f.f();
    }
}
