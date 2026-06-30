package ij5;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ij5.t tVar) {
        super(0);
        this.f291773d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ij5.t tVar = this.f291773d;
        java.lang.String stringExtra = tVar.getIntent().getStringExtra("key_chatroomSessionWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return tVar.getString(com.tencent.mm.R.string.ifz);
    }
}
