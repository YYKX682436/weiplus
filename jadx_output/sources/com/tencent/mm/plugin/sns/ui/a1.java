package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f167697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f167698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f167699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c1 f167700g;

    public a1(com.tencent.mm.plugin.sns.ui.c1 c1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.View view, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f167700g = c1Var;
        this.f167697d = snsInfo;
        this.f167698e = view;
        this.f167699f = baseViewHolder;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f167699f;
        com.tencent.mm.plugin.sns.ui.c1 c1Var = this.f167700g;
        android.view.View view = this.f167698e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2");
        try {
            com.tencent.mm.plugin.sns.model.l7 l7Var = c1Var.Y.f169703d;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f167697d;
            if (l7Var != null) {
                com.tencent.mm.plugin.sns.statistics.l a17 = l7Var.a();
                a17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                if (snsInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                } else {
                    java.util.HashSet hashSet = a17.f164872d;
                    hashSet.add(snsInfo.getLocalid());
                    hashSet.size();
                    a17.f(snsInfo);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
            }
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482871qe);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f482869qc);
            int i17 = baseViewHolder.f169270g;
            com.tencent.mm.plugin.sns.ui.l1 l1Var = c1Var.Y;
            if (i17 == 0) {
                com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
                m21.w.d(707);
                ca4.z0.T(snsInfo);
                int i18 = snsInfo.field_type;
                snsInfo.isAd();
                snsInfo.getUxinfo();
                int i19 = e17.LikeCount;
                android.os.StrictMode.allowThreadDiskReads();
                baseViewHolder.f169270g = 1;
                snsInfo.setLikeFlag(1);
                com.tencent.mm.plugin.sns.storage.l1.d(snsInfo.getSnsId(), snsInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                boolean z17 = l1Var.f169707h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                if (z17 && !snsInfo.isSocialAttitudeAd()) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
                    weImageView.setIconColor(view.getResources().getColor(com.tencent.mm.R.color.f478532ac));
                }
                if (textView != null) {
                    textView.setImportantForAccessibility(2);
                    textView.setText(com.tencent.mm.R.string.jam);
                    textView.announceForAccessibility(view.getResources().getString(com.tencent.mm.R.string.j5n));
                    textView.setImportantForAccessibility(1);
                }
                if (snsInfo.isSocialAttitudeAd() && k84.f4.e()) {
                    ca4.m0.v0();
                }
                com.tencent.mm.plugin.sns.model.d6.n(snsInfo, snsInfo.isAd() ? 7 : 1, null, 0);
                l1Var.f169709j.o(true, snsInfo.getLocalid());
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.l(ca4.z0.t0(baseViewHolder.f169266e), true);
                if (!snsInfo.isFireworkCheerAd()) {
                    l1Var.f169709j.b((android.widget.LinearLayout) view, new com.tencent.mm.plugin.sns.ui.z0(this), snsInfo);
                }
                if (snsInfo.isAd()) {
                    l44.b3.f316041a.e(snsInfo);
                }
                com.tencent.mm.plugin.sns.model.k7.f164367a.b(snsInfo, 1);
            } else {
                baseViewHolder.f169270g = 0;
                snsInfo.setLikeFlag(0);
                com.tencent.mm.plugin.sns.storage.l1.d(snsInfo.getSnsId(), snsInfo);
                if (!snsInfo.isSocialAttitudeAd()) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_like);
                    weImageView.setIconColor(view.getResources().getColor(com.tencent.mm.R.color.f478553an));
                }
                if (textView != null) {
                    textView.setImportantForAccessibility(2);
                    textView.setText(com.tencent.mm.R.string.jc8);
                    textView.announceForAccessibility(view.getResources().getString(com.tencent.mm.R.string.j5p));
                    textView.setImportantForAccessibility(1);
                }
                if (snsInfo.isSocialAttitudeAd() && k84.f4.e()) {
                    ca4.m0.v0();
                }
                com.tencent.mm.plugin.sns.model.d6.a(snsInfo.getSnsId());
                l1Var.f169709j.o(false, snsInfo.getLocalid());
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.l(ca4.z0.t0(baseViewHolder.f169266e), false);
                com.tencent.mm.plugin.sns.ui.bs bsVar = l1Var.f169709j;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                bsVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                bsVar.f168036b.f169717r.b(linearLayout);
                linearLayout.setPressed(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                l1Var.f169705f = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendUnLiked", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                if (snsInfo.isAd()) {
                    l44.b3.f316041a.l(snsInfo);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onLikeClick and exp is " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1$2");
    }
}
