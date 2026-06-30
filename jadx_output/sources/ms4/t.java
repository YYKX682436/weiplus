package ms4;

/* loaded from: classes8.dex */
public final class t extends androidx.lifecycle.c1 {

    /* renamed from: x, reason: collision with root package name */
    public static final ms4.p f331108x = new ms4.p(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f331109d;

    /* renamed from: p, reason: collision with root package name */
    public boolean f331118p;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f331120r;

    /* renamed from: s, reason: collision with root package name */
    public int f331121s;

    /* renamed from: t, reason: collision with root package name */
    public r45.v11 f331122t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData f331123u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f331124v;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331110e = new androidx.lifecycle.j0();

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331111f = new androidx.lifecycle.j0();

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331112g = new androidx.lifecycle.j0();

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331113h = new androidx.lifecycle.j0();

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331114i = new androidx.lifecycle.j0();

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331115m = new androidx.lifecycle.j0();

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331116n = new androidx.lifecycle.j0();

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f331117o = new androidx.lifecycle.j0();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f331119q = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f331125w = "";

    public t(int i17) {
        this.f331109d = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N6(android.app.Activity r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ms4.r
            if (r0 == 0) goto L13
            r0 = r9
            ms4.r r0 = (ms4.r) r0
            int r1 = r0.f331103g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f331103g = r1
            goto L18
        L13:
            ms4.r r0 = new ms4.r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f331101e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f331103g
            r3 = 1
            java.lang.String r4 = "MicroMsg.WeCoinIncomeDetailViewModel"
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f331100d
            ms4.t r8 = (ms4.t) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "getRealNameAuthRequest"
            com.tencent.mars.xlog.Log.i(r4, r9)
            androidx.lifecycle.j0 r9 = r7.f331117o
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            os4.a.a(r9, r2)
            java.lang.Class<s40.b1> r9 = s40.b1.class
            i95.m r9 = i95.n0.c(r9)
            s40.b1 r9 = (s40.b1) r9
            r0.f331100d = r7
            r0.f331103g = r3
            com.tencent.mm.feature.finder.live.t6 r9 = (com.tencent.mm.feature.finder.live.t6) r9
            java.lang.Object r9 = r9.Ai(r8, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r8 = r7
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            androidx.lifecycle.j0 r0 = r8.f331117o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            os4.a.a(r0, r1)
            if (r9 == 0) goto L76
            java.lang.String r9 = "getRealNameAuthRequest succ."
            com.tencent.mars.xlog.Log.i(r4, r9)
            androidx.lifecycle.j0 r8 = r8.f331116n
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.postValue(r9)
            goto L8e
        L76:
            java.lang.String r9 = "getRealNameAuthRequest failed."
            com.tencent.mars.xlog.Log.i(r4, r9)
            androidx.lifecycle.j0 r8 = r8.f331115m
            ms4.a r9 = new ms4.a
            r1 = 3
            r2 = -1
            java.lang.String r3 = ""
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.postValue(r9)
        L8e:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ms4.t.N6(android.app.Activity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O6(android.app.Activity r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof ms4.s
            if (r0 == 0) goto L13
            r0 = r12
            ms4.s r0 = (ms4.s) r0
            int r1 = r0.f331107g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f331107g = r1
            goto L18
        L13:
            ms4.s r0 = new ms4.s
            r0.<init>(r9, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.f331105e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f331107g
            r2 = 1
            java.lang.String r8 = "MicroMsg.WeCoinIncomeDetailViewModel"
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r10 = r5.f331104d
            ms4.t r10 = (ms4.t) r10
            kotlin.ResultKt.throwOnFailure(r12)
            goto L64
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = "getRealNameAuthRequest"
            com.tencent.mars.xlog.Log.i(r8, r12)
            androidx.lifecycle.j0 r12 = r9.f331117o
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            os4.a.a(r12, r1)
            java.lang.Class<s40.b1> r12 = s40.b1.class
            i95.m r12 = i95.n0.c(r12)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r12, r1)
            r1 = r12
            s40.b1 r1 = (s40.b1) r1
            r4 = 0
            r6 = 4
            r7 = 0
            r5.f331104d = r9
            r5.f331107g = r2
            r2 = r10
            r3 = r11
            java.lang.Object r12 = s40.b1.d7(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L63
            return r0
        L63:
            r10 = r9
        L64:
            com.tencent.mm.modelbase.f r12 = (com.tencent.mm.modelbase.f) r12
            boolean r11 = r12.b()
            androidx.lifecycle.j0 r12 = r10.f331117o
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            os4.a.a(r12, r0)
            if (r11 == 0) goto L80
            java.lang.String r11 = "getRealNameNewAuthRequest succ."
            com.tencent.mars.xlog.Log.i(r8, r11)
            androidx.lifecycle.j0 r10 = r10.f331116n
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.postValue(r11)
            goto L98
        L80:
            java.lang.String r11 = "getRealNameNewAuthRequest failed."
            com.tencent.mars.xlog.Log.i(r8, r11)
            androidx.lifecycle.j0 r10 = r10.f331115m
            ms4.a r11 = new ms4.a
            r1 = 3
            r2 = -1
            java.lang.String r3 = ""
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.postValue(r11)
        L98:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ms4.t.O6(android.app.Activity, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void P6(boolean z17, r45.v11 prepareInfo) {
        r45.kj5 kj5Var;
        kotlin.jvm.internal.o.g(prepareInfo, "prepareInfo");
        this.f331122t = prepareInfo;
        this.f331118p = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", "refreshData use_studio_new_style:" + z17 + ", tips:" + prepareInfo.getString(7));
        int i17 = 1;
        if (z17) {
            java.lang.String string = prepareInfo.getString(7);
            if (!(string == null || string.length() == 0)) {
                this.f331118p = true;
            }
        }
        java.lang.String string2 = prepareInfo.getString(7);
        if (string2 == null) {
            string2 = "";
        }
        this.f331119q = string2;
        this.f331110e.postValue(prepareInfo.getString(1));
        this.f331111f.postValue(java.lang.Long.valueOf(prepareInfo.getLong(0)));
        this.f331112g.postValue(java.lang.Long.valueOf(prepareInfo.getLong(2)));
        androidx.lifecycle.j0 j0Var = this.f331113h;
        r45.gs2 gs2Var = (r45.gs2) prepareInfo.getCustom(5);
        if (gs2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", "has_realname_auth:" + gs2Var.getBoolean(5) + " appid:" + gs2Var.getString(0) + ", category_id:" + gs2Var.getList(1));
            kj5Var = new r45.kj5();
            kj5Var.f378761d = gs2Var.getString(0);
            kj5Var.f378762e = gs2Var.getList(1);
            kj5Var.f378763f = gs2Var.getInteger(2);
            kj5Var.f378764g = gs2Var.getString(3);
            kj5Var.f378765h = gs2Var.getString(4);
            if ((gs2Var.getInteger(6) != 2 && gs2Var.getBoolean(5)) || (gs2Var.getInteger(6) == 2 && gs2Var.getInteger(8) == 1)) {
                i17 = 2;
            }
            kj5Var.f378766i = i17;
        } else {
            kj5Var = null;
        }
        j0Var.postValue(kj5Var);
        this.f331120r = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) prepareInfo.getCustom(3);
        this.f331121s = prepareInfo.getInteger(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIncomePageInfoRequest encashScene:");
        sb6.append(this.f331121s);
        sb6.append(", encashInterceptJumpInfo: ");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f331120r;
        sb6.append(finderJumpInfo != null ? f331108x.a(finderJumpInfo) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", sb6.toString());
    }

    public final void Q6(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData wecoinEncashKVData = this.f331123u;
        if (wecoinEncashKVData == null || (str3 = wecoinEncashKVData.f179137e) == null) {
            str3 = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(wecoinEncashKVData != null ? wecoinEncashKVData.f179136d : 1);
        objArr[1] = str3;
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i18);
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str2;
        g0Var.d(22129, objArr);
    }

    public final void R6(int i17) {
        com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData wecoinEncashKVData = this.f331123u;
        if (wecoinEncashKVData != null) {
            java.lang.String str = wecoinEncashKVData.f179137e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = wecoinEncashKVData.f179138f;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(wecoinEncashKVData.f179136d), str, java.lang.Integer.valueOf(i17), str2 != null ? str2 : "");
        }
    }
}
