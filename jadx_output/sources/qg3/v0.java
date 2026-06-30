package qg3;

/* loaded from: classes2.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f362878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f362879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f362881h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362882i;

    public v0(int i17, byte[] bArr, byte[] bArr2, int i18, int i19, yz5.l lVar) {
        this.f362877d = i17;
        this.f362878e = bArr;
        this.f362879f = bArr2;
        this.f362880g = i18;
        this.f362881h = i19;
        this.f362882i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.vx0 vx0Var;
        byte[] finderObjectBytes = this.f362878e;
        kotlin.jvm.internal.o.g(finderObjectBytes, "finderObjectBytes");
        byte[] lastBuffer = this.f362879f;
        kotlin.jvm.internal.o.g(lastBuffer, "lastBuffer");
        yz5.l callback = this.f362882i;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchTopicList start topicType:");
        int i17 = this.f362877d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(this.f362881h));
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.parseFrom(finderObjectBytes);
        long id6 = finderObject.getId();
        r45.na1 na1Var = new r45.na1();
        na1Var.set(7, java.lang.Long.valueOf(id6));
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        r45.dm2 object_extend = finderObject.getObject_extend();
        na1Var.set(13, java.lang.Long.valueOf((object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null) ? 0L : vx0Var.getLong(0)));
        na1Var.set(18, java.lang.Integer.valueOf(this.f362880g));
        na1Var.set(2, new com.tencent.mm.protobuf.g(lastBuffer, 0, lastBuffer.length));
        na1Var.set(1, db2.t4.f228171a.b(817, qt2Var));
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        na1Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        na1Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = na1Var;
        lVar.f70667d = 817;
        lVar.f70665b = new r45.oa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopiclist";
        com.tencent.mm.modelbase.z2.d(lVar.a(), new qg3.w0(callback), false);
    }
}
