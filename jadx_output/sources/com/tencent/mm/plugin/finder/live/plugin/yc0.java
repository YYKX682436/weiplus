package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yc0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.yc0 f115185d = new com.tencent.mm.plugin.finder.live.plugin.yc0();

    public yc0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        r45.a84 a84Var = (r45.a84) obj;
        r45.a84 a84Var2 = (r45.a84) obj2;
        boolean z17 = false;
        java.lang.String str = null;
        java.lang.String string = a84Var != null ? a84Var.getString(0) : null;
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = a84Var2 != null ? a84Var2.getString(0) : null;
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String g07 = (a84Var == null || (list2 = a84Var.getList(1)) == null) ? null : kz5.n0.g0(list2, "|", null, null, 0, null, com.tencent.mm.plugin.finder.live.plugin.xc0.f115072d, 30, null);
        if (g07 == null) {
            g07 = "";
        }
        if (a84Var2 != null && (list = a84Var2.getList(1)) != null) {
            str = kz5.n0.g0(list, "|", null, null, 0, null, com.tencent.mm.plugin.finder.live.plugin.wc0.f114918d, 30, null);
        }
        java.lang.String str2 = str != null ? str : "";
        if (kotlin.jvm.internal.o.b(string, string2) && kotlin.jvm.internal.o.b(g07, str2)) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
