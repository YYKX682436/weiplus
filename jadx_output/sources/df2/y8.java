package df2;

/* loaded from: classes3.dex */
public final class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f231850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a9 f231851e;

    public y8(boolean z17, df2.a9 a9Var) {
        this.f231850d = z17;
        this.f231851e = a9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        byte[] j17;
        df2.a9 a9Var = this.f231851e;
        try {
            if (this.f231850d && c01.id.e() - a9Var.a7().getInt(a9Var.f229692r, 0) < a9Var.f229693s) {
                com.tencent.mars.xlog.Log.i(a9Var.f229687m, "[saveRecordCache] to frequently， return");
                return;
            }
            r45.yb4 yb4Var = a9Var.f229694t;
            if (yb4Var == null) {
                com.tencent.mm.sdk.platformtools.o4 a76 = a9Var.a7();
                kotlin.jvm.internal.o.f(a76, "access$getMmkv(...)");
                java.lang.String str = a9Var.f229691q;
                if (a76.f(str) && (j17 = a76.j(str)) != null) {
                    if (!(j17.length == 0)) {
                        try {
                            java.lang.Object newInstance = r45.yb4.class.newInstance();
                            ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                            obj = (com.tencent.mm.protobuf.f) newInstance;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                        }
                        yb4Var = (r45.yb4) obj;
                    }
                }
                obj = null;
                yb4Var = (r45.yb4) obj;
            }
            if (yb4Var != null) {
                java.util.LinkedList list = yb4Var.getList(0);
                if (list != null) {
                    pm0.v.d0(list, df2.x8.f231765d);
                }
                com.tencent.mars.xlog.Log.i(a9Var.f229687m, "[saveRecordCache] cache = " + pm0.b0.g(yb4Var));
                java.util.LinkedList list2 = yb4Var.getList(0);
                boolean z17 = list2 == null || list2.isEmpty();
                java.lang.String str2 = a9Var.f229691q;
                if (z17) {
                    a9Var.a7().W(str2);
                } else {
                    a9Var.a7().H(str2, yb4Var.toByteArray());
                }
                a9Var.a7().putInt(a9Var.f229692r, c01.id.e());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(a9Var.f229687m, "[saveRecordCache] e:" + th6.getMessage());
        }
    }
}
