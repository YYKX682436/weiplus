package h41;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f278777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlinx.coroutines.q qVar) {
        super(1);
        this.f278777d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wx.f1 f1Var = (wx.f1) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCChatBot", "prepare startAISessionAsync result=" + f1Var);
        ((kotlinx.coroutines.r) this.f278777d).resumeWith(kotlin.Result.m521constructorimpl(f1Var));
        return jz5.f0.f302826a;
    }
}
