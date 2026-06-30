package mk1;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f327115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.view.Surface surface) {
        super(1);
        this.f327115d = surface;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ye1.r doOrAddPendingAction = (ye1.r) obj;
        kotlin.jvm.internal.o.g(doOrAddPendingAction, "$this$doOrAddPendingAction");
        doOrAddPendingAction.setSurface(this.f327115d);
        return jz5.f0.f302826a;
    }
}
