package xw0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str) {
        super(1);
        this.f457618d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.material.MJMaterialInfo it = (com.tencent.maas.material.MJMaterialInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.f48224b, this.f457618d));
    }
}
