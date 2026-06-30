package vt2;

/* loaded from: classes3.dex */
public final class m implements ek2.n2 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f439979d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final long f439980a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.y23 f439981b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f439982c;

    public m(long j17, r45.y23 product, java.lang.ref.WeakReference rAdapter) {
        kotlin.jvm.internal.o.g(product, "product");
        kotlin.jvm.internal.o.g(rAdapter, "rAdapter");
        this.f439980a = j17;
        this.f439981b = product;
        this.f439982c = rAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ek2.n2
    public void a(ek2.o2 cgi, int i17, int i18, java.lang.String str, r45.zb2 resp) {
        java.util.LinkedList list;
        r45.z64 z64Var;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g(resp, "resp");
        r45.y23 y23Var = this.f439981b;
        vt2.l lVar = (vt2.l) f439979d.get(java.lang.Long.valueOf(y23Var.getLong(0)));
        if (lVar != null) {
            lVar.f439978d = false;
        }
        r45.yb2 yb2Var = cgi.f253513w;
        long j17 = yb2Var.getLong(6);
        long j18 = this.f439980a;
        if (j17 != j18) {
            com.tencent.mars.xlog.Log.w("ProductRefreshPresenter", "liveId not match: " + yb2Var.getLong(6) + " request liveId: " + j18);
            return;
        }
        if (i17 != 0 || i18 != 0 || resp.getList(1) == null || (list = resp.getList(1)) == null) {
            return;
        }
        for (r45.ij6 ij6Var : kz5.n0.V(list)) {
            if (ij6Var.getInteger(1) == 0 && ij6Var.getInteger(0) == 2 && ij6Var.getByteString(2) != null) {
                r45.yy2 yy2Var = new r45.yy2();
                com.tencent.mm.protobuf.g byteString = ij6Var.getByteString(2);
                byte[] g17 = byteString != null ? byteString.g() : null;
                if (g17 != null) {
                    try {
                        yy2Var.parseFrom(g17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                r45.y23 y23Var2 = (r45.y23) yy2Var.getCustom(0);
                if (y23Var2 != 0 && y23Var2.getLong(0) == y23Var.getLong(0)) {
                    tt2.e1 e1Var = (tt2.e1) this.f439982c.get();
                    if (e1Var == null) {
                        com.tencent.mars.xlog.Log.i("ProductRefreshPresenter", "refreshProduct suc,but adapter is null!");
                        return;
                    }
                    r45.w23 w23Var = (r45.w23) y23Var2.getCustom(77);
                    boolean z17 = (w23Var == null || (z64Var = (r45.z64) w23Var.getCustom(1)) == null || !z64Var.getBoolean(0)) ? false : true;
                    int i19 = z17 ? 12 : 5;
                    com.tencent.mars.xlog.Log.i("ProductRefreshPresenter", "refreshProduct price " + y23Var.getInteger(5) + " -> " + y23Var2.getInteger(5) + ", isLimitedSubsidy=" + z17 + ", payload=" + i19);
                    e1Var.U(1, y23Var2, java.lang.Integer.valueOf(i19));
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshProduct:");
                sb6.append(pm0.b0.b(y23Var2 != 0 ? y23Var2 : ""));
                com.tencent.mars.xlog.Log.i("ProductRefreshPresenter", sb6.toString());
            }
        }
    }
}
