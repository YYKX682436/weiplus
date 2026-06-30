package xc4;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f453362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xc4.p pVar) {
        super(0);
        this.f453362d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
        com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.TimeLineObject().parseFrom(this.f453362d.v0());
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineObject");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) parseFrom;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$timelineObject$2");
        return timeLineObject;
    }
}
