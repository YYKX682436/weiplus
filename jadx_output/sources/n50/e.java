package n50;

/* loaded from: classes9.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50.i f335099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n50.i iVar) {
        super(0);
        this.f335099d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f335099d.f335103a.getStringExtra("Retr_MsgTalker");
        return stringExtra == null ? "" : stringExtra;
    }
}
