package hq5;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.m f283242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hq5.m mVar) {
        super(1);
        this.f283242d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        eq5.h state = (eq5.h) obj;
        kotlin.jvm.internal.o.g(state, "state");
        eq5.i iVar = (eq5.i) state.a(eq5.i.class);
        if (iVar != null) {
            this.f283242d.f283247g = iVar.f255922b;
        }
        return jz5.f0.f302826a;
    }
}
