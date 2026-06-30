package p72;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f352480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f352482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p72.e f352484h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o72.r2 r2Var, int i17, int i18, java.lang.String str, p72.e eVar) {
        super(0);
        this.f352480d = r2Var;
        this.f352481e = i17;
        this.f352482f = i18;
        this.f352483g = str;
        this.f352484h = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfo() called with: itemid = ");
        o72.r2 r2Var = this.f352480d;
        sb6.append(r2Var.field_id);
        sb6.append(", delType = ");
        int i17 = this.f352481e;
        sb6.append(i17);
        sb6.append(", delFlag = ");
        int i18 = this.f352482f;
        sb6.append(i18);
        sb6.append(", callMsg = ");
        java.lang.String str = this.f352483g;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", sb6.toString());
        this.f352484h.d(r2Var, str, i17, i18);
        return jz5.f0.f302826a;
    }
}
