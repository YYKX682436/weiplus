package iw2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw2.b f295228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iw2.b bVar) {
        super(1);
        this.f295228d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17 = ((java.lang.Number) obj).intValue() == 1;
        iw2.b bVar = this.f295228d;
        bVar.f295231f = z17;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", bVar.f295231f);
        bVar.f295230e.w(ju3.c0.f301915y, bundle);
        return jz5.f0.f302826a;
    }
}
