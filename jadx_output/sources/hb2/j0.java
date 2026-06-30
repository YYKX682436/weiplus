package hb2;

/* loaded from: classes.dex */
public final class j0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.j0 f280060e = new hb2.j0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280061f = "Finder.FinderModifyMentionSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.hi2 cmdBufItem = (r45.hi2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 33;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280061f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.hi2 cmdBufItem = (r45.hi2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        cmdRef.getInteger(1);
        cmdBufItem.getInteger(0);
    }

    public final void n(androidx.lifecycle.y yVar, int i17, long j17, java.lang.String str, zy2.gc gcVar) {
        r45.hi2 hi2Var = new r45.hi2();
        hi2Var.set(0, java.lang.Integer.valueOf(i17));
        hi2Var.set(2, java.lang.Long.valueOf(j17));
        hi2Var.set(1, str);
        hb2.w0.h(this, yVar, hi2Var, gcVar, false, false, 24, null);
    }
}
