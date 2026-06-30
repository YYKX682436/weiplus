package nw4;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.n f341007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(nw4.n nVar, android.os.Looper looper) {
        super(looper);
        this.f341007a = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            java.util.Objects.toString(message.obj);
        } else {
            java.lang.String str = (java.lang.String) message.obj;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            nw4.n nVar = this.f341007a;
            if (!K0) {
                ((java.util.LinkedList) nVar.f340890d).add(str);
            }
            nw4.n.h(nVar);
        }
    }
}
