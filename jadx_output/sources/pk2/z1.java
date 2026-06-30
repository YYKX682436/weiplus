package pk2;

/* loaded from: classes3.dex */
public final class z1 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f356410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f356411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f356412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356413d;

    public z1(com.tencent.mm.ui.MMActivity mMActivity, r45.j32 j32Var, r45.c32 c32Var, boolean z17) {
        this.f356410a = mMActivity;
        this.f356411b = j32Var;
        this.f356412c = c32Var;
        this.f356413d = z17;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        if (i17 == -1) {
            r45.h32 h32Var = null;
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
            r45.j32 j32Var = this.f356411b;
            if (byteArrayExtra != null) {
                r45.h32 h32Var2 = new r45.h32();
                try {
                    h32Var2.parseFrom(byteArrayExtra);
                    h32Var = h32Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                if (h32Var != null && j32Var != null) {
                    j32Var.getList(0).add(h32Var);
                    j32Var.set(2, java.lang.Integer.valueOf(j32Var.getInteger(2) + 1));
                }
            }
            pk2.l2.f355938m.d(this.f356410a, j32Var, this.f356412c, this.f356413d);
        }
    }
}
