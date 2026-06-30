package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f171085d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f171086e;

    /* renamed from: f, reason: collision with root package name */
    public int f171087f;

    /* renamed from: g, reason: collision with root package name */
    public int f171088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171089h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f171090i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f171091m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, long j17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171089h = snsAdBreakFrameVideoView;
        this.f171090i = j17;
        this.f171091m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
        com.tencent.mm.plugin.sns.ui.widget.c0 c0Var = new com.tencent.mm.plugin.sns.ui.widget.c0(this.f171089h, this.f171090i, this.f171091m, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
        return c0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$2");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0129 -> B:16:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f0 -> B:41:0x00f1). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
