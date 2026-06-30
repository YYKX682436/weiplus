package x11;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f451381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x11.t tVar) {
        super(1);
        this.f451381d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        x11.t tVar = this.f451381d;
        tVar.f451397n += intValue;
        tVar.f451393g = true;
        return jz5.f0.f302826a;
    }
}
