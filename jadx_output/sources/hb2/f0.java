package hb2;

/* loaded from: classes2.dex */
public final class f0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.f0 f280042e = new hb2.f0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280043f = "Finder.FinderModifyHelpPromotionSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.ci2 cmdBufItem = (r45.ci2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 31;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280043f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.ci2 cmdBufItem = (r45.ci2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        cmdRef.getInteger(1);
        cmdBufItem.getInteger(0);
    }

    public final void n(androidx.lifecycle.y yVar, boolean z17, long j17, zy2.gc gcVar) {
        r45.ci2 ci2Var = new r45.ci2();
        ci2Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 2));
        ci2Var.set(1, java.lang.Long.valueOf(j17));
        hb2.w0.h(this, yVar, ci2Var, gcVar, false, false, 24, null);
    }
}
