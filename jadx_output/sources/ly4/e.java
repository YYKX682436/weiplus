package ly4;

/* loaded from: classes14.dex */
public final class e implements i95.m, ly4.j, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public xc0.a f322284d;

    /* renamed from: e, reason: collision with root package name */
    public ly4.i f322285e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f322286f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322287g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f322288h;

    /* renamed from: i, reason: collision with root package name */
    public ly4.h f322289i = ly4.h.f322295d;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f322290m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.p f322291n;

    public final void b(boolean z17) {
        if (z17) {
            i(z17);
            xc0.a aVar = this.f322284d;
            if (aVar != null) {
                com.tencent.wechat.aff.ext_device.j.f216698b.b(com.tencent.wechat.aff.ext_device.a.ExtDeviceHandoff_Download, aVar.j(), aVar.n(), c01.id.c(), ly4.a.f322278a);
                long c17 = c01.id.c();
                java.lang.String domain = aVar.l();
                aVar.p("");
                aVar.q(java.lang.String.valueOf(c17));
                java.lang.String xml = aVar.toXml();
                java.lang.String sendTime = aVar.o();
                kotlin.jvm.internal.o.g(xml, "xml");
                kotlin.jvm.internal.o.g(domain, "domain");
                kotlin.jvm.internal.o.g(sendTime, "sendTime");
                java.lang.String r17 = c01.z1.r();
                kotlin.jvm.internal.o.d(r17);
                this.f322285e = new ly4.i(xml, domain, sendTime, r17, r17, this);
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                ly4.i iVar = this.f322285e;
                if (iVar == null) {
                    kotlin.jvm.internal.o.o("sendHandler");
                    throw null;
                }
                d17.g(iVar);
            }
        } else {
            yz5.a aVar2 = this.f322290m;
            if (aVar2 != null) {
                i(z17);
                aVar2.invoke();
            }
        }
        this.f322290m = null;
    }

    public final boolean c() {
        if (c01.d9.b().F()) {
            if (ug3.i.f427539m != c01.d9.b().x()) {
                c01.d9.e().g(new ug3.i(c01.d9.b().x()));
                return false;
            }
        }
        if (!c01.d9.b().F()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!com.tencent.mm.ui.bk.A() || !c01.d9.b().F()) {
                return false;
            }
            int i17 = ug3.i.f427542p;
            if (ug3.i.f427540n != 0) {
                return false;
            }
            if (i17 != 2 && i17 != 1) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String f(ly4.h descType) {
        kotlin.jvm.internal.o.g(descType, "descType");
        if (!c()) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f489896me2);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        int ordinal = descType.ordinal();
        if (ordinal == 0) {
            return "";
        }
        if (ordinal == 1) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.mdz);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal == 2) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f489895me1);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            return string3;
        }
        if (ordinal != 3) {
            throw new jz5.j();
        }
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f489893me0);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        return string4;
    }

    public final boolean h(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    public final void i(boolean z17) {
        xc0.a aVar = this.f322284d;
        if (aVar != null) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            java.lang.String l17 = aVar.l();
            if (l17 == null) {
                l17 = "";
            }
            lVarArr[0] = new jz5.l("dl_domain_name", l17);
            java.lang.String n17 = aVar.n();
            lVarArr[1] = new jz5.l("ad_linkid", n17 != null ? n17 : "");
            lVarArr[2] = new jz5.l("pop_win_btn", java.lang.Integer.valueOf(z17 ? 1 : 2));
            lVarArr[3] = new jz5.l("pop_win_type", java.lang.Integer.valueOf(c() ? 1 : 2));
            lVarArr[4] = new jz5.l("view_id", "mobile_confirm_pop_win");
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 34575);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.content.Context r17, xc0.a r18) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly4.e.k(android.content.Context, xc0.a):void");
    }

    public final void l(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f322286f;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        boolean c17 = c();
        if (!z17) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.f492667hf0);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c().setOnDismissListener(this);
            return;
        }
        if (c17) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = f(this.f322289i);
            e4Var2.b(com.tencent.mm.R.raw.icons_outlined_display);
            e4Var2.c().setOnDismissListener(this);
            return;
        }
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var3.f211776c = f(this.f322289i);
        e4Var3.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var3.c().setOnDismissListener(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        yz5.p pVar = this.f322291n;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(this.f322287g), this.f322288h);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        yz5.p pVar = this.f322291n;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(this.f322287g), this.f322288h);
        }
    }
}
