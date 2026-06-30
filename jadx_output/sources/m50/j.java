package m50;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.x f323484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m50.x xVar) {
        super(0);
        this.f323484d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        m50.x xVar = this.f323484d;
        if (!xVar.getActivity().isFinishing() && !xVar.getActivity().isDestroyed()) {
            xVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
