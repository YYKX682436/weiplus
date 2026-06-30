package i33;

/* loaded from: classes10.dex */
public final class a0 extends i33.c implements i33.l1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288144f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f288145g;

    /* renamed from: h, reason: collision with root package name */
    public int f288146h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f288147i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f288148m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f288149n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f288150o;

    /* renamed from: p, reason: collision with root package name */
    public v23.b f288151p;

    /* renamed from: q, reason: collision with root package name */
    public u23.e0 f288152q;

    /* renamed from: r, reason: collision with root package name */
    public u23.s f288153r;

    /* renamed from: s, reason: collision with root package name */
    public u23.n f288154s;

    /* renamed from: t, reason: collision with root package name */
    public final i33.x f288155t;

    /* renamed from: u, reason: collision with root package name */
    public final i33.w f288156u;

    /* renamed from: v, reason: collision with root package name */
    public final i33.y f288157v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288144f = "MicroMsg.AlbumQueryMediaUIC";
        this.f288146h = -1;
        this.f288149n = new java.util.ArrayList();
        this.f288150o = "";
        this.f288155t = new i33.x(this, activity);
        this.f288156u = new i33.w(this);
        this.f288157v = new i33.y(this);
    }

    public final v23.b W6(java.util.List list, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v23.b bVar = (v23.b) obj;
            if (kotlin.jvm.internal.o.b(bVar.f432886a, str) && (kotlin.jvm.internal.o.b(str2, "") || kotlin.jvm.internal.o.b(str2, bVar.f432888c))) {
                break;
            }
        }
        v23.b bVar2 = (v23.b) obj;
        return bVar2 == null ? (v23.b) list.get(0) : bVar2;
    }

    public final java.lang.String X6() {
        java.lang.String str;
        v23.b bVar = this.f288151p;
        return (bVar == null || (str = bVar.f432886a) == null) ? "" : str;
    }

    public void Y6(java.lang.String folderName, boolean z17, java.lang.String targetBucketId) {
        kotlin.jvm.internal.o.g(folderName, "folderName");
        kotlin.jvm.internal.o.g(targetBucketId, "targetBucketId");
        v23.b W6 = W6(this.f288149n, folderName, targetBucketId);
        yz5.a aVar = this.f288145g;
        e33.b0 b0Var = aVar != null ? (e33.b0) aVar.invoke() : null;
        java.lang.String str = this.f288144f;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.e(str, "switchFolderByName: adapter null");
            return;
        }
        if (z17) {
            this.f288151p = W6;
        }
        yz5.p pVar = this.f288148m;
        if (pVar != null) {
        }
        com.tencent.mars.xlog.Log.i(str, "switchFolderByName: " + W6.f432888c + ", targetBucketId=" + targetBucketId + ", media size=" + W6.f432887b.size());
    }
}
