package ls0;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.w0 f320928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ls0.w0 w0Var) {
        super(1);
        this.f320928d = w0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ls0.w0 w0Var = this.f320928d;
        com.tencent.mars.xlog.Log.i(w0Var.f320941a, "onEncodeEnd");
        w0Var.f320951k = (yz5.l) obj;
        int i17 = w0Var.f320947g;
        boolean z17 = i17 == 0;
        java.lang.String str = w0Var.f320946f;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            boolean z18 = i17 == 1;
            int i18 = w0Var.f320942b;
            int i19 = w0Var.f320950j;
            int i27 = w0Var.f320949i;
            ls0.b1 b1Var = w0Var.f320943c;
            if (i18 > 0) {
                if (b1Var != null) {
                    r2 = b1Var.a(w0Var.f320944d, w0Var.f320946f, z18 ? 0 : i27, z18 ? 0 : i19, z17);
                } else {
                    r2 = -1;
                }
                int i28 = w0Var.f320942b;
                java.lang.String str2 = w0Var.f320948h;
                com.tencent.mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(str, str2, i28);
                com.tencent.mm.vfs.w6.w(str2, str);
            } else if (b1Var != null) {
                r2 = b1Var.a(w0Var.f320944d, w0Var.f320946f, z18 ? 0 : i27, z18 ? 0 : i19, z17);
            } else {
                r2 = -1;
            }
        }
        java.lang.String str3 = "output mediaInfo :" + com.tencent.mm.plugin.sight.base.e.d(str, true);
        java.lang.String str4 = w0Var.f320941a;
        com.tencent.mars.xlog.Log.i(str4, str3);
        com.tencent.mars.xlog.Log.i(str4, "finish process, ret:" + r2);
        if (r2 >= 0) {
            yz5.l lVar = w0Var.f320951k;
            if (lVar != null) {
                lVar.invoke(str);
            }
        } else {
            yz5.l lVar2 = w0Var.f320951k;
            if (lVar2 != null) {
                lVar2.invoke(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
