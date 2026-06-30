package pk2;

/* loaded from: classes3.dex */
public final class t0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f356257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f356258c;

    public t0(pk2.o9 o9Var, v65.n nVar, long j17) {
        this.f356256a = o9Var;
        this.f356257b = nVar;
        this.f356258c = j17;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f356256a;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "switchDesignedGift-callBack-onFail anchorStatus=" + j17 + ", errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(this.f356258c);
        this.f356257b.a(java.lang.Boolean.FALSE);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f356256a;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "switchDesignedGift-callBack-onSuccess anchorStatus=" + j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).Z9(j17);
        this.f356257b.a(java.lang.Boolean.TRUE);
    }
}
