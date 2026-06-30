package fu;

/* loaded from: classes5.dex */
public final class a extends st.a {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f266745q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String toUserName, l15.c cVar, byte[] bArr) {
        super(toUserName, cVar, bArr);
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        this.f266745q = "send_app_msg_quote";
    }

    @Override // st.a
    public java.lang.String a() {
        return this.f266745q;
    }
}
