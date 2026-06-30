package qg3;

/* loaded from: classes2.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f362849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f362853h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f362854i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f362855m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362856n;

    public q0(byte[] bArr, int i17, java.lang.String str, int i18, byte[] bArr2, byte[] bArr3, int i19, yz5.l lVar) {
        this.f362849d = bArr;
        this.f362850e = i17;
        this.f362851f = str;
        this.f362852g = i18;
        this.f362853h = bArr2;
        this.f362854i = bArr3;
        this.f362855m = i19;
        this.f362856n = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] finderObjectBytes = this.f362849d;
        kotlin.jvm.internal.o.g(finderObjectBytes, "finderObjectBytes");
        java.lang.String fromSessionId = this.f362851f;
        kotlin.jvm.internal.o.g(fromSessionId, "fromSessionId");
        byte[] lastBuffer = this.f362853h;
        kotlin.jvm.internal.o.g(lastBuffer, "lastBuffer");
        byte[] longVideoPlayerContextBytes = this.f362854i;
        kotlin.jvm.internal.o.g(longVideoPlayerContextBytes, "longVideoPlayerContextBytes");
        yz5.l callback = this.f362856n;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchRelatedList start pullType:");
        int i17 = this.f362852g;
        sb6.append(i17);
        sb6.append(", commentScene:");
        int i18 = this.f362855m;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(i18));
        qt2Var.set(0, fromSessionId);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.parseFrom(finderObjectBytes);
        long id6 = finderObject.getId();
        r45.z91 z91Var = new r45.z91();
        z91Var.set(3, java.lang.Long.valueOf(finderObject.getId()));
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        if (objectNonceId == null) {
            objectNonceId = "";
        }
        z91Var.set(7, objectNonceId);
        z91Var.set(4, 301);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        z91Var.set(2, new com.tencent.mm.protobuf.g(lastBuffer, 0, lastBuffer.length));
        db2.t4 t4Var = db2.t4.f228171a;
        z91Var.set(1, t4Var.b(3688, qt2Var));
        int i19 = this.f362850e;
        z91Var.set(9, java.lang.Integer.valueOf(i19));
        z91Var.set(17, null);
        z91Var.set(18, fromSessionId);
        z91Var.set(28, java.lang.Integer.valueOf(i17));
        r45.kv0 kv0Var = (r45.kv0) z91Var.getCustom(1);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(id6);
        r45.dm2 object_extend = finderObject.getObject_extend();
        t4Var.h(kv0Var, null, kz5.b0.c(new jz5.o(valueOf, valueOf2, object_extend != null ? object_extend.getString(62) : null)));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = z91Var;
        lVar.f70665b = new bw5.qg();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        lVar.f70667d = 3688;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new qg3.r0(i17, callback), false);
    }
}
