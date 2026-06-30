package te2;

/* loaded from: classes3.dex */
public final class za extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418569d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(te2.hc hcVar) {
        super(2);
        this.f418569d = hcVar;
    }

    public static final void a(te2.hc hcVar, r45.h32 h32Var, int i17) {
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String str = hcVar.M;
        if (str == null) {
            kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
            throw null;
        }
        java.lang.String string = h32Var.getString(4);
        kotlin.jvm.internal.o.d(string);
        gm0.j1.d().g(c61.zb.x3(zbVar, str, string, i17, null, hcVar.getContext().getIntent().getStringExtra("key_promotion_token"), 0, null, null, null, null, null, null, null, 8128, null));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String str2 = hcVar.M;
        if (str2 == null) {
            kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
            throw null;
        }
        java.lang.String string2 = h32Var.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        if (((b92.d1) zbVar2).bj(str2, string2) == null) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str3 = hcVar.M;
            if (str3 == null) {
                kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                throw null;
            }
            java.lang.String string3 = h32Var.getString(4);
            ((b92.d1) zbVar3).Ai(str3, string3 != null ? string3 : "", h32Var);
        } else {
            c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str4 = hcVar.M;
            if (str4 == null) {
                kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                throw null;
            }
            java.lang.String string4 = h32Var.getString(4);
            r45.h32 bj6 = ((b92.d1) zbVar4).bj(str4, string4 != null ? string4 : "");
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
            }
        }
        android.app.Activity context = hcVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        te2.e4 e4Var = (te2.e4) ((zy2.g8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.g8.class));
        java.lang.String str5 = hcVar.M;
        if (str5 == null) {
            kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
            throw null;
        }
        e4Var.f417974d.M0(str5);
        r45.h32 h32Var2 = hcVar.f418068J;
        if (h32Var2 != null) {
            com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView bigGreenNoticeStatusView = (com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView) ((jz5.n) hcVar.A).getValue();
            kotlin.jvm.internal.o.f(bigGreenNoticeStatusView, "access$getBookBtn(...)");
            java.lang.String str6 = hcVar.M;
            if (str6 != null) {
                com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.g(bigGreenNoticeStatusView, str6, false, new te2.ya(h32Var2), 2, null);
            } else {
                kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if ((r3.length() > 0) == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(te2.hc r25) {
        /*
            r0 = r25
            r45.h32 r1 = r0.f418068J
            r2 = 1
            if (r1 != 0) goto L8
            goto Lf
        L8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.set(r2, r3)
        Lf:
            cl0.g r1 = new cl0.g
            r1.<init>()
            java.lang.String r3 = "source_type"
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.s(r3, r5)
            r45.h32 r3 = r0.f418068J
            if (r3 == 0) goto L34
            r5 = 10
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r5)
            r45.q65 r3 = (r45.q65) r3
            if (r3 == 0) goto L34
            boolean r3 = r3.getBoolean(r4)
            if (r3 != r2) goto L34
            r3 = r2
            goto L35
        L34:
            r3 = r4
        L35:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "pay_type"
            r1.s(r5, r3)
            r45.h32 r3 = r0.f418068J
            if (r3 == 0) goto L56
            r5 = 8
            java.lang.String r3 = r3.getString(r5)
            if (r3 == 0) goto L56
            int r3 = r3.length()
            if (r3 <= 0) goto L52
            r3 = r2
            goto L53
        L52:
            r3 = r4
        L53:
            if (r3 != r2) goto L56
            goto L57
        L56:
            r2 = r4
        L57:
            if (r2 == 0) goto L5c
            java.lang.String r2 = "get_ticket"
            goto L5e
        L5c:
            java.lang.String r2 = ""
        L5e:
            java.lang.String r3 = "page_type"
            r1.s(r3, r2)
            java.lang.Class<c50.c1> r2 = c50.c1.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r3 = "getService(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            r4 = r2
            c50.c1 r4 = (c50.c1) r4
            ml2.i5 r5 = ml2.i5.f327572g
            java.lang.String r6 = r0.M
            r2 = 0
            if (r6 == 0) goto Lc2
            r7 = 0
            r9 = 0
            java.lang.String r10 = "200"
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r16 = r1.toString()
            r45.h32 r1 = r0.f418068J
            if (r1 == 0) goto L92
            r2 = 4
            java.lang.String r1 = r1.getString(r2)
            r17 = r1
            goto L94
        L92:
            r17 = r2
        L94:
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 62432(0xf3e0, float:8.7486E-41)
            r24 = 0
            c50.c1.l9(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24)
            r45.h32 r1 = r0.f418068J
            if (r1 == 0) goto Lac
            r2 = 2
            a(r0, r1, r2)
        Lac:
            android.app.Activity r1 = r25.getContext()
            android.app.Activity r0 = r25.getContext()
            r2 = 2131761815(0x7f101a97, float:1.915469E38)
            java.lang.String r0 = r0.getString(r2)
            r2 = 2131690843(0x7f0f055b, float:1.9010741E38)
            db5.t7.i(r1, r0, r2)
            return
        Lc2:
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.o(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.za.d(te2.hc):void");
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ov2 a17;
        java.lang.String string;
        r45.q65 q65Var;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        te2.hc hcVar = this.f418569d;
        if (intValue != -1) {
            r45.h32 h32Var = hcVar.f418068J;
            boolean z17 = false;
            if (h32Var != null) {
                h32Var.set(1, 0);
            }
            if (intValue == 1) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).wi(hcVar.getContext(), 2, false, new te2.wa(hcVar));
                cl0.g gVar = new cl0.g();
                gVar.s("source_type", java.lang.Integer.valueOf(intValue2 == 1 ? 1 : 0));
                r45.h32 h32Var2 = hcVar.f418068J;
                gVar.s("pay_type", java.lang.Integer.valueOf((h32Var2 == null || (q65Var = (r45.q65) h32Var2.getCustom(10)) == null || !q65Var.getBoolean(0)) ? 0 : 1));
                r45.h32 h32Var3 = hcVar.f418068J;
                if (h32Var3 != null && (string = h32Var3.getString(8)) != null) {
                    if (string.length() > 0) {
                        z17 = true;
                    }
                }
                gVar.s("page_type", z17 ? "get_ticket" : "");
                cl0.g gVar2 = new cl0.g();
                r45.h32 h32Var4 = hcVar.f418068J;
                gVar2.h("coupon_id", (h32Var4 == null || (a17 = zl2.t.a(h32Var4)) == null) ? null : a17.getString(1));
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str = hcVar.M;
                if (str == null) {
                    kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                    throw null;
                }
                java.lang.String gVar3 = gVar.toString();
                r45.h32 h32Var5 = hcVar.f418068J;
                c50.c1.l9(c1Var, i5Var, str, 0L, 0, "200", null, null, null, null, null, gVar3, h32Var5 != null ? h32Var5.getString(4) : null, gVar2.toString(), 0L, 0, null, 58336, null);
                r45.h32 h32Var6 = hcVar.f418068J;
                if (h32Var6 != null) {
                    a(hcVar, h32Var6, 1);
                }
            }
        } else if (intValue2 != 0) {
            d(hcVar);
        } else {
            r45.h32 h32Var7 = hcVar.f418068J;
            if (h32Var7 != null) {
                if (hcVar.M == null) {
                    kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
                    throw null;
                }
                te2.xa xaVar = new te2.xa(hcVar);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) hcVar.getActivity(), 1, true);
                k0Var.X1 = true;
                k0Var.f211872n = new te2.ec(hcVar);
                k0Var.f211881s = new te2.fc(h32Var7, xaVar);
                k0Var.v();
            }
        }
        return jz5.f0.f302826a;
    }
}
