package lt3;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f321253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f321254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.de f321255f;

    public l(android.content.Context context, android.view.ViewGroup viewGroup, r45.de deVar) {
        this.f321253d = context;
        this.f321254e = viewGroup;
        this.f321255f = deVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.n nVar = lt3.n.f321260a;
        r45.de it = this.f321255f;
        kotlin.jvm.internal.o.f(it, "$it");
        zu3.a0 a0Var = new zu3.a0(it);
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the text item view");
        if (!android.text.TextUtils.isEmpty(a0Var.f475764g)) {
            zu3.c0 c0Var = new zu3.c0(this.f321253d);
            this.f321254e.addView(c0Var, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            c0Var.setText(a0Var);
            c0Var.setViewMatrix(a0Var.f475763f);
            c0Var.setSourceDataType(zu3.e.f475799h);
        }
    }
}
