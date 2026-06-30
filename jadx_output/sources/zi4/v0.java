package zi4;

/* loaded from: classes9.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.w0 f473268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pb f473269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(zi4.w0 w0Var, bw5.pb pbVar) {
        super(0);
        this.f473268d = w0Var;
        this.f473269e = pbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bw5.pb pbVar = this.f473269e;
        boolean[] zArr = pbVar.f31555g;
        boolean z17 = true;
        java.lang.String str = zArr[1] ? pbVar.f31552d : "";
        java.lang.String str2 = zArr[2] ? pbVar.f31553e : "";
        boolean z18 = pbVar.f31554f;
        zi4.w0 w0Var = this.f473268d;
        w0Var.getClass();
        if (!(str == null || r26.n0.N(str))) {
            if (str2 != null && !r26.n0.N(str2)) {
                z17 = false;
            }
            if (!z17) {
                java.lang.ref.WeakReference weakReference = w0Var.f473181e;
                if ((weakReference != null ? (android.content.Context) weakReference.get() : null) != null) {
                    java.lang.Object obj = weakReference.get();
                    kotlin.jvm.internal.o.d(obj);
                    android.content.Context context = (android.content.Context) obj;
                    pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
                    com.tencent.mm.plugin.textstatus.ui.i5.a(com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity.f173501d, context, 1, str, str2, java.lang.Boolean.valueOf(z18), null, p0Var != null ? p0Var.f355242m : 0, 0, 160, null);
                    return jz5.f0.f302826a;
                }
            }
        }
        com.tencent.mars.xlog.Log.i(w0Var.f473271g, "openStatusCommentDialog: failed");
        return jz5.f0.f302826a;
    }
}
