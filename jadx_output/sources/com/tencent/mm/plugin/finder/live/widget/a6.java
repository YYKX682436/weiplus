package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f117731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.u24 f117732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xq1 f117733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f117734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f117735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, r45.u24 u24Var, r45.xq1 xq1Var, int i17, java.lang.Integer num) {
        super(0);
        this.f117731d = d6Var;
        this.f117732e = u24Var;
        this.f117733f = xq1Var;
        this.f117734g = i17;
        this.f117735h = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.t63 t63Var;
        java.util.LinkedList list;
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f117731d;
        androidx.lifecycle.j0 j0Var = ((mm2.c1) d6Var.f118061c.P0(mm2.c1.class)).f328833k6;
        r45.u24 u24Var = this.f117732e;
        java.lang.String string = u24Var.getString(0);
        if (string == null) {
            string = "";
        }
        j0Var.postValue(string);
        r45.xq1 xq1Var = this.f117733f;
        if (xq1Var != null) {
            xq1Var.set(1, java.lang.Integer.valueOf(u24Var.getInteger(1)));
        }
        r45.u24 u24Var2 = null;
        if (u24Var.getInteger(1) == 7) {
            r45.j73 j73Var = (r45.j73) u24Var.getCustom(2);
            if (j73Var != null) {
                j73Var.set(1, java.lang.Integer.valueOf(this.f117734g));
            }
            mm2.c1 c1Var = (mm2.c1) d6Var.f118061c.P0(mm2.c1.class);
            r45.j73 j73Var2 = (r45.j73) u24Var.getCustom(2);
            r45.xq1 xq1Var2 = c1Var.C2;
            if (xq1Var2 != null && (t63Var = (r45.t63) xq1Var2.getCustom(0)) != null && (list = t63Var.getList(0)) != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((r45.u24) next).getInteger(1) == 7) {
                        u24Var2 = next;
                        break;
                    }
                }
                u24Var2 = u24Var2;
            }
            if (u24Var2 != null) {
                u24Var2.set(2, j73Var2);
            }
        } else if (u24Var.getInteger(1) == 1) {
            android.view.ViewGroup viewGroup = d6Var.f118059a;
            db5.t7.i(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.cz7), com.tencent.mm.R.raw.icons_filled_done);
            qo0.c.a(d6Var.f118060b, qo0.b.U2, null, 2, null);
        }
        int integer = u24Var.getInteger(1);
        java.lang.Integer num = this.f117735h;
        if (integer == 7) {
            if (num != null && num.intValue() == 7) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.j0.Oj((ml2.j0) c17, ml2.i3.f327556g, this.f117734g, null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.j0.Oj((ml2.j0) c18, ml2.i3.f327555f, this.f117734g, null, 4, null);
            }
        } else if (num != null && num.intValue() == 7) {
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ml2.j0.Oj((ml2.j0) c19, ml2.i3.f327554e, 0, null, 6, null);
        }
        com.tencent.mars.xlog.Log.i(d6Var.f118062d, "onSuccess");
        return jz5.f0.f302826a;
    }
}
