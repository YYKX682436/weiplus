package d52;

/* loaded from: classes13.dex */
public class c implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        d52.b bVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            try {
                byte[] byteArray = bundle.getByteArray("key_hell_msg");
                if (byteArray != null) {
                    r45.hw3 hw3Var = new r45.hw3();
                    hw3Var.parseFrom(byteArray);
                    bVar = d52.e.a(hw3Var);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    d52.d a17 = d52.d.a();
                    a17.getClass();
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        a17.f226531a.a(bVar);
                    } else {
                        a17.b(bVar);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.CallMsgToMainProcess", "other process msg send type = [%d]", java.lang.Integer.valueOf(bVar.f226528a));
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CallMsgToMainProcess", "get other process hellMsg err");
            }
        }
        return null;
    }
}
