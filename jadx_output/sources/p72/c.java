package p72;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f352475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f352477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p72.e f352479h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List list, int i17, int i18, java.lang.String str, p72.e eVar) {
        super(0);
        this.f352475d = list;
        this.f352476e = i17;
        this.f352477f = i18;
        this.f352478g = str;
        this.f352479h = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfo() called with: items = ");
        java.util.List list = this.f352475d;
        sb6.append(list.size());
        sb6.append(", delType = ");
        int i17 = this.f352476e;
        sb6.append(i17);
        sb6.append(", delFlag = ");
        int i18 = this.f352477f;
        sb6.append(i18);
        sb6.append(", callMsg = ");
        java.lang.String str = this.f352478g;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", sb6.toString());
        p72.e eVar = this.f352479h;
        eVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            eVar.d((o72.r2) it.next(), str, i17, i18);
        }
        return jz5.f0.f302826a;
    }
}
