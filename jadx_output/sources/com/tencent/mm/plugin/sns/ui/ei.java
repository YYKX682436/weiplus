package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ei implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f168241d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f168242e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f168243f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.e86 f168244g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.n4 f168245h;

    /* renamed from: i, reason: collision with root package name */
    public final int f168246i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsInfoFlip f168247m;

    public ei(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String snsId, r45.e86 commentInfo, com.tencent.mm.plugin.sns.ui.n4 galleryTitleM, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(commentInfo, "commentInfo");
        kotlin.jvm.internal.o.g(galleryTitleM, "galleryTitleM");
        this.f168241d = context;
        this.f168242e = snsInfo;
        this.f168243f = snsId;
        this.f168244g = commentInfo;
        this.f168245h = galleryTitleM;
        this.f168246i = i17;
    }

    public final r45.e86 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return this.f168244g;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return this.f168242e;
    }

    public final com.tencent.mm.plugin.sns.ui.SnsInfoFlip c() {
        java.util.List<r45.m33> list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        if (this.f168247m == null) {
            r45.e86 e86Var = this.f168244g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFlipItems", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            try {
                com.tencent.mm.plugin.sns.ui.widget.q2 q2Var = com.tencent.mm.plugin.sns.ui.widget.q2.f171251d;
                java.util.LinkedList SnsCommentImageInfo = e86Var.A;
                kotlin.jvm.internal.o.f(SnsCommentImageInfo, "SnsCommentImageInfo");
                java.lang.Object X = kz5.n0.X(SnsCommentImageInfo);
                kotlin.jvm.internal.o.f(X, "first(...)");
                r45.jj4 s17 = q2Var.s((r45.d86) X);
                r45.m33 m33Var = new r45.m33();
                m33Var.f380109d = s17;
                m33Var.f380110e = this.f168243f;
                m33Var.f380111f = 0;
                m33Var.f380112g = 0;
                list = kz5.b0.c(m33Var);
            } catch (java.lang.Exception unused) {
                list = kz5.p0.f313996d;
            }
            java.util.List<r45.m33> list2 = list;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlipItems", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip(this.f168241d);
            snsInfoFlip.setIsFromMainTimeline(true);
            snsInfoFlip.setNeedScanImage(true);
            snsInfoFlip.setShowPageControl(false);
            snsInfoFlip.setTouchFinish(true);
            snsInfoFlip.setIsSoonEnterPhotoEditUI(false);
            snsInfoFlip.setClickable(true);
            snsInfoFlip.D = 8;
            snsInfoFlip.setItems(list2);
            if (!list2.isEmpty()) {
                snsInfoFlip.X(list2, e86Var.f373126d, 0, null, this.f168245h);
            }
            if (this.f168242e.isAd()) {
                snsInfoFlip.setIsAd(true);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            this.f168247m = snsInfoFlip;
        }
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f168247m;
        kotlin.jvm.internal.o.e(snsInfoFlip2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoFlip", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return snsInfoFlip2;
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f168247m;
        if (snsInfoFlip != null) {
            kotlin.jvm.internal.o.d(snsInfoFlip);
            snsInfoFlip.f0();
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f168247m;
            kotlin.jvm.internal.o.d(snsInfoFlip2);
            snsInfoFlip2.h0();
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3 = this.f168247m;
            kotlin.jvm.internal.o.d(snsInfoFlip3);
            snsInfoFlip3.Z();
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip4 = this.f168247m;
            kotlin.jvm.internal.o.d(snsInfoFlip4);
            snsInfoFlip4.Y();
        }
        this.f168247m = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
    }

    @Override // in5.c
    public long getItemId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        boolean isAd = this.f168242e.isAd();
        r45.e86 e86Var = this.f168244g;
        if (isAd) {
            long j17 = e86Var.f373137r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
            return j17;
        }
        long j18 = e86Var.f373132m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return j18;
    }

    @Override // in5.c
    public int h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemType", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        int i17 = this.f168244g.f373129g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemType", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        return i17;
    }
}
