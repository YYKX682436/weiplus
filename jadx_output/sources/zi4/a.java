package zi4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f473180d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f473181e;

    /* renamed from: f, reason: collision with root package name */
    public final zi4.g0 f473182f;

    public a(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f473180d = cmdId;
        this.f473181e = weakReference;
        this.f473182f = host;
    }

    public abstract void a(byte[] bArr, yz5.l lVar);
}
