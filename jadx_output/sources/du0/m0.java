package du0;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f243383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlin.coroutines.Continuation continuation) {
        super(2);
        this.f243383d = continuation;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        this.f243383d.resumeWith(kotlin.Result.m521constructorimpl((com.tencent.maas.material.MJMaterialPack) obj));
        return jz5.f0.f302826a;
    }
}
