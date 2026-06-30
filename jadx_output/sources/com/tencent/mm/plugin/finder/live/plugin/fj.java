package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class fj extends com.tencent.mm.plugin.finder.live.plugin.l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public final te2.n3 f112561p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f112562q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        te2.r3 r3Var = new te2.r3(root, context, S0(), statusMonitor, this);
        this.f112561p = r3Var;
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        r3Var.onAttach(new te2.t3(root, finderLiveGameWelfareTaskProgressView, (com.tencent.mm.ui.MMActivity) context2, r3Var, S0()));
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            super.K0(i17);
        } else {
            this.f365323d.setVisibility(8);
            com.tencent.mars.xlog.Log.w("FinderLiveGameWelfareTaskBubblePlugin", "setVisible return for isTeenMode");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f112562q = false;
        com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskBubblePlugin", "#unMount");
        te2.n3 n3Var = this.f112561p;
        if (n3Var != null) {
            ((te2.r3) n3Var).onDetach();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:15:0x002f, B:17:0x0037, B:19:0x004e, B:24:0x005a, B:27:0x0060, B:30:0x006d, B:33:0x0076), top: B:14:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:15:0x002f, B:17:0x0037, B:19:0x004e, B:24:0x005a, B:27:0x0060, B:30:0x006d, B:33:0x0076), top: B:14:0x002f }] */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l1(android.os.Bundle r13, java.lang.Object r14) {
        /*
            r12 = this;
            te2.n3 r0 = r12.f112561p
            if (r0 == 0) goto L9d
            te2.r3 r0 = (te2.r3) r0
            java.lang.String r1 = "FinderLiveGameWelfareTaskBubblePresenter"
            java.lang.String r2 = ""
            r3 = 0
            if (r13 == 0) goto L14
            java.lang.String r4 = "ACTION_POST_PORTRAIT"
            java.lang.String r13 = r13.getString(r4, r2)
            goto L15
        L14:
            r13 = r3
        L15:
            java.lang.String r4 = "PORTRAIT_ACTION_FinderLiveGameWelfareTaskBubblePresenter"
            boolean r13 = kotlin.jvm.internal.o.b(r13, r4)
            if (r13 == 0) goto L9d
            boolean r13 = r14 instanceof android.os.Bundle
            if (r13 == 0) goto L24
            r3 = r14
            android.os.Bundle r3 = (android.os.Bundle) r3
        L24:
            if (r3 == 0) goto L9d
            java.lang.String r13 = "PORTRAIT_ACTION_BUNDLE_OPEN_MINI_APP"
            r14 = 0
            boolean r13 = r3.getBoolean(r13, r14)
            if (r13 == 0) goto L9d
            java.lang.String r13 = "PORTRAIT_ACTION_BUNDLE_GAME_WELFARE_INFO"
            byte[] r13 = r3.getByteArray(r13)     // Catch: java.lang.Exception -> L87
            if (r13 == 0) goto L9d
            r45.t73 r3 = new r45.t73     // Catch: java.lang.Exception -> L87
            r3.<init>()     // Catch: java.lang.Exception -> L87
            com.tencent.mm.protobuf.f r13 = r3.parseFrom(r13)     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GameWelfareWxaJumpInfo"
            kotlin.jvm.internal.o.e(r13, r3)     // Catch: java.lang.Exception -> L87
            r45.t73 r13 = (r45.t73) r13     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = r13.getString(r14)     // Catch: java.lang.Exception -> L87
            r4 = 1
            if (r3 == 0) goto L57
            int r3 = r3.length()     // Catch: java.lang.Exception -> L87
            if (r3 != 0) goto L55
            goto L57
        L55:
            r3 = r14
            goto L58
        L57:
            r3 = r4
        L58:
            if (r3 == 0) goto L60
            java.lang.String r13 = "#onPortraitAction-openMiniApp appid is null, return"
            com.tencent.mars.xlog.Log.i(r1, r13)     // Catch: java.lang.Exception -> L87
            goto L9d
        L60:
            te2.qc r5 = te2.qc.f418364a     // Catch: java.lang.Exception -> L87
            android.content.Context r6 = r0.f418372e     // Catch: java.lang.Exception -> L87
            java.lang.String r14 = r13.getString(r14)     // Catch: java.lang.Exception -> L87
            if (r14 != 0) goto L6c
            r7 = r2
            goto L6d
        L6c:
            r7 = r14
        L6d:
            java.lang.String r14 = r13.getString(r4)     // Catch: java.lang.Exception -> L87
            if (r14 != 0) goto L75
            r8 = r2
            goto L76
        L75:
            r8 = r14
        L76:
            r14 = 2
            int r9 = r13.getInteger(r14)     // Catch: java.lang.Exception -> L87
            r14 = 3
            com.tencent.mm.protobuf.g r10 = r13.getByteString(r14)     // Catch: java.lang.Exception -> L87
            r11 = 0
            r5.b(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L87
            r0.f418377m = r4     // Catch: java.lang.Exception -> L87
            goto L9d
        L87:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "onPortraitAction-openMiniApp"
            r14.<init>(r0)
            java.lang.String r13 = r13.getLocalizedMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.tencent.mars.xlog.Log.e(r1, r13)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.fj.l1(android.os.Bundle, java.lang.Object):void");
    }

    public final void onResume() {
        te2.n3 n3Var = this.f112561p;
        if (n3Var != null) {
            te2.r3 r3Var = (te2.r3) n3Var;
            com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskBubblePresenter", "#requestToPreloadMiniAppOnResume");
            if (r3Var.f418377m) {
                r3Var.f418377m = false;
            } else {
                r3Var.c();
            }
        }
        if (n3Var != null) {
            te2.r3 r3Var2 = (te2.r3) n3Var;
            r3Var2.g(r3Var2.f418375h, true);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskBubblePlugin", "#mount");
        this.f112562q = true;
        com.tencent.mars.xlog.Log.i("FinderLiveGameWelfareTaskBubblePlugin", "#startPollingBannerData");
        dk2.ef.f233392k.e(5, new r45.ry2(), new com.tencent.mm.plugin.finder.live.plugin.ej(this, r45.sy2.class), false);
    }
}
