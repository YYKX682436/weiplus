package ij5;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f291813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ij5.d0 d0Var) {
        super(0);
        this.f291813d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ij5.d0 d0Var = this.f291813d;
        java.lang.String stringExtra = d0Var.getIntent().getStringExtra("key_chatroomSessionWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return d0Var.getString(com.tencent.mm.R.string.ifz);
    }
}
