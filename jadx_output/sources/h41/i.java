package h41;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f278793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlinx.coroutines.q qVar) {
        super(0);
        this.f278793d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCChatBot", "updateMicStatus finish");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f278793d).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        return jz5.f0.f302826a;
    }
}
