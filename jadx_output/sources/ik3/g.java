package ik3;

/* loaded from: classes8.dex */
public final class g implements com.tencent.wechat.aff.star.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik3.q f291893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.a40 f291894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f291895c;

    public g(ik3.q qVar, bw5.a40 a40Var, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        this.f291893a = qVar;
        this.f291894b = a40Var;
        this.f291895c = multiTaskInfo;
    }

    @Override // com.tencent.wechat.aff.star.a
    public final void complete(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskAffFsc", "checkAndMove deleteByIdAndTypeAsync result: " + z17);
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f291895c;
        bw5.a40 a40Var = this.f291894b;
        ik3.q qVar = this.f291893a;
        if (z17) {
            qVar.getClass();
            com.tencent.wechat.aff.star.d.f217506b.f(a40Var, new ik3.k(true, true, multiTaskInfo, qVar));
        } else {
            qVar.getClass();
            com.tencent.wechat.aff.star.d.f217506b.f(a40Var, new ik3.k(false, true, multiTaskInfo, qVar));
        }
    }
}
