package l31;

/* loaded from: classes9.dex */
public final class e extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final e31.l f315338e;

    /* renamed from: f, reason: collision with root package name */
    public final k31.a f315339f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String username, k31.a storageManager, e31.l lVar) {
        super(username);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        this.f315339f = storageManager;
        this.f315338e = lVar;
    }

    @Override // l31.u
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetAllSubscribeListTask", "getAllSubscribeStatus run");
        java.lang.String username = this.f315313a;
        l31.d dVar = new l31.d(this);
        kotlin.jvm.internal.o.g(username, "username");
        f31.f fVar = new f31.f(username, 3);
        fVar.f259277f = dVar;
        c(fVar);
    }
}
