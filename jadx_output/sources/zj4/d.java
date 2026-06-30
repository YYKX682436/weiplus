package zj4;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zj4.e f473341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zj4.e eVar) {
        super(0);
        this.f473341d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zj4.e eVar = this.f473341d;
        if (!eVar.getIntent().hasExtra("KEY_SET_STATUS_PARAM_FROM_EDIT")) {
            return null;
        }
        bi4.d1 d1Var = new bi4.d1();
        d1Var.parseFrom(eVar.getIntent().getByteArrayExtra("KEY_SET_STATUS_PARAM_FROM_EDIT"));
        return d1Var;
    }
}
