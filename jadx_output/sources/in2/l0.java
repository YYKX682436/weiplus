package in2;

/* loaded from: classes10.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f292858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292859e;

    public l0(in2.n0 n0Var, android.view.View view) {
        this.f292858d = n0Var;
        this.f292859e = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        in2.n0 n0Var = this.f292858d;
        in2.f0 f0Var = n0Var.P;
        android.content.Context context = n0Var.f118183e;
        if (f0Var.x(context)) {
            in2.f0 f0Var2 = n0Var.P;
            java.util.Iterator it = f0Var2.f292826h.iterator();
            boolean z17 = true;
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                java.lang.String str = ((dk2.yg) next).f234393a;
                ((c61.p2) ybVar).getClass();
                kotlin.jvm.internal.o.g(str, "str");
                ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).getClass();
                if (com.tencent.mm.smiley.x1.Di().Ai(str)) {
                    f0Var2.notifyItemChanged(i17, f0Var2.f292824f);
                    z17 = false;
                } else {
                    f0Var2.notifyItemChanged(i17, f0Var2.f292825g);
                }
                i17 = i18;
            }
            if (z17) {
                gn2.a aVar = n0Var.I.f407347p;
                if (aVar != null) {
                    aVar.c(false);
                }
                com.tencent.mm.plugin.finder.live.widget.e0.t(n0Var, false, 1, null);
                java.lang.Object systemService = context.getSystemService("input_method");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(n0Var.H().getWindowToken(), 0);
                f0Var2.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = f0Var2.f292826h.iterator();
                while (it6.hasNext()) {
                    dk2.yg ygVar = (dk2.yg) it6.next();
                    if ((ygVar.f234393a.length() > 0) && ygVar.f234395c != 1) {
                        arrayList.add(ygVar.f234393a);
                    }
                }
                gk2.e eVar = n0Var.H;
                long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
                long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
                java.lang.String userName = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
                in2.k0 k0Var = new in2.k0(n0Var, this.f292859e);
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(userName, "userName");
                pq5.g l17 = new ek2.b3(arrayList, java.lang.System.currentTimeMillis(), j17, j18, userName, null, 32, null).l();
                l17.K(new xl2.b(k0Var));
                if (context instanceof com.tencent.mm.ui.MMActivity) {
                    l17.f((im5.b) context);
                }
            }
        }
    }
}
