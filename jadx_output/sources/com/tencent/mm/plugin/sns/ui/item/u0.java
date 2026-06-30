package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public final class u0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {

    /* renamed from: q, reason: collision with root package name */
    public static final ed4.x f169422q = new ed4.x(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f169423r = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 268);

    public final void F(int i17, com.tencent.mm.plugin.ting.widget.MusicView musicView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        if (musicView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = musicView.getLayoutParams();
        boolean z17 = false;
        if (layoutParams != null && layoutParams.width == i17) {
            z17 = true;
        }
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams2 = musicView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = i17;
            } else {
                layoutParams2 = null;
            }
            musicView.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        if (baseViewHolder == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.t0 t0Var = (com.tencent.mm.plugin.sns.ui.item.t0) baseViewHolder;
        android.view.ViewStub r17 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder);
        if (r17 != null) {
            if (r17.getParent() != null) {
                r17.setLayoutResource(com.tencent.mm.R.layout.csk);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                boolean z17 = t0Var.D0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                if (!z17) {
                    android.view.View inflate = r17.inflate();
                    android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.o9l);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    t0Var.E0 = findViewById;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    com.tencent.mm.plugin.ting.widget.MusicView musicView = (com.tencent.mm.plugin.ting.widget.MusicView) inflate.findViewById(com.tencent.mm.R.id.qap);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    t0Var.F0 = musicView;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    t0Var.D0 = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                }
            } else {
                android.view.View findViewById2 = t0Var.f169272h.findViewById(com.tencent.mm.R.id.o9l);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                t0Var.E0 = findViewById2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                com.tencent.mm.plugin.ting.widget.MusicView musicView2 = (com.tencent.mm.plugin.ting.widget.MusicView) t0Var.f169272h.findViewById(com.tencent.mm.R.id.qap);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                t0Var.F0 = musicView2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                t0Var.D0 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
            }
        }
        com.tencent.mm.plugin.ting.widget.MusicView b17 = t0Var.b();
        android.view.View musicContainer = b17 != null ? b17.getMusicContainer() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        t0Var.G0 = musicContainer;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        com.tencent.mm.plugin.ting.widget.MusicView b18 = t0Var.b();
        com.tencent.mm.ui.widget.imageview.WeImageView musicMediaIcon = b18 != null ? b18.getMusicMediaIcon() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        t0Var.H0 = musicMediaIcon;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v5 java.lang.String, still in use, count: 2, list:
          (r14v5 java.lang.String) from 0x011f: IF  (r14v5 java.lang.String) == (null java.lang.String)  -> B:146:0x0121 A[HIDDEN]
          (r14v5 java.lang.String) from 0x0123: PHI (r14v8 java.lang.String) = (r14v5 java.lang.String), (r14v7 java.lang.String), (r14v24 java.lang.String) binds: [B:150:0x011f, B:146:0x0121, B:57:0x0116] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r18, int r19, com.tencent.mm.plugin.sns.ui.ns r20, com.tencent.mm.protocal.protobuf.TimeLineObject r21, int r22, com.tencent.mm.plugin.sns.ui.bs r23) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.u0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        return "TingMusicTimeLineItem";
    }
}
