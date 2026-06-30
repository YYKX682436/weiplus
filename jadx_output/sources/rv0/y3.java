package rv0;

/* loaded from: classes5.dex */
public final class y3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400342d;

    public y3(rv0.n1 n1Var) {
        this.f400342d = n1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        rv0.n1 n1Var = this.f400342d;
        if (itemId == 1) {
            du0.v0 R6 = n1Var.R6();
            zw0.a[] aVarArr = zw0.a.f476550d;
            R6.S6("BatchClippingTimeRangeTo1s");
            com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(1.0d);
            kotlin.jvm.internal.o.f(fromSeconds, "fromSeconds(...)");
            rv0.a4.b(n1Var, fromSeconds);
            return;
        }
        if (itemId == 2) {
            du0.v0 R62 = n1Var.R6();
            zw0.a[] aVarArr2 = zw0.a.f476550d;
            R62.S6("BatchClippingTimeRangeTo3s");
            com.tencent.maas.model.time.MJTime fromSeconds2 = com.tencent.maas.model.time.MJTime.fromSeconds(3.0d);
            kotlin.jvm.internal.o.f(fromSeconds2, "fromSeconds(...)");
            rv0.a4.b(n1Var, fromSeconds2);
            return;
        }
        if (itemId != 3) {
            return;
        }
        du0.v0 R63 = n1Var.R6();
        zw0.a[] aVarArr3 = zw0.a.f476550d;
        R63.S6("BatchClippingTimeRangeToOrigin");
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) s76.f257097g.f257177e).iterator();
        while (it.hasNext()) {
            ex0.r rVar = (ex0.r) it.next();
            rVar.g();
            rVar.h();
        }
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = n1Var.getContext().getString(com.tencent.mm.R.string.f492505lm0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        q76.r7(string, null);
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.v3(n1Var, s76, null), 3, null);
    }
}
