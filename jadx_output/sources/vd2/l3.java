package vd2;

/* loaded from: classes3.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f435797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f435799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView f435801h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(r45.h32 h32Var, android.content.Context context, xc2.p0 p0Var, java.lang.String str, com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView bigGreenNoticeStatusView) {
        super(2);
        this.f435797d = h32Var;
        this.f435798e = context;
        this.f435799f = p0Var;
        this.f435800g = str;
        this.f435801h = bigGreenNoticeStatusView;
    }

    public static final void a(java.lang.String str, android.content.Context context, r45.h32 h32Var, com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView bigGreenNoticeStatusView, r45.h32 h32Var2, int i17) {
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String string = h32Var2.getString(4);
        kotlin.jvm.internal.o.d(string);
        gm0.j1.d().g(c61.zb.x3((c61.zb) c17, str, string, i17, null, null, 11, null, null, null, null, null, null, null, 8144, null));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String string2 = h32Var2.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        if (((b92.d1) zbVar).bj(str, string2) == null) {
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string3 = h32Var2.getString(4);
            ((b92.d1) zbVar2).Ai(str, string3 != null ? string3 : "", h32Var2);
        } else {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string4 = h32Var2.getString(4);
            r45.h32 bj6 = ((b92.d1) zbVar3).bj(str, string4 != null ? string4 : "");
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(h32Var2.getInteger(1)));
            }
        }
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.g8.class))).f417974d.M0(str);
        if (h32Var != null) {
            kotlin.jvm.internal.o.d(bigGreenNoticeStatusView);
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.g(bigGreenNoticeStatusView, str, false, new vd2.i3(h32Var), 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if ((r3.length() > 0) == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(r45.h32 r28, java.lang.String r29, android.content.Context r30, xc2.p0 r31, com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView r32) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.l3.d(r45.h32, java.lang.String, android.content.Context, xc2.p0, com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView):void");
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ov2 a17;
        java.lang.String string;
        r45.q65 q65Var;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        xc2.p0 p0Var = this.f435799f;
        android.content.Context context = this.f435798e;
        r45.h32 h32Var = this.f435797d;
        if (intValue != -1) {
            boolean z17 = false;
            if (h32Var != null) {
                h32Var.set(1, 0);
            }
            if (intValue == 1) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).wi(context, 2, false, new vd2.g3(h32Var, context));
                cl0.g gVar = new cl0.g();
                gVar.s("pay_type", java.lang.Integer.valueOf((h32Var == null || (q65Var = (r45.q65) h32Var.getCustom(10)) == null || !q65Var.getBoolean(0)) ? 0 : 1));
                if (h32Var != null && (string = h32Var.getString(8)) != null) {
                    if (string.length() > 0) {
                        z17 = true;
                    }
                }
                gVar.s("page_type", z17 ? "get_ticket" : "");
                cl0.g gVar2 = new cl0.g();
                gVar2.h("coupon_id", (h32Var == null || (a17 = zl2.t.a(h32Var)) == null) ? null : a17.getString(1));
                gVar2.o("ui_position", 1);
                c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
                ml2.i5 i5Var = ml2.i5.f327571f;
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                java.lang.String string2 = h32Var.getString(3);
                java.lang.String str = string2 == null ? "" : string2;
                java.lang.String gVar3 = gVar.toString();
                java.lang.String string3 = h32Var.getString(4);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var.f453244f;
                long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
                int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(5);
                java.lang.String gVar4 = gVar2.toString();
                kotlin.jvm.internal.o.d(c1Var);
                c50.c1.l9(c1Var, i5Var, this.f435800g, 0L, 0, valueOf, null, null, null, null, str, gVar3, string3, gVar4, itemId, integer, null, 33248, null);
                if (h32Var != null) {
                    a(this.f435800g, this.f435798e, h32Var, this.f435801h, h32Var, 1);
                }
            }
        } else if (intValue2 != 0) {
            d(h32Var, this.f435800g, context, p0Var, this.f435801h);
        } else if (h32Var != null) {
            vd2.h3 h3Var = new vd2.h3(h32Var, this.f435800g, context, p0Var, this.f435801h);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
            k0Var.f211872n = new vd2.j3(context);
            k0Var.f211881s = new vd2.k3(h3Var);
            k0Var.v();
        }
        return jz5.f0.f302826a;
    }
}
