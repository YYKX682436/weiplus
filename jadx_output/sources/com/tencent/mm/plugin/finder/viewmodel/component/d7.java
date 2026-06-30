package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d7 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f134085e = kz5.c1.k(new jz5.l("title_wording", java.lang.Integer.valueOf(com.tencent.mm.R.id.vfz)), new jz5.l("content_wording", java.lang.Integer.valueOf(com.tencent.mm.R.id.szu)), new jz5.l("thumb_wording", java.lang.Integer.valueOf(com.tencent.mm.R.id.veo)), new jz5.l("heart_wording", java.lang.Integer.valueOf(com.tencent.mm.R.id.u2a)));

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f134086f = kz5.c1.k(new jz5.l("title_wording_voice_over", "title_wording"), new jz5.l("content_wording_voice_over", "content_wording"));

    /* renamed from: d, reason: collision with root package name */
    public boolean f134087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final java.util.Map O6(com.tencent.mm.plugin.finder.viewmodel.component.d7 d7Var, dm.x3 x3Var) {
        d7Var.getClass();
        in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(d7Var.getActivity());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = Lj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Lj : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        lVarArr[1] = new jz5.l("session_buffer", baseFinderFeed != null ? baseFinderFeed.g0() : null);
        lVarArr[2] = new jz5.l("edu_biz_type", java.lang.Integer.valueOf(x3Var.field_biz_type));
        lVarArr[3] = new jz5.l("bypass", x3Var.field_bypass_buffer);
        lVarArr[4] = new jz5.l("trigger_ts", java.lang.Integer.valueOf(c01.id.e()));
        r45.bf0 bf0Var = x3Var.field_display_info;
        lVarArr[5] = new jz5.l("edu_style_type", bf0Var != null ? java.lang.Integer.valueOf(bf0Var.getInteger(3)) : null);
        return kz5.c1.k(lVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        Q6(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0048 A[Catch: all -> 0x0041, LOOP:0: B:6:0x0048->B:34:0x0082, LOOP_START, TryCatch #0 {all -> 0x0041, blocks: (B:45:0x0039, B:6:0x0048, B:8:0x004e, B:15:0x006b, B:17:0x0071, B:19:0x0078, B:22:0x007e, B:34:0x0082, B:38:0x0061, B:39:0x0064, B:40:0x0067), top: B:44:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P6(java.util.List r12) {
        /*
            r11 = this;
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            c61.l7 r0 = (c61.l7) r0
            jz5.g r0 = r0.H
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.finder.storage.r r0 = (com.tencent.mm.plugin.finder.storage.r) r0
            int r1 = c01.id.e()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "storageCount: "
            r2.<init>(r3)
            int r3 = r0.getCount()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderCommonEducationUIC"
            com.tencent.mars.xlog.Log.i(r3, r2)
            android.database.Cursor r0 = r0.getAll()
            r2 = 1
            if (r0 == 0) goto L44
            boolean r4 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L41
            if (r4 != r2) goto L44
            r4 = r2
            goto L45
        L41:
            r12 = move-exception
            goto Lb6
        L44:
            r4 = 0
        L45:
            r5 = 0
            if (r4 == 0) goto Lbc
        L48:
            boolean r4 = r0.isAfterLast()     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto Lbc
            dm.x3 r4 = new dm.x3     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            r4.convertFrom(r0)     // Catch: java.lang.Throwable -> L41
            int r6 = r4.field_biz_type     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L67
            if (r6 == r2) goto L64
            r7 = 2
            if (r6 == r7) goto L61
            r6 = r5
            goto L69
        L61:
            r45.ki0 r6 = r45.ki0.EDU_BIZ_TYPE_CANCEL_LIKE     // Catch: java.lang.Throwable -> L41
            goto L69
        L64:
            r45.ki0 r6 = r45.ki0.EDU_BIZ_TYPE_LIKE     // Catch: java.lang.Throwable -> L41
            goto L69
        L67:
            r45.ki0 r6 = r45.ki0.EDU_BIZ_TYPE_UNKNOWN     // Catch: java.lang.Throwable -> L41
        L69:
            if (r6 == 0) goto L82
            boolean r7 = r12.contains(r6)     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L82
            long r7 = (long) r1     // Catch: java.lang.Throwable -> L41
            long r9 = r4.field_start_ts     // Catch: java.lang.Throwable -> L41
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L82
            long r9 = r4.field_end_ts     // Catch: java.lang.Throwable -> L41
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L82
            r11.Q6(r4)     // Catch: java.lang.Throwable -> L41
            goto Lbc
        L82:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r7.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "item can not show, bizType: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L41
            r7.append(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = ", start: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L41
            long r8 = r4.field_start_ts     // Catch: java.lang.Throwable -> L41
            r7.append(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = ", end: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L41
            long r8 = r4.field_end_ts     // Catch: java.lang.Throwable -> L41
            r7.append(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = ", serverTime: "
            r7.append(r4)     // Catch: java.lang.Throwable -> L41
            r7.append(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L41
            com.tencent.mars.xlog.Log.i(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.moveToNext()     // Catch: java.lang.Throwable -> L41
            goto L48
        Lb6:
            throw r12     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r1 = move-exception
            vz5.b.a(r0, r12)
            throw r1
        Lbc:
            vz5.b.a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.d7.P6(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0291 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(dm.x3 r29) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.d7.Q6(dm.x3):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127692f6).getValue()).r()).booleanValue()) {
            P6(kz5.b0.c(r45.ki0.EDU_BIZ_TYPE_LIKE));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (this.f134087d) {
            this.f134087d = false;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.ea) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ea.class)).f134241e = false;
        }
    }
}
