package zn0;

/* loaded from: classes3.dex */
public class d0 extends com.tencent.trtc.TRTCCloudListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zn0.a0 f474329a;

    public d0(zn0.a0 a0Var) {
        this.f474329a = a0Var;
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStartPublishMediaStream(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
        super.onStartPublishMediaStream(str, i17, str2, bundle);
        zn0.s sVar = this.f474329a.f474321y;
        sVar.getClass();
        pm0.v.X(new zn0.p(str, i17, str2, sVar, bundle));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStopPublishMediaStream(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
        super.onStopPublishMediaStream(str, i17, str2, bundle);
        zn0.s sVar = this.f474329a.f474321y;
        sVar.getClass();
        pm0.v.X(new zn0.q(str, i17, str2, sVar, bundle));
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUpdatePublishMediaStream(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
        super.onUpdatePublishMediaStream(str, i17, str2, bundle);
        zn0.s sVar = this.f474329a.f474321y;
        sVar.getClass();
        pm0.v.X(new zn0.r(str, i17, str2, bundle, sVar));
    }
}
