package lp4;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.a1 f320433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(lp4.a1 a1Var) {
        super(1);
        this.f320433d = a1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            lp4.a1 a1Var = this.f320433d;
            bundle.putLong("EDIT_VLOG_TRACK_CROP_START", a1Var.f320323s);
            bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", a1Var.f320324t);
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", true);
            a1Var.f465332d.w(ju3.c0.f301876f2, bundle);
        }
        return jz5.f0.f302826a;
    }
}
