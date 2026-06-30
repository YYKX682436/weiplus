package nc4;

/* loaded from: classes4.dex */
public final class h implements nc4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336148a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f336149b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f336150c;

    public h(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f336148a = context;
        this.f336149b = jz5.h.b(nc4.e.f336139d);
        this.f336150c = jz5.h.b(nc4.f.f336144d);
    }

    @Override // nc4.c
    public db5.h4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        android.content.Context context = this.f336148a;
        db5.h4 h4Var = new db5.h4(context, 6, 0);
        h4Var.f228368i = i65.a.r(context, c().a() == 1 ? com.tencent.mm.R.string.btf : com.tencent.mm.R.string.btg);
        if (c().a() == 2) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SNS_JUMP_FINDER_POST_EXPOSE_COUNT_INT_SYNC;
            java.lang.Object m17 = c17.m(u3Var, 0);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(((java.lang.Integer) m17).intValue() + 1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return h4Var;
    }

    @Override // nc4.c
    public java.lang.Object b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        lVar.invoke(java.lang.Boolean.TRUE);
        android.content.Intent intent = new android.content.Intent();
        int a17 = c().a();
        android.content.Context context = this.f336148a;
        if (a17 == 1) {
            intent.putExtra("key_finder_post_router", 6);
            intent.putExtra("key_finder_sns_post_type", 1);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(context, intent);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 5, 44, intent);
            intent.putExtra("key_form_sns", true);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.C(context, intent);
            com.tencent.mm.sdk.platformtools.u3.h(new nc4.g(this));
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return f0Var;
    }

    public final nc4.i c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderEntranceData", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        nc4.i iVar = (nc4.i) ((jz5.n) this.f336150c).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderEntranceData", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return iVar;
    }

    @Override // nc4.c
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c7, code lost:
    
        if (r5 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl() != false) goto L26;
     */
    @Override // nc4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean show() {
        /*
            r10 = this;
            java.lang.String r0 = "show"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.sdk.platformtools.f9 r2 = com.tencent.mm.sdk.platformtools.f9.MomentChannels
            boolean r2 = r2.h()
            r3 = 0
            if (r2 != 0) goto Le8
            nc4.i r2 = r10.c()
            int r2 = r2.a()
            r4 = 1
            if (r2 != r4) goto Lc9
            java.lang.String r2 = "checkFinderExposeCount"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r5 = "getExposeMaxCountByFinderStatus"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            java.lang.String r6 = "getCurFinderStatus"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            jz5.g r7 = r10.f336149b
            r8 = r7
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData"
            if (r8 != 0) goto L53
            nc4.i r6 = r10.c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNoUser"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            int r6 = r6.f336155b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            goto L8a
        L53:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            if (r7 != r4) goto L79
            nc4.i r6 = r10.c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNoFeed"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            int r6 = r6.f336156c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            goto L8a
        L79:
            nc4.i r6 = r10.c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNormal"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            int r6 = r6.f336157d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
        L8a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r7 = com.tencent.mm.storage.u3.USERINFO_SNS_FINDER_EXPOSE_COUNT_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r5.m(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.o.e(r5, r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 < r6) goto Lb3
            r8 = -1
            if (r6 != r8) goto Lb1
            goto Lb3
        Lb1:
            r5 = r3
            goto Lc4
        Lb3:
            gm0.b0 r6 = gm0.j1.u()
            com.tencent.mm.storage.n3 r6 = r6.c()
            int r5 = r5 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.x(r7, r5)
            r5 = r4
        Lc4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            if (r5 != 0) goto Le4
        Lc9:
            nc4.i r2 = r10.c()
            int r2 = r2.a()
            r5 = 2
            if (r2 != r5) goto Le8
            java.lang.Class<zy2.b6> r2 = zy2.b6.class
            i95.m r2 = i95.n0.c(r2)
            zy2.b6 r2 = (zy2.b6) r2
            c61.l7 r2 = (c61.l7) r2
            boolean r2 = r2.gl()
            if (r2 == 0) goto Le8
        Le4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        Le8:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nc4.h.show():boolean");
    }

    @Override // nc4.c
    public int type() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        int h17 = nc4.d.f336126h.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return h17;
    }
}
