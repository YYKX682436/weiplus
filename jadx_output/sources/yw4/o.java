package yw4;

/* loaded from: classes7.dex */
public final class o extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw4.q f466977a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yw4.q qVar, android.os.Looper looper) {
        super(looper);
        this.f466977a = qVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        yw4.q qVar = this.f466977a;
        if (qVar.f466982e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebPrefetcherJsApiHandler", "handleMsg destroyed and ignore");
            return;
        }
        int i17 = msg.what;
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 == 2) {
                java.util.Objects.toString(msg.obj);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                qVar.f466982e = true;
                return;
            }
        }
        java.lang.Object obj = msg.obj;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            ((java.util.ArrayList) qVar.f466983f).add(str);
        }
        yw4.q.b(qVar);
    }
}
