package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f128850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI, java.lang.String str) {
        super(0);
        this.f128850d = finderFansListUI;
        this.f128851e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f128850d;
        java.util.Iterator it = finderFansListUI.f128569w.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r26.i0.q(((r45.q21) obj).getString(2), this.f128851e, false, 2, null)) {
                break;
            }
        }
        r45.q21 q21Var = (r45.q21) obj;
        if (q21Var != null) {
            java.util.ArrayList arrayList = finderFansListUI.f128569w;
            arrayList.remove(q21Var);
            com.tencent.mm.plugin.finder.ui.e eVar = finderFansListUI.f128568v;
            eVar.c(arrayList);
            eVar.notifyDataSetChanged();
            g92.b bVar = g92.b.f269769e;
            androidx.appcompat.app.AppCompatActivity context = finderFansListUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            m92.b j37 = g92.a.j3(bVar, xy2.c.e(context), false, 2, null);
            int integer = j37 != null ? j37.u0().getInteger(20) : 0;
            com.tencent.mars.xlog.Log.i("Finder.FinderFansListUI", "oldFansCnt %d", java.lang.Integer.valueOf(integer));
            if (integer > 0) {
                androidx.appcompat.app.AppCompatActivity context2 = finderFansListUI.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                m92.c cVar = new m92.c(xy2.c.e(context2));
                cVar.u0().set(20, java.lang.Integer.valueOf(r3.getInteger(20) - 1));
                bVar.C(cVar, m92.j.f324992g);
            }
            finderFansListUI.e7();
        }
        return jz5.f0.f302826a;
    }
}
