package vt;

/* loaded from: classes9.dex */
public final class e extends st.a {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f439931q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String toUserName, l15.c cVar, byte[] bArr) {
        super(toUserName, cVar, bArr);
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        this.f439931q = "send_finder_msg";
    }

    @Override // st.a
    public java.lang.String a() {
        return this.f439931q;
    }
}
