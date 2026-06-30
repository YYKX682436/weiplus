package qg5;

/* loaded from: classes5.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f362913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f362914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(yz5.a aVar, qg5.n5 n5Var) {
        super(0);
        this.f362913d = aVar;
        this.f362914e = n5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f362913d;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f362914e.f363102n).getValue();
        if (o4Var != null) {
            o4Var.putBoolean("yuanbao_summarize_agreed", true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoSummarizeFSC", "[handleSummaryTosConsent] user accepted");
        return jz5.f0.f302826a;
    }
}
