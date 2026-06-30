package gd4;

/* loaded from: classes4.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270736d;

    /* renamed from: e, reason: collision with root package name */
    public int f270737e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f270739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f270740h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.r1 f270741i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f270742m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.s1 f270743n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f270744o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(float f17, gd4.c2 c2Var, com.tencent.mm.plugin.sns.storage.r1 r1Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.sns.storage.s1 s1Var, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270739g = f17;
        this.f270740h = c2Var;
        this.f270741i = r1Var;
        this.f270742m = h0Var;
        this.f270743n = s1Var;
        this.f270744o = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
        gd4.k1 k1Var = new gd4.k1(this.f270739g, this.f270740h, this.f270741i, this.f270742m, this.f270743n, this.f270744o, continuation);
        k1Var.f270738f = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
        return k1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
        java.lang.Object invokeSuspend = ((gd4.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
        return invokeSuspend;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gd4.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
