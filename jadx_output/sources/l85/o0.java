package l85;

/* loaded from: classes12.dex */
public final class o0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.service.MMIntentService f317201a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.service.MMIntentService mMIntentService, xu5.b bVar) {
        super(bVar);
        this.f317201a = mMIntentService;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        android.content.Intent intent = (android.content.Intent) message.obj;
        com.tencent.mm.service.MMIntentService mMIntentService = this.f317201a;
        mMIntentService.i(intent);
        int i17 = message.arg1;
        com.tencent.mars.xlog.Log.i(mMIntentService.b(), "%s stopSelf() startId = %d mStartId = %d", "MicroMsg.MMService", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mMIntentService.f193204d));
        if (i17 == mMIntentService.f193204d) {
            mMIntentService.a(new android.content.Intent(), "stop");
        }
    }
}
