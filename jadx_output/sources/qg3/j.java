package qg3;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f362823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362825f;

    public j(byte[] bArr, int i17, int i18) {
        this.f362823d = bArr;
        this.f362824e = i17;
        this.f362825f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f362824e;
        try {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.parseFrom(this.f362823d);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, i17, null);
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(0, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
            qt2Var.set(5, java.lang.Integer.valueOf(i17));
            ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            qt2Var.set(1, b17);
            ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
            qt2Var.set(2, b52.b.c());
            com.tencent.mm.plugin.finder.report.o0 o0Var = com.tencent.mm.plugin.finder.report.r0.f125279q;
            long id6 = finderObject.getId();
            r45.dm2 object_extend = finderObject.getObject_extend();
            com.tencent.mm.plugin.finder.report.o0.b(o0Var, qt2Var, id6, object_extend != null ? object_extend.getString(62) : null, 14, java.lang.String.valueOf(this.f362825f), 0L, null, null, null, 480, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderLegacyJavaStatic", "parse pb error:" + e17.getMessage());
        }
    }
}
