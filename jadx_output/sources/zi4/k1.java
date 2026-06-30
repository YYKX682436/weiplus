package zi4;

/* loaded from: classes4.dex */
public final class k1 extends zi4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
    }

    @Override // zi4.a
    public void a(byte[] bArr, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.zb zbVar = new bw5.zb();
        zbVar.parseFrom(bArr);
        pm0.v.X(new zi4.j1(this, zbVar));
    }
}
