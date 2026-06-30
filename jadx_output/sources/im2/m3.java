package im2;

/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(im2.z3 z3Var) {
        super(0);
        this.f292439d = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f292439d.getIntent().getStringExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = java.lang.String.valueOf(c01.id.c());
        }
        return stringExtra == null ? "" : stringExtra;
    }
}
