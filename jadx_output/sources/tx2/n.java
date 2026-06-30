package tx2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.s f422615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tx2.s sVar) {
        super(2);
        this.f422615d = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if ((r3.length() > 0) == true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(tx2.s r26) {
        /*
            r0 = r26
            r45.h32 r1 = r0.f422649e
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.set(r2, r3)
            cl0.g r1 = new cl0.g
            r1.<init>()
            java.lang.String r3 = "source_type"
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.s(r3, r5)
            r45.h32 r3 = r0.f422649e
            r5 = 10
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r5)
            r45.q65 r3 = (r45.q65) r3
            if (r3 == 0) goto L2f
            boolean r3 = r3.getBoolean(r4)
            if (r3 != r2) goto L2f
            r3 = r2
            goto L30
        L2f:
            r3 = r4
        L30:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "pay_type"
            r1.s(r5, r3)
            r45.h32 r3 = r0.f422649e
            r5 = 8
            java.lang.String r3 = r3.getString(r5)
            if (r3 == 0) goto L4f
            int r3 = r3.length()
            if (r3 <= 0) goto L4b
            r3 = r2
            goto L4c
        L4b:
            r3 = r4
        L4c:
            if (r3 != r2) goto L4f
            goto L50
        L4f:
            r2 = r4
        L50:
            java.lang.String r3 = ""
            if (r2 == 0) goto L57
            java.lang.String r2 = "get_ticket"
            goto L58
        L57:
            r2 = r3
        L58:
            java.lang.String r4 = "page_type"
            r1.s(r4, r2)
            java.lang.Class<c50.c1> r2 = c50.c1.class
            i95.m r2 = i95.n0.c(r2)
            java.lang.String r4 = "getService(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            r5 = r2
            c50.c1 r5 = (c50.c1) r5
            ml2.i5 r6 = ml2.i5.f327572g
            java.lang.String r7 = r0.f422646b
            r8 = 0
            r10 = 0
            int r2 = r0.f422645a
            java.lang.String r11 = java.lang.String.valueOf(r2)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r45.h32 r2 = r0.f422649e
            r4 = 3
            java.lang.String r2 = r2.getString(r4)
            if (r2 != 0) goto L88
            r16 = r3
            goto L8a
        L88:
            r16 = r2
        L8a:
            java.lang.String r17 = r1.toString()
            r45.h32 r1 = r0.f422649e
            r2 = 4
            java.lang.String r18 = r1.getString(r2)
            cl0.g r1 = r0.f422654j
            if (r1 == 0) goto L9e
            java.lang.String r1 = r1.toString()
            goto L9f
        L9e:
            r1 = 0
        L9f:
            r19 = r1
            long r1 = r0.f422650f
            r45.qt2 r3 = r0.f422648d
            r4 = 5
            int r22 = r3.getInteger(r4)
            r23 = 0
            r24 = 33248(0x81e0, float:4.659E-41)
            r25 = 0
            r20 = r1
            c50.c1.l9(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25)
            r1 = 2
            tx2.s.a(r0, r1)
            android.app.Activity r1 = r0.f422647c
            r2 = 2131761815(0x7f101a97, float:1.915469E38)
            java.lang.String r2 = r1.getString(r2)
            r3 = 2131690843(0x7f0f055b, float:1.9010741E38)
            db5.t7.i(r1, r2, r3)
            yz5.p r0 = r0.f422653i
            if (r0 == 0) goto Ld2
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1, r1)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tx2.n.a(tx2.s):void");
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        tx2.s sVar = this.f422615d;
        boolean z17 = false;
        boolean z18 = sVar.f422649e.getInteger(9) == 1;
        if (intValue != -1) {
            sVar.f422649e.set(1, 0);
            if (intValue == 1) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).wi(sVar.f422647c, 2, false, new tx2.l(sVar, z18));
                cl0.g gVar = new cl0.g();
                gVar.s("source_type", java.lang.Integer.valueOf(intValue2 == 1 ? 1 : 0));
                r45.q65 q65Var = (r45.q65) sVar.f422649e.getCustom(10);
                gVar.s("pay_type", java.lang.Integer.valueOf((q65Var == null || !q65Var.getBoolean(0)) ? 0 : 1));
                java.lang.String string2 = sVar.f422649e.getString(8);
                if (string2 != null) {
                    if (string2.length() > 0) {
                        z17 = true;
                    }
                }
                gVar.s("page_type", z17 ? "get_ticket" : "");
                cl0.g gVar2 = sVar.f422654j;
                if (gVar2 == null) {
                    gVar2 = new cl0.g();
                }
                r45.ov2 a17 = zl2.t.a(sVar.f422649e);
                gVar2.h("coupon_id", a17 != null ? a17.getString(1) : null);
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str = sVar.f422646b;
                java.lang.String valueOf = java.lang.String.valueOf(sVar.f422645a);
                r45.h32 h32Var = sVar.f422649e;
                c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, (h32Var == null || (string = h32Var.getString(3)) == null) ? "" : string, gVar.toString(), sVar.f422649e.getString(4), gVar2.toString(), sVar.f422650f, sVar.f422648d.getInteger(5), null, 33248, null);
                if (z18) {
                    i95.m c18 = i95.n0.c(c61.zb.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    java.lang.String str2 = sVar.f422646b;
                    java.lang.String string3 = sVar.f422649e.getString(4);
                    kotlin.jvm.internal.o.d(string3);
                    gm0.j1.d().g(c61.zb.x3((c61.zb) c18, str2, string3, 1, sVar.f422648d, sVar.f422647c.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(sVar.f422652h), null, null, null, null, null, null, null, 8128, null));
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str3 = sVar.f422646b;
                    java.lang.String string4 = sVar.f422649e.getString(4);
                    if (string4 == null) {
                        string4 = "";
                    }
                    if (((b92.d1) zbVar).bj(str3, string4) == null) {
                        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str4 = sVar.f422646b;
                        java.lang.String string5 = sVar.f422649e.getString(4);
                        if (string5 == null) {
                            string5 = "";
                        }
                        ((b92.d1) zbVar2).Ai(str4, string5, sVar.f422649e);
                    } else {
                        c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str5 = sVar.f422646b;
                        java.lang.String string6 = sVar.f422649e.getString(4);
                        if (string6 == null) {
                            string6 = "";
                        }
                        r45.h32 bj6 = ((b92.d1) zbVar3).bj(str5, string6);
                        if (bj6 != null) {
                            bj6.set(1, java.lang.Integer.valueOf(sVar.f422649e.getInteger(1)));
                        }
                    }
                    android.app.Activity context = sVar.f422647c;
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((te2.e4) ((zy2.g8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.g8.class))).f417974d.M0(sVar.f422646b);
                } else {
                    tx2.s.a(sVar, 1);
                }
                yz5.p pVar = sVar.f422653i;
                if (pVar != null) {
                    pVar.invoke(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(z18));
                }
            }
            if (z18) {
                r45.h32 h32Var2 = sVar.f422649e;
                java.lang.String str6 = sVar.f422646b;
                java.lang.String string7 = h32Var2.getString(8);
                java.lang.String str7 = string7 == null ? "" : string7;
                java.lang.String string8 = h32Var2.getString(4);
                pq5.g l17 = new db2.b2(str7, null, null, 0L, 0L, string8 == null ? "" : string8, 1, false, 158, null).l();
                android.app.Activity activity = sVar.f422647c;
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) activity);
                l17.K(new tx2.p(sVar, str6));
            }
        } else if (!z18) {
            if (intValue2 != 0) {
                a(sVar);
            } else {
                tx2.m mVar = new tx2.m(sVar);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) sVar.f422647c, 1, true);
                k0Var.f211872n = new tx2.q(sVar);
                k0Var.f211881s = new tx2.r(mVar);
                k0Var.v();
            }
        }
        return jz5.f0.f302826a;
    }
}
