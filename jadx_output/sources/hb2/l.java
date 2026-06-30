package hb2;

/* loaded from: classes8.dex */
public final class l extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.l f280066e = new hb2.l();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280067f = "Finder.FinderModOverSeaAgree";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        java.lang.String cmdBufItem = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        byte[] bytes = cmdBufItem.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return com.tencent.mm.protobuf.g.b(bytes);
    }

    @Override // hb2.w0
    public int i() {
        return 15;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280067f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        java.lang.String cmdBufItem = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        com.tencent.mars.xlog.Log.i(f280067f, "retcode:" + integer);
        if (kotlin.jvm.internal.o.b(cmdBufItem, "") && integer == 0) {
            g92.b bVar = g92.b.f269769e;
            r45.k67 k67Var = (r45.k67) bVar.k2().d().getCustom(7);
            if (k67Var == null) {
                k67Var = new r45.k67();
            }
            k67Var.set(0, 0);
            m92.f fVar = new m92.f();
            fVar.d().set(7, k67Var);
            bVar.S1(fVar, m92.j.f325006x);
        }
    }
}
