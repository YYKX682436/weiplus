package cp4;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f221035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(cp4.r rVar) {
        super(1);
        this.f221035d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) longValue);
        cp4.r rVar = this.f221035d;
        rVar.f465332d.w(ju3.c0.H, bundle);
        ju3.d0.k(rVar.f465332d, ju3.c0.f301913x1, null, 2, null);
        return jz5.f0.f302826a;
    }
}
