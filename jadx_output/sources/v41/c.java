package v41;

/* loaded from: classes15.dex */
public abstract class c implements v41.s {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f433204d;

    /* renamed from: e, reason: collision with root package name */
    public l41.m f433205e;

    /* renamed from: f, reason: collision with root package name */
    public int f433206f = -1;

    /* renamed from: g, reason: collision with root package name */
    public j41.i0 f433207g;

    public c(android.app.Activity activity) {
        this.f433204d = activity;
    }

    @Override // v41.s
    public void a() {
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest;
        if (j41.g0.a(this.f433206f)) {
            j41.i0 i0Var = this.f433207g;
            java.lang.Object obj = i0Var != null ? i0Var.f297643d : null;
            k41.g0 g0Var = obj instanceof k41.g0 ? (k41.g0) obj : null;
            l41.m mVar = this.f433205e;
            int i17 = -1;
            if (mVar != null && (openIMKefuStartConversationRequest = ((l41.j1) mVar).f315844c) != null) {
                i17 = openIMKefuStartConversationRequest.f72274f;
            }
            q41.f.c(g0Var, 22, i17, 0L, 8, null);
        }
    }

    @Override // v41.s
    public void c(int i17, int i18, j41.i0 confirmData) {
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest;
        kotlin.jvm.internal.o.g(confirmData, "confirmData");
        this.f433206f = i17;
        this.f433207g = confirmData;
        if (j41.g0.a(i17)) {
            j41.u uVar = confirmData.f297643d;
            k41.g0 g0Var = uVar instanceof k41.g0 ? (k41.g0) uVar : null;
            l41.m mVar = this.f433205e;
            int i19 = -1;
            if (mVar != null && (openIMKefuStartConversationRequest = ((l41.j1) mVar).f315844c) != null) {
                i19 = openIMKefuStartConversationRequest.f72274f;
            }
            q41.f.c(g0Var, 21, i19, 0L, 8, null);
        }
    }

    @Override // v41.s
    public void d(l41.m confirmController) {
        kotlin.jvm.internal.o.g(confirmController, "confirmController");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmBaseUIModel", "OpenIMKefuConfirmUIModel onCreate: %s", this);
        this.f433205e = confirmController;
    }

    @Override // v41.s
    public void e() {
        g(4, "start conversation failed");
    }

    @Override // v41.s
    public void f() {
        g(3, "user cancel");
    }

    public final void g(int i17, java.lang.String str) {
        l41.m mVar = this.f433205e;
        if (mVar != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_result_err_code", i17);
            intent.putExtra("key_result_err_msg", str);
            ((l41.j1) mVar).f(-1, i17, intent);
        }
    }

    @Override // v41.s
    public void release() {
        this.f433204d = null;
    }
}
