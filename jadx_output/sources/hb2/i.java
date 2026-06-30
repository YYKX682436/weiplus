package hb2;

/* loaded from: classes3.dex */
public final class i extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.i f280054e = new hb2.i();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280055f = "Finder.FinderModPersonalizedSetting";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.gi2 cmdBufItem = (r45.gi2) obj;
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        return com.tencent.mm.protobuf.g.b(cmdBufItem.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 20;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280055f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        java.util.LinkedList list;
        r45.gi2 cmdBufItem = (r45.gi2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        int integer = cmdRef.getInteger(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleUpdateResult: retCode=");
        sb6.append(integer);
        sb6.append(", no_recommend_to_friend=");
        r45.t62 t62Var = (r45.t62) cmdBufItem.getCustom(1);
        sb6.append(t62Var != null ? java.lang.Integer.valueOf(t62Var.getInteger(0)) : null);
        sb6.append(", no_recommend_to_all_city=");
        r45.t62 t62Var2 = (r45.t62) cmdBufItem.getCustom(1);
        sb6.append(t62Var2 != null ? java.lang.Boolean.valueOf(t62Var2.getBoolean(1)) : null);
        sb6.append(", cityNameList=");
        r45.t62 t62Var3 = (r45.t62) cmdBufItem.getCustom(1);
        sb6.append((t62Var3 == null || (list = t62Var3.getList(4)) == null) ? null : kz5.n0.g0(list, "、", null, null, 0, null, null, 62, null));
        sb6.append(", cityCount-");
        r45.t62 t62Var4 = (r45.t62) cmdBufItem.getCustom(1);
        sb6.append(t62Var4 != null ? java.lang.Integer.valueOf(t62Var4.getInteger(5)) : null);
        com.tencent.mars.xlog.Log.i(f280055f, sb6.toString());
    }

    public final void n(r45.t62 config, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(config, "config");
        r45.gi2 gi2Var = new r45.gi2();
        gi2Var.set(0, java.lang.Integer.valueOf(config.getInteger(0) == 0 ? 1 : 2));
        gi2Var.set(1, config);
        hb2.w0.m(this, gi2Var, gcVar, false, false, null, null, 60, null);
    }
}
