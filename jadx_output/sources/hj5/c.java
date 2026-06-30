package hj5;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj5.e f281666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hj5.e eVar) {
        super(0);
        this.f281666d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hj5.e eVar = this.f281666d;
        java.lang.String stringExtra = eVar.getIntent().getStringExtra("key_rightButtonWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return eVar.getString(com.tencent.mm.R.string.f490459vn);
    }
}
