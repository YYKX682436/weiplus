package vw3;

/* loaded from: classes9.dex */
public final class o6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f441055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441057g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(long j17, java.lang.String str, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441055e = j17;
        this.f441056f = str;
        this.f441057g = repairerUploadTestUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw3.o6(this.f441055e, this.f441056f, this.f441057g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.o6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441054d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441057g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oc0.b bVar = new oc0.b();
            bVar.f344123b = 0L;
            bVar.f344124c = this.f441055e;
            bVar.f344125d = "ForwardUsername";
            bVar.f344127f = "ForwardUsername";
            java.lang.String str = this.f441056f;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            bVar.f344126e = str;
            bVar.f344129h = false;
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f344128g = new bt3.g0();
            repairerUploadTestUI.runOnUiThread(new vw3.l6(repairerUploadTestUI));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f441054d = 1;
            obj = ((zs3.z) kVar).hj(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        oc0.c cVar = (oc0.c) obj;
        repairerUploadTestUI.runOnUiThread(new vw3.m6(repairerUploadTestUI));
        if (cVar.f344131a == oc0.d.f344133d) {
            try {
                java.lang.String format = java.lang.String.format("record_attach_upload_xml_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                kotlin.jvm.internal.o.f(format, "format(...)");
                xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
                byte[] bytes = cVar.f344132b.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                ((zc0.h) i1Var).aj(format, bytes, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(repairerUploadTestUI.d, e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.n6(repairerUploadTestUI));
        }
        return jz5.f0.f302826a;
    }
}
