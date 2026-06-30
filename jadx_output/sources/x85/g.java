package x85;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f452592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x85.i f452594f;

    public g(android.os.Bundle bundle, java.lang.String str, x85.i iVar) {
        this.f452592d = bundle;
        this.f452593e = str;
        this.f452594f = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = this.f452592d;
        int i17 = bundle != null ? bundle.getInt("err_type") : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetLensInfoTask", "IPCInvoker: " + this.f452593e + ", " + i17);
        byte[] byteArray = bundle != null ? bundle.getByteArray("result") : null;
        x85.i iVar = this.f452594f;
        if (byteArray == null) {
            x85.c cVar = iVar.f452597d;
            if (cVar != null) {
                cVar.a(i17, null);
                return;
            }
            return;
        }
        r45.p64 p64Var = new r45.p64();
        p64Var.parseFrom(byteArray);
        x85.c cVar2 = iVar.f452597d;
        if (cVar2 != null) {
            cVar2.a(i17, p64Var);
        }
    }
}
