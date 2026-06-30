package dg3;

/* loaded from: classes3.dex */
public abstract class k extends lf3.n implements dg3.m, db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f232332d;

    /* renamed from: e, reason: collision with root package name */
    public kd0.p2 f232333e;

    /* renamed from: f, reason: collision with root package name */
    public dg3.o f232334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void V6(dg3.k kVar, db5.g4 g4Var, java.util.List list) {
        kVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dg3.p pVar = (dg3.p) it.next();
            java.lang.String string = kVar.getContext().getString(pVar.f232338b);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int i17 = pVar.f232339c;
            dg3.q qVar = pVar.f232337a;
            java.lang.Integer num = pVar.f232340d;
            if (num != null) {
                g4Var.h(qVar.f232352d, string, i17, kVar.getContext().getResources().getColor(num.intValue()));
            } else {
                g4Var.h(qVar.f232352d, string, i17, 0);
            }
        }
    }

    public abstract java.util.List W6(mf3.k kVar);

    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        dg3.o aVar;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        int ordinal = info.getType().ordinal();
        if (ordinal == 1) {
            aVar = new dg3.a(info, apiCenter);
        } else {
            if (ordinal != 2) {
                return null;
            }
            aVar = new dg3.l(info, apiCenter);
        }
        return aVar;
    }

    public abstract java.util.List Y6(mf3.k kVar);

    @Override // dg3.m
    public void Z0(mf3.k info, mf3.p apiCenter, dg3.q type) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        kotlin.jvm.internal.o.g(type, "type");
        dg3.o X6 = X6(info, apiCenter);
        this.f232334f = X6;
        if (X6 != null) {
            X6.a(type);
        }
    }

    public void Z6(mf3.k info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((jd0.q2) x2Var).getClass();
        this.f232333e = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(activity);
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        dg3.o oVar;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            rz5.a aVar = dg3.q.f232351r;
            int d17 = kz5.b1.d(kz5.d0.q(aVar, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
            for (java.lang.Object obj : aVar) {
                linkedHashMap.put(java.lang.Integer.valueOf(((dg3.q) obj).f232352d), obj);
            }
            dg3.q qVar = (dg3.q) linkedHashMap.get(java.lang.Integer.valueOf(itemId));
            if (qVar == null || (oVar = this.f232334f) == null) {
                return;
            }
            oVar.a(qVar);
        }
    }

    @Override // dg3.m
    public void y6(mf3.k info, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        sf3.f fVar = (sf3.f) U6(sf3.f.class);
        sf3.k Q3 = fVar != null ? fVar.Q3(info) : null;
        if (info.getType() == mf3.u.f326123e && Q3 == sf3.k.f407399g) {
            dg3.n nVar = (dg3.n) U6(dg3.n.class);
            if (nVar != null) {
                rh5.g gVar = (rh5.g) nVar;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) gVar.getActivity(), 0, true);
                k0Var.f211872n = new rh5.f(gVar);
                rh5.i iVar = new rh5.i(gVar.getActivity(), info, apiCenter);
                k0Var.f211881s = iVar;
                k0Var.f211854d = iVar;
                k0Var.v();
                return;
            }
            return;
        }
        this.f232334f = X6(info, apiCenter);
        this.f232332d = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getActivity(), 0, true);
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f232332d;
        if (k0Var2 != null) {
            k0Var2.f211876p = new dg3.b(mVar, this);
        }
        if (k0Var2 != null) {
            k0Var2.f211886x = new dg3.c(mVar, this);
        }
        kotlin.jvm.internal.o.d(k0Var2);
        k0Var2.f211885w = new dg3.e(mVar, this);
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f232332d;
        if (k0Var3 != null) {
            k0Var3.f211872n = new dg3.f(this, info);
        }
        if (k0Var3 != null) {
            k0Var3.f211874o = new dg3.g(this, info);
        }
        if (k0Var3 != null) {
            k0Var3.f211879q = new dg3.h(this, info);
        }
        if (k0Var3 != null) {
            k0Var3.f211854d = new dg3.i(this);
        }
        if (k0Var3 != null) {
            k0Var3.C = new dg3.j(this);
        }
        if (k0Var3 != null) {
            k0Var3.f211881s = this;
        }
        if (k0Var3 != null) {
            k0Var3.f211884v = this;
        }
        if (k0Var3 != null) {
            k0Var3.f211889y = this;
        }
        if (k0Var3 != null) {
            k0Var3.v();
        }
        Z6(info);
    }
}
