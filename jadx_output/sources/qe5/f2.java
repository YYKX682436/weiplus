package qe5;

/* loaded from: classes12.dex */
public final class f2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f362104d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.o2 f362105e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362106f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f362107g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f362108h;

    /* renamed from: i, reason: collision with root package name */
    public final qe5.d2 f362109i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f362104d = jz5.h.b(new qe5.e2(this));
        this.f362106f = true;
        this.f362107g = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(3);
        this.f362109i = new qe5.d2(this);
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final em.d0 U6() {
        return (em.d0) ((jz5.n) this.f362104d).getValue();
    }

    public final void V6() {
        j75.f Q6;
        kd5.e T6 = T6();
        if (T6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.OpenFileWayUIC", "initOpenWayRecyclerView: downloadState is null");
            return;
        }
        java.lang.String str = T6.F;
        if (str.length() == 0) {
            str = null;
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.OpenFileWayUIC", "initOpenWayRecyclerView: filePath is null");
            return;
        }
        W6(true);
        if (this.f362105e == null) {
            java.lang.String str2 = T6.f306893x;
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
            java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.f.e(str2);
            kotlin.jvm.internal.o.f(e17, "getMimeTypeByExt(...)");
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            android.app.Activity context = getContext();
            com.tencent.mm.pluginsdk.model.g2 g2Var = new com.tencent.mm.pluginsdk.model.g2(e17, str);
            g2Var.f189312e = T6.f306879g;
            g2Var.f189313f = T6.f306880h;
            g2Var.f189310c = T6.f306892w;
            g2Var.f189311d = T6.f306893x;
            g2Var.f189315h = 3;
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var = new com.tencent.mm.pluginsdk.ui.otherway.u0(context, g2Var, this.f362109i);
            com.tencent.mm.view.recyclerview.WxRecyclerView i17 = U6().i();
            if (u0Var.f190997p == null) {
                com.tencent.mm.pluginsdk.ui.otherway.r0 r0Var = new com.tencent.mm.pluginsdk.ui.otherway.r0(new com.tencent.mm.pluginsdk.ui.otherway.OtherOpenWayAdapterBuilder$buildAdapter$2(), u0Var.g());
                u0Var.f190997p = r0Var;
                r0Var.B = u0Var.f190999r;
            }
            i17.setAdapter(u0Var.f190997p);
            u0Var.f190998q = new qe5.b2(this);
            this.f362105e = u0Var;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView i18 = U6().i();
        kotlin.jvm.internal.o.f(i18, "getDownloadOtherAppList(...)");
        kotlin.jvm.internal.o.f(U6().g(), "getDownloadOpenBtn(...)");
        android.widget.TextView m17 = U6().m();
        kotlin.jvm.internal.o.f(m17, "getFileOpenTipTv(...)");
        com.tencent.mm.pluginsdk.model.o2 o2Var = this.f362105e;
        if (o2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.OpenFileWayUIC", "initOpenWayAdapterBuilder: openWayAdapterBuilder is null");
            return;
        }
        com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var2 = (com.tencent.mm.pluginsdk.ui.otherway.u0) o2Var;
        u0Var2.m();
        java.util.ArrayList arrayList = u0Var2.f191005f;
        this.f362106f = arrayList == null || arrayList.isEmpty();
        kd5.e T62 = T6();
        if (T62 != null && T62.G) {
            if (this.f362106f) {
                X6(0);
                m17.setText(com.tencent.mm.R.string.ne9);
            } else {
                U6().g().setVisibility(0);
                i18.setVisibility(0);
                i18.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
                m17.setText(com.tencent.mm.R.string.brw);
                if (i18.getItemDecorationCount() == 0) {
                    i18.N(new qe5.a2(this));
                }
            }
        }
        kd5.e T63 = T6();
        if (T63 == null || !T63.G || (Q6 = Q6()) == null) {
            return;
        }
        Q6.B3(new kd5.v(false));
    }

    public final void W6(boolean z17) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209726n);
            nVar.f306904c = z17;
            Q6.B3(nVar);
        }
    }

    public final void X6(int i17) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.File.OpenFileWayUIC", "open by other way visible: " + i17);
        U6().m().setVisibility(i17);
        boolean z18 = this.f362106f;
        if (z18 || !this.f362107g) {
            if (i17 == 0 && z18) {
                android.view.ViewGroup.LayoutParams layoutParams = U6().g().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479734dr));
            }
            U6().g().setVisibility(i17);
            U6().i().setVisibility(8);
        } else {
            U6().i().setVisibility(i17);
            U6().g().setVisibility(8);
        }
        kd5.e T6 = T6();
        boolean z19 = false;
        boolean z27 = T6 != null ? T6.L : false;
        if (i17 != 0 || !z27) {
            kd5.e T62 = T6();
            if (T62 != null && T62.M) {
                z19 = true;
            }
            if (z19) {
                U6().o().setVisibility(8);
                U6().p().setVisibility(8);
                U6().m().setVisibility(8);
                return;
            }
            return;
        }
        sc5.g gVar = sc5.g.f406572a;
        kd5.e T63 = T6();
        java.lang.String str = T63 != null ? T63.f306893x : null;
        kd5.e T64 = T6();
        java.lang.String str2 = T64 != null ? T64.C : null;
        if (gVar.c(str)) {
            z17 = (str2 == null || str2.length() == 0) ^ true ? sc5.g.f406574c : sc5.g.f406573b;
        } else {
            z17 = false;
        }
        if (z17) {
            U6().g().setVisibility(8);
            U6().i().setVisibility(8);
            U6().m().setVisibility(8);
            U6().o().setVisibility(0);
            android.widget.Button o17 = U6().o();
            kotlin.jvm.internal.o.f(o17, "getOpenOriginFileBtn(...)");
            com.tencent.mm.ui.kk.d(o17, com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479657bu));
            U6().p().setVisibility(0);
            if (this.f362108h) {
                return;
            }
            kd5.e T65 = T6();
            if (T65 != null && !T65.L) {
                z19 = true;
            }
            if (z19) {
                j75.f Q6 = Q6();
                if (Q6 != null) {
                    kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209724i);
                    nVar.f306904c = true;
                    Q6.B3(nVar);
                }
                this.f362108h = true;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.c2(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f362107g) {
            kd5.e T6 = T6();
            if (T6 != null && T6.G) {
                kd5.e T62 = T6();
                if ((T62 == null || T62.L) ? false : true) {
                    V6();
                }
            }
        }
    }
}
