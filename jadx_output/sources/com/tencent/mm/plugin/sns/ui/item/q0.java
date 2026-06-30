package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class q0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem {

    /* renamed from: q, reason: collision with root package name */
    public jb4.v f169406q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.p f169407r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.p0 f169408s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f169409t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f169410u = true;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f169411v = null;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f169412w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: x, reason: collision with root package name */
    public int f169413x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final jb4.u f169414y = new ed4.s(this);

    /* renamed from: z, reason: collision with root package name */
    public final jb4.c0 f169415z = new ed4.v(this);

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        try {
            com.tencent.mm.plugin.sns.ui.item.p0 p0Var = (com.tencent.mm.plugin.sns.ui.item.p0) baseViewHolder;
            this.f169408s = p0Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent, holder=" + baseViewHolder.hashCode());
            if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cu9);
                if (!baseViewHolder.f169290q) {
                    p0Var.F0 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                    baseViewHolder.f169290q = true;
                }
            } else if (!baseViewHolder.f169290q) {
                p0Var.F0 = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.f22new);
                baseViewHolder.f169290q = true;
            }
            p0Var.D0 = p0Var.f169272h.findViewById(com.tencent.mm.R.id.ofu);
            p0Var.E0 = p0Var.f169272h.findViewById(com.tencent.mm.R.id.aug);
            p0Var.H0 = (android.widget.TextView) p0Var.f169272h.findViewById(com.tencent.mm.R.id.ofw);
            p0Var.I0 = (android.widget.TextView) p0Var.f169272h.findViewById(com.tencent.mm.R.id.ofv);
            p0Var.J0 = (android.widget.TextView) p0Var.f169272h.findViewById(com.tencent.mm.R.id.aui);
            p0Var.K0 = (android.widget.TextView) p0Var.f169272h.findViewById(com.tencent.mm.R.id.auh);
            p0Var.G0 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView) p0Var.f169272h.findViewById(com.tencent.mm.R.id.nex);
            p0Var.L0 = p0Var.f169272h.findViewById(com.tencent.mm.R.id.aut);
            p0Var.M0 = (android.widget.ImageView) p0Var.f169272h.findViewById(com.tencent.mm.R.id.f485861jc5);
            com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = (com.tencent.mm.ui.widget.MMPinProgressBtn) p0Var.f169272h.findViewById(com.tencent.mm.R.id.lbi);
            p0Var.N0 = mMPinProgressBtn;
            mMPinProgressBtn.setMax(50);
            float I = ca4.m0.I(com.tencent.mm.R.dimen.a_q);
            float I2 = ca4.m0.I(com.tencent.mm.R.dimen.a_l);
            int i17 = 0;
            p0Var.H0.setTextSize(0, I);
            p0Var.I0.setTextSize(0, I2);
            p0Var.J0.setTextSize(0, I);
            p0Var.K0.setTextSize(0, I2);
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent, disable touch and sensor");
            p0Var.G0.setTouchEnabled(false);
            p0Var.G0.setSensorEnabled(false);
            p0Var.G0.i(1.8f, 30.0f, -2.0f);
            p0Var.G0.setTouchSensitivity(0.45f);
            p0Var.G0.setEventListener(this.f169415z);
            p0Var.G0.setOnlyHorizontalScroll(true);
            jb4.v vVar = new jb4.v();
            this.f169406q = vVar;
            jb4.u uVar = this.f169414y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            vVar.f298852a = uVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            com.tencent.mm.plugin.sns.storage.p pVar = this.f169407r;
            if (pVar != null) {
                i17 = pVar.f166094f;
            }
            this.f169412w.postDelayed(new com.tencent.mm.plugin.sns.ui.item.n0(this, i17, p0Var), i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "viewHash=" + p0Var.G0.hashCode() + ", touchDelay=" + i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x019f A[Catch: all -> 0x04dc, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f0 A[Catch: all -> 0x04dc, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0446 A[Catch: all -> 0x04dc, TRY_ENTER, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x047a A[Catch: all -> 0x04dc, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ae  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r34, int r35, com.tencent.mm.plugin.sns.ui.ns r36, com.tencent.mm.protocal.protobuf.TimeLineObject r37, int r38, com.tencent.mm.plugin.sns.ui.bs r39) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.q0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        return "SphereCardAdTimeLineItem";
    }
}
