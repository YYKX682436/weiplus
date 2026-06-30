package e72;

/* loaded from: classes14.dex */
public class l extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e72.v f249918a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e72.v vVar, android.os.Looper looper) {
        super(looper);
        this.f249918a = vVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: refresh number");
        this.f249918a.o();
    }
}
