package n50;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50.i f335096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n50.i iVar) {
        super(0);
        this.f335096d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f335096d.f335103a.getStringExtra("Retr_File_Name");
        return stringExtra == null ? "" : stringExtra;
    }
}
