package r61;

/* loaded from: classes15.dex */
public class h0 implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r61.n0 f392877a;

    public h0(r61.n0 n0Var) {
        this.f392877a = n0Var;
    }

    @Override // bb5.e
    public int a() {
        return this.f392877a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            r61.n0 n0Var = this.f392877a;
            if (i17 < n0Var.getCount()) {
                r45.g74 g74Var = (r45.g74) n0Var.f392910e.get(i17);
                if (g74Var == null) {
                    return null;
                }
                return g74Var.f374944e;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FriendAdapter", "pos is invalid");
        return null;
    }
}
