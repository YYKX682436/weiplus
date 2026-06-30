package ue2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.x f426858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ue2.x xVar, java.lang.String str) {
        super(0);
        this.f426858d = xVar;
        this.f426859e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ue2.x xVar = this.f426858d;
        xVar.K0(0);
        mm2.c1 c1Var = (mm2.c1) xVar.P0(mm2.c1.class);
        java.lang.String str = this.f426859e;
        if (com.tencent.mm.vfs.w6.j(str == null ? "" : str)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str != null ? str : "");
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.io.InputStream D = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null));
            kotlin.jvm.internal.o.f(D, "openRead(...)");
            android.graphics.Bitmap O = com.tencent.mm.sdk.platformtools.x.O(D);
            xVar.f426867q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(xVar.f365323d.getContext().getResources(), O));
            c1Var.I4 = O;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.j0(str != null ? str : ""));
            a18.f447873d = new ue2.t(xVar, c1Var);
            a18.f();
        }
        com.tencent.mars.xlog.Log.i(xVar.f426866p, "liveCoverUrl:" + str + ", audioModeHolderBm:" + c1Var.I4);
        return jz5.f0.f302826a;
    }
}
