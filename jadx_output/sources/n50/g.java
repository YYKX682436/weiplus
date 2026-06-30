package n50;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n50.i f335101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n50.i iVar) {
        super(0);
        this.f335101d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra;
        n50.i iVar = this.f335101d;
        boolean hasExtra = iVar.f335103a.hasExtra("Retr_Msg_content_bytes");
        android.content.Intent intent = iVar.f335103a;
        if (hasExtra) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("Retr_Msg_content_bytes");
            stringExtra = byteArrayExtra != null ? new java.lang.String(byteArrayExtra, r26.c.f368865a) : null;
        } else {
            stringExtra = intent.getStringExtra("Retr_Msg_content");
        }
        return stringExtra == null ? "" : stringExtra;
    }
}
