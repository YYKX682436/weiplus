package lt3;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f321245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f321246f;

    public i(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f321244d = context;
        this.f321245e = viewGroup;
        this.f321246f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f321260a;
        r45.de it = this.f321246f;
        kotlin.jvm.internal.o.f(it, "$it");
        zu3.a0 a0Var = new zu3.a0(it);
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the text item view");
        if (!android.text.TextUtils.isEmpty(a0Var.f475764g)) {
            zu3.b0 b0Var = new zu3.b0(this.f321244d);
            this.f321245e.addView(b0Var, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            b0Var.k(a0Var);
        }
    }
}
