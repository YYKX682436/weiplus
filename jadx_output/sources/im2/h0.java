package im2;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(im2.z3 z3Var) {
        super(0);
        this.f292351d = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f292351d.getIntent().getBooleanExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", false));
    }
}
