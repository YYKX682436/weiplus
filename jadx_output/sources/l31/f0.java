package l31;

/* loaded from: classes9.dex */
public final class f0 extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public e31.l f315341e;

    /* renamed from: f, reason: collision with root package name */
    public e31.l f315342f;

    /* renamed from: g, reason: collision with root package name */
    public final k31.a f315343g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f315344h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f315345i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f315346j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f315347k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f315348l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData f315349m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f315350n;

    /* renamed from: o, reason: collision with root package name */
    public f31.f f315351o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(e31.o r5, k31.a r6, e31.l r7) {
        /*
            r4 = this;
            java.lang.String r0 = "updateRequest"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = r5.f247089a
            java.lang.String r1 = "bizUsername"
            kotlin.jvm.internal.o.g(r0, r1)
            r4.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f315344h = r0
            java.lang.String r1 = ""
            r4.f315345i = r1
            r2 = 1
            byte[] r2 = new byte[r2]
            r3 = 0
            r2[r3] = r3
            r4.f315348l = r2
            r4.f315350n = r1
            r4.f315343g = r6
            java.lang.String r6 = r5.f247090b
            r4.f315345i = r6
            java.util.List r6 = r5.f247091c
            r0.addAll(r6)
            e31.l r6 = r5.f247097i
            r4.f315341e = r6
            r4.f315342f = r7
            boolean r6 = r5.f247092d
            r4.f315346j = r6
            byte[] r6 = r5.f247093e
            r4.f315348l = r6
            com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData r6 = r5.f247094f
            r4.f315349m = r6
            java.lang.String r6 = r5.f247095g
            r4.f315350n = r6
            boolean r5 = r5.f247096h
            r4.f315347k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l31.f0.<init>(e31.o, k31.a, e31.l):void");
    }

    @Override // l31.b
    public void a() {
        this.f315316d = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        f31.f fVar = this.f315351o;
        objArr[0] = fVar != null ? java.lang.Integer.valueOf(fVar.hashCode()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList cancel task: %s", objArr);
        this.f315341e = null;
        this.f315342f = null;
        f31.b.f259269a.b(this.f315351o);
    }

    @Override // l31.b
    public java.lang.String b() {
        return (this.f315313a.length() > 0 ? this.f315313a : this.f315345i) + ",1";
    }

    @Override // l31.u
    public void run() {
        f31.f c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList %s, isOpened: %b", this.f315313a, java.lang.Boolean.valueOf(this.f315346j));
        l31.e0 e0Var = new l31.e0(this);
        boolean z17 = this.f315347k;
        java.util.List templates = this.f315344h;
        f31.c cVar = f31.d.f259271a;
        if (z17) {
            c17 = cVar.b(this.f315313a, this.f315345i, templates, this.f315350n, e0Var, this.f315346j, this.f315348l, this.f315349m);
        } else {
            java.lang.String username = this.f315313a;
            boolean z18 = this.f315346j;
            kotlin.jvm.internal.o.g(username, "username");
            java.lang.String appId = this.f315345i;
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(templates, "templates");
            c17 = cVar.c(username, appId, z18, e0Var, templates, 1, new byte[0], (r22 & 128) != 0 ? null : null, (r22 & 256) != 0 ? "" : null);
        }
        this.f315351o = c17;
        c(c17);
    }
}
