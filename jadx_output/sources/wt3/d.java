package wt3;

/* loaded from: classes5.dex */
public final class d extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.e f449389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wt3.e eVar, android.os.Looper looper) {
        super(looper);
        this.f449389a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        wt3.e eVar = this.f449389a;
        if (i17 == 0) {
            eVar.k();
            if (eVar.f449398g) {
                eVar.f449403l.obtainMessage(1).sendToTarget();
                return;
            }
            return;
        }
        if (i17 == 1) {
            eVar.j(true);
        } else {
            if (i17 != 2) {
                return;
            }
            eVar.j(false);
        }
    }
}
