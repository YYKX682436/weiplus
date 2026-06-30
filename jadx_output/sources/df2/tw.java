package df2;

/* loaded from: classes3.dex */
public final class tw implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.xw f231480d;

    public tw(df2.xw xwVar) {
        this.f231480d = xwVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (((mm2.c1) this.f231480d.business(mm2.c1.class)).T) {
            return;
        }
        mm2.n0 n0Var = (mm2.n0) this.f231480d.business(mm2.n0.class);
        boolean z17 = false;
        if ((n0Var != null && n0Var.f329273r) || kotlin.jvm.internal.o.b(java.lang.Boolean.valueOf(this.f231480d.f231814r), bool)) {
            return;
        }
        df2.xw xwVar = this.f231480d;
        kotlin.jvm.internal.o.d(bool);
        xwVar.f231814r = bool.booleanValue();
        if (!bool.booleanValue()) {
            this.f231480d.f231812p = false;
            return;
        }
        fe2.q qVar = (fe2.q) this.f231480d.R6(fe2.q.class);
        if (qVar != null) {
            java.util.Iterator it = qVar.f261531v.f280898e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((ee2.a) obj2).f251583g instanceof com.tencent.mm.plugin.finder.live.plugin.mg) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                z17 = true;
            }
        }
        if (z17 && (!this.f231480d.f231809m.isEmpty())) {
            fe2.q qVar2 = (fe2.q) this.f231480d.R6(fe2.q.class);
            if (qVar2 != null) {
                qVar2.H1(null);
                return;
            }
            return;
        }
        df2.xw xwVar2 = this.f231480d;
        if (xwVar2.f231812p) {
            com.tencent.mars.xlog.Log.i("LiveShopMsgDataController", "already done");
        } else {
            xwVar2.f231812p = true;
            com.tencent.mm.plugin.finder.live.util.y.o(xwVar2, kotlinx.coroutines.q1.f310570c, null, new df2.sw(xwVar2, null), 2, null);
        }
    }
}
