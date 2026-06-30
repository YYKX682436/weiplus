package ya2;

/* loaded from: classes.dex */
public final class r implements zy2.j9 {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.r f460525a = new ya2.r();

    /* JADX WARN: Multi-variable type inference failed */
    public void c(android.content.Context context, int i17, long j17, java.lang.String finderUsername, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(callback, "callback");
        hb2.j0 j0Var = hb2.j0.f280060e;
        j0Var.getClass();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            return;
        }
        hb2.i0 i0Var = new hb2.i0(callback, i17, context);
        if (i17 != 1) {
            j0Var.n(yVar, i17, j17, finderUsername, i0Var);
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(context.getResources().getString(com.tencent.mm.R.string.mqt));
        k0Var.s(inflate, false);
        k0Var.f211872n = new hb2.g0(context);
        k0Var.f211881s = new hb2.h0(yVar, i17, j17, finderUsername, i0Var);
        k0Var.v();
    }

    public void d(int i17, java.util.LinkedList objIds, java.util.LinkedList collectionIds, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(objIds, "objIds");
        kotlin.jvm.internal.o.g(collectionIds, "collectionIds");
        hb2.r rVar = hb2.r.f280085e;
        rVar.getClass();
        r45.li2 li2Var = new r45.li2();
        li2Var.set(0, java.lang.Integer.valueOf(i17));
        li2Var.set(1, objIds);
        li2Var.set(2, collectionIds);
        com.tencent.mars.xlog.Log.i(hb2.r.f280086f, "modifyPlayHistorySet op_type:" + li2Var.getInteger(0));
        hb2.w0.m(rVar, li2Var, gcVar, false, false, null, null, 60, null);
    }

    public void e(int i17, int i18, long j17) {
        hb2.v vVar = hb2.v.f280102e;
        vVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyTeenModeSetting: flag=");
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", birthYear=");
        sb6.append(i17);
        sb6.append(", birthMonth=");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i(hb2.v.f280103f, sb6.toString());
        r45.qn2 qn2Var = new r45.qn2();
        qn2Var.set(0, java.lang.Integer.valueOf(i17));
        qn2Var.set(1, java.lang.Integer.valueOf(i18));
        qn2Var.set(2, java.lang.Long.valueOf(j17));
        hb2.w0.m(vVar, qn2Var, null, false, false, null, null, 60, null);
    }
}
