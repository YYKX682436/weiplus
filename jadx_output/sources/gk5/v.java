package gk5;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.y f272723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk5.y yVar) {
        super(0);
        this.f272723d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk5.y yVar = this.f272723d;
        if (!yVar.getActivity().isFinishing() && !yVar.getActivity().isDestroyed()) {
            yVar.getActivity().setResult(0);
            yVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
