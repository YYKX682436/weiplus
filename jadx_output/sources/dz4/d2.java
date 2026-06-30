package dz4;

/* loaded from: classes12.dex */
public abstract class d2 implements dz4.z1 {
    @Override // dz4.z1
    public void a(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        dz4.i iVar = context.f245256c;
        java.lang.String str = iVar.f245292c;
        kk.j jVar = qz4.c.f367937a;
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        boolean z17 = false;
        eqVar.f6583a = 0;
        eqVar.f6584b = str;
        recordOperationEvent.e();
        r45.ul5 ul5Var = recordOperationEvent.f54664h.f6692a;
        android.app.Activity activity = context.f245254a;
        if (ul5Var == null) {
            h(activity, com.tencent.mm.R.string.cck);
            return;
        }
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.d(ul5Var.f387465f);
        bq0Var.l(ul5Var.f387467h);
        o72.r2 r2Var = new o72.r2();
        r2Var.field_type = 18;
        r2Var.field_favProto = bq0Var;
        dz4.a2 a2Var = new dz4.a2(r2Var, iVar.f245293d);
        boolean g17 = g();
        o72.r2 r2Var2 = a2Var.f245160a;
        if (g17) {
            long j17 = iVar.f245293d;
            r45.bq0 bq0Var2 = r2Var2.field_favProto;
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 32;
            z9Var.f8532e = j17;
            if (bq0Var2 != null) {
                z9Var.f8531d = bq0Var2;
            }
            favoriteOperationEvent.e();
            am.aa result = favoriteOperationEvent.f54244h;
            kotlin.jvm.internal.o.f(result, "result");
            if (result.f6136c == null) {
                h(activity, com.tencent.mm.R.string.cck);
            } else if (result.f6142i) {
                h(activity, com.tencent.mm.R.string.f489709i);
            } else {
                z17 = true;
            }
            if (!z17) {
                return;
            }
        }
        com.tencent.mm.plugin.fav.ui.e6 a17 = com.tencent.mm.plugin.fav.ui.e6.a(com.tencent.mm.sdk.platformtools.x2.f193071a, r2Var2);
        mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
        java.lang.String str2 = a17.f100831a;
        java.lang.String str3 = a17.f100832b;
        r45.bq0 field_favProto = r2Var2.field_favProto;
        kotlin.jvm.internal.o.f(field_favProto, "field_favProto");
        i(context.f245254a, d(((zs3.z) kVar).Zi(str2, str3, field_favProto), a2Var, context), context.f245257d, iVar.f245290a, context.f245255b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (r5 != 5) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dc5.a d(java.lang.String r5, dz4.a2 r6, dz4.g2 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "msgXml"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "forwardData"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r7, r0)
            dc5.a r0 = new dc5.a
            r0.<init>()
            l15.c r1 = new l15.c
            r1.<init>()
            r1.fromXml(r5)
            r0.n(r1)
            l15.c r5 = r0.k()
            if (r5 == 0) goto L2b
            v05.b r5 = r5.k()
            goto L2c
        L2b:
            r5 = 0
        L2c:
            r1 = 6
            if (r5 != 0) goto L30
            goto L3c
        L30:
            int r2 = r5.f368365d
            int r2 = r2 + r1
            r3 = 24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.set(r2, r3)
        L3c:
            long r5 = r6.f245161b
            r0.l(r5)
            dz4.i r5 = r7.f245256c
            int r5 = r5.f245290a
            r6 = 1
            if (r5 == r6) goto L51
            r7 = 4
            if (r5 == r7) goto L4f
            r7 = 5
            if (r5 == r7) goto L51
            goto L52
        L4f:
            r1 = 7
            goto L52
        L51:
            r1 = r6
        L52:
            r0.o(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.d2.d(java.lang.String, dz4.a2, dz4.g2):dc5.a");
    }

    public final android.app.Dialog e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.cax), true, false, null);
        kotlin.jvm.internal.o.f(Q, "showProgressDlg(...)");
        return Q;
    }

    public final void f(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String str = context.f245257d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteFlutterForwardChatHelper", "handleCommonForwardResult: toUser empty");
            return;
        }
        android.app.Activity activity = context.f245254a;
        android.app.Dialog e17 = e(activity);
        dz4.i iVar = context.f245256c;
        int i17 = iVar.f245290a;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavFixForwardNoteSwitch()) == 1) {
            i17 = iVar instanceof dz4.f ? 10 : iVar.f245290a;
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 13;
        z9Var.f8548u = i17;
        z9Var.f8535h = activity;
        z9Var.f8538k = str;
        z9Var.f8539l = context.f245258e;
        z9Var.f8532e = iVar.f245293d;
        z9Var.f8531d = ((hz4.f) hz4.f.wi()).f286407d.f286421o;
        z9Var.f8537j = new dz4.b2(e17, this, context);
        favoriteOperationEvent.e();
    }

    public boolean g() {
        return this instanceof dz4.i2;
    }

    public final void h(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        db5.e1.T(context, context.getString(i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r10 != 5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r10 != 5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.app.Activity r7, dc5.a r8, java.lang.String r9, int r10, ih0.p r11) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "chattingViewModel"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r11, r0)
            r0 = 1
            if (r9 == 0) goto L1b
            int r1 = r9.length()
            if (r1 != 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = r0
        L1c:
            r2 = 15
            r3 = 17
            r4 = 4
            r5 = 5
            if (r1 != 0) goto L4c
            dz4.c2 r1 = new dz4.c2
            r1.<init>(r11, r7, r9, r6)
            n13.t r11 = new n13.t
            r11.<init>()
            r11.f334133a = r1
            if (r10 == r0) goto L39
            if (r10 == r4) goto L37
            if (r10 == r5) goto L39
            goto L3a
        L37:
            r0 = r2
            goto L3a
        L39:
            r0 = r3
        L3a:
            n13.u r10 = r11.f334138f
            r10.f334139a = r0
            java.lang.Class<n13.a0> r10 = n13.a0.class
            i95.m r10 = i95.n0.c(r10)
            n13.a0 r10 = (n13.a0) r10
            dk5.y r10 = (dk5.y) r10
            r10.wi(r7, r8, r9, r11)
            goto L7f
        L4c:
            java.lang.Class<n13.b0> r9 = n13.b0.class
            i95.m r9 = i95.n0.c(r9)
            n13.b0 r9 = (n13.b0) r9
            if (r10 == r0) goto L63
            if (r10 == r4) goto L60
            if (r10 == r5) goto L5d
            r11 = 4102(0x1006, float:5.748E-42)
            goto L65
        L5d:
            r11 = 4361(0x1109, float:6.111E-42)
            goto L65
        L60:
            r11 = 4360(0x1108, float:6.11E-42)
            goto L65
        L63:
            r11 = 4096(0x1000, float:5.74E-42)
        L65:
            n13.r r1 = new n13.r
            r1.<init>()
            r1.f334118b = r11
            if (r10 == r0) goto L75
            if (r10 == r4) goto L73
            if (r10 == r5) goto L75
            goto L76
        L73:
            r0 = r2
            goto L76
        L75:
            r0 = r3
        L76:
            n13.u r10 = r1.f334120d
            r10.f334139a = r0
            dk5.b0 r9 = (dk5.b0) r9
            r9.Bi(r7, r8, r1)
        L7f:
            java.lang.Class<qx.f0> r7 = qx.f0.class
            i95.m r7 = i95.n0.c(r7)
            qx.f0 r7 = (qx.f0) r7
            px.b0 r7 = (px.b0) r7
            r7.qc(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.d2.i(android.app.Activity, dc5.a, java.lang.String, int, ih0.p):void");
    }

    public final void j(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "EnterChattingAfterTrans done config disabled");
        com.tencent.mm.ui.widget.snackbar.j.c(context.getString(com.tencent.mm.R.string.f_p), null, context, null, null);
    }
}
