package u7;

/* loaded from: classes13.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.net.Socket f425046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u7.i f425047e;

    public g(u7.i iVar, java.net.Socket socket) {
        this.f425047e = iVar;
        this.f425046d = socket;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.net.Socket socket = this.f425046d;
        u7.i iVar = this.f425047e;
        iVar.getClass();
        try {
            try {
                u7.d a17 = u7.d.a(socket.getInputStream());
                a17.toString();
                iVar.b(u7.s.a(a17.f425040a)).b(a17, socket);
            } finally {
                iVar.d(socket);
                iVar.c();
            }
        } catch (java.net.SocketException unused) {
        } catch (java.io.IOException e17) {
            e = e17;
            new u7.r("Error processing request", e);
        } catch (u7.r e18) {
            e = e18;
            new u7.r("Error processing request", e);
        }
    }
}
