package s50;

/* loaded from: classes8.dex */
public final class e1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(s50.l1 l1Var, android.os.Looper looper) {
        super(looper);
        this.f403044a = l1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (!(message != null && message.what == 101)) {
            if (!(message != null && message.what == 102)) {
                return;
            }
        }
        s50.l1 l1Var = this.f403044a;
        java.util.Objects.toString(l1Var.f403085i);
        if (l1Var.f403085i != s50.x0.f403140g) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMessage, what: ");
        sb6.append(message != null ? java.lang.Integer.valueOf(message.what) : null);
        sb6.append(", currVoiceStatus: ");
        sb6.append(l1Var.f403085i);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.VoiceSearchService", sb6.toString());
        l1Var.Bi();
    }
}
