package rt;

/* loaded from: classes9.dex */
public final class c extends st.a {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f399370q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String toUserName, l15.c cVar, byte[] bArr) {
        super(toUserName, cVar, bArr);
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        this.f399370q = "send_photo_account_msg";
    }

    @Override // st.a
    public java.lang.String a() {
        return this.f399370q;
    }
}
