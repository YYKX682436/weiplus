package x85;

/* loaded from: classes9.dex */
public final class q implements x85.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f452602a;

    public q(com.tencent.mm.ipcinvoker.r rVar) {
        this.f452602a = rVar;
    }

    @Override // x85.j
    public void a(int i17, int i18, r45.xh3 xh3Var) {
        byte[] byteArray;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        if (xh3Var != null && (byteArray = xh3Var.toByteArray()) != null) {
            bundle.putByteArray("response", byteArray);
        }
        com.tencent.mm.ipcinvoker.r rVar = this.f452602a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
