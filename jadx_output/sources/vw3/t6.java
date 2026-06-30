package vw3;

/* loaded from: classes12.dex */
public final class t6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f441123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441126i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441122e = str;
        this.f441123f = j17;
        this.f441124g = str2;
        this.f441125h = str3;
        this.f441126i = repairerUploadTestUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw3.t6(this.f441122e, this.f441123f, this.f441124g, this.f441125h, this.f441126i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.t6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object d76;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441121d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441126i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            v70.w wVar = (v70.w) ((xs.d1) i95.n0.c(xs.d1.class));
            java.lang.String str = this.f441122e;
            long j17 = this.f441123f;
            s70.a hj6 = wVar.hj(str, j17);
            java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("upimgjpg", c01.id.c(), str, j17 + "_0_0");
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(this.f441124g, j17);
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(n17);
            java.lang.String str2 = this.f441125h;
            java.lang.String str3 = this.f441124g;
            java.lang.String str4 = this.f441122e;
            kotlin.jvm.internal.o.d(b17);
            s70.g gVar = new s70.g(null, str2, str3, str4, b17, S1.f322640h, new k70.i0(), 1, null);
            gVar.f403953j = new java.lang.ref.WeakReference(hj6);
            repairerUploadTestUI.runOnUiThread(new vw3.q6(repairerUploadTestUI));
            xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
            this.f441121d = 1;
            ((v70.w) d1Var).getClass();
            d76 = g80.o.f269519f.a().d7(gVar, this);
            if (d76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            d76 = obj;
        }
        s70.h hVar = (s70.h) d76;
        if (hVar.f403956a == s70.i.f403961d) {
            repairerUploadTestUI.runOnUiThread(new vw3.r6(repairerUploadTestUI));
            try {
                java.lang.String format = java.lang.String.format("msg_img_upload_xml_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                kotlin.jvm.internal.o.f(format, "format(...)");
                xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
                byte[] bytes = hVar.f403957b.toXml().getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                ((zc0.h) i1Var).aj(format, bytes, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(repairerUploadTestUI.d, e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.s6(repairerUploadTestUI));
        }
        return jz5.f0.f302826a;
    }
}
