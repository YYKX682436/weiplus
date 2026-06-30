package dn2;

/* loaded from: classes3.dex */
public final class v implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f241988a = jz5.h.b(dn2.r.f241968d);

    public static final void e(dn2.v vVar, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str, java.lang.String str2) {
        df2.yi yiVar;
        vVar.getClass();
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (yiVar = (df2.yi) liveRoomControllerStore.controller(df2.yi.class)) == null) {
            return;
        }
        if (yiVar.U6()) {
            yiVar.W6(new dn2.u(vVar, context, finderJumpInfo, str, str2));
        } else {
            vVar.h(context, finderJumpInfo, str, str2);
        }
    }

    @Override // dn2.e
    public java.lang.Integer a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @Override // dn2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.view.View r5, dk2.zf r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            java.lang.Object r6 = r6.D()
            boolean r0 = r6 instanceof r45.uj1
            r1 = 0
            if (r0 == 0) goto Lc
            r45.uj1 r6 = (r45.uj1) r6
            goto Ld
        Lc:
            r6 = r1
        Ld:
            r0 = 0
            r2 = 1
            if (r6 == 0) goto L18
            int r3 = r6.getInteger(r0)
            if (r3 != r2) goto L18
            r0 = r2
        L18:
            if (r0 == 0) goto L67
            r0 = 2131302010(0x7f09167a, float:1.8222094E38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r2, r0)
            r45.hi1 r0 = new r45.hi1
            r0.<init>()
            com.tencent.mm.protobuf.g r6 = r6.getByteString(r2)
            if (r6 == 0) goto L38
            byte[] r6 = r6.g()
            goto L39
        L38:
            r6 = r1
        L39:
            if (r6 != 0) goto L3d
        L3b:
            r0 = r1
            goto L4e
        L3d:
            r0.parseFrom(r6)     // Catch: java.lang.Exception -> L41
            goto L4e
        L41:
            r6 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r2 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r2, r0, r6)
            goto L3b
        L4e:
            if (r0 == 0) goto L58
            r6 = 7
            com.tencent.mm.protobuf.f r6 = r0.getCustom(r6)
            r1 = r6
            r45.n32 r1 = (r45.n32) r1
        L58:
            if (r5 == 0) goto L67
            if (r1 == 0) goto L67
            xt2.a0 r6 = xt2.a0.f456611a
            java.lang.Object r5 = r6.f(r5, r1, r7)
            pz5.a r6 = pz5.a.f359186d
            if (r5 != r6) goto L67
            return r5
        L67:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.v.b(android.view.View, dk2.zf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0175, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0412, code lost:
    
        if (r0 != null) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x047a A[Catch: Exception -> 0x04cf, TryCatch #0 {Exception -> 0x04cf, blocks: (B:91:0x045e, B:93:0x0464, B:97:0x0472, B:101:0x047a, B:103:0x0486, B:105:0x04a5, B:106:0x04c6), top: B:90:0x045e }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0486 A[Catch: Exception -> 0x04cf, TryCatch #0 {Exception -> 0x04cf, blocks: (B:91:0x045e, B:93:0x0464, B:97:0x0472, B:101:0x047a, B:103:0x0486, B:105:0x04a5, B:106:0x04c6), top: B:90:0x045e }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04a5 A[Catch: Exception -> 0x04cf, TryCatch #0 {Exception -> 0x04cf, blocks: (B:91:0x045e, B:93:0x0464, B:97:0x0472, B:101:0x047a, B:103:0x0486, B:105:0x04a5, B:106:0x04c6), top: B:90:0x045e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0265 A[Catch: Exception -> 0x02ba, TryCatch #3 {Exception -> 0x02ba, blocks: (B:29:0x0249, B:31:0x024f, B:35:0x025d, B:39:0x0265, B:41:0x0271, B:43:0x0290, B:44:0x02b1), top: B:28:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0271 A[Catch: Exception -> 0x02ba, TryCatch #3 {Exception -> 0x02ba, blocks: (B:29:0x0249, B:31:0x024f, B:35:0x025d, B:39:0x0265, B:41:0x0271, B:43:0x0290, B:44:0x02b1), top: B:28:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0290 A[Catch: Exception -> 0x02ba, TryCatch #3 {Exception -> 0x02ba, blocks: (B:29:0x0249, B:31:0x024f, B:35:0x025d, B:39:0x0265, B:41:0x0271, B:43:0x0290, B:44:0x02b1), top: B:28:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0476  */
    @Override // dn2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View c(android.view.View r30, dk2.zf r31, cn2.p0 r32) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.v.c(android.view.View, dk2.zf, cn2.p0):android.view.View");
    }

    public final float f() {
        return ((java.lang.Number) ((jz5.n) this.f241988a).getValue()).floatValue();
    }

    public final void g(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.g gVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("msg_type", i18);
        jSONObject.put("msg_txt", str);
        jSONObject.put("game_json", gVar != null ? new java.lang.String(gVar.g(), r26.c.f368865a) : "");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327239j2, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e_m;
    }

    public final void h(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str, java.lang.String str2) {
        android.content.Intent intent;
        java.lang.String stringExtra;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("backendExtData", str);
        jSONObject.put("uxInfo", zl2.r4.f473950a.j0(context));
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str3 = a52.a.f1584l;
        java.lang.String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("commentScene", str3);
        jSONObject.put("enterImmerseType", dk2.q4.f233938a.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type"));
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (intent = mMActivity.getIntent()) != null && (stringExtra = intent.getStringExtra("KEY_GAMECENTER_PARAMS_ID")) != null) {
            str4 = stringExtra;
        }
        jSONObject.put("gameClientParams", str4);
        com.tencent.mars.xlog.Log.i("LiveGamePromoteBulletItem", "onclick-tag, json = " + jSONObject);
        sVar.d(kz5.b1.e(new jz5.l("preInjectData", jSONObject.toString())));
        ((c61.p2) ybVar).Oj(context, finderJumpInfo, sVar);
    }
}
