package pk2;

/* loaded from: classes3.dex */
public final class m9 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f356017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f356018c;

    public m9(pk2.o9 o9Var, yz5.p pVar, long j17) {
        this.f356016a = o9Var;
        this.f356017b = pVar;
        this.f356018c = j17;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f356016a;
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(this.f356018c);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "[modifyAnchorStatusFlagLong] onFail: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        yz5.p pVar = this.f356017b;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, null);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f356016a;
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).Z9(j17);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "[modifyAnchorStatusFlagLong] onSuccess: anchorStatus=" + j17);
        yz5.p pVar = this.f356017b;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, cv2Var);
        }
    }
}
