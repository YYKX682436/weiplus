package gd4;

/* loaded from: classes4.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270626d;

    /* renamed from: e, reason: collision with root package name */
    public int f270627e;

    /* renamed from: f, reason: collision with root package name */
    public int f270628f;

    /* renamed from: g, reason: collision with root package name */
    public float f270629g;

    /* renamed from: h, reason: collision with root package name */
    public int f270630h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f270631i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.y2 f270632m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.r1 f270633n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f270634o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(gd4.c2 c2Var, com.tencent.mm.plugin.sns.storage.y2 y2Var, com.tencent.mm.plugin.sns.storage.r1 r1Var, kotlin.jvm.internal.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270631i = c2Var;
        this.f270632m = y2Var;
        this.f270633n = r1Var;
        this.f270634o = e0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        gd4.b2 b2Var = new gd4.b2(this.f270631i, this.f270632m, this.f270633n, this.f270634o, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        return b2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        java.lang.Object invokeSuspend = ((gd4.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x010a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x012e -> B:5:0x0134). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gd4.b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
