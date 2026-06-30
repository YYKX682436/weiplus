package p72;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f352489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f352491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p72.k f352493h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.util.List list, int i17, int i18, java.lang.String str, p72.k kVar) {
        super(0);
        this.f352489d = list;
        this.f352490e = i17;
        this.f352491f = i18;
        this.f352492g = str;
        this.f352493h = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfo() called with: items = ");
        java.util.List list = this.f352489d;
        sb6.append(list.size());
        sb6.append(", delType = ");
        int i17 = this.f352490e;
        sb6.append(i17);
        sb6.append(", delFlag = ");
        int i18 = this.f352491f;
        sb6.append(i18);
        sb6.append(", callMsg = ");
        java.lang.String str = this.f352492g;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", sb6.toString());
        p72.k kVar = this.f352493h;
        kVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kVar.d((o72.r2) it.next(), str, i17, i18);
        }
        return jz5.f0.f302826a;
    }
}
