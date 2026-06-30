package d83;

/* loaded from: classes15.dex */
public final class b0 implements com.tencent.ilink.CloudSession.SendCloudCgiRequestEvent {

    /* renamed from: a, reason: collision with root package name */
    public static final d83.b0 f226952a = new d83.b0();

    @Override // com.tencent.ilink.CloudSession.SendCloudCgiRequestEvent
    public final void event(com.tencent.ilink.network.CloudCgiRequest cloudCgiRequest) {
        d83.e0 e0Var = d83.e0.f226958a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent");
        if (cloudCgiRequest == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent: req is null");
        }
        d83.e0.f226962e.put(java.lang.Integer.valueOf(cloudCgiRequest.getCloudTaskid()), kotlinx.coroutines.l.d(d83.e0.f226961d, null, null, new d83.a0(cloudCgiRequest, null), 3, null));
    }
}
