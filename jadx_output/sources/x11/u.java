package x11;

/* loaded from: classes11.dex */
public final class u implements x11.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f451410a;

    public u(java.util.List contactList) {
        kotlin.jvm.internal.o.g(contactList, "contactList");
        this.f451410a = contactList;
    }

    @Override // x11.a
    public x11.y a(x11.t initController) {
        r45.b50 b50Var;
        kotlin.jvm.internal.o.g(initController, "initController");
        com.tencent.mm.plugin.zero.a1 a1Var = new com.tencent.mm.plugin.zero.a1();
        a1Var.b("NetSceneInit");
        java.util.List list = this.f451410a;
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.b50 b50Var2 = new r45.b50();
            b50Var2.f370530d = 2;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(((r45.n80) obj).f381151f.initialProtobufBytes());
            b50Var2.f370531e = cu5Var;
            try {
                b50Var = b50Var2;
                try {
                    a1Var.d("NetSceneInit", i17, list.size(), b50Var2, true, com.tencent.mm.booter.x1.e(), 1);
                    initController.d(b50Var);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th, "InitTaskBatchContactRsp err", new java.lang.Object[0]);
                    w11.k.f442068a.b(b50Var, th, 1);
                    i17 = i18;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                b50Var = b50Var2;
            }
            i17 = i18;
        }
        ((java.util.LinkedList) initController.f451402s).poll();
        a1Var.a("NetSceneInit");
        return x11.y.f451421e;
    }

    @Override // x11.a
    public java.lang.String b() {
        return "InitTaskBatchContactRsp@" + hashCode();
    }
}
