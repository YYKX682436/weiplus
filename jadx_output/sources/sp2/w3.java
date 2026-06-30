package sp2;

/* loaded from: classes2.dex */
public final class w3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(sp2.x3 x3Var, android.os.Looper looper) {
        super(looper);
        this.f411261a = x3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.Integer valueOf = message != null ? java.lang.Integer.valueOf(message.what) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            sp2.x3 x3Var = this.f411261a;
            if (x3Var.f411277h) {
                x3Var.W6(x3Var.f411278i, x3Var.f411279m);
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = x3Var.f411275f;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = x3Var.f411276g;
            if (recyclerView == null || wxRecyclerAdapter == null) {
                return;
            }
            kotlinx.coroutines.y0 lifecycleScope = x3Var.getLifecycleScope();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new sp2.p3(x3Var, recyclerView, wxRecyclerAdapter, null), 2, null);
        }
    }
}
