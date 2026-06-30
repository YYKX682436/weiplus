package zm5;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f474245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(zm5.r0 r0Var) {
        super(0);
        this.f474245d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryMainUIC", "cancel image query");
        this.f474245d.getActivity().finish();
        return jz5.f0.f302826a;
    }
}
