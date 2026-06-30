package xd4;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final xd4.k0 f453664a = new xd4.k0();

    public final int a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoReportUtils");
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = context instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI ? true : context instanceof com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI ? true : context instanceof com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 ? 1 : context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI ? 3 : context instanceof com.tencent.mm.plugin.sns.ui.SnsGalleryUI ? 2 : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoReportUtils");
        return i17;
    }

    public final java.lang.String b(int i17, boolean z17) {
        java.lang.String Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoReportUtils");
        if (i17 == 3) {
            Ni = z17 ? ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni() : ca4.z0.f40071d;
            kotlin.jvm.internal.o.d(Ni);
        } else {
            Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            kotlin.jvm.internal.o.d(Ni);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoReportUtils");
        return Ni;
    }
}
