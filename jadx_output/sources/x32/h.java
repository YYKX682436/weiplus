package x32;

/* loaded from: classes5.dex */
public final class h extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_099f9dd6";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mars.xlog.Log.i("UdrLibWechatAccessoryFeatureService", "[postProcess] name: %s, md5: %s, path: %s", resource.getName(), resource.getMd5(), resource.getPath());
    }
}
