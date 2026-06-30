package mk1;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f327116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f327117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(float f17, float f18) {
        super(1);
        this.f327116d = f17;
        this.f327117e = f18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ye1.r doOrAddPendingAction = (ye1.r) obj;
        kotlin.jvm.internal.o.g(doOrAddPendingAction, "$this$doOrAddPendingAction");
        doOrAddPendingAction.c(this.f327116d, this.f327117e);
        return jz5.f0.f302826a;
    }
}
