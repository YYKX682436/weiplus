package dk2;

/* loaded from: classes3.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f233757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f233758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f233759g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f233760h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f233761i;

    public m6(android.content.Context context, boolean z17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var, r45.hc1 hc1Var, byte[] bArr) {
        this.f233756d = context;
        this.f233757e = z17;
        this.f233758f = finderObject;
        this.f233759g = qt2Var;
        this.f233760h = hc1Var;
        this.f233761i = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.o72 o72Var;
        dk2.u6 u6Var = dk2.u6.f234171a;
        android.content.Context context = this.f233756d;
        boolean a17 = u6Var.a(context);
        r45.qt2 qt2Var = this.f233759g;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f233758f;
        if (a17 && !this.f233757e) {
            u6Var.e(context, finderObject, qt2Var, true);
            return;
        }
        ss5.k0 k0Var = (ss5.k0) i95.n0.c(ss5.k0.class);
        r45.kv0 b17 = db2.t4.f228171a.b(3976, qt2Var);
        java.lang.String e17 = xy2.c.e(context);
        r45.hc1 hc1Var = this.f233760h;
        r45.nw1 nw1Var = (r45.nw1) hc1Var.getCustom(3);
        long j17 = nw1Var != null ? nw1Var.getLong(0) : -1L;
        long id6 = finderObject.getId();
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        if (objectNonceId == null) {
            objectNonceId = "";
        }
        java.lang.String str = objectNonceId;
        r45.dm2 object_extend = finderObject.getObject_extend();
        java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
        ml2.e4 e4Var = ml2.e4.f327376e;
        if (qt2Var == null) {
            qt2Var = new r45.qt2();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.nw1 nw1Var2 = (r45.nw1) hc1Var.getCustom(3);
        sb6.append(nw1Var2 != null ? nw1Var2.getLong(0) : -1L);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        android.content.Context context2 = this.f233756d;
        boolean z17 = this.f233757e;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f233758f;
        r45.qt2 qt2Var2 = this.f233759g;
        r45.hc1 hc1Var2 = this.f233760h;
        dk2.l6 l6Var = new dk2.l6(context2, z17, finderObject2, qt2Var2, hc1Var2);
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        java.lang.String str2 = w0Var != null ? w0Var.Z : null;
        if (z17) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.nw1 nw1Var3 = (r45.nw1) hc1Var2.getCustom(3);
            o72Var = r4Var.T(context2, nw1Var3 != null ? nw1Var3.getLong(0) : -1L, "Finder.FinderLiveFeedFlowReporter");
        } else {
            o72Var = null;
        }
        kotlin.jvm.internal.o.d(k0Var);
        pq5.g l17 = ss5.k0.B4(k0Var, b17, e17, this.f233761i, j17, id6, str, string, 9, this.f233757e, 4, null, 2, qt2Var, sb7, l6Var, str2, null, o72Var, true, null, null, 0L, null, 5768192, null).l();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            l17.f(mMActivity);
        }
    }
}
