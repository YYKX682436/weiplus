package zi4;

/* loaded from: classes9.dex */
public final class a1 extends zi4.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f473187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f473187g = "MicroMsg.FLTStatusOpenLikeDialogHandler";
    }

    @Override // zi4.a
    public void a(byte[] bArr, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.rb rbVar = new bw5.rb();
        rbVar.parseFrom(bArr);
        pm0.v.X(new zi4.z0(this, rbVar));
    }
}
