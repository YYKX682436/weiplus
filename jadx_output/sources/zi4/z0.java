package zi4;

/* loaded from: classes9.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.a1 f473280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.rb f473281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(zi4.a1 a1Var, bw5.rb rbVar) {
        super(0);
        this.f473280d = a1Var;
        this.f473281e = rbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bw5.rb rbVar = this.f473281e;
        boolean z17 = true;
        java.lang.String str = rbVar.f32481e[1] ? rbVar.f32480d : "";
        zi4.a1 a1Var = this.f473280d;
        if (str != null) {
            a1Var.getClass();
            if (!r26.n0.N(str)) {
                z17 = false;
            }
        }
        if (!z17) {
            java.lang.ref.WeakReference weakReference = a1Var.f473181e;
            if ((weakReference != null ? (android.content.Context) weakReference.get() : null) != null) {
                java.lang.Object obj = weakReference.get();
                kotlin.jvm.internal.o.d(obj);
                com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI.f173626i.a((android.content.Context) obj, str);
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.i(a1Var.f473187g, "openStatusCommentDialog: failed");
        return jz5.f0.f302826a;
    }
}
