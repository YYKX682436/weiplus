package yx3;

/* loaded from: classes15.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.j f467900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f467901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yx3.j jVar, long j17) {
        super(0);
        this.f467900d = jVar;
        this.f467901e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yx3.j jVar = this.f467900d;
        d9.v vVar = new d9.v(android.net.Uri.parse(com.tencent.mm.vfs.w6.i(jVar.f467912a.f234483t, false)), new r9.v(), new q8.c(), null, null);
        m8.i0 i0Var = jVar.f467911f;
        if (i0Var != null) {
            ((m8.k) i0Var.f324561b).j(vVar);
        }
        m8.i0 i0Var2 = jVar.f467911f;
        if (i0Var2 != null) {
            i0Var2.seekTo(this.f467901e);
        }
        m8.i0 i0Var3 = jVar.f467911f;
        if (i0Var3 != null) {
            i0Var3.k(jVar.f467912a.f234475l ? 1 : 0);
        }
        return jz5.f0.f302826a;
    }
}
