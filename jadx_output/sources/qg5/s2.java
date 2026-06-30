package qg5;

/* loaded from: classes8.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.z2 f363175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(qg5.z2 z2Var) {
        super(0);
        this.f363175d = z2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoChatRecordsFeatureService", "[onChatRecordsAnalyzeClick] User cancelled chat log analysis");
        qg5.z2 z2Var = this.f363175d;
        ((qg5.l0) z2Var.aj()).ij();
        ((qg5.e3) ((ct.k3) ((jz5.n) z2Var.f363273o).getValue())).oj("journey_analyze");
        return jz5.f0.f302826a;
    }
}
