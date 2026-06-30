package cp2;

/* loaded from: classes2.dex */
public final class d1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f220786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f220787e;

    public d1(java.util.ArrayList arrayList, cp2.q1 q1Var) {
        this.f220786d = arrayList;
        this.f220787e = q1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.s92 s92Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        java.lang.Object obj = this.f220786d.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        java.lang.String str = rq2.x.f398915b;
        cp2.q1 q1Var = this.f220787e;
        java.lang.String string = q1Var.a().getString(2);
        if (string == null) {
            string = "";
        }
        java.lang.String str2 = string;
        cq2.r rVar = cq2.r.f221444a;
        r45.fd1 fd1Var = cp2.b.f220775x;
        view.setTag(com.tencent.mm.R.id.f486101k63, cq2.r.f(rVar, i18, j5Var, view, (fd1Var == null || (s92Var = (r45.s92) fd1Var.getCustom(11)) == null) ? 0 : s92Var.getInteger(0), null, 0, q1Var.q() != 0, false, 48, null));
        cp2.u1 u1Var = q1Var.f220896u;
        java.util.ArrayList arrayList = this.f220786d;
        com.tencent.mm.view.recyclerview.WxRecyclerView g17 = q1Var.g();
        kotlin.jvm.internal.o.f(g17, "access$getRecyclerView(...)");
        cp2.u1.d(u1Var, j5Var, i17, i18, view, arrayList, str, str2, g17, 0L, 256, null);
    }
}
