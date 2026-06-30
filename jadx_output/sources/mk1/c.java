package mk1;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ye1.g f327099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ye1.g gVar) {
        super(1);
        this.f327099d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ye1.r doOrAddPendingAction = (ye1.r) obj;
        kotlin.jvm.internal.o.g(doOrAddPendingAction, "$this$doOrAddPendingAction");
        doOrAddPendingAction.e(this.f327099d);
        return jz5.f0.f302826a;
    }
}
