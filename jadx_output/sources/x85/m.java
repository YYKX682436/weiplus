package x85;

/* loaded from: classes9.dex */
public final class m implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x85.n f452599d;

    public m(x85.n nVar) {
        this.f452599d = nVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("err_type");
        int i18 = bundle.getInt("err_code");
        r45.xh3 xh3Var = new r45.xh3();
        byte[] byteArray = bundle.getByteArray("response");
        if (byteArray != null) {
            xh3Var.parseFrom(byteArray);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetLensListTask", "ipc callback: " + i17 + ' ' + i18);
        x85.j jVar = this.f452599d.f452600d;
        if (jVar != null) {
            jVar.a(i17, i18, xh3Var);
        }
    }
}
