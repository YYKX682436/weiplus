package o31;

/* loaded from: classes9.dex */
public final class j implements f31.e, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public f31.e f342676d;

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        try {
            f31.e eVar = this.f342676d;
            if (eVar != null) {
                eVar.a(i17, i18, errMsg, subscribeMsgRequestResult);
            }
        } finally {
            this.f342676d = null;
        }
    }

    @Override // im5.a
    public void dead() {
        this.f342676d = null;
    }
}
