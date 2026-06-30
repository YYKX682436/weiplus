package xc4;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f453351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xc4.p pVar) {
        super(0);
        this.f453351d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
        java.util.LinkedList<r45.e86> linkedList = this.f453351d.d1().CommentUserList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo$commentList$2");
        return linkedList;
    }
}
