package yx0;

/* loaded from: classes5.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(yz5.l lVar, yx0.b8 b8Var) {
        super(2);
        this.f467271d = lVar;
        this.f467272e = b8Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        this.f467271d.invoke(java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue && !booleanValue2) {
            this.f467272e.onResume();
        }
        return jz5.f0.f302826a;
    }
}
