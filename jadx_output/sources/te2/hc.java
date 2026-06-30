package te2;

/* loaded from: classes3.dex */
public final class hc extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public r45.l32 E;
    public java.lang.String F;
    public int G;
    public java.lang.String H;
    public ya2.b2 I;

    /* renamed from: J, reason: collision with root package name */
    public r45.h32 f418068J;
    public com.tencent.mm.ui.widget.dialog.u3 K;
    public boolean L;
    public java.lang.String M;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f418069d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f418070e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f418071f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f418072g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f418073h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f418074i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f418075m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f418076n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f418077o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f418078p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f418079q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f418080r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f418081s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f418082t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f418083u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f418084v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f418085w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f418086x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f418087y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f418088z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f418069d = jz5.h.b(new te2.vb(activity));
        this.f418070e = jz5.h.b(new te2.fb(activity));
        this.f418071f = jz5.h.b(new te2.pb(activity));
        this.f418072g = jz5.h.b(new te2.kb(activity));
        this.f418073h = jz5.h.b(new te2.rb(activity));
        this.f418074i = jz5.h.b(new te2.sb(activity));
        this.f418075m = jz5.h.b(new te2.ac(activity));
        this.f418076n = jz5.h.b(new te2.eb(activity));
        this.f418077o = jz5.h.b(new te2.ob(activity));
        this.f418078p = jz5.h.b(new te2.nb(activity));
        this.f418079q = jz5.h.b(new te2.wb(activity));
        this.f418080r = jz5.h.b(new te2.ub(activity));
        this.f418081s = jz5.h.b(new te2.tb(activity));
        this.f418082t = jz5.h.b(new te2.mb(activity));
        this.f418083u = jz5.h.b(new te2.gb(activity));
        this.f418084v = jz5.h.b(new te2.xb(activity));
        this.f418085w = jz5.h.b(new te2.yb(activity));
        this.f418086x = jz5.h.b(new te2.lb(activity));
        this.f418087y = jz5.h.b(new te2.ib(activity, this));
        this.f418088z = jz5.h.b(new te2.dc(activity));
        this.A = jz5.h.b(new te2.ga(activity));
        this.B = jz5.h.b(new te2.cc(activity));
        this.C = jz5.h.b(new te2.qb(activity));
        this.D = jz5.h.b(new te2.jb(this));
        this.F = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (kotlinx.coroutines.k1.b(100, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(te2.hc r4, kotlin.coroutines.Continuation r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof te2.ua
            if (r0 == 0) goto L16
            r0 = r5
            te2.ua r0 = (te2.ua) r0
            int r1 = r0.f418485g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f418485g = r1
            goto L1b
        L16:
            te2.ua r0 = new te2.ua
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f418483e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f418485g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f418482d
            te2.hc r4 = (te2.hc) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L50
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r5 = r4.R6()
            if (r5 == 0) goto L43
            r2 = 0
            r5.setRadius(r2)
        L43:
            r0.f418482d = r4
            r0.f418485g = r3
            r2 = 100
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r2, r0)
            if (r5 != r1) goto L50
            goto L6f
        L50:
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r5 = r4.R6()
            android.graphics.Bitmap r1 = com.tencent.mm.sdk.platformtools.x.b0(r5)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r5 = r4.R6()
            if (r5 == 0) goto L6c
            android.app.Activity r4 = r4.getContext()
            r0 = 20
            int r4 = com.tencent.mm.plugin.appbrand.ui.u5.a(r4, r0)
            float r4 = (float) r4
            r5.setRadius(r4)
        L6c:
            kotlin.jvm.internal.o.d(r1)
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.hc.O6(te2.hc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final android.widget.TextView P6() {
        return (android.widget.TextView) ((jz5.n) this.f418087y).getValue();
    }

    public final android.widget.TextView Q6() {
        return (android.widget.TextView) ((jz5.n) this.f418077o).getValue();
    }

    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout R6() {
        return (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) ((jz5.n) this.f418081s).getValue();
    }

    public final void S6() {
        r45.l94 b17;
        java.lang.String string;
        r45.ov2 a17;
        java.lang.String str;
        P6().setVisibility(8);
        r45.h32 h32Var = this.f418068J;
        java.lang.String str2 = "";
        if (h32Var != null && (a17 = zl2.t.a(h32Var)) != null && com.tencent.mm.plugin.finder.assist.o7.a(a17)) {
            r45.l1 l1Var = (r45.l1) a17.getCustom(19);
            if (l1Var != null && com.tencent.mm.plugin.finder.assist.a.a(l1Var)) {
                P6().setVisibility(0);
                P6().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
                P6().setText(getContext().getResources().getString(com.tencent.mm.R.string.ljk, a17.getString(20)));
            } else {
                r45.h32 h32Var2 = this.f418068J;
                if (h32Var2 != null && zl2.t.e(h32Var2)) {
                    P6().setVisibility(0);
                    P6().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo));
                    P6().setText(getContext().getResources().getString(com.tencent.mm.R.string.ljj, a17.getString(20)));
                }
            }
            if (P6().getVisibility() == 0) {
                java.lang.String string2 = a17.getString(1);
                if (string2 == null) {
                    string2 = "";
                }
                r45.h32 h32Var3 = this.f418068J;
                if (h32Var3 == null || (str = h32Var3.getString(4)) == null) {
                    str = "";
                }
                cl0.g gVar = new cl0.g();
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                gVar.h("finderuin", xy2.c.e(context));
                gVar.h("coupon_id", string2);
                gVar.h("noticeid", str);
                gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                com.tencent.mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct();
                liveAudienceCommodityLogStruct.f58570l = liveAudienceCommodityLogStruct.b("Event", "expose_get_coupon_btn_after_reserve", true);
                liveAudienceCommodityLogStruct.f58571m = liveAudienceCommodityLogStruct.b("Params", r26.i0.t(gVar2, ",", ";", false), true);
                liveAudienceCommodityLogStruct.k();
            }
        }
        r45.h32 h32Var4 = this.f418068J;
        if (h32Var4 == null || (b17 = zl2.t.b(h32Var4)) == null) {
            return;
        }
        if (b17.getInteger(1) > 0) {
            P6().setVisibility(0);
            P6().setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo));
            P6().setText(getContext().getResources().getString(com.tencent.mm.R.string.oxr, java.lang.Integer.valueOf(b17.getInteger(1))));
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.u1 u1Var = ml2.u1.f328084s3;
        jz5.l[] lVarArr = new jz5.l[1];
        r45.h32 h32Var5 = this.f418068J;
        if (h32Var5 != null && (string = h32Var5.getString(4)) != null) {
            str2 = string;
        }
        lVarArr[0] = new jz5.l("noticeid", str2);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        java.lang.String str3 = this.M;
        if (str3 != null) {
            zy2.zb.I8(zbVar, u1Var, l17, null, "200", null, str3, false, 84, null);
        } else {
            kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
            throw null;
        }
    }

    public final void T6() {
        android.widget.TextView textView;
        r45.ov2 a17;
        r45.h32 h32Var = this.f418068J;
        jz5.g gVar = this.f418086x;
        jz5.f0 f0Var = null;
        if (h32Var != null && (a17 = zl2.t.a(h32Var)) != null) {
            if (!com.tencent.mm.plugin.finder.assist.o7.a(a17)) {
                a17 = null;
            }
            if (a17 != null) {
                android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).getValue();
                if (textView2 != null) {
                    textView2.setText(getActivity().getResources().getString(com.tencent.mm.R.string.ljm, a17.getString(20)));
                }
                android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) gVar).getValue();
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var != null || (textView = (android.widget.TextView) ((jz5.n) gVar).getValue()) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void U6() {
        r45.h32 h32Var = this.f418068J;
        if (h32Var != null) {
            com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView bigGreenNoticeStatusView = (com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView) ((jz5.n) this.A).getValue();
            kotlin.jvm.internal.o.f(bigGreenNoticeStatusView, "<get-bookBtn>(...)");
            ya2.b2 b2Var = this.I;
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.g(bigGreenNoticeStatusView, b2Var != null ? b2Var.D0() : null, false, new te2.bc(h32Var), 2, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b19;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030f  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r50) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.hc.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.d().q(6276, this);
        gm0.j1.d().q(4214, this);
        gm0.j1.d().q(6653, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        r45.h32 h32Var;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String str4;
        int i19;
        java.lang.String string2;
        int i27;
        mn2.g1 g1Var;
        android.graphics.Bitmap bitmap;
        jz5.f0 f0Var;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.protobuf.g byteString2;
        java.util.LinkedList<r45.zf5> list;
        java.lang.String string3;
        pm0.v.X(new te2.gc(false, this, null));
        str2 = "";
        if (!(m1Var instanceof db2.g6)) {
            if (!(m1Var instanceof db2.f5)) {
                if ((m1Var instanceof db2.e5) && i17 == 0 && i18 == 0 && (h32Var = this.f418068J) != null) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str5 = this.M;
                    if (str5 == null) {
                        kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                        throw null;
                    }
                    java.lang.String string4 = h32Var.getString(4);
                    r45.h32 bj6 = ((b92.d1) zbVar).bj(str5, string4 != null ? string4 : "");
                    if (bj6 != null) {
                        h32Var.set(1, java.lang.Integer.valueOf(bj6.getInteger(1)));
                        com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", "onSceneEnd: update noticeInfo status from cache, status=" + bj6.getInteger(1));
                    }
                    S6();
                    U6();
                    return;
                }
                return;
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 != -200211) {
                    db5.t7.g(getContext(), getActivity().getResources().getString(com.tencent.mm.R.string.f491714e05));
                    return;
                }
                java.lang.String string5 = str == null || str.length() == 0 ? getActivity().getResources().getString(com.tencent.mm.R.string.f491713e04) : str;
                kotlin.jvm.internal.o.d(string5);
                db5.t7.g(getContext(), string5);
                return;
            }
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            r45.h32 h32Var2 = this.f418068J;
            if (h32Var2 == null || (str3 = h32Var2.getString(4)) == null) {
                str3 = "";
            }
            ((b92.d1) zbVar2).pj(str3);
            android.content.Intent intent = new android.content.Intent();
            r45.h32 h32Var3 = this.f418068J;
            if (h32Var3 != null && (string = h32Var3.getString(4)) != null) {
                str2 = string;
            }
            intent.putExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY", str2);
            getActivity().setResult(1000, intent);
            getActivity().finish();
            db5.t7.h(getContext(), getActivity().getResources().getString(com.tencent.mm.R.string.f491715e06));
            return;
        }
        if (i17 == 0 && i18 == 0) {
            r45.l32 K = ((db2.g6) m1Var).K();
            this.E = K;
            boolean b17 = kotlin.jvm.internal.o.b(this.H, K.getString(4));
            mn2.g1 g1Var2 = mn2.g1.f329975a;
            if (b17) {
                i27 = 8;
                g1Var = g1Var2;
                str4 = "getService(...)";
                i19 = 3;
            } else {
                r45.l32 l32Var = this.E;
                java.lang.String string6 = l32Var != null ? l32Var.getString(4) : null;
                this.H = string6;
                boolean z17 = string6 == null || string6.length() == 0;
                jz5.g gVar = this.f418073h;
                jz5.g gVar2 = this.f418082t;
                if (z17) {
                    android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar2).getValue();
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setPadding(com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 32), com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 80), com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 32), com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 40));
                    android.view.ViewGroup.LayoutParams layoutParams = Q6().getLayoutParams();
                    if (layoutParams != null && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
                        ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin = com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 48);
                        Q6().setLayoutParams(layoutParams);
                    }
                } else {
                    vo0.d e17 = g1Var2.e();
                    mn2.q3 q3Var = new mn2.q3(this.H, com.tencent.mm.plugin.finder.storage.y90.f128356f);
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar2).getValue();
                    kotlin.jvm.internal.o.f(imageView2, "<get-mCoverImageView>(...)");
                    e17.c(q3Var, imageView2, g1Var2.h(mn2.f1.f329965s));
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ((jz5.n) gVar2).getValue();
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setPadding(com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 32), com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 40), com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 32), com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 40));
                    android.view.ViewGroup.LayoutParams layoutParams2 = Q6().getLayoutParams();
                    if (layoutParams2 != null && (layoutParams2 instanceof android.widget.LinearLayout.LayoutParams)) {
                        ((android.widget.LinearLayout.LayoutParams) layoutParams2).topMargin = com.tencent.mm.plugin.appbrand.ui.u5.a(getContext(), 40);
                        Q6().setLayoutParams(layoutParams2);
                    }
                }
                Q6().setVisibility(4);
                i27 = 8;
                g1Var = g1Var2;
                str4 = "getService(...)";
                i19 = 3;
                pf5.e.launchUI$default(this, null, null, new te2.ta(this, null), 3, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("qrcode url ");
            r45.l32 l32Var2 = this.E;
            sb6.append(l32Var2 != null ? l32Var2.getString(i19) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", sb6.toString());
            r45.l32 l32Var3 = this.E;
            java.lang.String string7 = l32Var3 != null ? l32Var3.getString(i19) : null;
            if (string7 == null) {
                string7 = "";
            }
            this.F = string7;
            te2.sc scVar = te2.sc.f418412a;
            r45.l32 l32Var4 = this.E;
            r45.s52 b18 = scVar.b(l32Var4 != null ? l32Var4.getInteger(i27) : 0);
            if (b18 != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", "#setStyleToUI bg_type=" + b18.getInteger(1) + " bg_sub_type=" + b18.getString(2) + " fg_color=" + b18.getString(i19) + " finder_logo_color=" + b18.getString(4) + " auth_icon_url=" + b18.getString(5));
                this.G = b18.getInteger(0);
                int integer = b18.getInteger(1);
                jz5.g gVar3 = this.f418072g;
                if (integer == 0) {
                    java.lang.String string8 = b18.getString(2);
                    if (string8 != null) {
                        if (!(string8.length() > 0)) {
                            string8 = null;
                        }
                        if (string8 != null) {
                            try {
                                ((android.widget.ImageView) ((jz5.n) gVar3).getValue()).setImageBitmap(null);
                                ((android.widget.ImageView) ((jz5.n) gVar3).getValue()).setBackgroundColor(android.graphics.Color.parseColor(string8));
                            } catch (java.lang.Exception e18) {
                                com.tencent.mars.xlog.Log.e("FinderLiveNoticeQRCodeUIC", e18.toString());
                            }
                        }
                    }
                } else if (integer == 1) {
                    ya2.b2 b2Var = this.I;
                    if (b2Var != null) {
                        if (!(b2Var.D0().length() > 0)) {
                            b2Var = null;
                        }
                        if (b2Var != null) {
                            i95.m c17 = i95.n0.c(vd2.i5.class);
                            kotlin.jvm.internal.o.f(c17, str4);
                            vd2.i5.l7((vd2.i5) c17, b2Var.getAvatarUrl(), (android.widget.ImageView) ((jz5.n) gVar3).getValue(), null, 4, null);
                        }
                    }
                } else if (integer == 2 && (string3 = b18.getString(2)) != null) {
                    if (!(string3.length() > 0)) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        vo0.d e19 = g1Var.e();
                        mn2.q3 q3Var2 = new mn2.q3(string3, com.tencent.mm.plugin.finder.storage.y90.f128356f);
                        android.widget.ImageView imageView4 = (android.widget.ImageView) ((jz5.n) gVar3).getValue();
                        kotlin.jvm.internal.o.f(imageView4, "<get-mContentStyleBg>(...)");
                        e19.c(q3Var2, imageView4, g1Var.h(mn2.f1.f329965s));
                    }
                }
                java.lang.String string9 = b18.getString(i19);
                if (string9 != null) {
                    if (!(string9.length() > 0)) {
                        string9 = null;
                    }
                    if (string9 != null) {
                        try {
                            int parseColor = android.graphics.Color.parseColor(string9);
                            ((android.widget.TextView) ((jz5.n) this.f418074i).getValue()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f418075m).getValue()).setTextColor(parseColor);
                            Q6().setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f418078p).getValue()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f418079q).getValue()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f418084v).getValue()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f418085w).getValue()).setTextColor(parseColor);
                            ((android.widget.TextView) ((jz5.n) this.f418086x).getValue()).setTextColor(parseColor);
                            ((com.tencent.mm.plugin.finder.view.notice.NoticeDetailBindProductsView) ((jz5.n) this.D).getValue()).setTextColor(android.graphics.Color.argb(android.graphics.Color.alpha(parseColor) / 2, android.graphics.Color.red(parseColor), android.graphics.Color.green(parseColor), android.graphics.Color.blue(parseColor)));
                        } catch (java.lang.Exception e27) {
                            com.tencent.mars.xlog.Log.e("FinderLiveNoticeQRCodeUIC", e27.toString());
                        }
                    }
                }
                java.lang.String string10 = b18.getString(4);
                if (string10 != null) {
                    if (!(string10.length() > 0)) {
                        string10 = null;
                    }
                    if (string10 != null) {
                        try {
                            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f418071f).getValue()).setIconColor(android.graphics.Color.parseColor(string10));
                        } catch (java.lang.Exception e28) {
                            com.tencent.mars.xlog.Log.e("FinderLiveNoticeQRCodeUIC", e28.toString());
                        }
                    }
                }
                java.lang.String string11 = b18.getString(5);
                if (string11 != null) {
                    if (!(string11.length() > 0)) {
                        string11 = null;
                    }
                    if (string11 != null) {
                        vo0.d e29 = g1Var.e();
                        mn2.q3 q3Var3 = new mn2.q3(string11, com.tencent.mm.plugin.finder.storage.y90.f128356f);
                        android.widget.ImageView imageView5 = (android.widget.ImageView) ((jz5.n) this.f418076n).getValue();
                        kotlin.jvm.internal.o.f(imageView5, "<get-mAuthView>(...)");
                        e29.c(q3Var3, imageView5, g1Var.h(mn2.f1.f329965s));
                    }
                }
            }
            r45.l32 l32Var5 = this.E;
            if (l32Var5 == null || (list = l32Var5.getList(6)) == null) {
                bitmap = null;
            } else {
                bitmap = null;
                for (r45.zf5 zf5Var : list) {
                    if (zf5Var.getList(1).contains(java.lang.Integer.valueOf(this.G))) {
                        com.tencent.mm.protobuf.g byteString3 = zf5Var.getByteString(0);
                        bitmap = com.tencent.mm.sdk.platformtools.x.G(byteString3 != null ? byteString3.f192156a : null);
                    }
                }
            }
            if (bitmap == null) {
                r45.l32 l32Var6 = this.E;
                if (!((l32Var6 == null || (byteString2 = l32Var6.getByteString(2)) == null || byteString2.f192156a.length != 0) ? false : true)) {
                    r45.l32 l32Var7 = this.E;
                    bitmap = com.tencent.mm.sdk.platformtools.x.G((l32Var7 == null || (byteString = l32Var7.getByteString(2)) == null) ? null : byteString.g());
                }
            }
            if (bitmap == null) {
                r45.l32 l32Var8 = this.E;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l32Var8 != null ? l32Var8.getString(i19) : null)) {
                    r45.l32 l32Var9 = this.E;
                    java.lang.String string12 = l32Var9 != null ? l32Var9.getString(i19) : null;
                    bitmap = string12 == null ? null : ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(getActivity(), string12, 12, 0);
                }
            }
            if (bitmap != null) {
                ((android.widget.ImageView) ((jz5.n) this.f418080r).getValue()).setImageBitmap(bitmap);
                android.view.View view = (android.view.View) ((jz5.n) this.B).getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC", "setQrCodeStyle", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                db5.t7.i(getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.e1g), com.tencent.mm.R.raw.icons_filled_close);
            }
        } else {
            str4 = "getService(...)";
            i19 = 3;
            db5.t7.i(getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.e1g), com.tencent.mm.R.raw.icons_filled_close);
        }
        i95.m c18 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c18, str4);
        zy2.zb zbVar3 = (zy2.zb) c18;
        ml2.y2 y2Var = ml2.y2.f328262r;
        r45.h32 h32Var4 = this.f418068J;
        zy2.zb.qg(zbVar3, y2Var, "", (h32Var4 == null || (string2 = h32Var4.getString(i19)) == null) ? "" : string2, null, 8, null);
    }
}
