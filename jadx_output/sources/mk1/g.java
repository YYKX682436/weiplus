package mk1;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f327103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z17) {
        super(1);
        this.f327103d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ye1.r doOrAddPendingAction = (ye1.r) obj;
        kotlin.jvm.internal.o.g(doOrAddPendingAction, "$this$doOrAddPendingAction");
        doOrAddPendingAction.setMute(this.f327103d);
        return jz5.f0.f302826a;
    }
}
