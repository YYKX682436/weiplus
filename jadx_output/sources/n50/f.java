package n50;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50.i f335100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n50.i iVar) {
        super(0);
        this.f335100d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f335100d.f335103a.getStringExtra("msg_forward_sns_obj_id");
        return stringExtra == null ? "" : stringExtra;
    }
}
