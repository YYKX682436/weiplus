package x85;

/* loaded from: classes10.dex */
public final class o implements x85.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f452601a;

    public o(com.tencent.mm.ipcinvoker.r rVar) {
        this.f452601a = rVar;
    }

    @Override // x85.c
    public void a(int i17, r45.p64 p64Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        com.tencent.mm.ipcinvoker.r rVar = this.f452601a;
        if (p64Var == null) {
            if (rVar != null) {
                rVar.a(bundle);
            }
        } else {
            bundle.putByteArray("result", p64Var.toByteArray());
            if (rVar != null) {
                rVar.a(bundle);
            }
        }
    }
}
