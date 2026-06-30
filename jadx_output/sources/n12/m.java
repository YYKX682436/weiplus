package n12;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f334099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f334100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f334099d = c0Var;
        this.f334100e = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.model.z result = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreatePreprocessLogic", "process video: success " + result.f175793a);
        boolean z17 = result.f175793a;
        kotlin.jvm.internal.c0 c0Var = this.f334099d;
        if (z17) {
            c0Var.f310112d = true;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmoticonCustomCreatePreprocessLogic", "failed to process video");
            c0Var.f310112d = false;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        this.f334100e.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
