package hr3;

/* loaded from: classes10.dex */
public final class qc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(java.util.List list) {
        super(1);
        this.f283922d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xb5.a it = (xb5.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f283922d.contains(it.f453006d));
    }
}
