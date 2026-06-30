package com.tencent.mm.udr;

/* loaded from: classes5.dex */
public final class r0 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f196507b;

    public r0(java.lang.String str, com.tencent.mm.ipcinvoker.r rVar) {
        this.f196506a = str;
        this.f196507b = rVar;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("UDRFeatureService", this.f196506a + " onCallBackFailAsync projectId:" + projectId + ", name:" + name);
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("state", "fail");
        bundle.putString("projectId", projectId);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name);
        bundle.putInt("errNo", i17);
        bundle.putInt("errCode", i18);
        bundle.putInt("version", i19);
        bundle.putLong("taskId", j17);
        bundle.putInt("type", type.f217558d);
        this.f196507b.a(bundle);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("UDRFeatureService", this.f196506a + " onCallBackSuccessAsync projectId:" + projectId + ", name:" + name);
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("state", ya.b.SUCCESS);
        bundle.putString("projectId", projectId);
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name);
        bundle.putInt("version", i17);
        bundle.putLong("taskId", j17);
        bundle.putInt("type", type.f217558d);
        this.f196507b.a(bundle);
    }
}
