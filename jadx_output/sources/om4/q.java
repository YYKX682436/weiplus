package om4;

/* loaded from: classes15.dex */
public class q extends com.tencent.mm.sdk.platformtools.n3 {
    public q(om4.t tVar, java.lang.String str) {
        super(str);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 0) {
            return;
        }
        ((om4.s) message.obj).run();
    }
}
