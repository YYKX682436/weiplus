package l31;

/* loaded from: classes9.dex */
public final class a implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final f31.e f315310d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f315311e;

    public a(l31.b task, f31.e eVar, f31.f netScene) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(netScene, "netScene");
        this.f315310d = eVar;
        this.f315311e = new java.lang.ref.WeakReference(task);
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        l31.b bVar = (l31.b) this.f315311e.get();
        if (bVar != null) {
            k31.o.f303850a.a(bVar);
        }
        f31.e eVar = this.f315310d;
        if (eVar != null) {
            eVar.a(i17, i18, errMsg, subscribeMsgRequestResult);
        }
    }
}
