package zi4;

/* loaded from: classes11.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.y0 f473273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qb f473274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(zi4.y0 y0Var, bw5.qb qbVar) {
        super(0);
        this.f473273d = y0Var;
        this.f473274e = qbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bw5.qb qbVar = this.f473274e;
        bw5.sm0 sm0Var = qbVar.f32031e[1] ? qbVar.f32030d : new bw5.sm0();
        zi4.y0 y0Var = this.f473273d;
        if (sm0Var != null) {
            java.lang.ref.WeakReference weakReference = y0Var.f473181e;
            if ((weakReference != null ? (android.content.Context) weakReference.get() : null) != null) {
                mj4.h e17 = ai4.f.e(ai4.f.f5139a, sm0Var, null, 2, null);
                bk4.q0 q0Var = bk4.q0.f21538a;
                java.lang.Object obj = weakReference.get();
                kotlin.jvm.internal.o.d(obj);
                q0Var.b((android.content.Context) obj, e17, null);
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.i(y0Var.f473276g, "openStatusGroupDialog: failed");
        return jz5.f0.f302826a;
    }
}
