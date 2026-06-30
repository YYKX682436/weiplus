package r20;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView f368776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView ecsLabelBoxView) {
        super(0);
        this.f368776d = ecsLabelBoxView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a preOnCLick = this.f368776d.getPreOnCLick();
        if (preOnCLick != null) {
            preOnCLick.invoke();
        }
        return jz5.f0.f302826a;
    }
}
