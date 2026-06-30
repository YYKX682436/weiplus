package mm1;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm1.b0 f328700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(mm1.b0 b0Var) {
        super(0);
        this.f328700d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "delayReleaseManager doReleaseCallback");
        mm1.b0 b0Var = this.f328700d;
        kotlinx.coroutines.l.d(b0Var, null, null, new mm1.s(b0Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
