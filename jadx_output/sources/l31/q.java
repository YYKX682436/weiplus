package l31;

/* loaded from: classes9.dex */
public final class q extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public e31.l f315382e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315383f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f315384g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f315385h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f315386i;

    /* renamed from: j, reason: collision with root package name */
    public f31.f f315387j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String username, java.lang.String appId, java.lang.String subscribeUrl, java.util.List templateIdList, java.lang.String extInfo, k31.a aVar, e31.l lVar) {
        super(username);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(subscribeUrl, "subscribeUrl");
        kotlin.jvm.internal.o.g(templateIdList, "templateIdList");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f315383f = "";
        this.f315384g = "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f315385h = arrayList;
        this.f315386i = "";
        if (!(username.length() > 0)) {
            username = appId.length() > 0 ? appId : "";
        }
        this.f315313a = username;
        this.f315384g = appId;
        this.f315382e = lVar;
        this.f315383f = subscribeUrl;
        arrayList.addAll(templateIdList);
        this.f315386i = extInfo;
    }

    @Override // l31.b
    public void a() {
        this.f315316d = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        f31.f fVar = this.f315387j;
        objArr[0] = fVar != null ? java.lang.Integer.valueOf(fVar.hashCode()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetSubscribeMsgListForDialogTask", "getSubscribeMsgForDialogTask cancel task: %s", objArr);
        this.f315382e = null;
        f31.b.f259269a.b(this.f315387j);
    }

    @Override // l31.u
    public void run() {
        l31.p pVar = new l31.p(this);
        boolean z17 = this.f315384g.length() > 0;
        java.util.ArrayList arrayList = this.f315385h;
        f31.c cVar = f31.d.f259271a;
        f31.f a17 = z17 ? cVar.a("", this.f315384g, this.f315383f, arrayList, this.f315386i, pVar) : cVar.a(this.f315313a, "", this.f315383f, arrayList, this.f315386i, pVar);
        this.f315387j = a17;
        c(a17);
    }
}
