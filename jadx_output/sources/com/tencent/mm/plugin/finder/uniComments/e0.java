package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.uniComments.o0 o0Var) {
        super(1);
        this.f130227d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string;
        jv2.d commentItem = (jv2.d) obj;
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130227d;
        o0Var.getClass();
        android.content.Context context = o0Var.f130322d;
        if (context != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String md6 = c61.yb.md((c61.yb) c17, commentItem.f302207d.D0(), commentItem.f302207d.y0(), false, 4, null);
            kotlin.jvm.internal.o.f(context.getString(com.tencent.mm.R.string.f493357jv0, md6), "getString(...)");
            if (commentItem.f302207d.A0() != 0) {
                string = context.getString(com.tencent.mm.R.string.f493358jv1, md6);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else {
                java.util.ArrayList arrayList = o0Var.f130326h.f130342a;
                int i17 = 0;
                if (arrayList != null) {
                    long t07 = commentItem.f302207d.t0();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((jv2.d) it.next()).f302207d.A0() == t07) {
                            i17++;
                        }
                    }
                }
                if (i17 > 0) {
                    string = context.getString(com.tencent.mm.R.string.f493357jv0, md6);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                } else {
                    string = context.getString(com.tencent.mm.R.string.f493358jv1, md6);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
            }
            db5.e1.u(context, string, "", new com.tencent.mm.plugin.finder.uniComments.q(o0Var, commentItem, context), null);
        }
        return jz5.f0.f302826a;
    }
}
