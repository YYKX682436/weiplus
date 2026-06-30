package xc4;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f453358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xc4.p pVar) {
        super(0);
        this.f453358d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.kj4 kj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
        xc4.p pVar = this.f453358d;
        if (pVar.getPostBuf() != null) {
            byte[] postBuf = pVar.getPostBuf();
            kotlin.jvm.internal.o.f(postBuf, "getPostBuf(...)");
            if (!(postBuf.length == 0)) {
                com.tencent.mm.protobuf.f parseFrom = new r45.kj4().parseFrom(pVar.getPostBuf());
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaPostInfo");
                kj4Var = (r45.kj4) parseFrom;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
                return kj4Var;
            }
        }
        kj4Var = new r45.kj4();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$postInfo$2");
        return kj4Var;
    }
}
