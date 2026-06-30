package lp4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.p f320340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lp4.p pVar) {
        super(1);
        this.f320340d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            lp4.p pVar = this.f320340d;
            ju3.d0 d0Var = pVar.f465332d;
            ju3.c0 c0Var = ju3.c0.f301878g2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CONFIRM", pVar.f320402w);
            d0Var.w(c0Var, bundle);
        }
        return jz5.f0.f302826a;
    }
}
