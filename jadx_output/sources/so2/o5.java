package so2;

/* loaded from: classes8.dex */
public final class o5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f410530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.k5 f410531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f410533g;

    public o5(so2.w5 w5Var, so2.k5 k5Var, java.lang.String str, int i17) {
        this.f410530d = w5Var;
        this.f410531e = k5Var;
        this.f410532f = str;
        this.f410533g = i17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.SetProfileCoverViewModel", "onModifyResult, retCode: " + ret.getInteger(1) + " retMsg:" + ret.getString(2));
        kotlinx.coroutines.l.c(this.f410530d.getMainScope(), oz5.m.f350329d, kotlinx.coroutines.a1.DEFAULT, new so2.n5(this.f410531e, this.f410532f, this.f410533g, ret, null));
    }
}
