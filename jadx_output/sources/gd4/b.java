package gd4;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final gd4.x0 f270606a;

    /* renamed from: b, reason: collision with root package name */
    public final gd4.w0 f270607b;

    /* renamed from: c, reason: collision with root package name */
    public final gd4.x0 f270608c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f270609d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f270610e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f270611f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f270612g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f270613h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.a1 f270614i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.jj4 f270615j;

    /* renamed from: k, reason: collision with root package name */
    public final i64.b1 f270616k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Object f270617l;

    public b(gd4.x0 x0Var, gd4.w0 w0Var, gd4.x0 x0Var2, kotlinx.coroutines.y0 y0Var, kotlinx.coroutines.flow.i2 restartPlayFlow, kotlinx.coroutines.flow.i2 playCommandFlow, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, yz5.p setClickArea, com.tencent.mm.plugin.sns.storage.a1 a1Var, r45.jj4 jj4Var, i64.b1 b1Var, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(restartPlayFlow, "restartPlayFlow");
        kotlin.jvm.internal.o.g(playCommandFlow, "playCommandFlow");
        kotlin.jvm.internal.o.g(setClickArea, "setClickArea");
        this.f270606a = x0Var;
        this.f270607b = w0Var;
        this.f270608c = x0Var2;
        this.f270609d = y0Var;
        this.f270610e = restartPlayFlow;
        this.f270611f = playCommandFlow;
        this.f270612g = snsInfo;
        this.f270613h = setClickArea;
        this.f270614i = a1Var;
        this.f270615j = jj4Var;
        this.f270616k = b1Var;
        this.f270617l = obj;
    }

    public static /* synthetic */ java.lang.Object c(gd4.b bVar, yz5.a aVar, long j17, long j18, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation, int i27, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delayForAdjust$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        if (obj == null) {
            java.lang.Object b17 = bVar.b(aVar, j17, (i27 & 4) != 0 ? 0L : j18, (i27 & 8) != 0 ? 0 : i17, (i27 & 16) != 0 ? 4 : i18, (i27 & 32) != 0 ? 50 : i19, continuation);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delayForAdjust$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            return b17;
        }
        java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delayForAdjust");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delayForAdjust$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        throw unsupportedOperationException;
    }

    public abstract void a(com.tencent.mm.plugin.sns.storage.a1 a1Var);

    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0122 -> B:12:0x0125). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(yz5.a r21, long r22, long r24, int r26, int r27, int r28, kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gd4.b.b(yz5.a, long, long, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.plugin.sns.storage.a1 d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return this.f270614i;
    }

    public final kotlinx.coroutines.y0 e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBizScope", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBizScope", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return this.f270609d;
    }

    public final gd4.x0 f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return this.f270606a;
    }

    public final gd4.x0 g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullCardVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return this.f270608c;
    }

    public final i64.b1 h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return this.f270616k;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return this.f270612g;
    }

    public abstract void j();

    public abstract void k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo);

    public abstract void l();
}
