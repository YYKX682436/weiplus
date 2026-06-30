package su;

/* loaded from: classes9.dex */
public final class c extends st.a {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f412620q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String toUserName, l15.c cVar, byte[] bArr) {
        super(toUserName, cVar, bArr);
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        this.f412620q = "send_ting_chatroom_msg";
    }

    @Override // st.a
    public java.lang.String a() {
        return this.f412620q;
    }
}
