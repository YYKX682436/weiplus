package x51;

/* loaded from: classes12.dex */
public final class k0 extends d95.b0 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f452022i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f452023j;

    /* renamed from: k, reason: collision with root package name */
    public final android.util.SparseBooleanArray f452024k = new android.util.SparseBooleanArray();

    public k0(java.lang.String str, boolean z17) {
        this.f452022i = z17;
        this.f452023j = str;
    }

    @Override // d95.b0
    public void L() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e("MicroMsg.GeneralDBHelper", "forbid to use this method %s", new com.tencent.mm.sdk.platformtools.z3());
        if (this.f452024k.size() <= 1) {
            M(null);
        }
    }

    @Override // d95.b0
    public void M(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.GeneralDBHelper", "forbid to use this method");
        if (this.f452024k.size() <= 1) {
            super.M(str);
        }
    }

    public void W(int i17) {
        android.util.SparseBooleanArray sparseBooleanArray = this.f452024k;
        sparseBooleanArray.delete(i17);
        if (sparseBooleanArray.size() < 1) {
            M(null);
            x51.l0.f452029a.remove(java.lang.Integer.valueOf(this.f452023j.hashCode()));
        }
    }
}
