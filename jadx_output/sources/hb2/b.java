package hb2;

/* loaded from: classes8.dex */
public final class b extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.b f280023e = new hb2.b();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280024f = "Finder.FinderAgreeSavePhone";

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
        return 17;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280024f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        java.lang.String cmdBufItem = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        if (kotlin.jvm.internal.o.b(cmdBufItem, "") && integer == 0) {
            g92.b bVar = g92.b.f269769e;
            m92.f fVar = new m92.f();
            r45.ob4 e17 = fVar.e();
            int integer2 = fVar.e().getInteger(17);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            e17.set(17, java.lang.Integer.valueOf(integer2 | 8));
            bVar.S1(fVar, m92.j.f325003u);
        }
    }
}
